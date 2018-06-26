package com.zt.service.impl;

import com.zt.dao.GoodsDao;
import com.zt.dao.RecommendDao;
import com.zt.pojo.goods;
import com.zt.service.RecommendService;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

@Service
public class RecommendServiceImpl implements RecommendService {
    @Resource
    private GoodsDao goodsDao;
    @Resource
    private RecommendDao recommendDao;

    @Override
    // 执行推荐业务
    public String recommendService() {
        String json = "";
        try{
            recommendDao.clearRecommend();
            List<goods> list = goodsDao.selectGoodsAll();
            Collections.sort(list, new Comparator<goods>() {
                public int compare(goods o1, goods o2) {
                    if(o1.getWeight()<o2.getWeight()) return 1;
                    if(o1.getWeight()>o2.getWeight()) return -1;
                    return 0;
                }
            });
            List<goods> newlist = new LinkedList<goods>();
            for(int i=0;i<4;i++){
                newlist.add(list.get(i));
            }
            recommendDao.insertRecommend(newlist);
            json = JSONArray.fromObject(newlist).toString();
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }finally {}
        return json;
    }
}
