package com.atguigu;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//来标注一个主程序 说明这是一个springboot应用
public class Helloworld {
    public static void main(String[] args) {
        //spring 应用启动起来
        SpringApplication.run(Helloworld.class,args);
    }
}
