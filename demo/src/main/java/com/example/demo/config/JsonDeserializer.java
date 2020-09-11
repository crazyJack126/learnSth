//package com.example.demo.config;
//
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//import org.apache.kafka.common.serialization.Deserializer;
//
//import java.util.Map;
//
///**
// * <pre>
// * @description:
// * @copyright: Copyright (c) 2020 迅策科技
// * @author: lifeng.ruan
// * @version: 1.0
// * @date: 2020/8/31
// * @time: 17:25
// * </pre>
// */
//public class JsonDeserializer implements Deserializer<JSONObject> {
//    @Override
//    public void configure(Map<String, ?> configs, boolean isKey) {
//
//    }
//
//    @Override
//    public JSONObject deserialize(String topic, byte[] data) {
//        return JSON.parseObject(data,JSONObject.class);
//    }
//}
