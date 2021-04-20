package com.jia.umsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.umsmall.model.UmsMemberLevel;
import com.jia.umsmall.service.UmsMemberLevelService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 会员等级(UmsMemberLevel)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:47:16
 */

@RestController
@RequestMapping("/api/umsMemberLevel")
public class UmsMemberLevelController {

    /**
     * 服务对象
     */
    private final UmsMemberLevelService umsMemberLevelService;

    public UmsMemberLevelController(UmsMemberLevelService umsMemberLevelService) {
        this.umsMemberLevelService = umsMemberLevelService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 UmsMemberLevel", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.umsMemberLevelService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 UmsMemberLevel", response = Result.class)
    public Result addUmsMemberLevel(@Valid @RequestBody UmsMemberLevel umsMemberLevel) {
        return Result.success(umsMemberLevelService.insert(umsMemberLevel));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 UmsMemberLevel", response = Result.class)
    public Result updateUmsMemberLevel(@RequestBody UmsMemberLevel umsMemberLevel) {
        return Result.success(umsMemberLevelService.update(umsMemberLevel));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 UmsMemberLevel", response = Result.class)
    public Result deleteUmsMemberLevel(@PathVariable("id") Long id) {
        return Result.success(umsMemberLevelService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 UmsMemberLevel列表(分页)", response = Result.class)
    public Result listUmsMemberLevel(@RequestParam(defaultValue = "0") Integer page,
                                     @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(umsMemberLevelService.queryAllByLimit(page, size));
    }


}