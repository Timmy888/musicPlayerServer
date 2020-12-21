package com.softwareengineering.musicplayer.bean;

public class Post {
    private Integer postId;
    private Integer postAgree=0;
    private String postCreateTime=null;
    private Integer postAuthorId;
    private String postText=null;
    private String postImage=null;

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public void setPostAgree(Integer postAgree) {
        this.postAgree = postAgree;
    }

    public void setPostAuthorId(Integer postAuthorId) {
        this.postAuthorId = postAuthorId;
    }

    public Post() {
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getPostAgree() {
        return postAgree;
    }

    public void setPostAgree(int postAgree) {
        this.postAgree = postAgree;
    }

    public String getPostCreateTime() {
        return postCreateTime;
    }

    public void setPostCreateTime(String postCreateTime) {
        this.postCreateTime = postCreateTime;
    }

    public int getPostAuthorId() {
        return postAuthorId;
    }

    public void setPostAuthorId(int postAuthorId) {
        this.postAuthorId = postAuthorId;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostImage() {
        return postImage;
    }

    public void setPostImage(String postImage) {
        this.postImage = postImage;
    }
}
