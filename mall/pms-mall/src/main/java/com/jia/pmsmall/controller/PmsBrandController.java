package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.model.PmsBrand;
import com.jia.pmsmall.service.PmsBrandService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 品牌(PmsBrand)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:14:35
 */

@RestController
@RequestMapping("/api/pmsBrand")
public class PmsBrandController {

    /**
     * 服务对象
     */
    private final PmsBrandService pmsBrandService;

    public PmsBrandController(PmsBrandService pmsBrandService) {
        this.pmsBrandService = pmsBrandService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 PmsBrand", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.pmsBrandService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 PmsBrand", response = Result.class)
    public Result addPmsBrand(@Valid @RequestBody PmsBrand pmsBrand) {
        return Result.success(pmsBrandService.insert(pmsBrand));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 PmsBrand", response = Result.class)
    public Result updatePmsBrand(@RequestBody PmsBrand pmsBrand) {
        return Result.success(pmsBrandService.update(pmsBrand));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 PmsBrand", response = Result.class)
    public Result deletePmsBrand(@PathVariable("id") Long id) {
        return Result.success(pmsBrandService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 PmsBrand列表(分页)", response = Result.class)
    public Result listPmsBrand(@RequestParam(defaultValue = "0") Integer page,
                               @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(pmsBrandService.queryAllByLimit(page, size));
    }


}