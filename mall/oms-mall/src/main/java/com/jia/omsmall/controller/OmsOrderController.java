package com.jia.omsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.omsmall.feign.PmsFeignService;
import com.jia.omsmall.model.OmsOrder;
import com.jia.omsmall.service.OmsOrderService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 订单(OmsOrder)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:00:27
 */

@RestController
@RequestMapping("/api/omsOrder")
public class OmsOrderController {

    /**
     * 服务对象
     */
    private final OmsOrderService omsOrderService;

    public OmsOrderController(OmsOrderService omsOrderService, PmsFeignService pmsFeignService) {
        this.omsOrderService = omsOrderService;
        this.pmsFeignService = pmsFeignService;
    }

    private final PmsFeignService pmsFeignService;

    @GetMapping("/test")
    @ApiOperation(value = "test/openFeign", response = Result.class)
    public Result test() {
        return pmsFeignService.getAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 OmsOrder", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.omsOrderService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 OmsOrder", response = Result.class)
    public Result addOmsOrder(@Valid @RequestBody OmsOrder omsOrder) {
        return Result.success(omsOrderService.insert(omsOrder));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 OmsOrder", response = Result.class)
    public Result updateOmsOrder(@RequestBody OmsOrder omsOrder) {
        return Result.success(omsOrderService.update(omsOrder));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 OmsOrder", response = Result.class)
    public Result deleteOmsOrder(@PathVariable("id") Long id) {
        return Result.success(omsOrderService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 OmsOrder列表(分页)", response = Result.class)
    public Result listOmsOrder(@RequestParam(defaultValue = "0") Integer page,
                               @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(omsOrderService.queryAllByLimit(page, size));
    }


}