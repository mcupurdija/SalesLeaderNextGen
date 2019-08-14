package com.intelisale.salesleader.ui;

import android.os.Bundle;

import com.intelisale.core.di.presentation.PresentationModule;
import com.intelisale.salesleader.R;
import com.intelisale.salesleader.di.DaggerMainComponent;
import com.intelisale.salesleader.ui.common.base.BaseActivity;

public class MainActivity extends BaseActivity {

//    @Inject
//    UserRepository userRepository;
//
//    @Inject
//    ToastManager toastManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inject();
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void inject() {
        DaggerMainComponent.builder()
                .activity(this)
                .coreComponent(getCoreComponent())
                .presentationModule(new PresentationModule(this))
                .build()
                .inject(this);
    }
}
