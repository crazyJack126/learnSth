package com.example.demo.entity;

import com.example.demo.template.Response;
import lombok.Data;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/9/8
 * @time: 16:57
 * </pre>
 */
@Data
public class UserResponse extends Response {
    private String userName;
    private String gender;
    private int age;
}
