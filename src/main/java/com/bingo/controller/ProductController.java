package com.bingo.controller;

import com.bingo.model.Product;
import com.bingo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 秒杀商品 controller
 *
 * @author bingo
 * @since 2018/11/5
 */

@Controller
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @PostMapping
    public String add(Product product) {
        productService.save(product);
        return "200";
    }
}
