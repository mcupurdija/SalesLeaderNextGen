package com.intelisale.database.repository;

import com.intelisale.database.TableNames;
import com.intelisale.database.dao.ContactDao;
import com.intelisale.database.dao.GlobalDao;
import com.intelisale.database.dao.SyncStatusDao;
import com.intelisale.database.entity.ContactEntity;

import java.util.List;

public class SyncContactsRepository extends SyncRepository {

    private final ContactDao contactDao;

    public SyncContactsRepository(GlobalDao globalDao, SyncStatusDao syncStatusDao, ContactDao contactDao) {
        super(globalDao, syncStatusDao, TableNames.CONTACTS);

        this.contactDao = contactDao;
    }

    public void syncContacts(List<ContactEntity> entityList) {
        contactDao.insertOrUpdate(entityList, TableNames.CONTACTS);
    }
}