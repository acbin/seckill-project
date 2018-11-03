package com.bingo.dao;

import com.bingo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * UserMapper 接口
 *
 * @author bingo
 * @since 2018/11/3
 */

@Mapper
public interface UserMapper {
    String TABLE_NAME = "seckill_user";
    String INSERT_FIELDS = "user_name, user_account, user_password, user_sex, user_age, user_address, user_email";
    String SELECT_FIELDS = "id, " + INSERT_FIELDS;

    /**
     * 保存用户
     * @param user 用户
     * @return 影响行数
     */
    @Insert({"insert into ", TABLE_NAME, " (", INSERT_FIELDS, ") values(#{userName}, " +
            "#{userAccount}, #{userPassword}, #{userSex}, #{userAge}, #{userAddress}, #{userEmail})"})
    int save(User user);

    /**
     * 根据id获取用户
     * @param id 用户编号
     * @return 用户
     */
    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where id = #{id}"})
    User findById(int id);
}
