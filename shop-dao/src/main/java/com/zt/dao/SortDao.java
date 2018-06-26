package com.zt.dao;

import com.zt.pojo.goods;

import java.util.List;

public interface SortDao {
    // 清空sort数据库表
    public void clearSort();
    // 给sort表添加数据
    public void insertSort(List<goods> list);
}
