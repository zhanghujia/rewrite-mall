package com.jia.omsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.omsmall.model.OmsPaymentInfo;
import com.jia.omsmall.service.OmsPaymentInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 支付信息表(OmsPaymentInfo)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:01:18
 */

@RestController
@RequestMapping("/api/omsPaymentInfo")
public class OmsPaymentInfoController {

    /**
     * 服务对象
     */
    private final OmsPaymentInfoService omsPaymentInfoService;

    public OmsPaymentInfoController(OmsPaymentInfoService omsPaymentInfoService) {
        this.omsPaymentInfoService = omsPaymentInfoService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 OmsPaymentInfo", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.omsPaymentInfoService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 OmsPaymentInfo", response = Result.class)
    public Result addOmsPaymentInfo(@Valid @RequestBody OmsPaymentInfo omsPaymentInfo) {
        return Result.success(omsPaymentInfoService.insert(omsPaymentInfo));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 OmsPaymentInfo", response = Result.class)
    public Result updateOmsPaymentInfo(@RequestBody OmsPaymentInfo omsPaymentInfo) {
        return Result.success(omsPaymentInfoService.update(omsPaymentInfo));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 OmsPaymentInfo", response = Result.class)
    public Result deleteOmsPaymentInfo(@PathVariable("id") Long id) {
        return Result.success(omsPaymentInfoService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 OmsPaymentInfo列表(分页)", response = Result.class)
    public Result listOmsPaymentInfo(@RequestParam(defaultValue = "0") Integer page,
                                     @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(omsPaymentInfoService.queryAllByLimit(page, size));
    }


}