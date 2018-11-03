package com.bingo.model;

import lombok.Data;

import java.util.Date;

/**
 * 秒杀商品实体
 *
 * @author bingo
 * @since 2018/11/3
 */

@Data
public class Product {
    /**
     * 主键，自增长id
     */
    private int id;

    /**
     * 商品id
     */
    private int productId;

    /**
     * 商品标题
     */
    private String productTitle;

    /**
     * 商品图片
     */
    private String productImg;

    /**
     * 商品原价
     */
    private int originalPrice;

    /**
     * 商品秒杀价
     */
    private int seckillPrice;

    /**
     * 商家id
     */
    private int sellerId;

    /**
     * 申请时间
     */
    private Date applyTime;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 审核状态
     */
    private int auditStatus;

    /**
     * 秒杀开始时间
     */
    private Date startTime;

    /**
     * 秒杀结束时间
     */
    private Date endTime;

    /**
     * 秒杀商品数
     */
    private int productCount;

    /**
     * 剩余库存数
     */
    private int stockCount;

    /**
     * 商品描述
     */
    private String description;
}
