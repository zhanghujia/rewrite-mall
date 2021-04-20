package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.model.PmsAttrGroup;
import com.jia.pmsmall.service.PmsAttrGroupService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 属性分组(PmsAttrGroup)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:14:31
 */

@RestController
@RequestMapping("/api/pmsAttrGroup")
public class PmsAttrGroupController {

    /**
     * 服务对象
     */
    private final PmsAttrGroupService pmsAttrGroupService;

    public PmsAttrGroupController(PmsAttrGroupService pmsAttrGroupService) {
        this.pmsAttrGroupService = pmsAttrGroupService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 PmsAttrGroup", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.pmsAttrGroupService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 PmsAttrGroup", response = Result.class)
    public Result addPmsAttrGroup(@Valid @RequestBody PmsAttrGroup pmsAttrGroup) {
        return Result.success(pmsAttrGroupService.insert(pmsAttrGroup));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 PmsAttrGroup", response = Result.class)
    public Result updatePmsAttrGroup(@RequestBody PmsAttrGroup pmsAttrGroup) {
        return Result.success(pmsAttrGroupService.update(pmsAttrGroup));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 PmsAttrGroup", response = Result.class)
    public Result deletePmsAttrGroup(@PathVariable("id") Long id) {
        return Result.success(pmsAttrGroupService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 PmsAttrGroup列表(分页)", response = Result.class)
    public Result listPmsAttrGroup(@RequestParam(defaultValue = "0") Integer page,
                                   @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(pmsAttrGroupService.queryAllByLimit(page, size));
    }


}