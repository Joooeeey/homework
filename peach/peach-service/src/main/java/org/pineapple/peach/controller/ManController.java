package org.pineapple.peach.controller;

import lombok.RequiredArgsConstructor;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.pineapple.apple.feign.ISayHelloClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenhui
 * @date 2021/12/12
 * @description TODO
 */
@RibbonClients
@RequiredArgsConstructor
@RestController
public class ManController {

    private final ISayHelloClient sayHelloClient;
    private final RocketMQTemplate rocketMQTemplate;

    @GetMapping("/say")
    public String saySomething(){
        return sayHelloClient.sayHello();
    }

    @GetMapping("/give-mq")
    public String giveMq(String message){
        rocketMQTemplate.sendOneWay("apple_give_weather_topic:*",message);
        return "success";
    }
}
