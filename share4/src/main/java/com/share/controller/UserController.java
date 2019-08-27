package com.share.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.share.domain.ResultObject;
import com.share.domain.User;
import com.share.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping(path = "userController")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private ObjectMapper mapper;



    @RequestMapping(path = "findUserByUsername")
    public void findUserByUsername(String username,HttpServletResponse response) throws IOException {
        User userByUsername = userService.findUserByUsername(username);


        String json = mapper.writeValueAsString(userByUsername);
        System.out.println("json:" + json);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }

    @RequestMapping(path = "updateUser")
    public void updateUser(User user, HttpServletResponse response) throws IOException {
        ResultObject resultObject=new ResultObject();
        try {
            userService.updateUser(user);
            resultObject.setResult(true);
        }catch (Exception e){
            resultObject.setResult(false);
            resultObject.setMsg("更新信息失败，请稍后重试");
        }

        String json = mapper.writeValueAsString(resultObject);
        System.out.println("json:" + json);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
    }




    @RequestMapping(path = "tohomepage")
    public String tohomepage(){
        System.out.println("tohomepage");
        return "homepage";
    }
    @RequestMapping(path = "tohomepage1")
    public String tohomepage1(){
        System.out.println("tohomepage1");
        return "homepage1";
    }

    @RequestMapping(path = "tohomepage2")
    public String tohomepage2(){
        System.out.println("tohomepage2");
        return "homepage2";
    }

    @RequestMapping(path = "tohomepage3")
    public String tohomepage3(){
        System.out.println("tohomepage3");
        return "homepage3";
    }

    @RequestMapping(path = "toupload")
    public String toupload(){
        System.out.println("toupload");
        return "fileupload";
    }

    @RequestMapping(path = "toShouye")
    public String toShouye(){
        System.out.println("toShouye");
        return "shouye";
    }
    @RequestMapping(path = "tosousuo")
    public String tosousuo(){
        System.out.println("tosousuo");
        return "sousuo";
    }
}
