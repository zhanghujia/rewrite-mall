package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsHomeAdv;
import com.jia.smsmall.service.SmsHomeAdvService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 首页轮播广告(SmsHomeAdv)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:22:07
 */

@RestController
@RequestMapping("/api/smsHomeAdv")
public class SmsHomeAdvController {

    /**
     * 服务对象
     */
    private final SmsHomeAdvService smsHomeAdvService;

    public SmsHomeAdvController(SmsHomeAdvService smsHomeAdvService) {
        this.smsHomeAdvService = smsHomeAdvService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsHomeAdv", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsHomeAdvService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsHomeAdv", response = Result.class)
    public Result addSmsHomeAdv(@Valid @RequestBody SmsHomeAdv smsHomeAdv) {
        return Result.success(smsHomeAdvService.insert(smsHomeAdv));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsHomeAdv", response = Result.class)
    public Result updateSmsHomeAdv(@RequestBody SmsHomeAdv smsHomeAdv) {
        return Result.success(smsHomeAdvService.update(smsHomeAdv));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsHomeAdv", response = Result.class)
    public Result deleteSmsHomeAdv(@PathVariable("id") Long id) {
        return Result.success(smsHomeAdvService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsHomeAdv列表(分页)", response = Result.class)
    public Result listSmsHomeAdv(@RequestParam(defaultValue = "0") Integer page,
                                 @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsHomeAdvService.queryAllByLimit(page, size));
    }


}