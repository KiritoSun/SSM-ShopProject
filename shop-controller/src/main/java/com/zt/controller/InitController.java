package com.zt.controller;

import com.sun.deploy.net.HttpResponse;
import com.zt.service.InitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class InitController {
    @Resource
    private InitService initService;

    @RequestMapping(value = "/init.action",method = RequestMethod.POST)
    public void init(HttpServletResponse response){
        PrintWriter out = null;
        try{
            out = response.getWriter();
            initService.init();
            out.print("success");
            out.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {}
        out.close();
    }
}
