package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsSkuFullReduction;
import com.jia.smsmall.service.SmsSkuFullReductionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 商品满减信息(SmsSkuFullReduction)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:24:07
 */

@RestController
@RequestMapping("/api/smsSkuFullReduction")
public class SmsSkuFullReductionController {

    /**
     * 服务对象
     */
    private final SmsSkuFullReductionService smsSkuFullReductionService;

    public SmsSkuFullReductionController(SmsSkuFullReductionService smsSkuFullReductionService) {
        this.smsSkuFullReductionService = smsSkuFullReductionService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsSkuFullReduction", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsSkuFullReductionService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsSkuFullReduction", response = Result.class)
    public Result addSmsSkuFullReduction(@Valid @RequestBody SmsSkuFullReduction smsSkuFullReduction) {
        return Result.success(smsSkuFullReductionService.insert(smsSkuFullReduction));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsSkuFullReduction", response = Result.class)
    public Result updateSmsSkuFullReduction(@RequestBody SmsSkuFullReduction smsSkuFullReduction) {
        return Result.success(smsSkuFullReductionService.update(smsSkuFullReduction));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsSkuFullReduction", response = Result.class)
    public Result deleteSmsSkuFullReduction(@PathVariable("id") Long id) {
        return Result.success(smsSkuFullReductionService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsSkuFullReduction列表(分页)", response = Result.class)
    public Result listSmsSkuFullReduction(@RequestParam(defaultValue = "0") Integer page,
                                          @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsSkuFullReductionService.queryAllByLimit(page, size));
    }


}