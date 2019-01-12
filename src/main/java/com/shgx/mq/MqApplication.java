package com.shgx.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MqApplication {

    static {
        System.setProperty("java.security.auth.login.config",
                "d:/kafka_client_jaas.conf"); // 表示系统环境属性
    }

    public static void main(String[] args) {
        SpringApplication.run(MqApplication.class, args);
    }

}

