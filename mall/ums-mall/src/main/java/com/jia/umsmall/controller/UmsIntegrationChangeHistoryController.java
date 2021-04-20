package com.jia.umsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.umsmall.model.UmsIntegrationChangeHistory;
import com.jia.umsmall.service.UmsIntegrationChangeHistoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 积分变化历史记录(UmsIntegrationChangeHistory)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:46:46
 */

@RestController
@RequestMapping("/api/umsIntegrationChangeHistory")
public class UmsIntegrationChangeHistoryController {

    /**
     * 服务对象
     */
    private final UmsIntegrationChangeHistoryService umsIntegrationChangeHistoryService;

    public UmsIntegrationChangeHistoryController(UmsIntegrationChangeHistoryService umsIntegrationChangeHistoryService) {
        this.umsIntegrationChangeHistoryService = umsIntegrationChangeHistoryService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 UmsIntegrationChangeHistory", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.umsIntegrationChangeHistoryService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 UmsIntegrationChangeHistory", response = Result.class)
    public Result addUmsIntegrationChangeHistory(@Valid @RequestBody UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        return Result.success(umsIntegrationChangeHistoryService.insert(umsIntegrationChangeHistory));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 UmsIntegrationChangeHistory", response = Result.class)
    public Result updateUmsIntegrationChangeHistory(@RequestBody UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        return Result.success(umsIntegrationChangeHistoryService.update(umsIntegrationChangeHistory));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 UmsIntegrationChangeHistory", response = Result.class)
    public Result deleteUmsIntegrationChangeHistory(@PathVariable("id") Long id) {
        return Result.success(umsIntegrationChangeHistoryService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 UmsIntegrationChangeHistory列表(分页)", response = Result.class)
    public Result listUmsIntegrationChangeHistory(@RequestParam(defaultValue = "0") Integer page,
                                                  @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(umsIntegrationChangeHistoryService.queryAllByLimit(page, size));
    }


}