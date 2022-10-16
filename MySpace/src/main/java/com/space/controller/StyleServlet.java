package com.space.controller;

import com.alibaba.fastjson.JSON;
import com.space.pojo.Style;
import com.space.service.StyleService;
import com.space.service.impl.StyleServiceImpl;
import com.space.web.BaseServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet( "/Style/*")
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
