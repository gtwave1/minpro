package com.wave.service;

import com.wave.pojo.Post;
import com.wave.vo.PostList;

import java.util.List;

public interface PostService {

    List<Post> select();

    List<PostList> selectPostList();
}
