package com.softwareengineering.musicplayer.mapper;

import com.softwareengineering.musicplayer.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

//这是一个操作数据库的mapper
//@Mapper
public interface UserMapper {
    //获取所有用户信息
    @Select("select * from user where userId=#{userId}")
    public User getUser(Integer userId);

    //获取用户密码
    @Select("select userPasswd from user where userId=#{userId}")
    public String getUserPasswd(Integer userId);

    //删除用户
    @Delete("delete from user where userId=#{userId}")
    public int deleteUserById(Integer userId);

    //添加用户（初始状态只有用户名和密码和用户Id）
    @Insert("insert into user (userId,userPasswd,userName) values(#{userId},#{userPasswd},#{userName})")
    public int insertUser(User user);

    //更新用户其他信息(除账户密码)
    @Update("update user set userName=#{userName},userAdress=#{userAdress},userTel=#{userTel},userEmail=#{userEmail},userSex=#{userSex},userBirthday=#{userBirthday} where userId=#{userId}")
    public int updateUserImformation(User user);

    //添加用户头像
    @Update("update user set userFace=#{userName} where userId=#{userId}")
    public int updateUserFace(User user);

    //更改用户密码
    @Update("update user set userPasswd=#{userPasswd} where userId=#{userId}")
    public int updateUserPasswd(User user);

    @Select("select * from user")
    public List<User>findUser();
}
