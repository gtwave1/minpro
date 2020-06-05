package com.wave.service;

import com.wave.pojo.Comment;

public interface CommentService {
    Comment selectByPostid(Integer id);

    void insertComment(Comment comment);
}
