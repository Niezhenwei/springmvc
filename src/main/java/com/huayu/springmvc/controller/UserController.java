package com.huayu.springmvc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Nie
 * @date: 2018/12/11 14:49
 * @description:
 */
public class UserController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        List<String> list = new ArrayList<>();
        list.add("华为");
        list.add("apple");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",list);
        modelAndView.setViewName("list");
        return modelAndView;
    }
}
