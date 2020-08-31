package com.example.demo.test;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/8/20
 * @time: 15:44
 * </pre>
 */
public class Thread1 extends Thread {
    @Override
    public void run() {
        try{
            Thread.sleep(3000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("thread1 complete!");
    }
}
