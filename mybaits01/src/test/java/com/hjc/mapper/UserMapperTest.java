package com.hjc.mapper;

import com.hjc.util.MybaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class UserMapperTest {
    @Test
    public void test(){

        SqlSession session = MybaitsUtils.getSqlSessionFactory();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.getUserList().stream().forEach(i->{System.out.println(i);});

    }
}
