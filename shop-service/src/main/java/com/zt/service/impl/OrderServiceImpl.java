package com.zt.service.impl;

import com.zt.dao.OrderDao;
import com.zt.model.orderv;
import com.zt.pojo.order;
import com.zt.service.OrderService;
import com.zt.util.PayUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao dao;

    @Override
    public boolean addOrderService(order order) {
        try{
            dao.insertOrder(order);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {}
        return true;
    }

    @Override
    public List<orderv> getOrderService(String cname) {
        List<orderv> vlist = new ArrayList<>();
        try{
            List<order> list = dao.selectOrder(cname);
            orderv v = null;
            for(order e : list){
                v = new orderv(e.getRid(),e.getCname(), PayUtil.toList(e.getNames()),e.getPrice());
                vlist.add(v);
            }
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {}
        return vlist;
    }

    @Override
    public boolean deleteOrderService(String rid) {
        try{
            dao.deleteOrder(rid);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {}
        return true;
    }

    @Override
    public boolean updateOrderService(order order) {
        try{
            dao.deleteOrder(order.getRid());
            dao.insertOrder(order);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {}
        return true;
    }
}
