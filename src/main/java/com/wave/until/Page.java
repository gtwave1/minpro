package com.wave.until;

public class Page {

    int pageNum=0;
    int pageSize = 5;
    int last = 0;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
    public int getLast() {
        return last;
    }
    public void setLast(int last) {
        this.last = last;
    }

    public void caculateLast(int total) {
        // 假设总数是50，是能够被5整除的，那么最后一页的开始就是45
        if (0 == total % pageSize)
            last = total - pageSize;
            // 假设总数是51，不能够被5整除的，那么最后一页的开始就是50
        else
            last = total - total % pageSize;
    }

}