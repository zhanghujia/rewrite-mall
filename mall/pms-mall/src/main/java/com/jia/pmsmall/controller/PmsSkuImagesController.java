package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.model.PmsSkuImages;
import com.jia.pmsmall.service.PmsSkuImagesService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * sku图片(PmsSkuImages)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:14:51
 */

@RestController
@RequestMapping("/api/pmsSkuImages")
public class PmsSkuImagesController {

    /**
     * 服务对象
     */
    private final PmsSkuImagesService pmsSkuImagesService;

    public PmsSkuImagesController(PmsSkuImagesService pmsSkuImagesService) {
        this.pmsSkuImagesService = pmsSkuImagesService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 PmsSkuImages", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.pmsSkuImagesService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 PmsSkuImages", response = Result.class)
    public Result addPmsSkuImages(@Valid @RequestBody PmsSkuImages pmsSkuImages) {
        return Result.success(pmsSkuImagesService.insert(pmsSkuImages));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 PmsSkuImages", response = Result.class)
    public Result updatePmsSkuImages(@RequestBody PmsSkuImages pmsSkuImages) {
        return Result.success(pmsSkuImagesService.update(pmsSkuImages));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 PmsSkuImages", response = Result.class)
    public Result deletePmsSkuImages(@PathVariable("id") Long id) {
        return Result.success(pmsSkuImagesService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 PmsSkuImages列表(分页)", response = Result.class)
    public Result listPmsSkuImages(@RequestParam(defaultValue = "0") Integer page,
                                   @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(pmsSkuImagesService.queryAllByLimit(page, size));
    }


}