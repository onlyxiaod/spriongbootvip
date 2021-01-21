package cn.enjoy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 *
 * @author xiAo
 * @date 2021/1/20 21:10
 */
@RestController
public class UserController {

    @RequestMapping("/hello")
    public Object sayHello(){
        return "hello";
    }
}
