package com.example.demo.test;

import com.example.demo.entity.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/8/14
 * @time: 10:23
 * </pre>
 */
public class TestSth {
    public static void main(String[] args){
        List<String> list = Arrays.asList("23","12","45");
        list = new ArrayList<>();
        Optional<String> min = list.stream().min((o1, o2) -> o1.compareTo(o2));
        System.out.println(min.orElse("555"));
        User user1 = new User("jj","kk");
        User user2 = new User("vv","hh");
        List<User> users = new ArrayList<>();
        List<String> names = users.stream().map(User::getName).collect(Collectors.toList());
        System.out.println(names);
        Thread1 thread1 = new Thread1();
        thread1.start();
        try {
            thread1.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        BigDecimal z = BigDecimal.ONE;
        System.out.println(z.negate().toPlainString());
        BigDecimal zz = new BigDecimal("12%");
        System.out.println(zz);
    }
}
