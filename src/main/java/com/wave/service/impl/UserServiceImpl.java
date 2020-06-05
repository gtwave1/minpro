package com.wave.service.impl;

import com.wave.mapper.UserMapper;
import com.wave.pojo.User;
import com.wave.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectById(String userid) {
        User user = userMapper.selectById(userid);
        return user;
    }

    @Override
    public User selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }
}
