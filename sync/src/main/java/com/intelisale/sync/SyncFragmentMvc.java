package com.intelisale.sync;

import com.intelisale.core.ui.ObservableViewMvc;
import com.intelisale.database.entity.SyncStatusEntity;

import java.util.List;

public interface SyncFragmentMvc extends ObservableViewMvc<SyncFragmentMvc.Listener> {

    void bindEntities(List<SyncStatusEntity> entities);

    interface Listener {
        void onSyncSelectedButtonClicked(List<String> checkedItems);

        void onSyncAllButtonClicked();
    }
}
