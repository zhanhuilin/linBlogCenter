package com.lin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;




/**
 * @author zhanhuilin
 * @date 2021/12/15 - 16:26
 */
@SpringBootApplication
@ComponentScan("com.lin")
public class LinBlogCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinBlogCenterApplication.class, args);
    }
}
