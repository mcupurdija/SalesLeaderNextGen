package com.intelisale.core.di.presentation;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import com.intelisale.core.dialogFragment.DialogFragmentManager;
import com.intelisale.core.imageloader.ImageLoader;
import com.intelisale.core.notifications.DialogManager;
import com.intelisale.core.notifications.ToastManager;

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
    static DialogFragmentManager getDialogFragmentManager(FragmentManager fragmentManager) {
        return new DialogFragmentManager(fragmentManager);
    }

    @Provides
    static DialogManager dialogManager(Context context) {
        return new DialogManager(context);
    }

    @Provides
    static ToastManager toastManager(Context context) {
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
    static ImageLoader imageLoader(Activity activity) {
        return new ImageLoader(activity);
    }
}
