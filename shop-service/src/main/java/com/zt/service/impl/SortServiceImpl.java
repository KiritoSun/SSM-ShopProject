package com.zt.service.impl;

import com.zt.dao.GoodsDao;
import com.zt.dao.SortDao;
import com.zt.pojo.goods;
import com.zt.service.SortService;
import com.zt.util.TypeUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SortServiceImpl implements SortService {
    @Resource
    private GoodsDao goodsDao;
    @Resource
    private SortDao sortDao;

    @Override
    public boolean sortService(String type) {
        try{
            sortDao.clearSort();
            String t = TypeUtil.changeType(type);
            List<goods> list = goodsDao.selectGoodsByType(t);
            //sortDao.insertSort(list);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {}
        return true;
    }
}
