package com.zt.service.impl;

import com.zt.dao.GoodsDao;
import com.zt.dao.GoodsListDao;
import com.zt.pojo.goods;
import com.zt.service.GoodsListService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsListServiceImpl implements GoodsListService {
    @Resource
    private GoodsDao goodsDao;
    @Resource
    private GoodsListDao goodsListDao;

    @Override
    public boolean goodsListService(String id) {
        try{
            goodsListDao.clearGoodslist();
            goods p = goodsDao.selectGoodsById(id);
            goodsListDao.insertGoodslist2(p);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean goodsListServiceByLike(String info) {
        try{
            goodsListDao.clearGoodslist();
            List<goods> list = goodsDao.selectGoodsLike("%"+info+"%");
            goodsListDao.insertGoodslist(list);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
