package com.softwareengineering.musicplayer.serviceimpl;

import com.softwareengineering.musicplayer.bean.User;
import com.softwareengineering.musicplayer.mapper.UserMapper;
import com.softwareengineering.musicplayer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(Integer userId) {
        return userMapper.getUser(userId);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int deleteUserById(Integer userId) {
        return userMapper.deleteUserById(userId);
    }

    @Override
    public int updateUserImformation(User user) {
        return userMapper.updateUserImformation(user);
    }

    @Override
    public int updateUserFace(User user) {
        return userMapper.updateUserFace(user);
    }

    @Override
    public String getUserPasswd(Integer userId) {
        return userMapper.getUserPasswd(userId);
    }

    @Override
    public int updateUserPasswd(User user) {
        return userMapper.updateUserPasswd(user);
    }

    @Override
    public List<User> findUser() {
        return userMapper.findUser();
    }
}
