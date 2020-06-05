package com.wave.mapper;

import com.wave.pojo.User;

public interface UserMapper {

    User selectById(String userid);

    User selectByUsername(String username);
}
