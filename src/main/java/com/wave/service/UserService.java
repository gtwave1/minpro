package com.wave.service;

import com.wave.pojo.User;

public interface UserService {
    User selectById(String userid);
    User selectByUsername(String username);
}
