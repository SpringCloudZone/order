package info.xiaomo.order.controller;

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
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "订单服务可用";
    }
}
