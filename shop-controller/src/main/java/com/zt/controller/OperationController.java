package com.zt.controller;

import com.zt.pojo.cart;
import com.zt.pojo.custom;
import com.zt.pojo.order;
import com.zt.model.pay;
import com.zt.service.CartService;
import com.zt.service.CustomService;
import com.zt.service.OrderService;
import com.zt.util.NumberUtil;
import com.zt.util.PayUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
public class OperationController {
    @Resource
    private CartService cartService;
    @Resource
    private OrderService orderService;
    @Resource
    private CustomService customService;

    // 加入购物车
    @RequestMapping(value = "/addCart.action",method = RequestMethod.POST)
    public void addCart(@RequestParam(value = "cname") String cname,
                        @RequestParam(value = "id") String id,
                        @RequestParam(value = "img") String img,
                        @RequestParam(value = "name") String name,
                        @RequestParam(value = "price") String price,
                        @RequestParam(value = "number") String number,
                        HttpServletResponse response){
        PrintWriter out = null;
        try{
            out = response.getWriter();
            int p = new Integer(price);
            int n = new Integer(number);
            String result = cartService.addCartService(new cart(cname,id,img,name,p,n));
            out.print(result);
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }

    // 删除购物车记录
    @RequestMapping(value = "/removeCart.action",method = RequestMethod.POST)
    public void removeCart(@RequestParam(value = "id") String id,
                           HttpServletRequest request,HttpServletResponse response){
        HttpSession session = null;
        PrintWriter out = null;
        try{
            session = request.getSession();
            out = response.getWriter();
            String cname = session.getAttribute("cname").toString();
            cartService.deleteCartService(cname,id);
            out.print("success");
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }

    // 提交订单
    @RequestMapping(value = "/submitOrder.action",method = RequestMethod.POST)
    public void submitOrder(HttpServletRequest request,HttpServletResponse response){
        HttpSession session = null;
        PrintWriter out = null;
        try{
            session = request.getSession();
            out = response.getWriter();
            String c_id = NumberUtil.createNumber();
            String cname = session.getAttribute("cname").toString();
            List<pay> list = (List<pay>) session.getAttribute("pay");
            String price = session.getAttribute("allprice").toString();
            order order = PayUtil.createOrder(c_id,list,cname,price);
            System.out.println(order);
            orderService.addOrderService(order);
            for(pay e : list){
                cartService.deleteCartService(cname,e.getId());
            }
            out.print("success");
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
    }

    // 删除订单记录
    @RequestMapping(value = "/removeOrder.action",method = RequestMethod.POST)
    public void removeOrder(@RequestParam(value = "rid") String rid,
                            HttpServletRequest request,HttpServletResponse response){
        PrintWriter out = null;
        try{
            out = response.getWriter();
            orderService.deleteOrderService(rid);
            out.print("success");
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }

    // 跟新用户信息
    @RequestMapping(value = "/updateCustom.action",method = RequestMethod.POST)
    public void updateCustom(@RequestParam(value = "name") String name,
                             @RequestParam(value = "phone") String phone,
                             @RequestParam(value = "address") String address,
                             @RequestParam(value = "password") String password,
                             @RequestParam(value = "question") String question,
                             @RequestParam(value = "answer") String answer,
                             HttpServletRequest request,HttpServletResponse response){
        PrintWriter out = null;
        HttpSession session = null;
        try{
            out = response.getWriter();
            session = request.getSession();
            String cname = session.getAttribute("cname").toString();
            custom custom = new custom(cname,password,name,phone,address,question,answer);
            customService.updateCustomService(custom);
            out.print("success");
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }
}
