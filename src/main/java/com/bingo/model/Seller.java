package com.bingo.model;

import lombok.Data;

/**
 * 商家实体
 *
 * @author bingo
 * @since 2018/11/3
 */

@Data
public class Seller {
    /**
     * 主键，自增长id
     */
    private int id;

    /**
     * 商家名称
     */
    private String sellerName;

    /**
     * 商家店铺名称
     */
    private String sellerShopName;

    /**
     * 商家账号
     */
    private String sellerAccount;

    /**
     * 商家密码
     */
    private String sellerPassword;

    /**
     * 商家经营范围
     */
    private String sellerScope;
}
