package com.bingo.service;

import com.bingo.model.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * OrderService 测试类
 *
 * @author bingo
 * @since 2018/11/4
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderServiceTest {

    @Resource
    private OrderService orderService;

    @Test
    public void testQuery() {
        Order order = orderService.queryById(1);
        System.out.println(order);
    }
}
