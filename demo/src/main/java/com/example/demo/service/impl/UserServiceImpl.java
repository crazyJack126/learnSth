package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.entity.UserRequest;
import com.example.demo.entity.UserResponse;
import com.example.demo.service.UserService;
import com.example.demo.event.TestUserEvent;
import com.example.demo.template.AbstractQueryServiceTemplate;
import com.example.demo.template.QueryServiceTemplate;
import com.example.demo.util.SpringUtil;
import org.springframework.stereotype.Service;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/8/11
 * @time: 13:57
 * </pre>
 */
@Service
public class UserServiceImpl extends AbstractQueryServiceTemplate<UserResponse, UserRequest> implements UserService {

    @Override
    public User getUserInfo(String name) {
        User user = new User("jack","man");
        SpringUtil.getApplicationContext().publishEvent(new TestUserEvent(user));
        new AbstractQueryServiceTemplate<UserResponse,UserRequest>(){

            @Override
            public UserResponse doQuery(UserRequest request) {
                return null;
            }
        };
        return user;
    }

    @Override
    public UserResponse doQuery(UserRequest request) {
        return null;
    }
}
