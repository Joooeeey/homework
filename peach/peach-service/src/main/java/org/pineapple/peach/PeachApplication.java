package org.pineapple.peach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients({"org.pineapple"})
@SpringBootApplication
public class PeachApplication {

    public static void main(String[] args) {
        SpringApplication.run(PeachApplication.class, args);
    }

}
