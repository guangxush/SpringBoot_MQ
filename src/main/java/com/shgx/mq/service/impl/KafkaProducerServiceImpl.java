package com.shgx.mq.service.impl;

import com.shgx.mq.service.IKafkaProducerService;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: guangxush
 * @create: 2019/01/12
 */
@Service
public class KafkaProducerServiceImpl implements IKafkaProducerService {
    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;
    @Override
    public void sendMessage(String msg) {
        this.kafkaTemplate.sendDefault("study-key", msg);
    }
}
