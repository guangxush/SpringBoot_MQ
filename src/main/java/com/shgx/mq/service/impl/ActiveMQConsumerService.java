package com.shgx.mq.service.impl;

import org.springframework.jms.annotation.JmsListener;

/**
 * @author: guangxush
 * @create: 2019/01/12
 */
public class ActiveMQConsumerService {
    @JmsListener(destination="com.shgx.mq")
    public void receiveMessage(String text) {
        // 进行消息接收处理
        System.err.println("Receive Message:------" + text);
    }
}
