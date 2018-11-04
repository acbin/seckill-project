package com.bingo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 秒杀接口
 *
 * @author bingo
 * @since 2018/11/4
 */

@Controller
@RequestMapping("/seckill")
public class SeckillController {

    private final Logger logger = LoggerFactory.getLogger(SeckillController.class);

    @GetMapping("/list")
    public String list(Model model) {
        return null;
    }

    @GetMapping("/{seckillId}/detail")
    public String detail(@PathVariable("seckillId") Long seckillId,
                         Model model) {
        if (seckillId == null) {
            return "redirect:/seckill/list";
        }

        // id如果是随便传的，也需要返回
        // return "forward:/seckill/list";

        return null;
    }

    @PostMapping("/{seckillId}/exposer")
    @ResponseBody
    public void/*TODO*/ exposer(Long seckillId) {

    }
}
