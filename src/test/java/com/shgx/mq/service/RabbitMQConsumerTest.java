package com.shgx.mq.service;

import com.shgx.mq.MqApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author: guangxush
 * @create: 2019/01/12
 */
@SpringBootTest(classes = MqApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class RabbitMQConsumerTest {
    @Test
    public void testStart() throws Exception {
        Thread.sleep(Long.MAX_VALUE);
    }
}
