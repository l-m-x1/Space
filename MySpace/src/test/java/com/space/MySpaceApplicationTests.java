package com.space;

import com.space.dao.AddFriDao;
import com.space.domain.AddFriMsg;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MySpaceApplicationTests {
    @Autowired
    AddFriDao addFriDao;

    @Test
    void contextLoads() {
        AddFriMsg addFriMsg=new AddFriMsg();
        addFriMsg.setMsg_from(1);
        addFriMsg.setMsg_to(2);
        addFriDao.insert(addFriMsg);

    }

}
