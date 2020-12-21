package com.softwareengineering.musicplayer.service;

import com.softwareengineering.musicplayer.bean.Post;

import java.util.List;

public interface PostService {
    public Post getPost(Integer postId);
//  public int insertPostTime(Post post);
    public int addPostAgree(Post post);
    public int reduceAgree(Post post);
    public List<Post> getALLPostById(Integer postAuthorId);
    public int insertTruePost(Post post);
    public int deletePost(Post post);
    public List<Post>findPost();
}
