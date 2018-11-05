package com.bingo.service.impl;

import com.bingo.dao.ProductMapper;
import com.bingo.model.Product;
import com.bingo.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * ProductService 接口实现类
 *
 * @author bingo
 * @since 2018/11/4
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public Product queryById(int id) {
        return productMapper.findById(id);
    }

    @Override
    public int save(Product product) {
        return productMapper.save(product);
    }
}
