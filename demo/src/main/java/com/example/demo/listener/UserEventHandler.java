package com.example.demo.listener;

import com.example.demo.entity.User;
import com.example.demo.event.TestUserEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/8/11
 * @time: 13:52
 * </pre>
 */
@Component
public class UserEventHandler implements ApplicationListener<TestUserEvent> {
    @Override
    public void onApplicationEvent(TestUserEvent testUserEvent) {
        User user = testUserEvent.getUser();
        System.out.println("user:"+user.getName()+"-"+user.getGender());
    }
}
