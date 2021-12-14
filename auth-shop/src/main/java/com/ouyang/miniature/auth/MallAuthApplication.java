package com.ouyang.miniature.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * TODO:微服务权限解决方案（鉴权服务端）:我们将采用Nacos作为注册中心，Gateway作为网关，使用nimbus-jose-jwtJWT库操作JWT令牌
 * */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.ouyang.miniature")
public class MallAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallAuthApplication.class, args);
    }

}
