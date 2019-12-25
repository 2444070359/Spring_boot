package com.hp.config;

import com.hp.interceptor.Loginlnterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Component
public class MvcConfig implements WebMvcConfigurer {
    @Bean
    public Loginlnterceptor getLoginlnterceptor(){

        return  new Loginlnterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截器
        registry.addInterceptor(getLoginlnterceptor()).addPathPatterns("/**");

    }
}
