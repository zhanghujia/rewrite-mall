package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsCouponSpuRelation;
import com.jia.smsmall.service.SmsCouponSpuRelationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 优惠券与产品关联(SmsCouponSpuRelation)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:21:57
 */

@RestController
@RequestMapping("/api/smsCouponSpuRelation")
public class SmsCouponSpuRelationController {

    /**
     * 服务对象
     */
    private final SmsCouponSpuRelationService smsCouponSpuRelationService;

    public SmsCouponSpuRelationController(SmsCouponSpuRelationService smsCouponSpuRelationService) {
        this.smsCouponSpuRelationService = smsCouponSpuRelationService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsCouponSpuRelation", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsCouponSpuRelationService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsCouponSpuRelation", response = Result.class)
    public Result addSmsCouponSpuRelation(@Valid @RequestBody SmsCouponSpuRelation smsCouponSpuRelation) {
        return Result.success(smsCouponSpuRelationService.insert(smsCouponSpuRelation));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsCouponSpuRelation", response = Result.class)
    public Result updateSmsCouponSpuRelation(@RequestBody SmsCouponSpuRelation smsCouponSpuRelation) {
        return Result.success(smsCouponSpuRelationService.update(smsCouponSpuRelation));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsCouponSpuRelation", response = Result.class)
    public Result deleteSmsCouponSpuRelation(@PathVariable("id") Long id) {
        return Result.success(smsCouponSpuRelationService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsCouponSpuRelation列表(分页)", response = Result.class)
    public Result listSmsCouponSpuRelation(@RequestParam(defaultValue = "0") Integer page,
                                           @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsCouponSpuRelationService.queryAllByLimit(page, size));
    }


}