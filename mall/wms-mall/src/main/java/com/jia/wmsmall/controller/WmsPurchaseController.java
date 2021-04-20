package com.jia.wmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.wmsmall.model.WmsPurchase;
import com.jia.wmsmall.service.WmsPurchaseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 采购信息(WmsPurchase)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:29:27
 */

@RestController
@RequestMapping("/api/wmsPurchase")
public class WmsPurchaseController {

    /**
     * 服务对象
     */
    private final WmsPurchaseService wmsPurchaseService;

    public WmsPurchaseController(WmsPurchaseService wmsPurchaseService) {
        this.wmsPurchaseService = wmsPurchaseService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 WmsPurchase", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.wmsPurchaseService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 WmsPurchase", response = Result.class)
    public Result addWmsPurchase(@Valid @RequestBody WmsPurchase wmsPurchase) {
        return Result.success(wmsPurchaseService.insert(wmsPurchase));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 WmsPurchase", response = Result.class)
    public Result updateWmsPurchase(@RequestBody WmsPurchase wmsPurchase) {
        return Result.success(wmsPurchaseService.update(wmsPurchase));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 WmsPurchase", response = Result.class)
    public Result deleteWmsPurchase(@PathVariable("id") Long id) {
        return Result.success(wmsPurchaseService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 WmsPurchase列表(分页)", response = Result.class)
    public Result listWmsPurchase(@RequestParam(defaultValue = "0") Integer page,
                                  @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(wmsPurchaseService.queryAllByLimit(page, size));
    }


}