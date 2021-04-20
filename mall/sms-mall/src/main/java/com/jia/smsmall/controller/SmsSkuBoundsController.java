package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsSkuBounds;
import com.jia.smsmall.service.SmsSkuBoundsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 商品sku积分设置(SmsSkuBounds)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:23:50
 */

@RestController
@RequestMapping("/api/smsSkuBounds")
public class SmsSkuBoundsController {

    /**
     * 服务对象
     */
    private final SmsSkuBoundsService smsSkuBoundsService;

    public SmsSkuBoundsController(SmsSkuBoundsService smsSkuBoundsService) {
        this.smsSkuBoundsService = smsSkuBoundsService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsSkuBounds", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsSkuBoundsService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsSkuBounds", response = Result.class)
    public Result addSmsSkuBounds(@Valid @RequestBody SmsSkuBounds smsSkuBounds) {
        return Result.success(smsSkuBoundsService.insert(smsSkuBounds));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsSkuBounds", response = Result.class)
    public Result updateSmsSkuBounds(@RequestBody SmsSkuBounds smsSkuBounds) {
        return Result.success(smsSkuBoundsService.update(smsSkuBounds));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsSkuBounds", response = Result.class)
    public Result deleteSmsSkuBounds(@PathVariable("id") Long id) {
        return Result.success(smsSkuBoundsService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsSkuBounds列表(分页)", response = Result.class)
    public Result listSmsSkuBounds(@RequestParam(defaultValue = "0") Integer page,
                                   @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsSkuBoundsService.queryAllByLimit(page, size));
    }


}