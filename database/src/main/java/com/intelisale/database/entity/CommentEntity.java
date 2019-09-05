package com.intelisale.database.entity;

import androidx.room.Entity;

import com.intelisale.database.entity.column.BaseAuditColumns;

@Entity(tableName = "Comments")
public class CommentEntity extends BaseAuditColumns {

    private Integer customerId;
    private Integer commentsSourceId;
    private Integer commentsTargetId;
    private String description;
    private String link;
    private Integer userId;
    private Boolean checked;
    private String reminder;
    private String createdDate;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getCommentsSourceId() {
        return commentsSourceId;
    }

    public void setCommentsSourceId(Integer commentsSourceId) {
        this.commentsSourceId = commentsSourceId;
    }

    public Integer getCommentsTargetId() {
        return commentsTargetId;
    }

    public void setCommentsTargetId(Integer commentsTargetId) {
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean isChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
}
