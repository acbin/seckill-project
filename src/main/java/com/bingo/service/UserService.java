package com.bingo.service;

import com.bingo.model.User;

/**
 * UserService 接口
 *
 * @author bingo
 * @since 2018/11/4
 */

public interface UserService {
    /**
     * 通过id查询用户
     * @param id 用户编号
     * @return 用户
     */
    User queryById(int id);
}
