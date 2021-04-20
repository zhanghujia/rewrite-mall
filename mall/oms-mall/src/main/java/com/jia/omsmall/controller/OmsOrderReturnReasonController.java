package com.jia.omsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.omsmall.model.OmsOrderReturnReason;
import com.jia.omsmall.service.OmsOrderReturnReasonService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 退货原因(OmsOrderReturnReason)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:00:59
 */

@RestController
@RequestMapping("/api/omsOrderReturnReason")
public class OmsOrderReturnReasonController {

    /**
     * 服务对象
     */
    private final OmsOrderReturnReasonService omsOrderReturnReasonService;

    public OmsOrderReturnReasonController(OmsOrderReturnReasonService omsOrderReturnReasonService) {
        this.omsOrderReturnReasonService = omsOrderReturnReasonService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 OmsOrderReturnReason", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.omsOrderReturnReasonService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 OmsOrderReturnReason", response = Result.class)
    public Result addOmsOrderReturnReason(@Valid @RequestBody OmsOrderReturnReason omsOrderReturnReason) {
        return Result.success(omsOrderReturnReasonService.insert(omsOrderReturnReason));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 OmsOrderReturnReason", response = Result.class)
    public Result updateOmsOrderReturnReason(@RequestBody OmsOrderReturnReason omsOrderReturnReason) {
        return Result.success(omsOrderReturnReasonService.update(omsOrderReturnReason));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 OmsOrderReturnReason", response = Result.class)
    public Result deleteOmsOrderReturnReason(@PathVariable("id") Long id) {
        return Result.success(omsOrderReturnReasonService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 OmsOrderReturnReason列表(分页)", response = Result.class)
    public Result listOmsOrderReturnReason(@RequestParam(defaultValue = "0") Integer page,
                                           @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(omsOrderReturnReasonService.queryAllByLimit(page, size));
    }


}