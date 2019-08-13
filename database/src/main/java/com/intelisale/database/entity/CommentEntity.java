package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

import org.joda.time.DateTime;

@Entity(tableName = "Comments")
public class CommentEntity extends BaseAuditColumns {

    private int customerId;
    private int commentsSourceId;
    private int commentsTargetId;
    private String description;
    private String link;
    private int userId;
    private boolean checked;
    private String reminder;
    private DateTime createdDate;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCommentsSourceId() {
        return commentsSourceId;
    }

    public void setCommentsSourceId(int commentsSourceId) {
        this.commentsSourceId = commentsSourceId;
    }

    public int getCommentsTargetId() {
        return commentsTargetId;
    }

    public void setCommentsTargetId(int commentsTargetId) {
        this.commentsTargetId = commentsTargetId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public DateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
    }
}
