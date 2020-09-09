package com.example.demo.config;

import com.alibaba.fastjson.JSONObject;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/8/31
 * @time: 17:23
 * </pre>
 */
public class JsonSerializer implements Serializer<JSONObject> {
    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {

    }

    @Override
    public byte[] serialize(String topics, JSONObject data) {
        return JSONObject.toJSONBytes(data);
    }
}
