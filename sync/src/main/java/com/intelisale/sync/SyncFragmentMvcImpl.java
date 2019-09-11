package com.intelisale.sync;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.button.MaterialButton;
import com.intelisale.core.ui.BaseViewMvc;
import com.intelisale.database.entity.SyncStatusEntity;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class SyncFragmentMvcImpl extends BaseViewMvc<SyncFragmentMvc.Listener> implements SyncFragmentMvc {

    private SyncAdapter mSyncAdapter;

    SyncFragmentMvcImpl(LayoutInflater inflater, ViewGroup container) {
        setRootView(inflater.inflate(R.layout.fragment_sync, container, false));

        final RecyclerView mRecyclerView = findViewById(R.id.recyclerView);

        final GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        mRecyclerView.setLayoutManager(gridLayoutManager);
        mRecyclerView.setHasFixedSize(true);

        mSyncAdapter = new SyncAdapter();
        mRecyclerView.setAdapter(mSyncAdapter);

        final MaterialButton mSyncButton = findViewById(R.id.bSync);
        mSyncButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                List<String> checkedItems = new ArrayList<>();

                for (int i = 0; i < mSyncAdapter.getItemCount(); i++) {

                    View childView =  gridLayoutManager.getChildAt(i);
                    if (childView != null) {

                        Switch mSwitch = childView.findViewById(R.id.itemSwitch);
                        if (mSwitch.isChecked()) {

                            checkedItems.add(mSyncAdapter.getEntities().get(i).getGroupName());
                        }
                    }
                }

                for (Listener listener : getListeners()) {
                    listener.onSyncButtonClicked(checkedItems);
                }
            }
        });
    }

    @Override
    public void bindEntities(List<SyncStatusEntity> entities) {
        mSyncAdapter.bindEntities(entities);
    }

    public static class SyncAdapter extends RecyclerView.Adapter<SyncAdapter.SyncViewHolder> {

        private List<SyncStatusEntity> mEntities = new ArrayList<>(0);

        class SyncViewHolder extends RecyclerView.ViewHolder {

            TextView mTitle, mSubtitle, mProgress;
            FrameLayout mProgressLayout;
            Switch mSwitch;

            SyncViewHolder(View view) {
                super(view);
                mTitle = view.findViewById(R.id.tvTitle);
                mSubtitle = view.findViewById(R.id.tvSubtitle);
                mProgress = view.findViewById(R.id.tvProgress);
                mProgressLayout = view.findViewById(R.id.progressLayout);
                mSwitch = view.findViewById(R.id.itemSwitch);
            }
        }

        SyncAdapter() {
        }

        void bindEntities(List<SyncStatusEntity> entities) {
            mEntities = new ArrayList<>(entities);
            notifyDataSetChanged();
        }

        @NotNull
        @Override
        public SyncViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_sync_list_item, parent, false);
            return new SyncViewHolder(itemView);
        }

        @Override
        @SuppressLint("DefaultLocale")
        public void onBindViewHolder(@NotNull SyncViewHolder holder, final int position) {

            holder.setIsRecyclable(false);

            SyncStatusEntity entity = mEntities.get(position);

            holder.mTitle.setText(entity.getGroupName());
            holder.mSubtitle.setText(entity.getSyncDate());

            switch (entity.getStatus()) {
                case SyncStatusEntity.STATUS_IN_PROGRESS:
                    holder.mProgress.setText(String.format("%d%%", entity.getSyncProgress()));
                    holder.mProgressLayout.setVisibility(View.VISIBLE);
                    holder.mSwitch.setEnabled(false);
                    break;
                case SyncStatusEntity.STATUS_SUCCESS:
                    holder.mSubtitle.setTextColor(Color.DKGRAY);
                    holder.mProgressLayout.setVisibility(View.GONE);
                    holder.mSwitch.setEnabled(true);
                    break;
                case SyncStatusEntity.STATUS_FAIL:
                    holder.mSubtitle.setTextColor(Color.RED);
                    holder.mProgressLayout.setVisibility(View.GONE);
                    holder.mSwitch.setEnabled(true);
                    break;
            }
        }

        @Override
        public int getItemCount() {
            return mEntities.size();
        }

        List<SyncStatusEntity> getEntities() {
            return mEntities;
        }
    }
}
