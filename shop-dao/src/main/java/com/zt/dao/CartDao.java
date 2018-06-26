package com.zt.dao;

import com.zt.pojo.cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartDao {
    // 插入数据
    public void insertCart(cart cart);
    // 查询数据
    public cart selectCart(@Param("cname") String cname,@Param("id") String id);
    // 查询购物记录
    public List<cart> selectCartByCname(String cname);
    // 删除购物记录
    public void deleteCart(@Param("cname") String cname,@Param("id") String id);
}
