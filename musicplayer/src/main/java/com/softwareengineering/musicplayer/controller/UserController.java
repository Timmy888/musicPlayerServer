package com.softwareengineering.musicplayer.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.softwareengineering.musicplayer.bean.ErrorMessage;
import com.softwareengineering.musicplayer.bean.User;
import com.softwareengineering.musicplayer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    //根据用户Id获取用户
    @PostMapping("/user")
    public User getUser(@RequestParam("userId") Integer userId){
        return userService.getUserById(userId);
    }

    //添加用户
    @PostMapping("/user/insert")
    public int insertUser(User user)
    {
        if (userService.getUserById(user.getUserId())==null)
        {
            return userService.insertUser(user);
        }else{
            return 0;
        }
    }

    //删除用户
    @PostMapping("/user/delete")
    public int deleteUserById(Integer userId)
    {
        if (userService.getUserById(userId)!=null)
        {
            return userService.deleteUserById(userId);
        }else{
            return 0;
        }
    }

    //更新用户信息
    @PostMapping("/user/update")
    public int updateUser(User user){
        if (userService.getUserById(user.getUserId())!=null)
        {
            return userService.updateUserImformation(user);
        }else{
            return 0;
        }
    }

    //更换头像
    @PostMapping("/user/updateUserFace")
    public int updateUserFace(User user){
        if (userService.getUserById(user.getUserId())!=null)
        {
             return userService.updateUserFace(user);
        }else{
            return 0;
        }

    }

    //获取用户密码
    @PostMapping("/user/getUserPasswd")
    public String getUserPasswd(Integer userId){
        if (userService.getUserById(userId)!=null)
        {
            return userService.getUserPasswd(userId);
        }else{
            return null;
        }
    }

    //更改用户密码
    @PostMapping("/user/updateUserPasswd")
    public int updateUserPasswd(User user)
    {
        if (userService.getUserById(user.getUserId())!=null)
        {
            return userService.updateUserPasswd(user);
        }else{
            return 0;
        }
    }

    //判断用户输入的信息是否正确,正确返回true，错误返回false
    @PostMapping("/user/login")
    public String  login(@RequestParam("userId") Integer userId,@RequestParam("userPasswd") String userPasswd)
    {
        ErrorMessage errorMessage=new ErrorMessage();
        if (userService.getUserById(userId)==null)
        {
            errorMessage.setErrorMessage("用户名不存在");
            String json= JSON.toJSONString(errorMessage);
            return json;
        }
        String userTruePasswd =userService.getUserPasswd(userId);
        if(userTruePasswd.equals(userPasswd))
        {
            User user=userService.getUserById(userId);
            String json=JSON.toJSONString(user);
            return json;
        }else{
            errorMessage.setErrorMessage("密码错误");
            String json=JSON.toJSONString(errorMessage);
            return json;
        }
    }
    @PostMapping("user/findAll")
    public List<User>findUser(){
        return userService.findUser();
    }
}
