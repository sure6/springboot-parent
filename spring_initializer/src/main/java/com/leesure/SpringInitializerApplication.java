package com.leesure;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringInitializerApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringInitializerApplication.class);
//        app.setBannerMode(Banner.Mode.OFF); // 关闭运行控制台logo
        app.run(args);
    }

    public SpringInitializerApplication() {
        System.out.println("loading");
    }
}
