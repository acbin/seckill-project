package com.bingo.service;

import com.bingo.model.Seller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * SellerService 测试类
 *
 * @author bingo
 * @since 2018/11/4
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class SellerServiceTest {

    @Resource
    private SellerService sellerService;

    @Test
    public void testQuery() {
        Seller seller = sellerService.queryById(1);
        System.out.println(seller);
    }
}
