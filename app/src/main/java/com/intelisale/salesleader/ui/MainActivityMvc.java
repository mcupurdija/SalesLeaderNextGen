package com.intelisale.salesleader.ui;

import com.intelisale.core.ui.ObservableViewMvc;

public interface MainActivityMvc extends ObservableViewMvc<MainActivityMvc.Listener> {

    void setNavigationDrawer();

    void onBackPressed();

    interface Listener {

    }
}
