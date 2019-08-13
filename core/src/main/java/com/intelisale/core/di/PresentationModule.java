package com.intelisale.core.di;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import com.intelisale.core.dialogFragment.DialogFragmentManager;
import com.intelisale.core.imageloader.ImageLoader;
import com.intelisale.core.toast.ToastManager;

import dagger.Module;
import dagger.Provides;

@Module
public class PresentationModule {

    private final FragmentActivity mActivity;

    public PresentationModule(FragmentActivity activity) {
        mActivity = activity;
    }

    @Provides
    FragmentManager fragmentManager() {
        return mActivity.getSupportFragmentManager();
    }

    @Provides
    DialogFragmentManager getDialogFragmentManager(FragmentManager fragmentManager) {
        return new DialogFragmentManager(fragmentManager);
    }

    @Provides
    ToastManager toastManager(Context context) {
        return new ToastManager(context);
    }

    @Provides
    LayoutInflater layoutInflater() {
        return LayoutInflater.from(mActivity);
    }

    @Provides
    Activity activity() {
        return mActivity;
    }

    @Provides
    Context context(Activity activity) {
        return activity;
    }

    @Provides
    ImageLoader imageLoader(Activity activity) {
        return new ImageLoader(activity);
    }
}
