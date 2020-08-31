package com.example.demo.entity;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/8/28
 * @time: 14:05
 * </pre>
 */
@Data
public class UserQueryParam {
    private String userName;
    private String userPwd;
    private String gender;
    private int age;
    private List<String> roleIds;
}
