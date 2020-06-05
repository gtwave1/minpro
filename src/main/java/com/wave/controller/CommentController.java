package com.wave.controller;

import com.wave.pojo.Comment;
import com.wave.service.CommentService;
import com.wave.vo.CommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@ResponseBody
public class CommentController {
    @Autowired
    private CommentService commentService;

    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY年MM月dd日 HH:mm:ss");

    @RequestMapping("/comment")
    public CommentVo selectByPostid(Integer postid){
        Comment comment = commentService.selectByPostid(postid);
        CommentVo commentVo = new CommentVo();
        commentVo.setId(comment.getId());
        commentVo.setContext(comment.getContext());
        commentVo.setDate(simpleDateFormat.format(comment.getDate()));
        commentVo.setUserid(comment.getUserid());
        commentVo.setPostid(comment.getPostid());
        commentVo.setUsername(comment.getUsername());
        return commentVo;
    }

    //String context,Integer postid,String username,String userid
    @RequestMapping("/doComment")
    public String insertComment(Comment comment){
        comment.setDate(new Date(System.currentTimeMillis()));
        commentService.insertComment(comment);
        return "ok";
    }
}
