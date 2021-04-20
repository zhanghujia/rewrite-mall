package com.jia.omsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.omsmall.model.OmsRefundInfo;
import com.jia.omsmall.service.OmsRefundInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 退款信息(OmsRefundInfo)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:01:28
 */

@RestController
@RequestMapping("/api/omsRefundInfo")
public class OmsRefundInfoController {

    /**
     * 服务对象
     */
    private final OmsRefundInfoService omsRefundInfoService;

    public OmsRefundInfoController(OmsRefundInfoService omsRefundInfoService) {
        this.omsRefundInfoService = omsRefundInfoService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 OmsRefundInfo", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.omsRefundInfoService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 OmsRefundInfo", response = Result.class)
    public Result addOmsRefundInfo(@Valid @RequestBody OmsRefundInfo omsRefundInfo) {
        return Result.success(omsRefundInfoService.insert(omsRefundInfo));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 OmsRefundInfo", response = Result.class)
    public Result updateOmsRefundInfo(@RequestBody OmsRefundInfo omsRefundInfo) {
        return Result.success(omsRefundInfoService.update(omsRefundInfo));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 OmsRefundInfo", response = Result.class)
    public Result deleteOmsRefundInfo(@PathVariable("id") Long id) {
        return Result.success(omsRefundInfoService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 OmsRefundInfo列表(分页)", response = Result.class)
    public Result listOmsRefundInfo(@RequestParam(defaultValue = "0") Integer page,
                                    @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(omsRefundInfoService.queryAllByLimit(page, size));
    }


}