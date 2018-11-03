package com.bingo.model;

import lombok.Data;

import java.util.Date;

/**
 * 秒杀订单实体
 *
 * @author bingo
 * @since 2018/11/3
 */

@Data
public class Order {
    /**
     * 主键，自增长id
     */
    private int id;

    /**
     * 商品id
     */
    private int productId;

    /**
     * 支付金额
     */
    private int payAmount;

    /**
     * 用户id
     */
    private int userId;

    /**
     * 商家id
     */
    private int sellerId;

    /**
     * 订单创建时间
     */
    private Date createTime;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 支付状态
     */
    private int payStatus;

    /**
     * 收货人姓名
     */
    private String consigneeName;

    /**
     * 收货人地址
     */
    private String consigneeAddress;

    /**
     * 收货人电话
     */
    private long consigneePhone;

    /**
     * 交易流水号
     */
    private String tradeSerialNumber;
}
