package com.ouyang.miniature.auth.config;


import com.miniature.commonshop.config.BaseSwaggerConfig;
import com.miniature.commonshop.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by ouyang on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.ouyang.miniature.auth.controller")
                .title("shop认证中心")
                .description("shop认证中心相关接口文档")
                .contactName("ouyang")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
