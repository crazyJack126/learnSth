package com.example.demo.template;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/9/8
 * @time: 16:23
 * </pre>
 */
public interface QueryServiceTemplate<R extends Response,T extends Request>  {
    void doCheck(T request);
    void doWork(T request);
    void doAfter(T request);
}
