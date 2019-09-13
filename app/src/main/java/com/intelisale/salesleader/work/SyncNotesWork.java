package com.intelisale.salesleader.work;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

import com.intelisale.core.mapper.NoteMapper;
import com.intelisale.database.TableNames;
import com.intelisale.database.entity.NoteAttachmentsEntity;
import com.intelisale.database.entity.NoteEntity;
import com.intelisale.database.entity.NoteTargetGroupsEntity;
import com.intelisale.database.entity.NoteTargetTypesEntity;
import com.intelisale.database.repository.SyncNotesRepository;
import com.intelisale.networking.api.SyncApi;
import com.intelisale.networking.schema.BaseRecordSchema;
import com.intelisale.networking.schema.BaseSchema;
import com.intelisale.networking.schema.notes.NoteAttachmentsSchema;
import com.intelisale.networking.schema.notes.NoteSchema;
import com.intelisale.networking.schema.notes.NoteTargetGroupsSchema;
import com.intelisale.networking.schema.notes.NoteTargetTypesSchema;
import com.intelisale.networking.schema.notes.SyncNotesResponseSchema;
import com.intelisale.networking.schema.sync.SyncTableNames;
import com.intelisale.salesleader.di.DaggerWorkComponent;
import com.intelisale.salesleader.ui.common.base.BaseWorker;
import com.intelisale.salesleader.work.helper.PaginationHelper;
import com.intelisale.salesleader.work.helper.SyncObject;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;

public class SyncNotesWork extends BaseWorker {

    private NoteMapper noteMapper = NoteMapper.INSTANCE;

    @Inject
    SyncApi syncApi;

    @Inject
    SyncNotesRepository syncNotesRepository;

    public SyncNotesWork(@NonNull Context appContext, @NonNull WorkerParameters workerParams) {
        super(appContext, workerParams);
        inject();
    }

    @NonNull
    @Override
    public ListenableWorker.Result doWork() {

        // 0. NOTE
        SyncObject obj0 = new SyncObject(SyncTableNames.Notes, syncNotesRepository.getModifiedDate(TableNames.NOTES), 1000);
        // 1. NOTE TARGET GROUPS
        SyncObject obj1 = new SyncObject(SyncTableNames.NotesTargetGroups, syncNotesRepository.getModifiedDate(TableNames.NOTES_TARGET_GROUPS), 5000);
        // 2. NOTE TARGET TYPES
        SyncObject obj2 = new SyncObject(SyncTableNames.NotesTargetTypes, syncNotesRepository.getModifiedDate(TableNames.NOTES_TARGET_TYPES), 5000);
        // 3. NOTE ATTACHMENTS
        SyncObject obj3 = new SyncObject(SyncTableNames.NotesAttachments, syncNotesRepository.getModifiedDate(TableNames.NOTES_ATTACHMENTS), 1000);

        PaginationHelper paginationHelper = new PaginationHelper(new SyncObject[]{obj0, obj1, obj2, obj3});

        while (paginationHelper.setSyncRequest()) {

            syncNotesRepository.updateProgress(paginationHelper.getPercentageCompleted());

            Call<BaseSchema<SyncNotesResponseSchema>> call = syncApi.syncNotes(1, new ArrayList<>(paginationHelper.getSyncRequest().values()));
            try {
                Response<BaseSchema<SyncNotesResponseSchema>> response = call.execute();
                if (response.isSuccessful()) {

                    BaseSchema<SyncNotesResponseSchema> responseSchema = response.body();
                    if (responseSchema != null && responseSchema.getSuccess()) {

                        SyncNotesResponseSchema notesResponseSchema = responseSchema.getData();
                        if (notesResponseSchema != null) {

                            // 0. NOTE
                            BaseRecordSchema<NoteSchema> noteRecordSchema = notesResponseSchema.getNotes();
                            if (noteRecordSchema != null && noteRecordSchema.getRecords() != null) {

                                List<NoteEntity> noteEntities = noteMapper.noteEntities(noteRecordSchema.getRecords());
                                syncNotesRepository.syncNotes(noteEntities);

                                paginationHelper.updateCounters(0, noteRecordSchema.getNumOfRecords());
                            }

                            // 1. NOTE TARGET GROUPS
                            BaseRecordSchema<NoteTargetGroupsSchema> noteTargetGroupsSchema = notesResponseSchema.getNoteTargetGroups();
                            if (noteTargetGroupsSchema != null && noteTargetGroupsSchema.getRecords() != null) {

                                List<NoteTargetGroupsEntity> noteTargetGroupsEntities = noteMapper.noteTargetGroupsEntities(noteTargetGroupsSchema.getRecords());
                                syncNotesRepository.syncNoteTargetGroups(noteTargetGroupsEntities);

                                paginationHelper.updateCounters(1, noteTargetGroupsSchema.getNumOfRecords());
                            }

                            // 2. NOTE TARGET TYPES
                            BaseRecordSchema<NoteTargetTypesSchema> noteTargetTypesSchema = notesResponseSchema.getNoteTargetTypes();
                            if (noteTargetTypesSchema != null && noteTargetTypesSchema.getRecords() != null) {

                                List<NoteTargetTypesEntity> noteTargetTypesEntities = noteMapper.noteTargetTypesEntities(noteTargetTypesSchema.getRecords());
                                syncNotesRepository.syncNoteTargetTypes(noteTargetTypesEntities);

                                paginationHelper.updateCounters(2, noteTargetTypesSchema.getNumOfRecords());
                            }

                            // 3. NOTE ATTACHMENTS
                            BaseRecordSchema<NoteAttachmentsSchema> noteAttachmentsSchema = notesResponseSchema.getNoteAttachments();
                            if (noteAttachmentsSchema != null && noteAttachmentsSchema.getRecords() != null) {

                                List<NoteAttachmentsEntity> noteAttachmentsEntities = noteMapper.noteAttachmentsEntities(noteAttachmentsSchema.getRecords());
                                syncNotesRepository.syncNoteAttachments(noteAttachmentsEntities);

                                paginationHelper.updateCounters(3, noteAttachmentsSchema.getNumOfRecords());
                            }
                        }
                    } else {

                        return Result.failure();
                    }
                } else {

                    return Result.failure();
                }
            } catch (Exception e) {

                return Result.failure();
            }
        }

        return Result.success();
    }

    private void inject() {
        DaggerWorkComponent.builder()
                .coreComponent(getCoreComponent())
                .build()
                .injectSyncNotesWork(this);
    }
}
