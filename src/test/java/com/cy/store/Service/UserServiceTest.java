package com.cy.store.Service;

import com.cy.store.entity.User;
import com.cy.store.mapper.UserMapper;
import com.cy.store.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserServiceImpl userService;
    @Test
    void contextLoads() {
        User user = new User();
        user.setUsername("TestService");
        user.setPassword("123456");
        userService.reg(user);
        System.out.println(userMapper.findByUsername("TestService"));
    }
}
