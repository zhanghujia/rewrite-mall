package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.model.PmsCategory;
import com.jia.pmsmall.service.PmsCategoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 商品三级分类(PmsCategory)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:14:39
 */

@RestController
@RequestMapping("/api/pmsCategory")
public class PmsCategoryController {

    /**
     * 服务对象
     */
    private final PmsCategoryService pmsCategoryService;

    public PmsCategoryController(PmsCategoryService pmsCategoryService) {
        this.pmsCategoryService = pmsCategoryService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 PmsCategory", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.pmsCategoryService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 PmsCategory", response = Result.class)
    public Result addPmsCategory(@Valid @RequestBody PmsCategory pmsCategory) {
        return Result.success(pmsCategoryService.insert(pmsCategory));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 PmsCategory", response = Result.class)
    public Result updatePmsCategory(@RequestBody PmsCategory pmsCategory) {
        return Result.success(pmsCategoryService.update(pmsCategory));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 PmsCategory", response = Result.class)
    public Result deletePmsCategory(@PathVariable("id") Long id) {
        return Result.success(pmsCategoryService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 PmsCategory列表(分页)", response = Result.class)
    public Result listPmsCategory(@RequestParam(defaultValue = "0") Integer page,
                                  @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(pmsCategoryService.queryAllByLimit(page, size));
    }

    @GetMapping("/list/tree")
    @ApiOperation(value = "获取 PmsCategoryTree列表 ", response = Result.class)
    public Result listPmsCategoryTree() {
        return Result.success(pmsCategoryService.queryAllByTree());
    }


}