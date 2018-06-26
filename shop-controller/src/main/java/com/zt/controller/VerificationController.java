package com.zt.controller;

import com.zt.pojo.custom;
import com.zt.service.AdminService;
import com.zt.service.CustomService;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

// 用户验证部分控制器
@Controller
public class VerificationController {
    @Resource
    private CustomService customService;

    // 处理客户登录
    @RequestMapping(value = "/login.action",method = RequestMethod.POST)
    public void login(@RequestParam(value = "cname") String cname,
                       @RequestParam(value = "password") String password,
                       HttpServletResponse response, HttpServletRequest request) {
        PrintWriter out = null;
        try{
            out = response.getWriter();
            String result = customService.loginService(cname,password);
            if(result.equals("success")){
                HttpSession session = request.getSession();
                session.setAttribute("cname",cname);
            }
            out.print(result);
            out.flush();
        } catch (IOException e){
            e.printStackTrace();
        } finally {}
        out.close();
    }

    // 处理客户注册
    @RequestMapping(value = "/register.action",method = RequestMethod.POST)
    public void register(@RequestParam(value = "cname") String cname,
                             @RequestParam(value = "password") String password,
                             @RequestParam(value = "name") String name,
                             @RequestParam(value = "phone") String phone,
                             @RequestParam(value = "address") String address,
                             @RequestParam(value = "question") String question,
                             @RequestParam(value = "answer") String answer,
                             HttpServletResponse response){
        PrintWriter out = null;
        try{
            out = response.getWriter();
            custom custom = new custom(cname,password,name,phone,address,question,answer);
            String result = customService.registerService(custom);
            out.print(result);
            out.flush();
        } catch (IOException e){
            e.printStackTrace();
        } finally {}
        out.close();
    }

    // 获取客户信息
    @RequestMapping(value = "/getCustom.action",method = RequestMethod.POST)
    public void getCustom (@RequestParam(value = "cname") String cname,
                             HttpServletResponse response){
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;
        try{
            out = response.getWriter();
            custom c = customService.getCustomService(cname);
            if(c==null){
                out.print("no");
            }
            else{
                JSONObject jsonObject = JSONObject.fromObject(c);
                String json = jsonObject.toString();
                out.print(json);
            }
            out.flush();
        } catch (IOException e){
            e.printStackTrace();
        } finally{}
        out.close();
    }

    // 处理客户更换密码
    @RequestMapping(value = "/updatePassword.action",method = RequestMethod.POST)
    public void updatePassword(@RequestParam(value = "cname") String cname,
                            @RequestParam(value = "password") String password,
                            HttpServletResponse response){
        PrintWriter out = null;
        try{
            out = response.getWriter();
            String result = customService.setPasswordService(cname,password);
            out.print(result);
            out.flush();
        } catch (IOException e){
            e.printStackTrace();
        } finally {}
        out.close();
    }

    // 处理客户退出登录
    @RequestMapping(value = "/exit.action",method = RequestMethod.GET)
    public ModelAndView exit(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("cname");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/");
        return modelAndView;
    }
}