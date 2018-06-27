package com.zt.service.impl;

import com.zt.dao.GoodsIndexDao;
import com.zt.dao.SortDao;
import com.zt.pojo.goodsindex;
import com.zt.service.GoodsIndexService;
import com.zt.util.TypeUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsIndexServiceImpl implements GoodsIndexService {
    @Resource
    private GoodsIndexDao goodsIndexDao;
    @Resource
    private SortDao sortDao;

    @Override
    public List<goodsindex> goodsindexService(String type) {
        List<goodsindex> list = null;
        try{
            sortDao.clearSort();
            String t = TypeUtil.changeType(type);
            list = goodsIndexDao.selectByType(t);
            sortDao.insertSort(list);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return list;
    }
}
