package com.shgx.mq.service.impl;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * @author: guangxush
 * @create: 2019/01/12
 */
public class RabbitMQConsumerService {
    @RabbitListener(queues="study.microboot.queue")
    public void receiveMessage(String text) {    // 进行消息接收处理
        System.err.println("Receive Message:------" + text);
    }
}
