package com.zt.service;

import com.zt.model.orderv;
import com.zt.pojo.order;

import java.util.List;

public interface OrderService {
    // 添加订单数据
    public boolean addOrderService(order order);
    // 查询订单数据
    public List<orderv> getOrderService(String cname);
    // 删除订单数据
    public boolean deleteOrderService(String rid);
    // 更新订单信息
    public boolean updateOrderService(order order);
}
