package com.wave.mapper;

import com.wave.pojo.Post;

import java.util.List;

public interface PostMapper {

    Post selectById(Integer id);

    List<Post> select();

    void addThumbup();

    void addComment();
}
