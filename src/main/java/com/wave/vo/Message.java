package com.wave.vo;

import java.util.ArrayList;
import java.util.List;

public class Message {
    private int total;
    private int pageNum;
    private List<PostList> postList = new ArrayList<>();
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public List<PostList> getPostList() {
        return postList;
    }

    public void setPostList(List<PostList> postList) {
        this.postList = postList;
    }
}
