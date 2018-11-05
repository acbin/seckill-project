package com.bingo.service.impl;

import com.bingo.dao.UserMapper;
import com.bingo.model.User;
import com.bingo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * UserService 接口实现类
 *
 * @author bingo
 * @since 2018/11/4
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public int save(User user) {
        return userMapper.save(user);
    }
}
