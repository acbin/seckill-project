package com.bingo.dao;

import com.bingo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * UserMapper 测试类
 *
 * @author bingo
 * @since 2018/11/3
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        User user = new User();
        user.setUserAccount("yang");
        user.setUserAddress("深圳大学乔相阁");
        user.setUserAge(21);
        user.setUserEmail("contact@yanglibin.info");
        user.setUserName("杨立滨");
        user.setUserPassword("HelloWorld123");
        user.setUserSex(1);
        int val = userMapper.save(user);
        assert val == 1;
    }

    @Test
    public void testSelect() {
        User user = userMapper.findById(1);
        System.out.println(user);
    }
}
