package com.shgx.mq.service.impl;

import com.shgx.mq.config.RabbitMQProducerConfig;
import com.shgx.mq.service.IRabbitMQProducerService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: guangxush
 * @create: 2019/01/12
 */
@Service
public class RabbitMQProducerServiceImpl implements IRabbitMQProducerService {
    @Resource
    private RabbitTemplate rabbitTemplate;
    @Override
    public void sendMessage(String msg) {
        this.rabbitTemplate.convertAndSend(RabbitMQProducerConfig.EXCHANGE,
                RabbitMQProducerConfig.ROUTINGKEY, msg);
    }
}
