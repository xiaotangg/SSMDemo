import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.dao.pojo.UserT;
import ssm.service.UserService;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext-dao.xml"})
public class TestSSM {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        UserT userT = userService.getUserById(1001);  //1001在数据库有对应的数据
        System.out.println(userT);
    }


}
