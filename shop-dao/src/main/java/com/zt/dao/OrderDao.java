package com.zt.dao;

import com.zt.pojo.order;

import java.util.List;

public interface OrderDao {
    // 添加订单信息
    public void insertOrder(order order);
    // 查询订单信息
    public List<order> selectOrder(String cname);
    // 删除订单信息
    public void deleteOrder(String rid);
}
