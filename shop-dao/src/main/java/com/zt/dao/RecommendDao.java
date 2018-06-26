package com.zt.dao;

import com.zt.pojo.goods;

import java.util.List;

public interface RecommendDao {
    // 清空recommend数据库表
    public void clearRecommend();
    // 给recommend表添加数据
    public void insertRecommend(List<goods> list);
}
