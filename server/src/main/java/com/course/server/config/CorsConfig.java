package com.course.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @auther Yankd
 * @date 2021/2/1 0001 12:27
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping ("/**")
                .allowedOrigins ("/")
                .allowedHeaders (CorsConfiguration.ALL)
                .allowedMethods (CorsConfiguration.ALL)
                .allowCredentials (true)
                .maxAge (3600);//一小时内不需要再预检（发option请求）
    }
}
