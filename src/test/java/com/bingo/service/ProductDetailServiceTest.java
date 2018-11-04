package com.bingo.service;

import com.bingo.model.ProductDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * ProductDetailService 测试类
 *
 * @author bingo
 * @since 2018/11/4
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductDetailServiceTest {

    @Resource
    private ProductDetailService productDetailService;

    @Test
    public void testQuery() {
        ProductDetail productDetail = productDetailService.queryById(1);
        System.out.println(productDetail);
    }
}
