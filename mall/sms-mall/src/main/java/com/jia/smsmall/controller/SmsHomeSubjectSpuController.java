package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsHomeSubjectSpu;
import com.jia.smsmall.service.SmsHomeSubjectSpuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 专题商品(SmsHomeSubjectSpu)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:22:27
 */

@RestController
@RequestMapping("/api/smsHomeSubjectSpu")
public class SmsHomeSubjectSpuController {

    /**
     * 服务对象
     */
    private final SmsHomeSubjectSpuService smsHomeSubjectSpuService;

    public SmsHomeSubjectSpuController(SmsHomeSubjectSpuService smsHomeSubjectSpuService) {
        this.smsHomeSubjectSpuService = smsHomeSubjectSpuService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsHomeSubjectSpu", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsHomeSubjectSpuService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsHomeSubjectSpu", response = Result.class)
    public Result addSmsHomeSubjectSpu(@Valid @RequestBody SmsHomeSubjectSpu smsHomeSubjectSpu) {
        return Result.success(smsHomeSubjectSpuService.insert(smsHomeSubjectSpu));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsHomeSubjectSpu", response = Result.class)
    public Result updateSmsHomeSubjectSpu(@RequestBody SmsHomeSubjectSpu smsHomeSubjectSpu) {
        return Result.success(smsHomeSubjectSpuService.update(smsHomeSubjectSpu));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsHomeSubjectSpu", response = Result.class)
    public Result deleteSmsHomeSubjectSpu(@PathVariable("id") Long id) {
        return Result.success(smsHomeSubjectSpuService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsHomeSubjectSpu列表(分页)", response = Result.class)
    public Result listSmsHomeSubjectSpu(@RequestParam(defaultValue = "0") Integer page,
                                        @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsHomeSubjectSpuService.queryAllByLimit(page, size));
    }


}