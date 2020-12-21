package com.softwareengineering.musicplayer.bean;

import java.sql.Blob;
import java.sql.Date;

public class Comment {
 private Integer commentId;
 private Integer commentUserId;
 private String commentText=null;
 private Integer commentAgree;
 private Integer commentPostId;
 private Date commentTime=null;
 private Blob commentImage=null;

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public Comment() {
    }



    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentUserId() {
        return commentUserId;
    }

    public void setCommentUserId(Integer commentUserId) {
        this.commentUserId = commentUserId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Integer getCommentAgree() {
        return commentAgree;
    }

    public void setCommentAgree(Integer commentAgree) {
        this.commentAgree = commentAgree;
    }

    public Integer getCommentPostId() {
        return commentPostId;
    }

    public void setCommentPostId(Integer commentPostId) {
        this.commentPostId = commentPostId;
    }

    public Blob getCommentImage() {
        return commentImage;
    }

    public void setCommentImage(Blob commentImage) {
        this.commentImage = commentImage;
    }


}
