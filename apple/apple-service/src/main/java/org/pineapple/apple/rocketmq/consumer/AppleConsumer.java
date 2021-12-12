package org.pineapple.apple.rocketmq.consumer;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @author shenhui
 * @date 2021/12/12
 * @description TODO
 */
@Component
@RocketMQMessageListener(topic = "apple_give_weather_topic",
                        consumerGroup = "apple_give_weather_group")
public class AppleConsumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String s) {
        System.out.println("收到了别人给我的消息："+s);
    }
}
