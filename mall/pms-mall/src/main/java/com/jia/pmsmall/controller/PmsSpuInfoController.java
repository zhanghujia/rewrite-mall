package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.model.PmsSpuInfo;
import com.jia.pmsmall.service.PmsSpuInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * spu信息(PmsSpuInfo)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:15:11
 */

@RestController
@RequestMapping("/api/pmsSpuInfo")
public class PmsSpuInfoController {

    /**
     * 服务对象
     */
    private final PmsSpuInfoService pmsSpuInfoService;

    public PmsSpuInfoController(PmsSpuInfoService pmsSpuInfoService) {
        this.pmsSpuInfoService = pmsSpuInfoService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 PmsSpuInfo", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.pmsSpuInfoService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 PmsSpuInfo", response = Result.class)
    public Result addPmsSpuInfo(@Valid @RequestBody PmsSpuInfo pmsSpuInfo) {
        return Result.success(pmsSpuInfoService.insert(pmsSpuInfo));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 PmsSpuInfo", response = Result.class)
    public Result updatePmsSpuInfo(@RequestBody PmsSpuInfo pmsSpuInfo) {
        return Result.success(pmsSpuInfoService.update(pmsSpuInfo));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 PmsSpuInfo", response = Result.class)
    public Result deletePmsSpuInfo(@PathVariable("id") Long id) {
        return Result.success(pmsSpuInfoService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 PmsSpuInfo列表(分页)", response = Result.class)
    public Result listPmsSpuInfo(@RequestParam(defaultValue = "0") Integer page,
                                 @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(pmsSpuInfoService.queryAllByLimit(page, size));
    }


}