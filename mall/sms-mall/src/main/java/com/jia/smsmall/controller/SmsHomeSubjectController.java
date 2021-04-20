package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsHomeSubject;
import com.jia.smsmall.service.SmsHomeSubjectService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:22:17
 */

@RestController
@RequestMapping("/api/smsHomeSubject")
public class SmsHomeSubjectController {

    /**
     * 服务对象
     */
    private final SmsHomeSubjectService smsHomeSubjectService;

    public SmsHomeSubjectController(SmsHomeSubjectService smsHomeSubjectService) {
        this.smsHomeSubjectService = smsHomeSubjectService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsHomeSubject", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsHomeSubjectService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsHomeSubject", response = Result.class)
    public Result addSmsHomeSubject(@Valid @RequestBody SmsHomeSubject smsHomeSubject) {
        return Result.success(smsHomeSubjectService.insert(smsHomeSubject));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsHomeSubject", response = Result.class)
    public Result updateSmsHomeSubject(@RequestBody SmsHomeSubject smsHomeSubject) {
        return Result.success(smsHomeSubjectService.update(smsHomeSubject));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsHomeSubject", response = Result.class)
    public Result deleteSmsHomeSubject(@PathVariable("id") Long id) {
        return Result.success(smsHomeSubjectService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsHomeSubject列表(分页)", response = Result.class)
    public Result listSmsHomeSubject(@RequestParam(defaultValue = "0") Integer page,
                                     @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsHomeSubjectService.queryAllByLimit(page, size));
    }


}