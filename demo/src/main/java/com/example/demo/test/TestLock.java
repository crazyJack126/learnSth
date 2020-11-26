package com.example.demo.test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/11/25
 * @time: 10:28
 * </pre>
 */
public class TestLock {
    private static ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args){
        lock.lock();
    }
}
