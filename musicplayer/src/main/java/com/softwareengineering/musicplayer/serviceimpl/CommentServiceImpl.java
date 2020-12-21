package com.softwareengineering.musicplayer.serviceimpl;

import com.softwareengineering.musicplayer.bean.Comment;
import com.softwareengineering.musicplayer.mapper.CommentMapper;
import com.softwareengineering.musicplayer.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;
    @Override
    public Comment commentFindById(Integer commentId) {
        return commentMapper.commentFindById(commentId);
    }

    @Override
    public int deleteCommentByPostId(Integer commentPostId) {
        return commentMapper.deleteCommentByPostId(commentPostId);
    }

    @Override
    public List<Comment> commentFindByPostId(Integer commentPostId) {
        return commentMapper.commentFindByPostID(commentPostId);
    }
    /*
    @Override
    public List<String> commentFindByPostIdDetail(Integer commentPostId) {
        return commentMapper.commentFindByPostIdDetail(commentPostId);
    }
    */
    @Override
    public int insertComment(Comment comment) {
        return commentMapper.insertComment(comment);
    }

    public CommentServiceImpl() {
        super();
    }

    @Override
    public int addAgree(Comment comment) {
        return commentMapper.addAgree(comment);
    }

    @Override
    public int reduceAgree(Comment comment) {
        return commentMapper.reduceAgree(comment);
    }

    @Override
    public List<Comment> findComment() {
        return commentMapper.findComment();
    }
}
