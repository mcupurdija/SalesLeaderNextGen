package com.intelisale.sync;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.intelisale.database.entity.SyncStatusEntity;
import com.intelisale.database.repository.SyncStatusRepository;
import com.intelisale.salesleader.ui.common.base.BaseFragment;
import com.intelisale.salesleader.work.MyWorkManager;
import com.intelisale.sync.di.DaggerSyncComponent;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class SyncFragment extends BaseFragment implements SyncFragmentMvc.Listener {

    @Inject
    SyncStatusRepository mSyncStatusRepository;
    @Inject
    MyWorkManager myWorkManager;

    private SyncFragmentMvc mSyncFragmentMvc;

    public SyncFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();
    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mSyncFragmentMvc = new SyncFragmentMvcImpl(inflater, null);
        return mSyncFragmentMvc.getRootView();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Disposable disposable = mSyncStatusRepository.getAll().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<List<SyncStatusEntity>>() {
            @Override
            public void accept(List<SyncStatusEntity> entities) {
                mSyncFragmentMvc.bindEntities(entities);
            }
        });
        compositeDisposable.add(disposable);
    }

    protected void inject() {
        DaggerSyncComponent.builder()
                .coreComponent(getCoreComponent())
                .build()
                .injectSyncFragment(this);
    }

    @Override
    public void onStart() {
        super.onStart();
        mSyncFragmentMvc.registerListener(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        mSyncFragmentMvc.unregisterListener(this);
    }

    @Override
    public void onSyncSelectedButtonClicked(List<String> checkedItems) {
        myWorkManager.enqueueSelected(checkedItems);
    }

    @Override
    public void onSyncAllButtonClicked() {
        myWorkManager.enqueueAll();
    }
}
