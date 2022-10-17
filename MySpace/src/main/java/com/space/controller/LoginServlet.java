package com.space.controller;

import com.space.domain.User;

import com.space.service.UserService;
import com.space.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@RestController
@RequestMapping("/Login")
public class LoginServlet extends BaseServlet {

    @Autowired
    UserService userService;

    public void login() throws IOException {



        Integer id = jsonObject.getInteger("id");
        User user = userService.selectById(id);
        String password = jsonObject.getString("password");
        if(user==null){
            resp.getWriter().write("account error");
        }
        else if(!user.getPassword().equals(password)){
            resp.getWriter().write("password error");
        }
        else {
            HttpSession session = req.getSession();
            session.setAttribute("id",id);
            session.setAttribute("name",user.getUsername());
            session.setAttribute("password",password);
            resp.getWriter().write("successfully login");
        }

    }
}
