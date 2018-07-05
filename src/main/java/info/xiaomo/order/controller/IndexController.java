package info.xiaomo.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: 胡 朋
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2018/7/5 下午3:53
 * desc  :
 */
@RestController
@RefreshScope
public class IndexController {


    @Value("${env}")
    private String env;

    @GetMapping("/")
    public String index(){
        return "订单服务可用,当前环境:" + env;
    }
}
