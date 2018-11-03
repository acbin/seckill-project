package com.bingo.dao;

import com.bingo.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * ProductMapper 测试类
 *
 * @author bingo
 * @since 2018/11/3
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductMapperTest {

    @Resource
    private ProductMapper productMapper;

    @Test
    public void testInsert() {
        Product product = new Product();
        product.setApplyTime(new Date());
        product.setAuditStatus(1);
        product.setDescription("这是商品描述");
        product.setEndTime(new Date());
        product.setStartTime(new Date());
        product.setOriginalPrice(11);
        product.setSeckillPrice(1);
        product.setAuditTime(new Date());
        product.setProductCount(11);
        product.setProductId(1);
        product.setProductImg("https://www.baidu.com");
        product.setProductTitle("这是商品标题");
        product.setSellerId(1);
        product.setStockCount(1);

        int val = productMapper.save(product);
        assert val == 1;
    }

    @Test
    public void testSelect() {
        Product product = productMapper.findById(1);
        System.out.println(product);
    }
}
