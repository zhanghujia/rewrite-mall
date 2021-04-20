package com.jia.omsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.omsmall.model.OmsOrderSetting;
import com.jia.omsmall.service.OmsOrderSettingService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 订单配置信息(OmsOrderSetting)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:01:07
 */

@RestController
@RequestMapping("/api/omsOrderSetting")
public class OmsOrderSettingController {

    /**
     * 服务对象
     */
    private final OmsOrderSettingService omsOrderSettingService;

    public OmsOrderSettingController(OmsOrderSettingService omsOrderSettingService) {
        this.omsOrderSettingService = omsOrderSettingService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 OmsOrderSetting", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.omsOrderSettingService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 OmsOrderSetting", response = Result.class)
    public Result addOmsOrderSetting(@Valid @RequestBody OmsOrderSetting omsOrderSetting) {
        return Result.success(omsOrderSettingService.insert(omsOrderSetting));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 OmsOrderSetting", response = Result.class)
    public Result updateOmsOrderSetting(@RequestBody OmsOrderSetting omsOrderSetting) {
        return Result.success(omsOrderSettingService.update(omsOrderSetting));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 OmsOrderSetting", response = Result.class)
    public Result deleteOmsOrderSetting(@PathVariable("id") Long id) {
        return Result.success(omsOrderSettingService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 OmsOrderSetting列表(分页)", response = Result.class)
    public Result listOmsOrderSetting(@RequestParam(defaultValue = "0") Integer page,
                                      @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(omsOrderSettingService.queryAllByLimit(page, size));
    }


}