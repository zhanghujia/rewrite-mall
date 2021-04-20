package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsCategoryBounds;
import com.jia.smsmall.service.SmsCategoryBoundsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 商品分类积分设置(SmsCategoryBounds)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:21:31
 */

@RestController
@RequestMapping("/api/smsCategoryBounds")
public class SmsCategoryBoundsController {

    /**
     * 服务对象
     */
    private final SmsCategoryBoundsService smsCategoryBoundsService;

    public SmsCategoryBoundsController(SmsCategoryBoundsService smsCategoryBoundsService) {
        this.smsCategoryBoundsService = smsCategoryBoundsService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsCategoryBounds", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsCategoryBoundsService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsCategoryBounds", response = Result.class)
    public Result addSmsCategoryBounds(@Valid @RequestBody SmsCategoryBounds smsCategoryBounds) {
        return Result.success(smsCategoryBoundsService.insert(smsCategoryBounds));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsCategoryBounds", response = Result.class)
    public Result updateSmsCategoryBounds(@RequestBody SmsCategoryBounds smsCategoryBounds) {
        return Result.success(smsCategoryBoundsService.update(smsCategoryBounds));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsCategoryBounds", response = Result.class)
    public Result deleteSmsCategoryBounds(@PathVariable("id") Long id) {
        return Result.success(smsCategoryBoundsService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsCategoryBounds列表(分页)", response = Result.class)
    public Result listSmsCategoryBounds(@RequestParam(defaultValue = "0") Integer page,
                                        @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsCategoryBoundsService.queryAllByLimit(page, size));
    }


}