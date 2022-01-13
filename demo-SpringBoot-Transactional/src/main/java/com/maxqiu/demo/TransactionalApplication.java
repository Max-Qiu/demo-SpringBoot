package com.maxqiu.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 事务
 *
 * @author Max_Qiu
 */
@SpringBootApplication
@MapperScan("com.maxqiu.demo.mapper")
public class TransactionalApplication {
    public static void main(String[] args) {
        SpringApplication.run(TransactionalApplication.class, args);
    }
}