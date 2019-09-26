package com.zpark.neimin.first;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zpark.neimin.first.dao")
public class NeiminApplication {

    public static void main(String[] args) {
        SpringApplication.run(NeiminApplication.class, args);
    }

}
