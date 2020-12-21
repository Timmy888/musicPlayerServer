package com.softwareengineering.musicplayer.service;

import com.softwareengineering.musicplayer.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public User getUserById(Integer userId);
    public int insertUser(User user);
    public int deleteUserById(Integer userId);
    public int updateUserImformation(User user);
    public int updateUserFace(User user);
    public String getUserPasswd(Integer userId);
    public int updateUserPasswd(User user);
    public List<User> findUser();
}
