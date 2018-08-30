package info.xiaomo.order;

import info.xiaomo.order.message.StreamClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Autowired
    StreamClient streamClient;


    @Test
    public void test1() {
        amqpTemplate.convertAndSend("myQueue", "衣服");
    }

    @Test
    public void test2() {
        amqpTemplate.convertAndSend("myQueue2", "数码");
    }

    @Test
    public void test3() {
        streamClient.output().send(MessageBuilder.withPayload("hello").build());

    }

}
