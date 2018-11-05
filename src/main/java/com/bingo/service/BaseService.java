package com.bingo.service;

/**
 * 基础service接口
 *
 * @author bingo
 * @since 2018/11/5
 */

public interface BaseService<T> {
    /**
     * 通过id查询实体
     * @param id 编号
     * @return 实体
     */
    T queryById(int id);

    /**
     * 保存实体
     * @param t 实体
     * @return 结果
     */
    int save(T t);
}
