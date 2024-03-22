package com.hugeyurt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hugeyurt.mapper")
public class WebbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebbootApplication.class, args);
    }

}
