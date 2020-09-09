package com.example.demo.entity;

import com.example.demo.template.Request;
import lombok.Data;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/9/8
 * @time: 16:56
 * </pre>
 */
@Data
public class UserRequest extends Request {
    private String userName;
    private String pwd;
}
