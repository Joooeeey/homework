package org.pineapple.apple.feign;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenhui
 * @date 2021/12/11
 * @description TODO
 */
@RestController
public class SayHelloClient implements ISayHelloClient{

    @Override
    public String sayHello() {
        System.out.println("enter some request!");
        return "bad apple";
    }
}
