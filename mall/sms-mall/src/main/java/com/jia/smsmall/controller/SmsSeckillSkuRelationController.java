package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsSeckillSkuRelation;
import com.jia.smsmall.service.SmsSeckillSkuRelationService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:23:34
 */

@RestController
@RequestMapping("/api/smsSeckillSkuRelation")
public class SmsSeckillSkuRelationController {

    /**
     * 服务对象
     */
    private final SmsSeckillSkuRelationService smsSeckillSkuRelationService;

    public SmsSeckillSkuRelationController(SmsSeckillSkuRelationService smsSeckillSkuRelationService) {
        this.smsSeckillSkuRelationService = smsSeckillSkuRelationService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsSeckillSkuRelation", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsSeckillSkuRelationService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsSeckillSkuRelation", response = Result.class)
    public Result addSmsSeckillSkuRelation(@Valid @RequestBody SmsSeckillSkuRelation smsSeckillSkuRelation) {
        return Result.success(smsSeckillSkuRelationService.insert(smsSeckillSkuRelation));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsSeckillSkuRelation", response = Result.class)
    public Result updateSmsSeckillSkuRelation(@RequestBody SmsSeckillSkuRelation smsSeckillSkuRelation) {
        return Result.success(smsSeckillSkuRelationService.update(smsSeckillSkuRelation));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsSeckillSkuRelation", response = Result.class)
    public Result deleteSmsSeckillSkuRelation(@PathVariable("id") Long id) {
        return Result.success(smsSeckillSkuRelationService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsSeckillSkuRelation列表(分页)", response = Result.class)
    public Result listSmsSeckillSkuRelation(@RequestParam(defaultValue = "0") Integer page,
                                            @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsSeckillSkuRelationService.queryAllByLimit(page, size));
    }


}