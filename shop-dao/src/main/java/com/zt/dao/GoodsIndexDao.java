package com.zt.dao;

import com.zt.pojo.goodsindex;

import java.util.List;

public interface GoodsIndexDao {
    // 根据类型获取索引列表
    public List<goodsindex> selectByType(String type);
}
