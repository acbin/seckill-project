package com.bingo.service.impl;

import com.bingo.dao.ProductDetailMapper;
import com.bingo.model.ProductDetail;
import com.bingo.service.ProductDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ProductDetailService 接口实现类
 *
 * @author bingo
 * @since 2018/11/4
 */

@Service
public class ProductDetailServiceImpl implements ProductDetailService {

    @Resource
    private ProductDetailMapper productDetailMapper;

    @Override
    public ProductDetail queryById(int id) {
        return productDetailMapper.findById(id);
    }

    @Override
    public int save(ProductDetail productDetail) {
        return productDetailMapper.save(productDetail);
    }
}
