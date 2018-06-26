package com.zt.dao;

import com.zt.pojo.admin;

public interface AdminDao {
    // 查询管理员信息
    public admin selectAdmin(String cname);
}
