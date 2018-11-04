package com.bingo.service;

import com.bingo.model.ProductDetail;

/**
 * ProductDetailService 接口
 *
 * @author bingo
 * @since 2018/11/4
 */

public interface ProductDetailService {
    /**
     * 通过id查询订单详情
     * @param id 订单详情编号
     * @return 订单详情
     */
    ProductDetail queryById(int id);
}
