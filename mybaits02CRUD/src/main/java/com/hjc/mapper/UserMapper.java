package com.hjc.mapper;

import com.hjc.POJO.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public List<User> getUserList();
    public void  insertUser(User user);
    public void deleteUser(User user);
    public void updateUser(User user);
    public List<User> getUserByLimit(@Param("start") int start, @Param("number") int number);
}
