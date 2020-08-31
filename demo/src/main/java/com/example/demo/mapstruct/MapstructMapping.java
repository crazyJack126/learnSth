package com.example.demo.mapstruct;

import com.example.demo.entity.User;
import com.example.demo.entity.UserQueryParam;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/8/28
 * @time: 14:05
 * </pre>
 */
@Mapper
public interface MapstructMapping {
    MapstructMapping INSTANCE = Mappers.getMapper(MapstructMapping.class);
    @Mapping(source = "name",target = "userName")
    UserQueryParam entity2QueryParam(User user);
}
