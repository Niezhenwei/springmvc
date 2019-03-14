package com.huayu.springmvc.controller;

import com.alibaba.fastjson.JSON;
import com.huayu.springmvc.bean.Student;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Nie
 * @date: 2018/12/11 17:14
 * @description:
 */
public class User1Controller implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html");
        Student s = new Student();
        s.setId(10);
        s.setUname("周杰伦");
        s.setSex("男");
        response.getWriter().write(JSON.toJSONString(s));
    }
}
