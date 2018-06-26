package com.zt.dao;

import com.zt.pojo.admin;
import com.zt.pojo.custom;
import org.apache.ibatis.annotations.Param;

// 封装验证身份的所有方法
public interface CustomDao {
    // 根据帐户名查找客户
    public custom selectCustom(String cname);
    // 添加账户信息
    public void insertCustom(custom c);
    // 更新账户密码
    public void updatePassword(@Param("cname") String cname, @Param("password") String password);
    // 删除账户信息
    public void deleteCustom(String cname);
}
