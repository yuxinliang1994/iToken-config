package com.itoken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.security.auth.login.Configuration;

@SpringBootApplication
@EnableConfigServer //配置中心服务端
@EnableEurekaClient //开启Eureka服务提供者
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
