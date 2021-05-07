package com.aluosu.service;

import com.aluosu.dao.UserMapper;
import com.aluosu.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private  UserMapper userMapper;
    public void setUserMapper(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public List<User> getUserByEmial(String email) {
        return userMapper.findByEmail(email);
    }

    //用email登陆
    public User loginByEmail(String email, String pwd){
        List<User> users = this.getUserByEmial(email);
        User loginedUser = null;
        for (User usr: users) {
            if(usr.getPwd().equals(pwd)){
                loginedUser = usr;
                break;
            }
        }
        return loginedUser;
    }
}
