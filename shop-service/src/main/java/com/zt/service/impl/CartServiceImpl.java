package com.zt.service.impl;

import com.zt.dao.CartDao;
import com.zt.dao.GoodsDao;
import com.zt.pojo.cart;
import com.zt.service.CartService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Resource
    private CartDao dao;
    @Resource
    private GoodsDao goodsDao;

    @Override
    public String addCartService(cart cart) {
        try{
            cart p = dao.selectCart(cart.getCname(),cart.getId());
            if(p!=null) return "exist";
            dao.insertCart(cart);
            goodsDao.addWeight(cart.getId());
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }finally {}
        return "success";
    }

    @Override
    public List<cart> selectCartService(String cname) {
        List<cart> list = null;
        try{
            list = dao.selectCartByCname(cname);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {}
        return list;
    }

    @Override
    public boolean deleteCartService(String cname, String id) {
        try{
            dao.deleteCart(cname,id);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {}
        return true;
    }

    @Override
    public boolean updateCartService(cart cart) {
        try{
            dao.deleteCart(cart.getCname(),cart.getId());
            dao.insertCart(cart);
        }catch (Exception e){
            e.printStackTrace();
        }finally {}
        return true;
    }
}
