package org.pineapple.apple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients({"org.pineapple"})
@SpringBootApplication
public class AppleApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppleApplication.class, args);
    }

}
