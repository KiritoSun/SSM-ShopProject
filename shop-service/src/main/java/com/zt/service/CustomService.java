package com.zt.service;

import com.zt.pojo.custom;

public interface CustomService {
    // 处理查询客户信息业务
    public custom getCustomService(String cname);
    // 处理登录业务
    public String loginService(String cname, String password);
    // 处理注册业务
    public String registerService(custom c);
    // 处理改密码业务
    public String setPasswordService(String cname, String password);
    // 处理跟新客户信息业务
    public boolean updateCustomService(custom c);
    // 处理删除客户信息业务
    public boolean deleteCustomService(String cname);
}
