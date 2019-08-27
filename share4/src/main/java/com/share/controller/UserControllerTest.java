package com.share.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.share.domain.ResultObject;
import com.share.domain.User;
import com.share.service.DisInterceptUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "UserControllerTest")
public class UserControllerTest {
    @Autowired
    private DisInterceptUserService disInterceptUserService;

    @Autowired
    private ObjectMapper mapper;

    @RequestMapping(path = "findAllUsername1")
    public String findAllUsername(){
        System.out.println("Controller层");
        List<String> allUsername = disInterceptUserService.findAllUsername();
        for (String s:allUsername){
            System.out.println(s);
        }
        return "success";
    }

    @RequestMapping(path = "outTest")
    public void outTest(HttpServletResponse response) throws IOException {
        System.out.println("请求到这里了");
        ResultObject resultObject=new ResultObject();
        List<User> userList=new ArrayList<User>();
        User user=new User("saf","sfd","sfd","sfd","sfd","sfd");
        User user1=new User("saf1","saf1","saf1","saf1","saf1","saf");
        User user2=new User("saf2","saf2","saf2","saf2","saf","saf");
        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        resultObject.setMsg("查询正确");
        resultObject.setResult(true);
        resultObject.setData(userList);
        String json = mapper.writeValueAsString(resultObject);
        System.out.println("json:" + json);
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(json);
        return;
    }






}
