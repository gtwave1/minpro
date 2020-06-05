package com.wave.service.impl;

import com.wave.mapper.PostMapper;
import com.wave.mapper.UserMapper;
import com.wave.pojo.Post;
import com.wave.pojo.User;
import com.wave.service.PostService;
import com.wave.vo.PostList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月dd日 HH:mm:ss");
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<Post> select() {
        List<Post> lists =  postMapper.select();
        return lists;
    }

    @Override
    public List<PostList> selectPostList() {
        List<Post> lists = postMapper.select();
        List<PostList> postLists = new ArrayList<>();
        for (Post item : lists) {
            PostList postList = new PostList();
            User user = userMapper.selectById(item.getUserid());
            postList.setId(item.getId());
            postList.setPublish_date(simpleDateFormat.format(item.getPublish_date()));
            postList.setDescription(item.getDescription());
            postList.setVideo_url(item.getVideo_url());
            postList.setImage_url(item.getImage_url());
            postList.setCommentNumber(item.getCommentNumber());
            postList.setThumbup(item.getThumbup());
            postList.setOpen_type(item.getOpen_type());
            postList.setNavigator_url(item.getNavigator_url());
            postList.setUser(user);
            postLists.add(postList);
        }
        return postLists;
    }
}
