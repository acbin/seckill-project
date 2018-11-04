package com.bingo.service;

import com.bingo.model.Seller;

/**
 * SellerService 接口
 *
 * @author bingo
 * @since 2018/11/4
 */

public interface SellerService {
    /**
     * 通过id查询商家
     * @param id 商家编号
     * @return 商家
     */
    Seller queryById(int id);
}
