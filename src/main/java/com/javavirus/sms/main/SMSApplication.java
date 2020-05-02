package com.javavirus.sms.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class SMSApplication implements WebMvcConfigurer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SMSApplication.class, args);
    }
    
    @Bean
    public ViewResolver viewResolver() {
         final InternalResourceViewResolver r = new InternalResourceViewResolver();
         r.setPrefix("/WEB-INF/jsp/");
         r.setSuffix(".jsp");
         return r;
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**")
                .addResourceLocations("/WEB-INF/css/");

    }
}
