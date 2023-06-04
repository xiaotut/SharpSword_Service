package org.zyh.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther : Zhao Yuheng
 * @Description : 启动springBoot项目的入口
 */
@SpringBootApplication // 这个注解明确的指出这是一个springBoot项目
public class MainApplication {

    // 11212
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
