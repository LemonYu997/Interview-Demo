package com.example.demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo1.mapper")
public class Demo01Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo01Application.class, args);
        System.out.println("Demo01启动成功");
    }
}
