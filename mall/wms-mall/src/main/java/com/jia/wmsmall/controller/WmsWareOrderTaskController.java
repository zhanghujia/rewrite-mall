package com.jia.wmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.wmsmall.model.WmsWareOrderTask;
import com.jia.wmsmall.service.WmsWareOrderTaskService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 库存工作单(WmsWareOrderTask)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:29:46
 */

@RestController
@RequestMapping("/api/wmsWareOrderTask")
public class WmsWareOrderTaskController {

    /**
     * 服务对象
     */
    private final WmsWareOrderTaskService wmsWareOrderTaskService;

    public WmsWareOrderTaskController(WmsWareOrderTaskService wmsWareOrderTaskService) {
        this.wmsWareOrderTaskService = wmsWareOrderTaskService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 WmsWareOrderTask", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.wmsWareOrderTaskService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 WmsWareOrderTask", response = Result.class)
    public Result addWmsWareOrderTask(@Valid @RequestBody WmsWareOrderTask wmsWareOrderTask) {
        return Result.success(wmsWareOrderTaskService.insert(wmsWareOrderTask));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 WmsWareOrderTask", response = Result.class)
    public Result updateWmsWareOrderTask(@RequestBody WmsWareOrderTask wmsWareOrderTask) {
        return Result.success(wmsWareOrderTaskService.update(wmsWareOrderTask));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 WmsWareOrderTask", response = Result.class)
    public Result deleteWmsWareOrderTask(@PathVariable("id") Long id) {
        return Result.success(wmsWareOrderTaskService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 WmsWareOrderTask列表(分页)", response = Result.class)
    public Result listWmsWareOrderTask(@RequestParam(defaultValue = "0") Integer page,
                                       @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(wmsWareOrderTaskService.queryAllByLimit(page, size));
    }


}