package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsCoupon;
import com.jia.smsmall.service.SmsCouponService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 优惠券信息(SmsCoupon)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:21:37
 */

@RestController
@RequestMapping("/api/smsCoupon")
public class SmsCouponController {

    /**
     * 服务对象
     */
    private final SmsCouponService smsCouponService;

    public SmsCouponController(SmsCouponService smsCouponService) {
        this.smsCouponService = smsCouponService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsCoupon", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsCouponService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsCoupon", response = Result.class)
    public Result addSmsCoupon(@Valid @RequestBody SmsCoupon smsCoupon) {
        return Result.success(smsCouponService.insert(smsCoupon));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsCoupon", response = Result.class)
    public Result updateSmsCoupon(@RequestBody SmsCoupon smsCoupon) {
        return Result.success(smsCouponService.update(smsCoupon));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsCoupon", response = Result.class)
    public Result deleteSmsCoupon(@PathVariable("id") Long id) {
        return Result.success(smsCouponService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsCoupon列表(分页)", response = Result.class)
    public Result listSmsCoupon(@RequestParam(defaultValue = "0") Integer page,
                                @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsCouponService.queryAllByLimit(page, size));
    }


}