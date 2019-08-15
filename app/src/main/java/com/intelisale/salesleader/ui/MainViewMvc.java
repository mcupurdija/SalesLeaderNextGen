package com.intelisale.salesleader.ui;

import com.intelisale.core.ui.ObservableViewMvc;

public interface MainViewMvc extends ObservableViewMvc<MainViewMvc.Listener> {

    void setNavigationDrawer();

    void onBackPressed();

    interface Listener {

    }
}
