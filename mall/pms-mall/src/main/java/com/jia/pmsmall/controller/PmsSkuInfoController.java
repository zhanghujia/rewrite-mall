package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.model.PmsSkuInfo;
import com.jia.pmsmall.service.PmsSkuInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * sku信息(PmsSkuInfo)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:14:55
 */

@RestController
@RequestMapping("/api/pmsSkuInfo")
public class PmsSkuInfoController {

    /**
     * 服务对象
     */
    private final PmsSkuInfoService pmsSkuInfoService;

    public PmsSkuInfoController(PmsSkuInfoService pmsSkuInfoService) {
        this.pmsSkuInfoService = pmsSkuInfoService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 PmsSkuInfo", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.pmsSkuInfoService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 PmsSkuInfo", response = Result.class)
    public Result addPmsSkuInfo(@Valid @RequestBody PmsSkuInfo pmsSkuInfo) {
        return Result.success(pmsSkuInfoService.insert(pmsSkuInfo));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 PmsSkuInfo", response = Result.class)
    public Result updatePmsSkuInfo(@RequestBody PmsSkuInfo pmsSkuInfo) {
        return Result.success(pmsSkuInfoService.update(pmsSkuInfo));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 PmsSkuInfo", response = Result.class)
    public Result deletePmsSkuInfo(@PathVariable("id") Long id) {
        return Result.success(pmsSkuInfoService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 PmsSkuInfo列表(分页)", response = Result.class)
    public Result listPmsSkuInfo(@RequestParam(defaultValue = "0") Integer page,
                                 @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(pmsSkuInfoService.queryAllByLimit(page, size));
    }


}