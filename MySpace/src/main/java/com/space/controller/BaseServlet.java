package com.space.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;


public class BaseServlet {
    @Autowired
    protected HttpServletRequest req;

    @Autowired
    protected HttpServletResponse resp;

    protected JSONObject jsonObject;

@RequestMapping("/*")
    public void init(){
        String contentType = req.getContentType();
        System.out.println(contentType+"13");
        if(contentType!=null&&contentType.contains("application/json")){
            String requestBody = null;
            try {
                requestBody = IOUtils.toString(req.getInputStream());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            jsonObject = JSON.parseObject(requestBody);
        }

        String uri = req.getRequestURI();
        int index = uri.lastIndexOf('/');
        String func = uri.substring(index + 1);
        try {
            this.getClass().getMethod(func).invoke(this);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }


}