package com.example.netdisk.util;

import org.springframework.core.env.Environment;

public class PropertiesUtil {
    private static Environment env = null;

    public static void setEnvironment(Environment env) {
        PropertiesUtil.env = env;
    }

    public static String getProperty(String key) { // 获取 application.properties 中的配置
        return PropertiesUtil.env.getProperty(key);
    }
}
