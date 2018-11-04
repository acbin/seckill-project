package com.bingo.service;

import com.bingo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * UserService 测试类
 *
 * @author bingo
 * @since 2018/11/4
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testQuery() {
        User user = userService.queryById(1);
        System.out.println(user);
    }
}
