package cn.enjoy.test;

import cn.enjoy.App;
import cn.enjoy.dao.UsersMapper;
import cn.enjoy.model.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * 类描述：
 *
 * @author xiAo
 * @date 2021/1/21 20:02
 */
@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class UserTest {
    @Resource
    private UsersMapper usersMapper;

    @Test
    public void testAdd() {
        Users user = new Users() ;
        user.setPassword("123566");
        user.setUsername("enjoy");
        usersMapper.insertSelective(user);
    }

    @Test
    public void testFindUser() {
        Users enjoy = usersMapper.findByUsernameAndPasswd("enjoy", "123");
        System.out.println(123);
        System.out.println(enjoy);
    }
}
