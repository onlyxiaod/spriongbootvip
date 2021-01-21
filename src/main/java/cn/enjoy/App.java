package cn.enjoy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 *
 * @author xiAo
 * @date 2021/1/14 21:59
 */
//@RestController
//@EnableAutoConfiguration//引入第三方组件
@SpringBootApplication
@MapperScan("cn.enjoy.dao")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
