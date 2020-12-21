package com.softwareengineering.musicplayer.service;

import com.softwareengineering.musicplayer.bean.Comment;

import java.util.List;

public interface CommentService {
    public Comment commentFindById(Integer commentId);
    public List<Comment> commentFindByPostId(Integer commentPostId);
    public int deleteCommentByPostId(Integer commentPostId);
//  public List<String>commentFindByPostIdDetail(Integer commentPostId);
    public int insertComment(Comment comment);
    public int addAgree(Comment comment);
    public int reduceAgree(Comment comment);
    public List<Comment>findComment();
}
