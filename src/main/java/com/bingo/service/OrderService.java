package com.bingo.service;

import com.bingo.model.Order;

/**
 * OrderService 接口
 *
 * @author bingo
 * @since 2018/11/4
 */

public interface OrderService {
    /**
     * 通过id查询订单
     * @param id 订单编号
     * @return 订单
     */
    Order queryById(int id);
}
