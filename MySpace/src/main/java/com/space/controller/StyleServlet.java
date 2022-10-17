package com.space.controller;

import com.alibaba.fastjson.JSON;
import com.space.domain.Style;

import com.space.service.StyleService;
import com.space.service.impl.StyleServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@RestController
@RequestMapping( "/Style/*")
public class StyleServlet extends BaseServlet {

    StyleService styleService=new StyleServiceImpl();

    public void show() throws IOException {
        HttpSession session=req.getSession();
        Integer uid = (Integer) session.getAttribute("id");
        Style styles = styleService.selectByUid(uid);
        String jsonString = JSON.toJSONString(styles);
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    public void updateType(){
        HttpSession session=req.getSession();
        Integer uid = (Integer) session.getAttribute("id");
        String type=jsonObject.getString("type");
        styleService.updateType(uid,type);
    }
}
