package com.bingo.model;

import lombok.Data;

/**
 * 秒杀商品详情实体
 *
 * @author bingo
 * @since 2018/11/3
 */

@Data
public class ProductDetail {
    /**
     * 主键，自增长id
     */
    private int id;

    /**
     * 商品id
     */
    private int productId;

    /**
     * 商家id
     */
    private int sellerId;

    /**
     * 商品产地
     */
    private String originalPlace;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 商品毛重
     */
    private String productWeight;

    /**
     * 商品规格
     */
    private String productSpecification;

    /**
     * 商品详情图地址
     */
    private String productDetailImg;
}
