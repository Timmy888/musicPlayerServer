package com.softwareengineering.musicplayer.controller;

import com.softwareengineering.musicplayer.bean.Post;
import com.softwareengineering.musicplayer.service.PostService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostService postService;
    //根据朋友圈Id获取朋友圈内容
    @PostMapping("/post")
    public Post getPost(@RequestParam("postId") Integer postId)
    {
        return postService.getPost(postId);
    }

   /*
    @PostMapping("/post/insert/noImage")
    public int insertPostTime(Post post)
    {
        return  postService.insertPostTime(post);
    }
*/
   //添加朋友圈
    @PostMapping("/post/insert")
    public int insertTruePost(Post post)
    {
        return postService.insertTruePost(post);
    }

    //点赞
    @PostMapping("/post/agree/add")
    public int updatePostAgree(Post post)
    {
        return postService.addPostAgree(post);
    }

    //取消点赞
    @PostMapping("/post/agree/reduce")
    public int reducePostAgree(Post post)
    {
        return postService.reduceAgree(post);
    }

    //根据用户Id查找朋友圈
    @PostMapping("/post/find/postAuthorId")
    public List<Post>getALLPostById(@RequestParam("postAuthorId") Integer postAuthorId)
    {
        return postService.getALLPostById(postAuthorId);
    }

    //删除朋友圈 （删除朋友圈前已经删除所有评论）
    @PostMapping("/post/delete")
    public int deletePostByPostId(Post post)
    {
        return postService.deletePost(post);
    }

    @PostMapping("/post/findAll")
    public List<Post>findPost(){
        return postService.findPost();
    }
}
