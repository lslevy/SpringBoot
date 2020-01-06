package com.example.demo.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserController {

    @ApiOperation(value = "接口的功能介绍",notes = "提示接口使用者注意事项",httpMethod = "GET")
    @ApiImplicitParam(dataType = "string",name = "name",value = "姓名",required = true)
    @RequestMapping(value = "/")
    public String hello(String name) {

        return "hello "+ name;
    }


    @RequestMapping("/index")
    public ModelAndView sada(Model model){
        ModelAndView mv = new ModelAndView();
        model.addAttribute("name","Levy");
        mv.setViewName("test");
        mv.addObject("model",model);
        return mv;
    }

    @RequestMapping("/login")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }
    @RequestMapping("/add")
    public ModelAndView add(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/add");
        return mv;
    }
    @RequestMapping("/update")
    public ModelAndView update(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user/update");
        return mv;
    }
}