package com.bingo.service.impl;

import com.bingo.dao.SellerMapper;
import com.bingo.model.Seller;
import com.bingo.service.SellerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * SellerService 接口实现类
 *
 * @author bingo
 * @since 2018/11/4
 */

@Service
public class SellerServiceImpl implements SellerService {

    @Resource
    private SellerMapper sellerMapper;

    @Override
    public Seller queryById(int id) {
        return sellerMapper.findById(id);
    }
}
