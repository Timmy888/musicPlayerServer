package com.softwareengineering.musicplayer.mapper;

import com.softwareengineering.musicplayer.bean.Comment;
import com.softwareengineering.musicplayer.bean.Post;
import javafx.geometry.Pos;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PostMapper {
    //通过postId(朋友圈编号)查询朋友圈
    @Select("select * from post where postId=#{postId}")
    public Post getPost(Integer postId);

    //通过用户Id查询所有朋友圈内容（按照时间排序）
    @Select("select * from post where postAuthorId=#{postAuthorId} order by postCreateTime ASC")
    public List<Post>getALLPostById(Integer postAuthorId);

/*    //添加朋友圈信息(至少包括 用户Id,朋友圈内容,发布时间,点赞数默认为0,无图片)
    @Insert("insert into post (postAuthorId,postText,postCreateTime) values (#{postAuthorId},#{postText},#{postCreateTime})")
    public int insertPostTime(Post post);
*/
    //点赞
    @Update("update post set postAgree=postAgree+1 where postId=#{postId}")
    public int addPostAgree(Post post);

    // 取消点赞
    @Update("update post set postAgree=postAgree-1 where postId=#{postId}")
    public int reduceAgree(Post post);

    //添加有图片的朋友圈(未测试，需要前端传入blob类型的数据),没有传入图片默认为null)
    @Insert("insert into post (postAuthorId,postText,postCreateTime,postImage) values (#{postAuthorId},#{postText},#{postCreateTime},#{postImage})")
    public int insertTruepost(Post post);

    //删除朋友圈
    @Delete("delete from post where postId=#{postId}")
    public int deletePost(Post post);

    //查询所有朋友圈
    @Select("select * from post order By postCreateTime ASC")
    public List<Post>findPost();
}
