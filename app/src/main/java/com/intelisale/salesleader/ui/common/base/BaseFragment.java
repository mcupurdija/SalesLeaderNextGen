package com.intelisale.salesleader.ui.common.base;

import androidx.annotation.UiThread;
import androidx.fragment.app.Fragment;

import com.intelisale.core.di.CoreComponent;
import com.intelisale.salesleader.SalesLeader;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BaseFragment extends Fragment {

    protected CompositeDisposable compositeDisposable = new CompositeDisposable();

    @UiThread
    protected abstract void inject();

    protected CoreComponent getCoreComponent() {
        return ((SalesLeader) getActivity().getApplication()).getCoreComponent();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        compositeDisposable.dispose();
    }
}
