package com.intelisale.database.repository;

import android.util.SparseIntArray;

import com.intelisale.database.TableNames;
import com.intelisale.database.dao.ItemDao;
import com.intelisale.database.entity.ItemEntity;
import com.intelisale.database.utils.DateUtils;

import org.joda.time.DateTime;

import java.util.List;

public class SyncItemsRepository {

    private final ItemDao itemDao;
    private final SparseIntArray itemsIdServerIdArray;

    public SyncItemsRepository(ItemDao itemDao) {
        this.itemDao = itemDao;
        itemsIdServerIdArray = itemDao.getIdServerId(TableNames.ITEMS);
    }

    public String getItemsModifiedDate() {
        if (itemDao.getCount(TableNames.ITEMS) > 0) {
            return itemDao.getMaxModifiedDate(TableNames.ITEMS);
        } else {
            return DateUtils.formatDateTime(new DateTime(1970, 1, 1, 0, 0, 0));
        }
    }

    public void syncItems(List<ItemEntity> entityList) {
        itemDao.insertOrUpdateByServerId(entityList, itemsIdServerIdArray);
    }
}