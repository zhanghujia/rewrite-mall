package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsCouponSpuCategoryRelation;
import com.jia.smsmall.service.SmsCouponSpuCategoryRelationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 优惠券分类关联(SmsCouponSpuCategoryRelation)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:21:50
 */

@RestController
@RequestMapping("/api/smsCouponSpuCategoryRelation")
public class SmsCouponSpuCategoryRelationController {

    /**
     * 服务对象
     */
    private final SmsCouponSpuCategoryRelationService smsCouponSpuCategoryRelationService;

    public SmsCouponSpuCategoryRelationController(SmsCouponSpuCategoryRelationService smsCouponSpuCategoryRelationService) {
        this.smsCouponSpuCategoryRelationService = smsCouponSpuCategoryRelationService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsCouponSpuCategoryRelation", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsCouponSpuCategoryRelationService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsCouponSpuCategoryRelation", response = Result.class)
    public Result addSmsCouponSpuCategoryRelation(@Valid @RequestBody SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation) {
        return Result.success(smsCouponSpuCategoryRelationService.insert(smsCouponSpuCategoryRelation));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsCouponSpuCategoryRelation", response = Result.class)
    public Result updateSmsCouponSpuCategoryRelation(@RequestBody SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation) {
        return Result.success(smsCouponSpuCategoryRelationService.update(smsCouponSpuCategoryRelation));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsCouponSpuCategoryRelation", response = Result.class)
    public Result deleteSmsCouponSpuCategoryRelation(@PathVariable("id") Long id) {
        return Result.success(smsCouponSpuCategoryRelationService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsCouponSpuCategoryRelation列表(分页)", response = Result.class)
    public Result listSmsCouponSpuCategoryRelation(@RequestParam(defaultValue = "0") Integer page,
                                                   @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsCouponSpuCategoryRelationService.queryAllByLimit(page, size));
    }


}