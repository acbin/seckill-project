package com.bingo.dao;

import com.bingo.model.Seller;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author bingo
 * @since 2018/11/3
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class SellerMapperTest {

    @Resource
    private SellerMapper sellerMapper;

    @Test
    public void testInsert() {
        Seller seller = new Seller();
        seller.setSellerAccount("15888888888");
        seller.setSellerName("傲雪滨锋");
        seller.setSellerPassword("HelloWorld123");
        seller.setSellerScope("数码电子");
        seller.setSellerShopName("傲雪科技");
        int val = sellerMapper.save(seller);
        assert val == 1;
    }

    @Test
    public void testSelect() {
        Seller seller = sellerMapper.findById(1);
        System.out.println(seller);
    }
}
