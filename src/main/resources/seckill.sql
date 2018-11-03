/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : seckill

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-11-03 15:10:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `seckill_order`
-- ----------------------------
DROP TABLE IF EXISTS `seckill_order`;
CREATE TABLE `seckill_order` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `product_id` int(32) NOT NULL COMMENT '秒杀商品id',
  `pay_amount` int(32) NOT NULL COMMENT '支付金额',
  `user_id` int(32) NOT NULL COMMENT '用户id',
  `seller_id` int(32) NOT NULL COMMENT '商家id',
  `create_time` datetime NOT NULL COMMENT '订单创建时间',
  `pay_time` datetime NOT NULL COMMENT '支付时间',
  `pay_status` int(2) NOT NULL COMMENT '支付状态',
  `consignee_name` varchar(50) NOT NULL COMMENT '收货人姓名',
  `consignee_address` varchar(100) NOT NULL COMMENT '收货人地址',
  `consignee_phone` bigint(11) NOT NULL COMMENT '收货人电话',
  `trade_serial_number` varchar(100) NOT NULL COMMENT '交易流水号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seckill_order
-- ----------------------------

-- ----------------------------
-- Table structure for `seckill_product`
-- ----------------------------
DROP TABLE IF EXISTS `seckill_product`;
CREATE TABLE `seckill_product` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `product_id` int(32) NOT NULL COMMENT '商品id',
  `product_title` varchar(50) NOT NULL COMMENT '商品标题',
  `product_img` varchar(50) NOT NULL COMMENT '商品图片',
  `original_price` int(20) NOT NULL COMMENT '原价格',
  `seckill_price` int(20) NOT NULL COMMENT '秒杀价格',
  `seller_id` int(32) NOT NULL COMMENT '商家id',
  `apply_time` datetime NOT NULL COMMENT '申请日期',
  `audit_time` datetime NOT NULL COMMENT '审核日期',
  `audit_status` int(2) NOT NULL COMMENT '审核状态',
  `start_time` datetime NOT NULL COMMENT '秒杀开始时间',
  `end_time` datetime NOT NULL COMMENT '秒杀结束时间',
  `product_count` int(20) NOT NULL COMMENT '秒杀商品数',
  `stock_count` int(20) NOT NULL COMMENT '剩余库存数',
  `description` varchar(1500) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seckill_product
-- ----------------------------

-- ----------------------------
-- Table structure for `seckill_product_detail`
-- ----------------------------
DROP TABLE IF EXISTS `seckill_product_detail`;
CREATE TABLE `seckill_product_detail` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `product_id` int(32) NOT NULL COMMENT '商品id',
  `seller_id` int(32) NOT NULL COMMENT '商家id',
  `original_place` varchar(50) NOT NULL COMMENT '商品产地',
  `product_name` varchar(50) NOT NULL COMMENT '商品名称',
  `brand_name` varchar(20) NOT NULL COMMENT '品牌名称',
  `product_weight` varchar(50) NOT NULL COMMENT '商品毛重',
  `product_specification` varchar(200) NOT NULL COMMENT '商品规格',
  `product_detail_img` varchar(100) NOT NULL COMMENT '商品详情图地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seckill_product_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `seckill_seller`
-- ----------------------------
DROP TABLE IF EXISTS `seckill_seller`;
CREATE TABLE `seckill_seller` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `seller_name` varchar(20) NOT NULL COMMENT '商家名称',
  `seller_shop_name` varchar(40) NOT NULL COMMENT '商家店铺名称',
  `seller_account` varchar(20) NOT NULL COMMENT '商家账号',
  `seller_password` varchar(50) NOT NULL COMMENT '商家密码',
  `seller_scope` varchar(500) NOT NULL COMMENT '商家经营范围',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seckill_seller
-- ----------------------------

-- ----------------------------
-- Table structure for `seckill_user`
-- ----------------------------
DROP TABLE IF EXISTS `seckill_user`;
CREATE TABLE `seckill_user` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `user_account` varchar(20) NOT NULL COMMENT '用户账号',
  `user_password` varchar(50) NOT NULL COMMENT '用户密码',
  `user_sex` int(2) NOT NULL COMMENT '用户性别',
  `user_age` int(4) NOT NULL COMMENT '用户年龄',
  `user_address` varchar(200) NOT NULL COMMENT '用户住址',
  `user_email` varchar(40) NOT NULL DEFAULT '' COMMENT '用户邮箱',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seckill_user
-- ----------------------------
