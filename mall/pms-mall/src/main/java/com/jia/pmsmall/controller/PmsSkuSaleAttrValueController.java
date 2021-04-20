package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.model.PmsSkuSaleAttrValue;
import com.jia.pmsmall.service.PmsSkuSaleAttrValueService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * sku销售属性&值(PmsSkuSaleAttrValue)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:14:59
 */

@RestController
@RequestMapping("/api/pmsSkuSaleAttrValue")
public class PmsSkuSaleAttrValueController {

    /**
     * 服务对象
     */
    private final PmsSkuSaleAttrValueService pmsSkuSaleAttrValueService;

    public PmsSkuSaleAttrValueController(PmsSkuSaleAttrValueService pmsSkuSaleAttrValueService) {
        this.pmsSkuSaleAttrValueService = pmsSkuSaleAttrValueService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 PmsSkuSaleAttrValue", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.pmsSkuSaleAttrValueService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 PmsSkuSaleAttrValue", response = Result.class)
    public Result addPmsSkuSaleAttrValue(@Valid @RequestBody PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        return Result.success(pmsSkuSaleAttrValueService.insert(pmsSkuSaleAttrValue));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 PmsSkuSaleAttrValue", response = Result.class)
    public Result updatePmsSkuSaleAttrValue(@RequestBody PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        return Result.success(pmsSkuSaleAttrValueService.update(pmsSkuSaleAttrValue));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 PmsSkuSaleAttrValue", response = Result.class)
    public Result deletePmsSkuSaleAttrValue(@PathVariable("id") Long id) {
        return Result.success(pmsSkuSaleAttrValueService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 PmsSkuSaleAttrValue列表(分页)", response = Result.class)
    public Result listPmsSkuSaleAttrValue(@RequestParam(defaultValue = "0") Integer page,
                                          @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(pmsSkuSaleAttrValueService.queryAllByLimit(page, size));
    }


}