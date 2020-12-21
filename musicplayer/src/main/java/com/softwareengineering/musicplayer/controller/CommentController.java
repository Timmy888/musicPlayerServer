package com.softwareengineering.musicplayer.controller;

import com.softwareengineering.musicplayer.bean.Comment;
import com.softwareengineering.musicplayer.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;
    //通过评论Id获取评论的所有信息
    @PostMapping("/comment")
    public Comment commentFindById(@RequestParam("commentId")Integer commentId){
        return commentService.commentFindById(commentId);
    }
    //通过朋友圈Id获取所有评价，并且按照时间顺序排序
    @PostMapping("/comment/commentFindByPostId")
    public List<Comment> commentFindByPostId(@RequestParam("commentPostId") Integer commentPostId)
    {
        return commentService.commentFindByPostId(commentPostId);
    }
    //通过朋友圈Id删除评论 (数据库中评论表（comment表）中有字段commentPostId作为外键连接朋友圈表（post表）)
    @PostMapping("/comment/deleteComment/postId")
    public int deleteCommentByPostId(@RequestParam("commentPostId") Integer commentPostId){
        return commentService.deleteCommentByPostId(commentPostId);
    }
    /*
    @PostMapping("/comment/commentFindByPostId/detail")
    public List<String>commentFindByPostIdDetail(@RequestParam("commentPostId") Integer commentPostId)
    {
        return commentService.commentFindByPostIdDetail(commentPostId);
    }
*/
    //添加评论
    @PostMapping("/comment/insert")
    public int insertComment(Comment comment){
        return commentService.insertComment(comment);
    }

    //点赞
    @PostMapping("/comment/addAgree")
    public int addAgree(Comment comment)
    {
        return commentService.addAgree(comment);
    }
    //取消点赞
    @PostMapping("/comment/reduceAgree")
    public int reduceAgree(Comment comment){
        return commentService.reduceAgree(comment);
    }

    @PostMapping("/comment/findAll")
    public List<Comment>findComment(){
        return commentService.findComment();
    }
}
