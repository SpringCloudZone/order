package info.xiaomo.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * author: 胡 朋
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2018/7/5 下午7:58
 * desc  :
 */

@Slf4j
@Component
public class MqReceiver {


    /**
     * 分组
     * 例如 同样都是订单服务，卖数码的和买衣服的互不干扰，各自关心自己的订单
     * @param msg msg
     */
    @RabbitListener(bindings = @QueueBinding(
            key = "myQueue",
            value = @Queue("myQueue"),
            exchange = @Exchange("myExchange")
    ))
    public void process(String msg) {
        log.info("{}", msg);
    }

    /**
     * 分组
     * 例如 同样都是订单服务，卖数码的和买衣服的互不干扰，各自关心自己的订单
     * @param msg msg
     */
    @RabbitListener(bindings = @QueueBinding(
            key = "myQueue2",
            value = @Queue("myQueue2"),
            exchange = @Exchange("myExchange2")
    ))
    public void process2(String msg) {
        log.info("{}", msg);
    }
}
