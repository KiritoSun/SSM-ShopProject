package com.zt.dao;

import com.zt.pojo.goods;

import java.util.List;

public interface GoodsDao {
    // 获取指定类型的商品
    public List<goods> selectGoodsByType(String type);
    // 获取指定title的商品
    public List<goods> selectGoodsByTitle(String title);
    // 取出所有的商品
    public List<goods> selectGoodsAll();
    // 根据id查询商品
    public goods selectGoodsById(String id);
    // 添加商品
    public void insertGoods(goods goods);
    // 删除指定商品
    public void deleteGoods(String id);
    // 权重加一操作
    public void addWeight(String id);
    // 搜索
    public List<goods> selectGoodsLike(String info);
}
