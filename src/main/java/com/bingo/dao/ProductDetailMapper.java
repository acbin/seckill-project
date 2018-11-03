package com.bingo.dao;

import com.bingo.model.ProductDetail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ProductDetailMapper 接口
 *
 * @author bingo
 * @since 2018/11/3
 */

@Mapper
public interface ProductDetailMapper {
    String TABLE_NAME = "seckill_product_detail";
    String INSERT_FIELDS = "product_id, seller_id, original_place, product_name, brand_name, product_weight, product_specification, product_detail_img";
    String SELECT_FIELDS = "id, " + INSERT_FIELDS;

    /**
     * 保存商品详情
     * @param productDetail 商品详情
     * @return 影响行数
     */
    @Insert({"insert into ", TABLE_NAME, " (", INSERT_FIELDS, ") values(#{productId}, #{sellerId}," +
            "#{originalPlace}, #{productName}, #{brandName}, #{productWeight}, #{productSpecification}, #{productDetailImg})"})
    int save(ProductDetail productDetail);

    /**
     * 根据id获取商品详情
     * @param id 商品详情编号
     * @return 商品详情
     */
    @Select({"select ", SELECT_FIELDS, " from ", TABLE_NAME, " where id = #{id}"})
    ProductDetail findById(int id);
}
