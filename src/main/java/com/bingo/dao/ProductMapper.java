package com.bingo.dao;

import com.bingo.model.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ProductMapper 接口
 *
 * @author bingo
 * @since 2018/11/3
 */

@Mapper
public interface ProductMapper {
    String TABLE_NAME = "seckill_product";
    String INSERT_FIELDS = "product_id, product_title, product_img, original_price, seckill_price, seller_id, apply_time, audit_time, audit_status, start_time, end_time, product_count, stock_count, description";
    String SELECT_FIELDS = "id, " + INSERT_FIELDS;

    /**
     * 保存商品
     * @param product 商品
     * @return 影响条数
     */
    @Insert({"insert into ", TABLE_NAME, " (", INSERT_FIELDS,
            ") values(#{productId}, #{productTitle}, #{productImg}, #{originalPrice}, #{seckillPrice}," +
                    "#{sellerId}, #{applyTime}, #{auditTime}, #{auditStatus}, #{startTime}, #{endTime}," +
                    "#{productCount}, #{stockCount}, #{description})"})
    int save(Product product);

    /**
     * 根据id获取商品
     * @param id 商品编号
     * @return 商品
     */
    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where id = #{id}"})
    Product findById(int id);
}
