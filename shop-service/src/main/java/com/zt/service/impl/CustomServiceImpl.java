package com.zt.service.impl;

import com.zt.dao.CustomDao;
import com.zt.pojo.admin;
import com.zt.pojo.custom;
import com.zt.service.CustomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CustomServiceImpl implements CustomService {
    @Resource
    private CustomDao dao;

    // 处理查询客户信息业务
    public custom getCustomService(String cname) {
        custom c = null;
        try {
            c = dao.selectCustom(cname);
        }catch (Exception e){
            e.printStackTrace();
        }finally {}
        return c;
    }

    // 处理登录业务 success--登录成功 cno--账户不存在 pno--密码错误 error--后台异常
    public String loginService(String cname, String password) {
        custom c = null;
        try{
            c = dao.selectCustom(cname);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }finally {}
        if(c==null) return "cno";
        if(c.getPassword().equals(password)) return "success";
        else return "pno";
    }

    // 处理注册业务
    public String registerService(custom c) {
        try {
            dao.insertCustom(c);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }finally {}
        return "success";
    }

    // 处理改密码业务
    public String setPasswordService(String cname, String password) {
        try{
            dao.updatePassword(cname,password);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }finally {}
        return "success";
    }

    // 处理客户信息修改业务
    @Override
    public boolean updateCustomService(custom c) {
        try{
            dao.deleteCustom(c.getCname());
            dao.insertCustom(c);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {}
        return true;
    }

    @Override
    public boolean deleteCustomService(String cname) {
        try{
            dao.deleteCustom(cname);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally {}
        return true;
    }
}
