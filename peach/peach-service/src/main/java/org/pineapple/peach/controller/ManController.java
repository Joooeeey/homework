package org.pineapple.peach.controller;

import lombok.RequiredArgsConstructor;
import org.pineapple.apple.feign.ISayHelloClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
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

    @GetMapping("/say")
    public String saySomething(){
        return sayHelloClient.sayHello();
    }
}
