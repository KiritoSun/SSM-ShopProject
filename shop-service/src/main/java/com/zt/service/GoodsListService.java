package com.zt.service;

public interface GoodsListService {
    // 执行获取商品列表业务
    public boolean goodsListService(String title);
    // 执行模糊查询商品业务
    public boolean goodsListServiceByLike(String info);
}
