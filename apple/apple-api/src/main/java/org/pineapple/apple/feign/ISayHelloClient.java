package org.pineapple.apple.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shenhui
 * @date 2021/12/11
 * @description TODO
 */
@FeignClient("say")
public interface ISayHelloClient {

    @GetMapping("/hello")
    String sayHello();
}
