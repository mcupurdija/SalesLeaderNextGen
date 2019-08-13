package com.intelisale.salesleader.ui.common.base;

import androidx.fragment.app.Fragment;

import com.intelisale.core.di.CoreComponent;
import com.intelisale.salesleader.SalesLeader;

public abstract class BaseFragment extends Fragment {

    public CoreComponent getCoreComponent() {
        return ((SalesLeader) getActivity().getApplication()).getCoreComponent();
    }
}
