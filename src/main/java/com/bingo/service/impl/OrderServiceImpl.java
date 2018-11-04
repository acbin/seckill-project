package com.bingo.service.impl;

import com.bingo.dao.OrderMapper;
import com.bingo.model.Order;
import com.bingo.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * OrderService 接口实现类
 *
 * @author bingo
 * @since 2018/11/4
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public Order queryById(int id) {
        return orderMapper.findById(id);
    }
}
