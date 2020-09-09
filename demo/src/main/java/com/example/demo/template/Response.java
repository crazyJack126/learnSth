package com.example.demo.template;

import lombok.Data;

import java.io.Serializable;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/9/8
 * @time: 16:22
 * </pre>
 */
@Data
public class Response implements Serializable {
    private String code;
    private String msg;

}
