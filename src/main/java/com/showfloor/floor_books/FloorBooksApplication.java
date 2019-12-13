package com.showfloor.floor_books;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration(exclude={DruidDataSourceAutoConfigure.class})
@SpringBootApplication
public class FloorBooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(FloorBooksApplication.class, args);
    }

}
