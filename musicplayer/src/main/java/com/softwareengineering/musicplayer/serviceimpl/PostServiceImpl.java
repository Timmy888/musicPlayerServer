package com.softwareengineering.musicplayer.serviceimpl;

import com.softwareengineering.musicplayer.bean.Post;
import com.softwareengineering.musicplayer.mapper.CommentMapper;
import com.softwareengineering.musicplayer.mapper.PostMapper;
import com.softwareengineering.musicplayer.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostMapper postMapper;
    @Autowired
    CommentMapper commentMapper;
    @Override
    public Post getPost(Integer postId) {
        return postMapper.getPost(postId);
    }
    /*  @Override
    public int insertPostTime(Post post) {
        return postMapper.insertPostTime(post);
    }
*/
    @Override
    public int addPostAgree(Post post) {
        return postMapper.addPostAgree(post);
    }

    @Override
    public int reduceAgree(Post post) {
        return postMapper.reduceAgree(post);
    }

    @Override
    public List<Post> getALLPostById(Integer postAuthorId) {
        return postMapper.getALLPostById(postAuthorId);
    }

    @Override
    public int insertTruePost(Post post) {
        return postMapper.insertTruepost(post);
    }

    @Override
    public int deletePost(Post post) {
        commentMapper.deleteCommentByPostId(post.getPostId());
        return postMapper.deletePost(post);
    }

    @Override
    public List<Post> findPost() {
        return postMapper.findPost();
    }
}
