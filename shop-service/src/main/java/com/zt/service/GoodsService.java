package com.zt.service;

import com.zt.pojo.goods;

public interface GoodsService {
    // 商品信息查询业务
    public goods selectService(String id);
    // 添加商品信息业务
    public boolean addGoodsService(goods goods);
    // 删除商品信息业务
    public boolean deleteGoodsService(String id);
    // 更新商品信息业务
    public boolean updateGoodsService(goods goods);
}
