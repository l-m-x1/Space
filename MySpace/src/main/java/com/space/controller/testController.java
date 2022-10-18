package com.space.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController extends BaseController {


//    @RequestMapping("/*")
    public void hello(){

        System.out.println(req.getRequestURI());
        System.out.println("hello");
    }
}
