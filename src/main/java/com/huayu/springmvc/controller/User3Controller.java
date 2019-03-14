package com.huayu.springmvc.controller;

import com.huayu.springmvc.bean.Classes;
import com.huayu.springmvc.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Nie
 * @date: 2018/12/11 17:41
 * @description:
 */
//Controller标识它为一个控制器
@Controller
@RequestMapping("/user") //窄化请求映射
public class User3Controller {
    //RequestMapping实现对queryall方法映射，一个方法对应一个url
    @RequestMapping(value="/queryAll.do",method = {RequestMethod.GET,RequestMethod.POST})
    public String  queryAll(Model model){
        List<String> list = new ArrayList<>();
        list.add("华为");
        list.add("apple");
        list.add("小米");
        model.addAttribute("user",list);
        return "forward:list.jsp";
    }

    @RequestMapping(value="/query.do",method = {RequestMethod.GET,RequestMethod.POST})
    public String query(Model model, Integer id, Student student,String s,double d,boolean b,Classes classes){
        List<String> list = new ArrayList<>();
        list.add("华为");
        list.add("apple");
        list.add("小米");
        list.add("方法参数："+id);
        list.add("学生名:"+student.getUname());
        list.add("字符串:"+s);
        list.add("双精度:"+d);
        list.add("布尔类型:"+b);
        list.add("班级名字:"+classes.getCname());
        model.addAttribute("user",list);
        return "list.jsp";
    }

    //如果没有使用@RequestParam，要求request传入的参数名必须和controller方法形参一致，方可绑定成功。
    @RequestMapping(value="/save.do",method = {RequestMethod.GET,RequestMethod.POST})
    public String save(Model model, @RequestParam(value = "ids")Integer id, Classes classes){
        List<String> list = new ArrayList<>();
        list.add("华为");
        list.add("方法参数:"+id);
        for (int i = 0; i < classes.getList().size(); i++) {
            list.add(""+classes.getList().get(i).getCname());
        }
        model.addAttribute("user",list);
        return "list.jsp";
    }

    //如果没有使用@RequestParam，要求request传入的参数名必须和controller方法形参一致，方可绑定成功。
    @RequestMapping(value="/add.do",method = {RequestMethod.GET,RequestMethod.POST})
    public String add(Model model,Integer[] id){
        List<String> list = new ArrayList<>();
        list.add("华为");
        for (int i = 0; i <id.length ; i++) {
            list.add("学生id："+id[i]);
        }
        model.addAttribute("user",list);
        return "list.jsp";
    }


    @RequestMapping(value="/date.do",method = {RequestMethod.GET,RequestMethod.POST})
    public String date(Student student){
       System.out.println("生日："+student.getBirthday());
        return "list.jsp";
    }
}
