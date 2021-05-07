package com.aluosu.service;

import com.aluosu.pojo.User;

import java.util.List;

public interface UserService {
    public User getUserById(int id);
    public List<User> getUserByEmial(String emial);
    public User loginByEmail(String email, String pwd);
}
