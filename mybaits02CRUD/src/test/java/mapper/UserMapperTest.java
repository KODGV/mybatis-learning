package mapper;

import com.hjc.POJO.User;
import com.hjc.mapper.UserMapper;
import com.hjc.util.MybaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {
    @Test
    public void test(){

        SqlSession session = MybaitsUtils.getSqlSessionFactory();
        UserMapper mapper = session.getMapper(UserMapper.class);
        mapper.getUserList().stream().forEach(i->{System.out.println(i);});
        session.commit();

//        User user = new User(1,"hhh","1234560");
//        mapper.insertUser(user);
//        session.commit();
//        User user2 = new User(1,"uuu","1234560");
//        mapper.insertUser(user2);
//        session.commit();
//        mapper.getUserList().stream().forEach(i->{System.out.println(i);});
//        user.setName("fuck");
//        session.commit();
//        mapper.updateUser(user);
//        mapper.getUserList().stream().forEach(i->{System.out.println(i);});
//        session.commit();
//        mapper.deleteUser(user);
//        mapper.getUserList().stream().forEach(i->{System.out.println(i);});
//        session.commit();
          session.close();
    }
}
