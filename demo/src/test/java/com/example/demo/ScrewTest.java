package com.example.demo;

import cn.smallbun.screw.core.Configuration;
import cn.smallbun.screw.core.engine.EngineConfig;
import cn.smallbun.screw.core.engine.EngineFileType;
import cn.smallbun.screw.core.engine.EngineTemplateType;
import cn.smallbun.screw.core.execute.DocumentationExecute;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * <pre>
 * @description:
 * @copyright: Copyright (c) 2020 迅策科技
 * @author: lifeng.ruan
 * @version: 1.0
 * @date: 2020/8/27
 * @time: 16:53
 * </pre>
 */
@SpringBootTest
public class ScrewTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void contextLoads() {
        //数据源
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("oracle.jdbc.OracleDriver");
        hikariConfig.setJdbcUrl("jdbc:oracle:thin:@//192.168.20.71:1521/orcl");
        hikariConfig.setUsername("xhe");
        hikariConfig.setPassword("xhe");
        //设置可以获取tables remarks信息
        hikariConfig.addDataSourceProperty("useInformationSchema", "true");
        hikariConfig.setMinimumIdle(2);
        hikariConfig.setMaximumPoolSize(5);
        DataSource dataSource = new HikariDataSource(hikariConfig);


//        DataSource dataSourceMysql = applicationContext.getBean(DataSource.class);
        // 生成文件配置
        EngineConfig engineConfig = EngineConfig.builder()
                // 生成文件路径，自己mac本地的地址，这里需要自己更换下路径
                .fileOutputDir("D:/")
                // 打开目录
                .openOutputDir(false)
                // 文件类型
                .fileType(EngineFileType.MD)
                // 生成模板实现
                .produceType(EngineTemplateType.freemarker).build();
        // 生成文档配置（包含以下自定义版本号、描述等配置连接）
        String reset = "0";
        Configuration config = Configuration.builder()
                .version("1.0.3")
                .description("生成文档信息描述")
                .dataSource(dataSource)
                .engineConfig(engineConfig)
//                .produceConfig(getProcessConfig())
                .build();
        // 执行生成
        new DocumentationExecute(config).execute();
    }
}

