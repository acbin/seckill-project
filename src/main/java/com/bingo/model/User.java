package com.bingo.model;

import lombok.Data;

/**
 * 用户实体
 *
 * @author bingo
 * @since 2018/11/3
 */

@Data
public class User {
    /**
     * 主键，自增长id
     */
    private int id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户性别
     *  0:女
     *  1:男
     */
    private int userSex;

    /**
     * 用户年龄
     */
    private int userAge;

    /**
     * 用户住址
     */
    private String userAddress;

    /**
     * 用户邮箱
     */
    private String userEmail;
}
