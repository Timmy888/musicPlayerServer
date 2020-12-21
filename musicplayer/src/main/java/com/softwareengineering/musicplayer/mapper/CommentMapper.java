package com.softwareengineering.musicplayer.mapper;

import com.softwareengineering.musicplayer.bean.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CommentMapper {
    //根据评论Id查询评论
    @Select("select * from comment where commentId=#{commentId}")
    public Comment commentFindById(Integer commentId);

    //根据朋友圈Id查询评论，并且按照时间顺序排序
    @Select("select * from comment where commentPostId=#{commentPostId} order by commentTime ASC")
    public List<Comment> commentFindByPostID(Integer commentPostId);

    //删除根据朋友圈Id评论
    @Delete("delete  from comment where commentPostId=#{commentPostId}")
    public int deleteCommentByPostId(Integer commentPostId);

    /*
    @Select("select commentText from comment where commentPostId=#{commentPostId}")
    public List<String>commentFindByPostIdDetail(Integer commentPostId);
*/
    //添加评论
    @Insert("insert into comment (commentUserId,commentTime,commentAgree,commentText,commentPostId) values(#{commentUserId},#{commentTime},#{commentAgree},#{commentText},#{commentPostId})")
    public int insertComment(Comment comment);

    //点赞
    @Update("update comment set commentAgree=commentAgree+1 where commentId=#{commentId}")
    public int addAgree(Comment comment);
    //取消点赞
    @Update("update comment set commentAgree=commentAgree-1 where commentId=#{commentId}")
    public int reduceAgree(Comment comment);
    @Select("select * from comment order By commentTime")
    public List<Comment>findComment();
}
