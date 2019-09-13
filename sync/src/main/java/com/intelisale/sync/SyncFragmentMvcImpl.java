package com.intelisale.sync;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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

                    View childView = gridLayoutManager.getChildAt(i);
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
            ImageView mStatus;
            Switch mSwitch;

            SyncViewHolder(View view) {
                super(view);
                mTitle = view.findViewById(R.id.tvTitle);
                mSubtitle = view.findViewById(R.id.tvSubtitle);
                mStatus = view.findViewById(R.id.ivStatus);
                mProgress = view.findViewById(R.id.tvProgress);
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
                case "RUNNING":
                    holder.mStatus.setImageResource(com.intelisale.salesleader.R.drawable.ic_status_running);
                    holder.mProgress.setText(String.format("%d%%", entity.getSyncProgress()));
                    holder.mProgress.setVisibility(View.VISIBLE);
                    holder.mSwitch.setEnabled(false);
                    break;
                case "SUCCEEDED":
                    holder.mStatus.setImageResource(com.intelisale.salesleader.R.drawable.ic_status_succeeded);
                    holder.mProgress.setVisibility(View.GONE);
                    holder.mSwitch.setEnabled(true);
                    break;
                case "FAILED":
                    holder.mStatus.setImageResource(com.intelisale.salesleader.R.drawable.ic_status_failed);
                    holder.mProgress.setVisibility(View.GONE);
                    holder.mSwitch.setEnabled(true);
                    break;
                default:
                    holder.mStatus.setImageResource(com.intelisale.salesleader.R.drawable.ic_status_waiting);
                    holder.mProgress.setVisibility(View.GONE);
                    holder.mSwitch.setEnabled(false);
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
