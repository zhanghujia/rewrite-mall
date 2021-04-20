package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsSkuLadder;
import com.jia.smsmall.service.SmsSkuLadderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 商品阶梯价格(SmsSkuLadder)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:24:25
 */

@RestController
@RequestMapping("/api/smsSkuLadder")
public class SmsSkuLadderController {

    /**
     * 服务对象
     */
    private final SmsSkuLadderService smsSkuLadderService;

    public SmsSkuLadderController(SmsSkuLadderService smsSkuLadderService) {
        this.smsSkuLadderService = smsSkuLadderService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsSkuLadder", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsSkuLadderService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsSkuLadder", response = Result.class)
    public Result addSmsSkuLadder(@Valid @RequestBody SmsSkuLadder smsSkuLadder) {
        return Result.success(smsSkuLadderService.insert(smsSkuLadder));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsSkuLadder", response = Result.class)
    public Result updateSmsSkuLadder(@RequestBody SmsSkuLadder smsSkuLadder) {
        return Result.success(smsSkuLadderService.update(smsSkuLadder));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsSkuLadder", response = Result.class)
    public Result deleteSmsSkuLadder(@PathVariable("id") Long id) {
        return Result.success(smsSkuLadderService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsSkuLadder列表(分页)", response = Result.class)
    public Result listSmsSkuLadder(@RequestParam(defaultValue = "0") Integer page,
                                   @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsSkuLadderService.queryAllByLimit(page, size));
    }


}