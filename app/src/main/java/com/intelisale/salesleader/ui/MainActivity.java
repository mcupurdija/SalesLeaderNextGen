package com.intelisale.salesleader.ui;

import android.os.Bundle;

import com.intelisale.core.di.PresentationModule;
import com.intelisale.core.dialogFragment.DialogFragmentManager;
import com.intelisale.core.toast.ToastManager;
import com.intelisale.database.repository.UserRepository;
import com.intelisale.salesleader.R;
import com.intelisale.salesleader.di.DaggerMainComponent;
import com.intelisale.salesleader.ui.common.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    UserRepository userRepository;

    @Inject
    ToastManager toastManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();
        setContentView(R.layout.activity_main);

        toastManager.displayCenteredToast("WORKS");
    }

    void inject() {
        DaggerMainComponent.builder()
                .activity(this)
                .presentationModule(new PresentationModule(this))
                .coreComponent(getCoreComponent())
                .build()
                .inject(this);
    }
}
