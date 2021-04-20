package com.jia.omsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.omsmall.model.OmsOrderOperateHistory;
import com.jia.omsmall.service.OmsOrderOperateHistoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 订单操作历史记录(OmsOrderOperateHistory)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:00:41
 */

@RestController
@RequestMapping("/api/omsOrderOperateHistory")
public class OmsOrderOperateHistoryController {

    /**
     * 服务对象
     */
    private final OmsOrderOperateHistoryService omsOrderOperateHistoryService;

    public OmsOrderOperateHistoryController(OmsOrderOperateHistoryService omsOrderOperateHistoryService) {
        this.omsOrderOperateHistoryService = omsOrderOperateHistoryService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 OmsOrderOperateHistory", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.omsOrderOperateHistoryService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 OmsOrderOperateHistory", response = Result.class)
    public Result addOmsOrderOperateHistory(@Valid @RequestBody OmsOrderOperateHistory omsOrderOperateHistory) {
        return Result.success(omsOrderOperateHistoryService.insert(omsOrderOperateHistory));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 OmsOrderOperateHistory", response = Result.class)
    public Result updateOmsOrderOperateHistory(@RequestBody OmsOrderOperateHistory omsOrderOperateHistory) {
        return Result.success(omsOrderOperateHistoryService.update(omsOrderOperateHistory));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 OmsOrderOperateHistory", response = Result.class)
    public Result deleteOmsOrderOperateHistory(@PathVariable("id") Long id) {
        return Result.success(omsOrderOperateHistoryService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 OmsOrderOperateHistory列表(分页)", response = Result.class)
    public Result listOmsOrderOperateHistory(@RequestParam(defaultValue = "0") Integer page,
                                             @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(omsOrderOperateHistoryService.queryAllByLimit(page, size));
    }


}