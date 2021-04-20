package com.jia.omsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.omsmall.model.OmsOrderReturnApply;
import com.jia.omsmall.service.OmsOrderReturnApplyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 订单退货申请(OmsOrderReturnApply)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:00:51
 */

@RestController
@RequestMapping("/api/omsOrderReturnApply")
public class OmsOrderReturnApplyController {

    /**
     * 服务对象
     */
    private final OmsOrderReturnApplyService omsOrderReturnApplyService;

    public OmsOrderReturnApplyController(OmsOrderReturnApplyService omsOrderReturnApplyService) {
        this.omsOrderReturnApplyService = omsOrderReturnApplyService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 OmsOrderReturnApply", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.omsOrderReturnApplyService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 OmsOrderReturnApply", response = Result.class)
    public Result addOmsOrderReturnApply(@Valid @RequestBody OmsOrderReturnApply omsOrderReturnApply) {
        return Result.success(omsOrderReturnApplyService.insert(omsOrderReturnApply));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 OmsOrderReturnApply", response = Result.class)
    public Result updateOmsOrderReturnApply(@RequestBody OmsOrderReturnApply omsOrderReturnApply) {
        return Result.success(omsOrderReturnApplyService.update(omsOrderReturnApply));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 OmsOrderReturnApply", response = Result.class)
    public Result deleteOmsOrderReturnApply(@PathVariable("id") Long id) {
        return Result.success(omsOrderReturnApplyService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 OmsOrderReturnApply列表(分页)", response = Result.class)
    public Result listOmsOrderReturnApply(@RequestParam(defaultValue = "0") Integer page,
                                          @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(omsOrderReturnApplyService.queryAllByLimit(page, size));
    }


}