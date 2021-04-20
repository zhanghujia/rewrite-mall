package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.model.PmsAttrAttrgroupRelation;
import com.jia.pmsmall.service.PmsAttrAttrgroupRelationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 属性&属性分组关联(PmsAttrAttrgroupRelation)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:14:27
 */

@RestController
@RequestMapping("/api/pmsAttrAttrgroupRelation")
public class PmsAttrAttrgroupRelationController {

    /**
     * 服务对象
     */
    private final PmsAttrAttrgroupRelationService pmsAttrAttrgroupRelationService;

    public PmsAttrAttrgroupRelationController(PmsAttrAttrgroupRelationService pmsAttrAttrgroupRelationService) {
        this.pmsAttrAttrgroupRelationService = pmsAttrAttrgroupRelationService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 PmsAttrAttrgroupRelation", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.pmsAttrAttrgroupRelationService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 PmsAttrAttrgroupRelation", response = Result.class)
    public Result addPmsAttrAttrgroupRelation(@Valid @RequestBody PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation) {
        return Result.success(pmsAttrAttrgroupRelationService.insert(pmsAttrAttrgroupRelation));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 PmsAttrAttrgroupRelation", response = Result.class)
    public Result updatePmsAttrAttrgroupRelation(@RequestBody PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation) {
        return Result.success(pmsAttrAttrgroupRelationService.update(pmsAttrAttrgroupRelation));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 PmsAttrAttrgroupRelation", response = Result.class)
    public Result deletePmsAttrAttrgroupRelation(@PathVariable("id") Long id) {
        return Result.success(pmsAttrAttrgroupRelationService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 PmsAttrAttrgroupRelation列表(分页)", response = Result.class)
    public Result listPmsAttrAttrgroupRelation(@RequestParam(defaultValue = "0") Integer page,
                                               @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(pmsAttrAttrgroupRelationService.queryAllByLimit(page, size));
    }


}