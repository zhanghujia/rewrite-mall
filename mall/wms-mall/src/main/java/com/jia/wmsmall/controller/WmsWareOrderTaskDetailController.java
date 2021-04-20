package com.jia.wmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.wmsmall.model.WmsWareOrderTaskDetail;
import com.jia.wmsmall.service.WmsWareOrderTaskDetailService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 库存工作单(WmsWareOrderTaskDetail)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:29:54
 */

@RestController
@RequestMapping("/api/wmsWareOrderTaskDetail")
public class WmsWareOrderTaskDetailController {

    /**
     * 服务对象
     */
    private final WmsWareOrderTaskDetailService wmsWareOrderTaskDetailService;

    public WmsWareOrderTaskDetailController(WmsWareOrderTaskDetailService wmsWareOrderTaskDetailService) {
        this.wmsWareOrderTaskDetailService = wmsWareOrderTaskDetailService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 WmsWareOrderTaskDetail", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.wmsWareOrderTaskDetailService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 WmsWareOrderTaskDetail", response = Result.class)
    public Result addWmsWareOrderTaskDetail(@Valid @RequestBody WmsWareOrderTaskDetail wmsWareOrderTaskDetail) {
        return Result.success(wmsWareOrderTaskDetailService.insert(wmsWareOrderTaskDetail));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 WmsWareOrderTaskDetail", response = Result.class)
    public Result updateWmsWareOrderTaskDetail(@RequestBody WmsWareOrderTaskDetail wmsWareOrderTaskDetail) {
        return Result.success(wmsWareOrderTaskDetailService.update(wmsWareOrderTaskDetail));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 WmsWareOrderTaskDetail", response = Result.class)
    public Result deleteWmsWareOrderTaskDetail(@PathVariable("id") Long id) {
        return Result.success(wmsWareOrderTaskDetailService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 WmsWareOrderTaskDetail列表(分页)", response = Result.class)
    public Result listWmsWareOrderTaskDetail(@RequestParam(defaultValue = "0") Integer page,
                                             @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(wmsWareOrderTaskDetailService.queryAllByLimit(page, size));
    }


}