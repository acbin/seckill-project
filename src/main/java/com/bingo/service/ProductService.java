package com.bingo.service;

import com.bingo.model.Product;

/**
 * ProductService 接口
 *
 * @author bingo
 * @since 2018/11/4
 */

public interface ProductService {
    /**
     * 通过id查询商品
     * @param id 商品id
     * @return 商品
     */
    Product queryById(int id);
}
