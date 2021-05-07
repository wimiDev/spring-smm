package com.aluosu.dao;

import com.aluosu.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> getAllUser();
    public List<User> findByEmail(String email);
}
