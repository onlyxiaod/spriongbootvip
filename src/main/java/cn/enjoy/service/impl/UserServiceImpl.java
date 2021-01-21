package cn.enjoy.service.impl;

import cn.enjoy.dao.UsersMapper;
import cn.enjoy.model.Users;
import cn.enjoy.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 类描述：
 *
 * @author xiAo
 * @date 2021/1/21 21:25
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public boolean login(String username, String passwd) {
        Users users = usersMapper.findByUsernameAndPasswd(username, passwd);
        return users != null;
    }

    @Override
    public boolean register(String username, String passwd) {
        Users users = new Users();
        users.setUsername(username);
        users.setPassword(passwd);
        int cnt = usersMapper.insertSelective(users);
        return cnt > 0;
    }

    @Override
    @Transactional//加上了事务注解，但是并没有生效
    public void batchAdd(String username, String passwd) {
        Users users = new Users();
        users.setUsername(username);
        users.setPassword(passwd);
        usersMapper.insertSelective(users);
        int i = 10 /0;
        users = new Users();
        users.setUsername(username+"2");
        users.setPassword(passwd);
        usersMapper.insertSelective(users);
    }
}