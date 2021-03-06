package com.example.demo.entity;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/8/11
 * @time: 13:48
 * </pre>
 */
@Data
public class User {

    private String name;
    private String gender;
    private int age;
    private String auth;
    private List<String> roleIds;

    public User() {
    }

    public User(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }


}
