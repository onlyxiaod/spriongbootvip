package cn.enjoy.service;

/**
 * 类描述：
 *
 * @author xiAo
 * @date 2021/1/21 21:23
 */
public interface IUserService {
    boolean login(String username,String passwd);
    boolean register(String username,String passwd);
    void batchAdd(String username,String passwd);
}
