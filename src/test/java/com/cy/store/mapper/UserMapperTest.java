package com.cy.store.mapper;

import com.cy.store.entity.User;
import com.cy.store.mapper.UserMapper;

import com.cy.store.service.ex.InsertException;
import com.cy.store.service.ex.UsernameDuplicateException;
import com.cy.store.service.impl.CartServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

@SpringBootTest
public class UserMapperTest {

    @Test
    public  void main() {
        Object testObject = new ArrayList();
        displayObjectClass(testObject);
    }
    public void displayObjectClass(Object o) {
        if (o instanceof Vector)
            System.out.println("对象是 java.util.Vector 类的实例");
        else if (o instanceof ArrayList)
            System.out.println("对象是 java.util.ArrayList 类的实例");
        else
            System.out.println("对象是 " + o.getClass() + " 类的实例");
    }



    /*
     * idea有自检功能，接口能不直接创建Bean的(动态代理功能)
     * */
    @Autowired
    private UserMapper userMapper;

    @Test
    void getUserMapper() {

        User user = new User();
//        user.setUsername("12");
//        user.setPassword("123456");
        String username = "12";
        User result = userMapper.findByUsername(username);
        // 判断查询结果是否不为null
        if (result != null) {
            // 是：表示用户名已被占用，则抛出UsernameDuplicateException异常
            throw new UsernameDuplicateException("尝试注册的用户名[" + username + "]已经被占用");
        }
//        System.out.println(rows);
//        User user1 = (User) userMapper.findByUid(rows);
//        System.out.println(user1);
    }

    @Autowired
    private CartServiceImpl cartService;
    @Test
    void getCartMapper() {
        cartService.remove(5);
    }



}
