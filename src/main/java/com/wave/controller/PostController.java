package com.wave.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wave.pojo.Post;
import com.wave.service.PostService;
import com.wave.until.Page;
import com.wave.vo.Message;
import com.wave.vo.Meta;
import com.wave.vo.PostList;
import com.wave.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping("/post")
    public Result select(Page page){
        PageHelper.offsetPage(page.getPageNum(),10);
        List<PostList> lists = postService.selectPostList();
        int total = (int) new PageInfo<>(lists).getTotal();
        page.caculateLast(total);
        Message message = new Message();
        message.setPageNum(page.getPageNum());
        message.setPostList(lists);
        message.setTotal(total);
        Meta meta = new Meta();
        meta.setMsg("获取成功");
        meta.setState(200);
        Result result = new Result();
        result.setMessage(message);
        result.setMeta(meta);
        return result;
    }
}
