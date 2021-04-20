package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.model.PmsAttr;
import com.jia.pmsmall.service.PmsAttrService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 商品属性(PmsAttr)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:14:22
 */

@RestController
@RequestMapping("/api/pmsAttr")
public class PmsAttrController {

    /**
     * 服务对象
     */
    private final PmsAttrService pmsAttrService;

    public PmsAttrController(PmsAttrService pmsAttrService) {
        this.pmsAttrService = pmsAttrService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 PmsAttr", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.pmsAttrService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 PmsAttr", response = Result.class)
    public Result addPmsAttr(@Valid @RequestBody PmsAttr pmsAttr) {
        return Result.success(pmsAttrService.insert(pmsAttr));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 PmsAttr", response = Result.class)
    public Result updatePmsAttr(@RequestBody PmsAttr pmsAttr) {
        return Result.success(pmsAttrService.update(pmsAttr));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 PmsAttr", response = Result.class)
    public Result deletePmsAttr(@PathVariable("id") Long id) {
        return Result.success(pmsAttrService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 PmsAttr列表(分页)", response = Result.class)
    public Result listPmsAttr(@RequestParam(defaultValue = "0") Integer page,
                              @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(pmsAttrService.queryAllByLimit(page, size));
    }


}