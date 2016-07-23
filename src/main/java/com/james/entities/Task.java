package com.james.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by jamesyburr on 7/20/16.
 */
@Entity
@Table(name = "tasks")
public class Task {
    @GeneratedValue
    @Id
    int taskId;

    @ManyToOne
    User user;

    @Column(nullable = false)
    String taskText;

    @ManyToOne
    User completedByUser;

    String commentText;

    @Column(nullable = false)
    boolean hidden;

    LocalDateTime timestamp;

    public Task() {
    }

    public Task(User user, String taskText, User completedByUser, String commentText, boolean hidden, LocalDateTime timestamp) {
        this.taskId = taskId;
        this.user = user;
        this.taskText = taskText;
        this.completedByUser = completedByUser;
        this.commentText = commentText;
        this.hidden = hidden;
        this.timestamp = timestamp;
    }

    public int getTaskId() {
        return taskId;
    }

    public User getUser() {
        return user;
    }

    public String getTaskText() {
        return taskText;
    }

    public User getCompletedByUser() {
        return completedByUser;
    }

    public void setCompletedByUser(User completedByUser) {
        this.completedByUser = completedByUser;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public LocalDateTime getTimestamp() { return timestamp;}
}
