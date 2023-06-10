package org.zyh.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther : Zhao Yuheng
 * @Description : 启动springBoot项目的入口
 */
@SpringBootApplication // 这个注解明确的指出这是一个springBoot项目
public class MainApplication {

    // 启动类就这样写
    public static void main(String[] args) {
        System.out.println("Begin start the project");
        SpringApplication.run(MainApplication.class, args);
        System.out.println("Start the project successful");
    }
}
