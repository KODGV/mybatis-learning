package com.hjc.POJO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;
    private List<Phone> phones;

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class uclazz= Class.forName("com.hjc.POJO.User");
        User user = (User) uclazz.newInstance();
        System.out.println(user);
        Constructor constructor = uclazz.getDeclaredConstructor(Integer.class,String.class,String.class);
        user = (User) constructor.newInstance(1,"jjj","123");
        System.out.println(user);
        Method method = uclazz.getMethod("setName", String.class);
        method.invoke(user,"hhhh");
        System.out.println(user);

        Field name = uclazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(user,"jjj");
        System.out.println(user);
    }

}
