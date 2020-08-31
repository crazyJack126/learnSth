package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.entity.UserQueryParam;
import com.example.demo.mapstruct.MapstructMapping;
import com.example.demo.service.impl.FailOverCluster;
import com.example.demo.service.impl.MockCluster;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/8/28
 * @time: 14:12
 * </pre>
 */
@SpringBootTest
public class mapstructTest {

    @Test
    public void entity2QueryParamTest(){
        User user = new User();
        user.setAge(23);
        user.setAuth("auth");
        user.setRoleIds(Arrays.asList("223","3rer"));
        user.setGender("w");
        user.setName("leon");
        UserQueryParam userQueryParam = MapstructMapping.INSTANCE.entity2QueryParam(user);
        Assert.assertEquals(user.getName(),userQueryParam.getUserName());
        Assert.assertEquals(user.getAge(),userQueryParam.getAge());
        Assert.assertEquals(user.getGender(),userQueryParam.getGender());
        MockCluster mockCluster = new MockCluster(new FailOverCluster(null));
        mockCluster.join();
        String colorCode = NumberEnum.getColorCode(new Double(100.0927));

    }
}
