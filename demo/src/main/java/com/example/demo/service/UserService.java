package com.example.demo.service;

import com.example.demo.entity.User;

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
public interface UserService {
    User getUserInfo(String name);
}
