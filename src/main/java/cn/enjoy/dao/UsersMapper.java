package cn.enjoy.dao;

import cn.enjoy.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);

    Users findByUsernameAndPasswd(@Param("username") String username, @Param("passwd") String passwd);
}