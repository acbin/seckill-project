package com.bingo.dao;

import com.bingo.model.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * OrderMapper 接口
 *
 * @author bingo
 * @since 2018/11/3
 */

@Mapper
public interface OrderMapper {
    String TABLE_NAME = "seckill_order";
    String INSERT_FIELDS = "product_id, pay_amount, user_id, seller_id, create_time, pay_time, pay_status, consignee_name, consignee_address, consignee_phone, trade_serial_number";
    String SELECT_FIELDS = "id, " + INSERT_FIELDS;

    /**
     * 保存订单
     * @param order 订单
     * @return 影响行数
     */
    @Insert({"insert into ", TABLE_NAME, " (", INSERT_FIELDS, ") values(#{productId}, #{payAmount}, " +
            "#{userId}, #{sellerId}, #{createTime}, #{payTime}, #{payStatus}, " +
            "#{consigneeName}, #{consigneeAddress}, #{consigneePhone}, #{tradeSerialNumber})"})
    int save(Order order);

    /**
     * 根据id获取订单
     * @param id 订单id
     * @return 订单
     */
    Order findById(int id);
}
