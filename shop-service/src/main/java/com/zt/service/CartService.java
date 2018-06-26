package com.zt.service;

import com.zt.pojo.cart;

import java.util.List;

public interface CartService {
    // 处理加入购物车业务
    public String addCartService(cart cart);
    // 处理查看购物车业务
    public List<cart> selectCartService(String cname);
    // 删除购物车业务
    public boolean deleteCartService(String cname,String id);
    // 更新购物车业务
    public boolean updateCartService(cart cart);
}
