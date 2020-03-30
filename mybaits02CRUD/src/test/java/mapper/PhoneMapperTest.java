package mapper;

import com.hjc.mapper.PhoneMapper;
import com.hjc.mapper.UserMapper;
import com.hjc.util.MybaitsUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class PhoneMapperTest {
    @Test
    public void test(){
        SqlSession session = MybaitsUtils.getSqlSessionFactory();
        PhoneMapper mapper = session.getMapper(PhoneMapper.class);
        mapper.getPhones().stream().forEach(i->{System.out.println(i);});
        session.commit();
    }
}
