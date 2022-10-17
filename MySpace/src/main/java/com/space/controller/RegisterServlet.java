package com.space.controller;


import com.space.domain.Info;
import com.space.domain.Style;
import com.space.domain.User;
import com.space.service.InfoService;
import com.space.service.StyleService;
import com.space.service.UserService;
import com.space.service.impl.InfoServiceImpl;
import com.space.service.impl.StyleServiceImpl;
import com.space.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@RestController
@RequestMapping("/Register/*")
public class RegisterServlet extends BaseServlet {

    @Autowired
    UserService userService;

    @Autowired
    InfoService infoService;

    @Autowired
    StyleService styleService;
    public void register() throws IOException {
           

        User user = new User();
        user.setUsername(jsonObject.getString("name"));
        user.setPassword(jsonObject.getString("password"));
        userService.insert(user);
        Integer maxId = userService.getMaxId();
        resp.getWriter().write(maxId.toString());
        Info info = new Info();
        info.setId(maxId);

        infoService.insert(info);

        req.getSession().setAttribute("id",maxId);

        Style style=new Style();
         style.setUid(maxId);
        styleService.insert(style);

    }
}
