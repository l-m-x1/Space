package com.space;

import com.space.dao.AddFriDao;
import com.space.domain.AddFriMsg;
import com.space.domain.User;
import com.space.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MySpaceApplicationTests {
    @Autowired
    AddFriDao addFriDao;

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        User user=new User();
        user.setUsername("12");
        user.setPassword("124");
        userService.insert(user);
    }

}
