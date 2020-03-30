package com.hjc.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybaitsUtils {
    private static InputStream inputStream;
    static{
        String resource = "mybatis-config.xml";
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSessionFactory(){

        return new SqlSessionFactoryBuilder().build(inputStream).openSession();
    }


}
