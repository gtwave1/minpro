package com.wave.service.impl;

import com.wave.mapper.CommentMapper;
import com.wave.pojo.Comment;
import com.wave.service.CommentService;
import com.wave.vo.CommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper mapper;



    @Override
    public Comment selectByPostid(Integer id) {
        Comment comment =  mapper.selectByPostid(id);

        return comment;
    }

    @Override
    public void insertComment(Comment comment) {
        mapper.insertComment(comment);
    }
}
