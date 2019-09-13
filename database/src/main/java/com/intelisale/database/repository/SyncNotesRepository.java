package com.intelisale.database.repository;

import com.intelisale.database.TableNames;
import com.intelisale.database.dao.GlobalDao;
import com.intelisale.database.dao.NoteAttachmentsDao;
import com.intelisale.database.dao.NoteDao;
import com.intelisale.database.dao.NoteTargetGroupsDao;
import com.intelisale.database.dao.NoteTargetTypesDao;
import com.intelisale.database.dao.SyncStatusDao;
import com.intelisale.database.entity.NoteAttachmentsEntity;
import com.intelisale.database.entity.NoteEntity;
import com.intelisale.database.entity.NoteTargetGroupsEntity;
import com.intelisale.database.entity.NoteTargetTypesEntity;

import java.util.List;

public class SyncNotesRepository extends SyncRepository {

    private final NoteDao noteDao;
    private final NoteTargetGroupsDao noteTargetGroupsDao;
    private final NoteTargetTypesDao noteTargetTypesDao;
    private final NoteAttachmentsDao noteAttachmentsDao;

    public SyncNotesRepository(GlobalDao globalDao, SyncStatusDao syncStatusDao, NoteDao noteDao, NoteTargetGroupsDao noteTargetGroupsDao, NoteTargetTypesDao noteTargetTypesDao, NoteAttachmentsDao noteAttachmentsDao) {
        super(globalDao, syncStatusDao, TableNames.NOTES);

        this.noteDao = noteDao;
        this.noteTargetGroupsDao = noteTargetGroupsDao;
        this.noteTargetTypesDao = noteTargetTypesDao;
        this.noteAttachmentsDao = noteAttachmentsDao;
    }

    public void syncNotes(List<NoteEntity> entityList) {
        noteDao.insertOrUpdate(entityList, TableNames.NOTES);
    }

    public void syncNoteTargetGroups(List<NoteTargetGroupsEntity> entityList) {
        noteTargetGroupsDao.insertOrUpdate(entityList, TableNames.NOTES_TARGET_GROUPS);
    }

    public void syncNoteTargetTypes(List<NoteTargetTypesEntity> entityList) {
        noteTargetTypesDao.insertOrUpdate(entityList, TableNames.NOTES_TARGET_TYPES);
    }

    public void syncNoteAttachments(List<NoteAttachmentsEntity> entityList) {
        noteAttachmentsDao.insertOrUpdate(entityList, TableNames.NOTES_ATTACHMENTS);
    }
}