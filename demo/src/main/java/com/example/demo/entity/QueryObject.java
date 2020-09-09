package com.example.demo.entity;

import lombok.Data;

import java.util.List;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/8/31
 * @time: 17:36
 * </pre>
 */
@Data
public class QueryObject {
    private List<String> prdCodeList;
    private String queryDt;
}
