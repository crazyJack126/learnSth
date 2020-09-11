package com.example.demo.listener;


import org.springframework.stereotype.Component;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/8/31
 * @time: 16:59
 * </pre>
 */
@Component
public class KafkaConsumer {
    // 消费监听
//    @KafkaListener(topics = {"topic1"})
//    public void onMessage1(ConsumerRecord<?, ?> record){
//        // 消费的哪个topic、partition的消息,打印出消息内容
//        JSONObject value = (JSONObject)record.value();
//        String queryDt = value.getString("queryDt");
//        System.out.println("简单消费："+record.topic()+"-"+record.partition()+"-"+record.value());
//    }

}
