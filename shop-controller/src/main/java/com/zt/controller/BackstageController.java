package com.zt.controller;

import com.zt.pojo.cart;
import com.zt.pojo.custom;
import com.zt.pojo.goods;
import com.zt.pojo.order;
import com.zt.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class BackstageController {
    @Resource
    private AdminService adminService;
    @Resource
    private GoodsService goodsService;
    @Resource
    private OrderService orderService;
    @Resource
    private CustomService customService;
    @Resource
    private CartService cartService;

    // 管理员后台界面跳转
    @RequestMapping(value = "/admin")
    public ModelAndView toBackstage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("page/alogin.jsp");
        return modelAndView;
    }

    // 处理管理员登录
    @RequestMapping(value = "/alogin.action",method = RequestMethod.POST)
    public void alogin(@RequestParam(value = "cname") String cname,
                       @RequestParam(value = "password") String password,
                       HttpServletResponse response){
        PrintWriter out = null;
        try{
            out = response.getWriter();
            String result = adminService.loginService(cname,password);
            out.print(result);
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }

    // 添加商品信息
    @RequestMapping(value = "/addGoods.action",method = RequestMethod.POST)
    public void addGoods(@RequestParam(value = "id") String id,
                         @RequestParam(value = "img") String img,
                         @RequestParam(value = "title") String title,
                         @RequestParam(value = "info") String info,
                         @RequestParam(value = "name") String name,
                         @RequestParam(value = "price") String price,
                         @RequestParam(value = "stock") String stock,
                         @RequestParam(value = "para") String para,
                         @RequestParam(value = "type") String type,
                         @RequestParam(value = "weight") String weight,
                         HttpServletResponse response){
        PrintWriter out = null;
        try{
            out = response.getWriter();
            goods goods = new goods(id,img,title,info,name,new Integer(price),new Integer(stock),para,type,new Integer(weight));
            goodsService.addGoodsService(goods);
            out.print("success");
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }

    // 添加订单信息
    @RequestMapping(value = "/addOrder.action",method = RequestMethod.POST)
    public void addOrder(@RequestParam(value = "rid") String rid,
                         @RequestParam(value = "cname") String cname,
                         @RequestParam(value = "ids") String ids,
                         @RequestParam(value = "names") String names,
                         @RequestParam(value = "price") String price,
                         HttpServletResponse response){
        PrintWriter out = null;
        try{
            out = response.getWriter();
            order order = new order(rid,cname,ids,names,new Integer(price));
            orderService.addOrderService(order);
            out.print("success");
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }

    // 删除单个字段
    @RequestMapping(value = "/deleteItem.action",method = RequestMethod.POST)
    public void deleteItem1(@RequestParam("table") String table,
                            @RequestParam("id") String id,
                            HttpServletResponse response){
        PrintWriter out = null;
        try{
            out = response.getWriter();
            switch (table){
                case "custom":{
                    customService.deleteCustomService(id);
                    break;
                }
                case "goods":{
                    goodsService.deleteGoodsService(id);
                    break;
                }
                case "cart":{
                    String[] s = id.split("_");
                    cartService.deleteCartService(s[0],s[1]);
                    break;
                }
                case "order":{
                    orderService.deleteOrderService(id);
                    break;
                }
                default:break;
            }
            out.print("success");
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }

    // 修改客户信息
    @RequestMapping(value = "/updateCustom2.action",method = RequestMethod.POST)
    public void updateCustom2(@RequestParam(value = "cname") String cname,
                             @RequestParam(value = "name") String name,
                             @RequestParam(value = "phone") String phone,
                             @RequestParam(value = "address") String address,
                             @RequestParam(value = "password") String password,
                             @RequestParam(value = "question") String question,
                             @RequestParam(value = "answer") String answer,
                             HttpServletResponse response){
        PrintWriter out = null;
        try{
            out = response.getWriter();
            custom c = new custom(cname,password,name,phone,address,question,answer);
            customService.updateCustomService(c);
            out.print("success");
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }

    // 修改商品信息
    @RequestMapping(value = "/updateGoods.action",method = RequestMethod.POST)
    public void updateGoods(@RequestParam(value = "id") String id,
                            @RequestParam(value = "img") String img,
                            @RequestParam(value = "title") String title,
                            @RequestParam(value = "info") String info,
                            @RequestParam(value = "name") String name,
                            @RequestParam(value = "price") String price,
                            @RequestParam(value = "stock") String stock,
                            @RequestParam(value = "para") String para,
                            @RequestParam(value = "type") String type,
                            @RequestParam(value = "weight") String weight,
                            HttpServletResponse response){
        PrintWriter out = null;
        try{
            out = response.getWriter();
            goods goods = new goods(id,img,title,info,name,new Integer(price),new Integer(stock),para,type,new Integer(weight));
            goodsService.updateGoodsService(goods);
            out.print("success");
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }

    // 修改购物车信息
    @RequestMapping(value = "/updateCart.action",method = RequestMethod.POST)
    public void updateCart(@RequestParam(value = "cname") String cname,
                           @RequestParam(value = "id") String id,
                           @RequestParam(value = "img") String img,
                           @RequestParam(value = "name") String name,
                           @RequestParam(value = "price") String price,
                           @RequestParam(value = "number") String number,
                           HttpServletResponse response){
        PrintWriter out = null;
        try{
            out = response.getWriter();
            cart cart = new cart(cname,id,img,name,new Integer(price),new Integer(number));
            cartService.updateCartService(cart);
            out.print("success");
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }

    // 修改订单信息
    @RequestMapping(value = "/updateOrder.action",method = RequestMethod.POST)
    public void updateCart(@RequestParam(value = "rid") String rid,
                           @RequestParam(value = "cname") String cname,
                           @RequestParam(value = "ids") String ids,
                           @RequestParam(value = "names") String names,
                           @RequestParam(value = "price") String price,
                           HttpServletResponse response){
        PrintWriter out = null;
        try{
            out = response.getWriter();
            order order = new order(rid,cname,ids,names,new Integer(price));
            orderService.updateOrderService(order);
            out.print("success");
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }
}
