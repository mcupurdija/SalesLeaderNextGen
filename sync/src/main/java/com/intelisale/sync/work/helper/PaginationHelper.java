package com.intelisale.sync.work.helper;

import com.intelisale.networking.schema.sync.SyncSchema;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PaginationHelper {

    private final SyncObject[] syncTables;
    private final int[] entityCounter, entityResultsCounter;
    private int percentageCompleted;

    private Map<String, SyncSchema> syncRequest;

    public PaginationHelper(SyncObject[] syncTables) {
        this.syncTables = syncTables;
        this.entityCounter = new int[syncTables.length];
        this.entityResultsCounter = new int[syncTables.length];
        for (int i = 0; i < entityResultsCounter.length; i++) {
            entityResultsCounter[i] = Integer.MAX_VALUE;
        }
    }

    public void updateCounters(int index, int results) {
        entityCounter[index] += syncTables[index].getPageSize();
        entityResultsCounter[index] = results;
    }

    public Map<String, SyncSchema> getSyncRequest() {
        return syncRequest;
    }

    public boolean setSyncRequest() {

        if (syncRequest == null) {
            percentageCompleted = 1;

            syncRequest = new HashMap<>();
            for (int i = 0; i < syncTables.length; i++) {
                syncRequest.put(syncTables[i].getSyncTableName(), new SyncSchema(syncTables[i].getSyncTableName(), syncTables[i].getModifiedDate(), entityCounter[i], syncTables[i].getPageSize()));
            }

        } else {
            percentageCompleted = 0;

            for (int i = 0; i < syncTables.length; i++) {

                if (entityCounter[i] < entityResultsCounter[i]) {
                    Objects.requireNonNull(syncRequest.get(syncTables[i].getSyncTableName())).setPageNumber(entityCounter[i]);
                    addPercentageCompleted(entityCounter[i]);
                } else {
                    syncRequest.remove(syncTables[i].getSyncTableName());
                    addPercentageCompleted(entityResultsCounter[i]);
                }
            }

            if (syncRequest.size() > 0) {

                for (SyncObject syncTable : syncTables) {

                    if (syncRequest.containsKey(syncTable.getSyncTableName())) {
                        Objects.requireNonNull(syncRequest.get(syncTable.getSyncTableName())).setPageSize(syncTable.getPageSize());
                    }
                }

            }
        }

        return syncRequest.size() > 0;
    }

    public int getPercentageCompleted() {
        return percentageCompleted;
    }

    private void addPercentageCompleted(int value) {

        int resultSum = 0;
        for (int i : entityResultsCounter) resultSum += i;
        if (resultSum != 0) percentageCompleted += value * 100 / resultSum;
    }
}
