package com.zt.dao;

import com.zt.pojo.goods;

import java.util.List;

public interface GoodsListDao {
    // 清空goodslist数据库表
    public void clearGoodslist();
    // 给goodslist表添加数据
    public void insertGoodslist(List<goods> list);
    // 给goodslist表添加一条数据
    public void insertGoodslist2(goods goods);
}
