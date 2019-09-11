package com.intelisale.salesleader.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.intelisale.core.ui.BaseViewMvc;
import com.intelisale.salesleader.R;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

public class MainActivityMvcImpl extends BaseViewMvc<MainActivityMvc.Listener> implements MainActivityMvc, Drawer.OnDrawerItemClickListener {

    private final AppCompatActivity mActivity;

    private Toolbar toolbar;
    private NavController navController;
    private Drawer drawer;

    MainActivityMvcImpl(LayoutInflater layoutInflater, ViewGroup container, AppCompatActivity activity) {
        mActivity = activity;
        setRootView(layoutInflater.inflate(R.layout.activity_main, container, false));

        toolbar = findViewById(R.id.toolbar);
        activity.setSupportActionBar(toolbar);

        navController = Navigation.findNavController(findViewById(R.id.nav_host_fragment));
    }

    @Override
    public void setNavigationDrawer() {

        drawer = new DrawerBuilder()
                .withActivity(mActivity)
                .withToolbar(toolbar)
                .addDrawerItems(
                        new PrimaryDrawerItem().withName("Dashboard"),
                        new DividerDrawerItem(),
                        new PrimaryDrawerItem().withName("Sync")
                )
                .withOnDrawerItemClickListener(this)
                .build();
    }

    @Override
    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {

        drawer.closeDrawer();
        switch (position) {
            case 0:
                navController.navigate(R.id.firstFragment);
                return true;
            case 2:
                navController.navigate(R.id.secondFragment);
                return true;
            default:
                return false;
        }
    }

    @Override
    public void onBackPressed() {
        if (drawer != null && drawer.isDrawerOpen()) drawer.closeDrawer();
    }
}
