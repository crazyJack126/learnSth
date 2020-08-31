package com.example.demo.service.impl;

import com.example.demo.service.Cluster;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/8/29
 * @time: 13:40
 * </pre>
 */
public class FailOverCluster implements Cluster {
    private Cluster cluster;

    public FailOverCluster(Cluster cluster) {
        this.cluster = cluster;
    }

    @Override
    public Cluster join() {
        System.out.println("failOver");
        return cluster;
    }
}
