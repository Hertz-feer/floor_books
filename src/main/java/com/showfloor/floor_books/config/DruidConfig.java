package com.showfloor.floor_books.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {

    //配置druid的监控
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        Map<String,String> map = new HashMap();

        map.put("loginUsername","admin");
        map.put("loginPassword","123456");
        map.put("allow","");

        bean.setInitParameters(map);
        return bean;
    }
    @Bean
    public FilterRegistrationBean statFilter() {
        // 创建过滤器
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        // 设置过滤器过滤路径
        filterRegistrationBean.addUrlPatterns("/*");
        // 忽略过滤的形式
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }



}
