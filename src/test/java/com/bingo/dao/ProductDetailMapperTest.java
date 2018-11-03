package com.bingo.dao;

import com.bingo.model.ProductDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * ProductDetailMapper 测试类
 *
 * @author bingo
 * @since 2018/11/3
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductDetailMapperTest {

    @Resource
    private ProductDetailMapper productDetailMapper;

    @Test
    public void testInsert() {
        ProductDetail productDetail = new ProductDetail();
        productDetail.setBrandName("霸气商家");
        productDetail.setOriginalPlace("广东深圳");
        productDetail.setProductDetailImg("http://www.baidu.com");
        productDetail.setProductId(1);
        productDetail.setProductSpecification("21*21");
        productDetail.setProductWeight("52kg");
        productDetail.setSellerId(1);
        productDetail.setProductName("没有名字的产品");
        int val = productDetailMapper.save(productDetail);
        assert val == 1;
    }

    @Test
    public void testSelect() {
        ProductDetail productDetail = productDetailMapper.findById(1);
        System.out.println(productDetail);
    }
}
