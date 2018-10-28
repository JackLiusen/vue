package itheima;

import com.itheima.domain.User;
import com.itheima.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test1 {

    @Autowired
    private IUserService userService;
    @Test
    public void findAll(){
        List<User> users = userService.findAll();
        System.out.println(users);
    }
    @Test
    public void findById(){
        User user = userService.findById(1);
        System.out.println(user);
    }
    @Test
    public void update(){
        User user = userService.findById(1);
        System.out.println(user);

        user.setAge(44);
        userService.updateUser(user);
        User user1 = userService.findById(1);
        System.out.println(user1);
    }
}
