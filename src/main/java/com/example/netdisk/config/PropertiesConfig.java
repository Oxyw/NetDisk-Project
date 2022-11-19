package com.example.netdisk.config;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import com.example.netdisk.util.PropertiesUtil;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * 读取环境变量，获取 application.properties 中的配置参数
 */
@Configuration
public class PropertiesConfig {

    @Resource
    private Environment env;

    @PostConstruct
    public void setProperties() {
        PropertiesUtil.setEnvironment(env);
    }
}
