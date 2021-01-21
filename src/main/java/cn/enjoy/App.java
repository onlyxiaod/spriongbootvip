package cn.enjoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 *
 * @author xiAo
 * @date 2021/1/14 21:59
 */
@RestController
//@EnableAutoConfiguration//引入第三方组件
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
