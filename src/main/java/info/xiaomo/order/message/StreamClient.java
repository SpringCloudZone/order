package info.xiaomo.order.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * author: 胡 朋
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2018/7/5 下午8:23
 * desc  :
 */
@Component
public interface StreamClient {

    @Input("xiaomoMessage")
    SubscribableChannel input();


    @Output("xiaomoMessage")
    MessageChannel output();


}
