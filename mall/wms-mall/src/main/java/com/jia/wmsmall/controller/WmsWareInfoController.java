package com.jia.wmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.wmsmall.model.WmsWareInfo;
import com.jia.wmsmall.service.WmsWareInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 仓库信息(WmsWareInfo)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:29:39
 */

@RestController
@RequestMapping("/api/wmsWareInfo")
public class WmsWareInfoController {

    /**
     * 服务对象
     */
    private final WmsWareInfoService wmsWareInfoService;

    public WmsWareInfoController(WmsWareInfoService wmsWareInfoService) {
        this.wmsWareInfoService = wmsWareInfoService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 WmsWareInfo", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.wmsWareInfoService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 WmsWareInfo", response = Result.class)
    public Result addWmsWareInfo(@Valid @RequestBody WmsWareInfo wmsWareInfo) {
        return Result.success(wmsWareInfoService.insert(wmsWareInfo));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 WmsWareInfo", response = Result.class)
    public Result updateWmsWareInfo(@RequestBody WmsWareInfo wmsWareInfo) {
        return Result.success(wmsWareInfoService.update(wmsWareInfo));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 WmsWareInfo", response = Result.class)
    public Result deleteWmsWareInfo(@PathVariable("id") Long id) {
        return Result.success(wmsWareInfoService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 WmsWareInfo列表(分页)", response = Result.class)
    public Result listWmsWareInfo(@RequestParam(defaultValue = "0") Integer page,
                                  @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(wmsWareInfoService.queryAllByLimit(page, size));
    }


}