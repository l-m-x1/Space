package com.space.service;


import com.space.domain.AddFriMsg;

import java.util.List;

public interface AddFriService {


    void insert(AddFriMsg addFriMsg);

    void delete(AddFriMsg addFriMsg);

    List<AddFriMsg> selectByTo(Integer msg_to);

    AddFriMsg selectSingle(AddFriMsg addFriMsg);
}
