package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.model.PmsSpuInfoDesc;
import com.jia.pmsmall.service.PmsSpuInfoDescService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * spu信息介绍(PmsSpuInfoDesc)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:15:16
 */

@RestController
@RequestMapping("/api/pmsSpuInfoDesc")
public class PmsSpuInfoDescController {

    /**
     * 服务对象
     */
    private final PmsSpuInfoDescService pmsSpuInfoDescService;

    public PmsSpuInfoDescController(PmsSpuInfoDescService pmsSpuInfoDescService) {
        this.pmsSpuInfoDescService = pmsSpuInfoDescService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 PmsSpuInfoDesc", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.pmsSpuInfoDescService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 PmsSpuInfoDesc", response = Result.class)
    public Result addPmsSpuInfoDesc(@Valid @RequestBody PmsSpuInfoDesc pmsSpuInfoDesc) {
        return Result.success(pmsSpuInfoDescService.insert(pmsSpuInfoDesc));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 PmsSpuInfoDesc", response = Result.class)
    public Result updatePmsSpuInfoDesc(@RequestBody PmsSpuInfoDesc pmsSpuInfoDesc) {
        return Result.success(pmsSpuInfoDescService.update(pmsSpuInfoDesc));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 PmsSpuInfoDesc", response = Result.class)
    public Result deletePmsSpuInfoDesc(@PathVariable("id") Long id) {
        return Result.success(pmsSpuInfoDescService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 PmsSpuInfoDesc列表(分页)", response = Result.class)
    public Result listPmsSpuInfoDesc(@RequestParam(defaultValue = "0") Integer page,
                                     @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(pmsSpuInfoDescService.queryAllByLimit(page, size));
    }


}