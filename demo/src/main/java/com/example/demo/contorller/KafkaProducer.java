//package com.example.demo.contorller;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import com.alibaba.fastjson.JSONPObject;
//import com.example.demo.entity.QueryObject;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.support.SendResult;
//import org.springframework.util.concurrent.ListenableFuture;
//import org.springframework.web.bind.annotation.*;
//
///**
// * <pre>
// * @description:
// * @copyright: Copyright (c) 2020 迅策科技
// * @author: lifeng.ruan
// * @version: 1.0
// * @date: 2020/8/31
// * @time: 16:56
// * </pre>
// */
//@RestController
//public class KafkaProducer {
//    @Autowired
//    private KafkaTemplate<String, Object> kafkaTemplate;
//
//    // 发送消息
//    @PostMapping("/kafka/normal")
//    public void sendMessage1(@RequestBody QueryObject normalMessage) {
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("prdCode",normalMessage.getPrdCodeList().get(0));
//        jsonObject.put("queryDt",normalMessage.getQueryDt());
//
//        ListenableFuture<SendResult<String, Object>> topic1 = kafkaTemplate.send("topic1", jsonObject);
//        System.out.println("send_succ");
//    }
//
//}
