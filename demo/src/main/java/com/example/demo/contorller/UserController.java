package com.example.demo.contorller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/9/10
 * @time: 11:21
 * </pre>
 */
@RestController
@EnableDiscoveryClient
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/getConfig")
    public User getConfig(){
        return userService.getUserInfo("jack");
    }

}
