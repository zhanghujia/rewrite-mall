package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsCouponHistory;
import com.jia.smsmall.service.SmsCouponHistoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 优惠券领取历史记录(SmsCouponHistory)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:21:43
 */

@RestController
@RequestMapping("/api/smsCouponHistory")
public class SmsCouponHistoryController {

    /**
     * 服务对象
     */
    private final SmsCouponHistoryService smsCouponHistoryService;

    public SmsCouponHistoryController(SmsCouponHistoryService smsCouponHistoryService) {
        this.smsCouponHistoryService = smsCouponHistoryService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsCouponHistory", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsCouponHistoryService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsCouponHistory", response = Result.class)
    public Result addSmsCouponHistory(@Valid @RequestBody SmsCouponHistory smsCouponHistory) {
        return Result.success(smsCouponHistoryService.insert(smsCouponHistory));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsCouponHistory", response = Result.class)
    public Result updateSmsCouponHistory(@RequestBody SmsCouponHistory smsCouponHistory) {
        return Result.success(smsCouponHistoryService.update(smsCouponHistory));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsCouponHistory", response = Result.class)
    public Result deleteSmsCouponHistory(@PathVariable("id") Long id) {
        return Result.success(smsCouponHistoryService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsCouponHistory列表(分页)", response = Result.class)
    public Result listSmsCouponHistory(@RequestParam(defaultValue = "0") Integer page,
                                       @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsCouponHistoryService.queryAllByLimit(page, size));
    }


}