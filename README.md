# 秒杀系统设计与实现

## 数据库(seckill)设计

### 秒杀商品表(seckill_product)
| 字段 | 类型 | 描述 | 示例 |
|---|---|---|---|
| id | int(32) | 主键，自增长id | 1 |
| product_id | int(32) | 商品id | 1 |
| product_title | varchar(50) | 商品标题 | 我是商品的标题 |
| product_img | varchar(50) | 商品图片 | https://avatars3.githubusercontent.com/u/21008209?s=460&v=4 |
| original_price | int(20) | 原价格 | 1000 |
| seckill_price | int(20) | 秒杀价格 | 100 |
| seller_id | int(32) | 商家id | 1 |
| apply_time | datetime | 申请日期 | 2018-11-03 16:49:59 |
| audit_time | datetime | 审核日期 | 2018-11-03 22:33:59 |
| audit_status | int(2) | 审核状态 | 1 |
| start_time | datetime | 秒杀开始时间 | 2018-11-11 00:00:00 |
| end_time | datetime | 秒杀结束时间 | 2018-11-11 00:11:00 |
| product_count | int(20) | 秒杀商品数 | 100 |
| stock_count | int(20) | 剩余库存数 | 100 |
| description | varchar(1500) | 描述 | 这是我的商品描述 |

### 秒杀订单表(seckill_order)
| 字段 | 类型 | 描述 | 示例 |
|---|---|---|---|
| id | int(32) | 主键，自增长id | 1 |
| product_id | int(32) | 商品id | 1 |
| pay_amount | int(32) | 支付金额 | 100 |
| user_id | int(32) | 用户id | 1 |
| seller_id | int(32) | 商家id | 1 |
| create_time | datetime | 订单创建时间 | 2018-11-11 00:00:13 |
| pay_time | datetime | 支付时间 | 2018-11-11 00:00:36 |
| pay_status | int(2) | 支付状态 | 1 |
| consignee_name | varchar(50) | 收货人姓名 | bingo |
| consignee_address | varchar(100) | 收货人地址 | 深圳大学乔相阁 |
| consignee_phone | bigint(11) | 收货人电话 | 15888888888 |
| trade_serial_number | varchar(100) | 交易流水号 | 123-12-123 |
 
### 秒杀系统用户表(seckill_user)
| 字段 | 类型 | 描述 | 示例 |
|---|---|---|---|
| id | int(32) | 主键，自增长id | 1 |
| user_name | varchar(20) | 用户名 | bingo |
| user_account | varchar(20) | 用户账号 | yanglbme |
| user_password | varchar(50) | 用户id | HelloWorld123 |
| user_sex | int(2) | 用户性别 | 1 |
| user_age | int(4) | 用户年龄 | 21 |
| user_address | varchar(200) | 用户住址 | 深圳大学乔相阁 |
| user_email | varchar(40) | 用户邮箱 | contact@yanglibin.info |

### 秒杀商家表(seckill_seller)
| 字段 | 类型 | 描述 | 示例 |
|---|---|---|---|
| id | int(32) | 主键，自增长id | 1 |
| seller_name | varchar(20) | 商家名称 | 小强 |
| seller_shop_name | varchar(40) | 商家店铺名称 | 华强北数码 |
| seller_account | varchar(20) | 商家账号 | helloqiang |
| seller_password | varchar(50) | 商家密码 | huaqiangbeiHello |
| seller_scope | varchar(500) | 商家经营范围 | 数码、电子产品 |

 ### 秒杀商品详情表(seckill_product_detail)
| 字段 | 类型 | 描述 | 示例 |
|---|---|---|---|
| id | int(32) | 主键，自增长id | 1 |
| product_id | int(32) | 商品id | 1 |
| seller_id | int(32) | 商家id | 1 |
| original_place | varchar(50) | original_place | 深圳市南山区 |
| product_name | varchar(50) | 商品名称 | iPhone XX |
| brand_name | varchar(20) | 品牌名称 | Apple |
| product_weight | varchar(50) | 商品毛重 | 500g |
| product_specification | varchar(200) | 规格和包装 | 100*80 |
| product_detail_img | varchar(100) | 商品详情图片地址 | https://avatars3.githubusercontent.com/u/21008209?s=460&v=4 |