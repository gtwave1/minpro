package com.wave.mapper;

import com.wave.pojo.Comment;

public interface CommentMapper {
    //查出评论详情
    Comment selectByPostid(Integer id);
    //添加评论
    void insertComment(Comment comment);
}
