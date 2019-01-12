package com.shgx.mq.service;

/**
 * @author: guangxush
 * @create: 2019/01/12
 */
public interface IRabbitMQProducerService {
    void sendMessage(String msg) ;
}
