package com.shgx.mq.service.impl;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author: guangxush
 * @create: 2019/01/12
 */
@Service
public class KafkaConsumerService {
    @KafkaListener(topics = {"study-microboot"})
    public void receiveMessage(ConsumerRecord<String, String> record) { // 进行消息接收处理
        System.err.println("Receive Message:------" + record.key() + "; value = "
                + record.value());
    }
}
