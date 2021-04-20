package com.jia.omsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.omsmall.model.OmsOrderItem;
import com.jia.omsmall.service.OmsOrderItemService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 订单项信息(OmsOrderItem)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:00:35
 */

@RestController
@RequestMapping("/api/omsOrderItem")
public class OmsOrderItemController {

    /**
     * 服务对象
     */
    private final OmsOrderItemService omsOrderItemService;

    public OmsOrderItemController(OmsOrderItemService omsOrderItemService) {
        this.omsOrderItemService = omsOrderItemService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 OmsOrderItem", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.omsOrderItemService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 OmsOrderItem", response = Result.class)
    public Result addOmsOrderItem(@Valid @RequestBody OmsOrderItem omsOrderItem) {
        return Result.success(omsOrderItemService.insert(omsOrderItem));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 OmsOrderItem", response = Result.class)
    public Result updateOmsOrderItem(@RequestBody OmsOrderItem omsOrderItem) {
        return Result.success(omsOrderItemService.update(omsOrderItem));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 OmsOrderItem", response = Result.class)
    public Result deleteOmsOrderItem(@PathVariable("id") Long id) {
        return Result.success(omsOrderItemService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 OmsOrderItem列表(分页)", response = Result.class)
    public Result listOmsOrderItem(@RequestParam(defaultValue = "0") Integer page,
                                   @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(omsOrderItemService.queryAllByLimit(page, size));
    }


}