package com.jia.umsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.umsmall.model.UmsGrowthChangeHistory;
import com.jia.umsmall.service.UmsGrowthChangeHistoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:46:41
 */

@RestController
@RequestMapping("/api/umsGrowthChangeHistory")
public class UmsGrowthChangeHistoryController {

    /**
     * 服务对象
     */
    private final UmsGrowthChangeHistoryService umsGrowthChangeHistoryService;

    public UmsGrowthChangeHistoryController(UmsGrowthChangeHistoryService umsGrowthChangeHistoryService) {
        this.umsGrowthChangeHistoryService = umsGrowthChangeHistoryService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 UmsGrowthChangeHistory", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.umsGrowthChangeHistoryService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 UmsGrowthChangeHistory", response = Result.class)
    public Result addUmsGrowthChangeHistory(@Valid @RequestBody UmsGrowthChangeHistory umsGrowthChangeHistory) {
        return Result.success(umsGrowthChangeHistoryService.insert(umsGrowthChangeHistory));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 UmsGrowthChangeHistory", response = Result.class)
    public Result updateUmsGrowthChangeHistory(@RequestBody UmsGrowthChangeHistory umsGrowthChangeHistory) {
        return Result.success(umsGrowthChangeHistoryService.update(umsGrowthChangeHistory));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 UmsGrowthChangeHistory", response = Result.class)
    public Result deleteUmsGrowthChangeHistory(@PathVariable("id") Long id) {
        return Result.success(umsGrowthChangeHistoryService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 UmsGrowthChangeHistory列表(分页)", response = Result.class)
    public Result listUmsGrowthChangeHistory(@RequestParam(defaultValue = "0") Integer page,
                                             @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(umsGrowthChangeHistoryService.queryAllByLimit(page, size));
    }


}