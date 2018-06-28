package com.zt.service.impl;

import com.zt.dao.InitDao;
import com.zt.service.InitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class InitServiceImpl implements InitService {
    @Resource
    private InitDao initDao;

    @Override
    public void init() {
        try{
            initDao.init();
        }catch (Exception e){
            e.printStackTrace();
        }finally {}
    }
}
