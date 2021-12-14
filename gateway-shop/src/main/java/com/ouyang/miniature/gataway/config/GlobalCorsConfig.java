package com.ouyang.miniature.gataway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * 全局跨域配置
 * 前端从网关进行调用时需要配置
 * 当前端应用通过网关调用服务时会产生跨域问题，解决方法是在网关服务中进行全局跨域配置，同时相关服务中如果有跨域配置应该去除。
 */
public class GlobalCorsConfig {

    /**
     * 允许跨域调用的过滤器
     */
    @Bean
    public CorsWebFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        //放行全部原始头信息
        config.addAllowedHeader("*");
        //允许所有域名进行跨域调用
        config.addAllowedOrigin("*");
        //允许所有请求方法跨域调用
        config.addAllowedMethod("*");
        //允许跨越发送cookie
        config.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return new CorsWebFilter(source);

    }

}
