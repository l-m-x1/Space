package com.space.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class testServlet extends BaseServlet{


    @RequestMapping("/123/*")
    public void hello(){

        System.out.println(req.getRequestURI());
        System.out.println("hello");
    }
}
