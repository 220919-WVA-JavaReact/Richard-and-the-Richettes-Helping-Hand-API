package com.revature.helpinghandapi.util;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("*")
                        .allowedHeaders("*")
                        .allowedMethods("GET", "PUT", "POST", "DELETE", "OPTIONS");
    }
}