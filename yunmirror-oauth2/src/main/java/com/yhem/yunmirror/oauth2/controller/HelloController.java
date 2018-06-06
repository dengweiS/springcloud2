package com.yhem.yunmirror.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Time:17:02
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "order";
    }
    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public void doLogin(String username,String password){
        System.out.println(username);
    }
}
