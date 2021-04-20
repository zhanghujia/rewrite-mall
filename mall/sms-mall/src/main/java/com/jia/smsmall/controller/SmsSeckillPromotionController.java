package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsSeckillPromotion;
import com.jia.smsmall.service.SmsSeckillPromotionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 秒杀活动(SmsSeckillPromotion)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:22:51
 */

@RestController
@RequestMapping("/api/smsSeckillPromotion")
public class SmsSeckillPromotionController {

    /**
     * 服务对象
     */
    private final SmsSeckillPromotionService smsSeckillPromotionService;

    public SmsSeckillPromotionController(SmsSeckillPromotionService smsSeckillPromotionService) {
        this.smsSeckillPromotionService = smsSeckillPromotionService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsSeckillPromotion", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsSeckillPromotionService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsSeckillPromotion", response = Result.class)
    public Result addSmsSeckillPromotion(@Valid @RequestBody SmsSeckillPromotion smsSeckillPromotion) {
        return Result.success(smsSeckillPromotionService.insert(smsSeckillPromotion));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsSeckillPromotion", response = Result.class)
    public Result updateSmsSeckillPromotion(@RequestBody SmsSeckillPromotion smsSeckillPromotion) {
        return Result.success(smsSeckillPromotionService.update(smsSeckillPromotion));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsSeckillPromotion", response = Result.class)
    public Result deleteSmsSeckillPromotion(@PathVariable("id") Long id) {
        return Result.success(smsSeckillPromotionService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsSeckillPromotion列表(分页)", response = Result.class)
    public Result listSmsSeckillPromotion(@RequestParam(defaultValue = "0") Integer page,
                                          @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsSeckillPromotionService.queryAllByLimit(page, size));
    }


}