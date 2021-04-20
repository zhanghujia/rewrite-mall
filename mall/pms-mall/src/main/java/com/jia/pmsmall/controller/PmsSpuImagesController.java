package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.model.PmsSpuImages;
import com.jia.pmsmall.service.PmsSpuImagesService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * spu图片(PmsSpuImages)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:15:07
 */

@RestController
@RequestMapping("/api/pmsSpuImages")
public class PmsSpuImagesController {

    /**
     * 服务对象
     */
    private final PmsSpuImagesService pmsSpuImagesService;

    public PmsSpuImagesController(PmsSpuImagesService pmsSpuImagesService) {
        this.pmsSpuImagesService = pmsSpuImagesService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 PmsSpuImages", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.pmsSpuImagesService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 PmsSpuImages", response = Result.class)
    public Result addPmsSpuImages(@Valid @RequestBody PmsSpuImages pmsSpuImages) {
        return Result.success(pmsSpuImagesService.insert(pmsSpuImages));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 PmsSpuImages", response = Result.class)
    public Result updatePmsSpuImages(@RequestBody PmsSpuImages pmsSpuImages) {
        return Result.success(pmsSpuImagesService.update(pmsSpuImages));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 PmsSpuImages", response = Result.class)
    public Result deletePmsSpuImages(@PathVariable("id") Long id) {
        return Result.success(pmsSpuImagesService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 PmsSpuImages列表(分页)", response = Result.class)
    public Result listPmsSpuImages(@RequestParam(defaultValue = "0") Integer page,
                                   @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(pmsSpuImagesService.queryAllByLimit(page, size));
    }


}