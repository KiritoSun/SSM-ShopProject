package com.zt.service;

import com.zt.pojo.goodsindex;

import java.util.List;

public interface GoodsIndexService {
    // 处理分类索引业务
    public List<goodsindex> goodsindexService(String type);
}
