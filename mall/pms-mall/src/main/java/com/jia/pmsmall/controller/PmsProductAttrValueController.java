package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.model.PmsProductAttrValue;
import com.jia.pmsmall.service.PmsProductAttrValueService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * spu属性值(PmsProductAttrValue)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:14:47
 */

@RestController
@RequestMapping("/api/pmsProductAttrValue")
public class PmsProductAttrValueController {

    /**
     * 服务对象
     */
    private final PmsProductAttrValueService pmsProductAttrValueService;

    public PmsProductAttrValueController(PmsProductAttrValueService pmsProductAttrValueService) {
        this.pmsProductAttrValueService = pmsProductAttrValueService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 PmsProductAttrValue", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.pmsProductAttrValueService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 PmsProductAttrValue", response = Result.class)
    public Result addPmsProductAttrValue(@Valid @RequestBody PmsProductAttrValue pmsProductAttrValue) {
        return Result.success(pmsProductAttrValueService.insert(pmsProductAttrValue));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 PmsProductAttrValue", response = Result.class)
    public Result updatePmsProductAttrValue(@RequestBody PmsProductAttrValue pmsProductAttrValue) {
        return Result.success(pmsProductAttrValueService.update(pmsProductAttrValue));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 PmsProductAttrValue", response = Result.class)
    public Result deletePmsProductAttrValue(@PathVariable("id") Long id) {
        return Result.success(pmsProductAttrValueService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 PmsProductAttrValue列表(分页)", response = Result.class)
    public Result listPmsProductAttrValue(@RequestParam(defaultValue = "0") Integer page,
                                          @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(pmsProductAttrValueService.queryAllByLimit(page, size));
    }


}