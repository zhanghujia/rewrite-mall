package com.jia.wmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.wmsmall.model.WmsPurchaseDetail;
import com.jia.wmsmall.service.WmsPurchaseDetailService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * (WmsPurchaseDetail)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:29:33
 */

@RestController
@RequestMapping("/api/wmsPurchaseDetail")
public class WmsPurchaseDetailController {

    /**
     * 服务对象
     */
    private final WmsPurchaseDetailService wmsPurchaseDetailService;

    public WmsPurchaseDetailController(WmsPurchaseDetailService wmsPurchaseDetailService) {
        this.wmsPurchaseDetailService = wmsPurchaseDetailService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 WmsPurchaseDetail", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.wmsPurchaseDetailService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 WmsPurchaseDetail", response = Result.class)
    public Result addWmsPurchaseDetail(@Valid @RequestBody WmsPurchaseDetail wmsPurchaseDetail) {
        return Result.success(wmsPurchaseDetailService.insert(wmsPurchaseDetail));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 WmsPurchaseDetail", response = Result.class)
    public Result updateWmsPurchaseDetail(@RequestBody WmsPurchaseDetail wmsPurchaseDetail) {
        return Result.success(wmsPurchaseDetailService.update(wmsPurchaseDetail));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 WmsPurchaseDetail", response = Result.class)
    public Result deleteWmsPurchaseDetail(@PathVariable("id") Long id) {
        return Result.success(wmsPurchaseDetailService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 WmsPurchaseDetail列表(分页)", response = Result.class)
    public Result listWmsPurchaseDetail(@RequestParam(defaultValue = "0") Integer page,
                                        @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(wmsPurchaseDetailService.queryAllByLimit(page, size));
    }


}