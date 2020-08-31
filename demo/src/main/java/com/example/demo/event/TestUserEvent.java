package com.example.demo.event;

import com.example.demo.entity.User;
import org.springframework.context.ApplicationEvent;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/8/11
 * @time: 13:46
 * </pre>
 */
public class TestUserEvent extends ApplicationEvent {
    public TestUserEvent(User user) {
        super(user);
    }
    public User getUser(){
        return (User)super.getSource();
    }
}
