package com.bingo.dao;

import com.bingo.model.Seller;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * SellerMapper 接口
 * @author bingo
 * @since 2018/11/3
 */

@Mapper
public interface SellerMapper {
    String TABLE_NAME = "seckill_seller";
    String INSERT_FIELDS = "seller_name, seller_shop_name, seller_account, seller_password, seller_scope";
    String SELECT_FIELDS = "id, " + INSERT_FIELDS;

    /**
     * 保存商家
     * @param seller 商家
     * @return 影响条数
     */
    @Insert({"insert into ", TABLE_NAME, " (", INSERT_FIELDS, ") " +
            "values(#{sellerName}, #{sellerShopName}, #{sellerAccount}, #{sellerPassword}, #{sellerScope})"})
    int save(Seller seller);

    /**
     * 根据id获取商家
     * @param id 商家编号
     * @return 商家
     */
    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where id = #{id}"})
    Seller findById(int id);

}
