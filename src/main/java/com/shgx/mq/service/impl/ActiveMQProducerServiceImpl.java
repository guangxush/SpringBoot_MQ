package com.shgx.mq.service.impl;

import com.shgx.mq.service.IActiveMQProducerService;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Queue;

/**
 * @author: guangxush
 * @create: 2019/01/12
 */
@Service
public class ActiveMQProducerServiceImpl implements IActiveMQProducerService {
    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Resource
    private Queue queue;
    @Override
    public void sendMessage(String msg) {
        this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
    }
}
