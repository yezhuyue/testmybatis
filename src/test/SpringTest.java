import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tang.model.User;
import tang.model.UserRole;
import tang.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tang on 2017/3/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class SpringTest {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @Test
    public void test1(){
        User user = userService.getUserById("2ff00636-ffb6-4f37-8633-6723a9f09b47");
        System.out.println(JSON.toJSONStringWithDateFormat(user,"yyyy-MM-dd HH:mm:ss"));
    }
    @Test
    public void test2(){
        List<User> users = userService.getAll();
        System.out.println(JSON.toJSONStringWithDateFormat(users,"yyyy-MM-dd HH:mm:ss"));
    }

    @Test
    public void test4(){
        List<User> users = new ArrayList<User>();
        users =  userService.getUserByName("令狐冲");
        for(User u:users){
            System.out.println(JSON.toJSONStringWithDateFormat(u,"yyyy-MM-dd HH:mm:ss"));
        }
    }

    @Test
    public void test5(){
        UserRole userRole = userService.getUserRoleByName("令狐冲");
        System.out.println(JSON.toJSONStringWithDateFormat(userRole,"yyyy-MM-dd HH:mm:ss"));
    }

    @Test
    public void test6(){
        List<User> list = userService.getUserRole();
        System.out.println(JSON.toJSONStringWithDateFormat(list,"yyyy-MM-dd HH:mm:ss"));
    }
}
