package com.shgx.mq.service;

import com.shgx.mq.MqApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * @author: guangxush
 * @create: 2019/01/12
 */
@SpringBootTest(classes = MqApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class RabbitMQProducerTest {
    @Resource
    private IRabbitMQProducerService messageProducer;
    @Test
    public void testSend() throws Exception {
        for (int x = 0; x < 100; x++) {
            this.messageProducer.sendMessage("Send Message:------" + x);
        }
    }
}
