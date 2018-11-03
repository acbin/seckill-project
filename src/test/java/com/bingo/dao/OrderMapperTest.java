package com.bingo.dao;

import com.bingo.model.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * OrderMapper 测试类
 *
 * @author bingo
 * @since 2018/11/3
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderMapperTest {

    @Resource
    private OrderMapper orderMapper;

    @Test
    public void testInsert() {
        Order order = new Order();
        order.setConsigneeAddress("深圳大学乔相阁");
        order.setConsigneeName("杨立滨");
        order.setConsigneePhone(15888888888L);
        order.setCreateTime(new Date());
        order.setPayAmount(123);
        order.setPayStatus(1);
        order.setProductId(1);
        order.setPayTime(new Date());
        order.setSellerId(1);
        order.setTradeSerialNumber("1232-2-1323");
        order.setUserId(1);
        int val = orderMapper.save(order);
        assert val == 1;
    }

    @Test
    public void testSelect() {
        Order order = orderMapper.findById(1);
        System.out.println(order);
    }
}
