import com.donric.mapper.UserMapper;
import com.donric.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MyTest {
    @Test
    public void test() throws IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");

        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }
}
