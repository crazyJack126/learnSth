package com.example.demo.template;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/9/8
 * @time: 16:26
 * </pre>
 */
public abstract class AbstractQueryServiceTemplate<R extends Response,T extends Request> {
    private void doCheck(T request) {
        System.out.println("do check...");
    }

    private void doWork(T request) {
        System.out.println("do work");
    }

    private void doAfter(T request) {
        throw new UnsupportedOperationException("This operation is not support on Query Template!");
    }
    public abstract R doQuery(T request);
    private void exec(T request){
        doCheck(request);
        doWork(request);
        R r = doQuery(request);
        if("0".equals(r.getCode())){
            System.out.println("succ");
        }
    }
}
