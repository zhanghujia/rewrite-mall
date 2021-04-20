package com.jia.umsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.umsmall.model.UmsMemberLoginLog;
import com.jia.umsmall.service.UmsMemberLoginLogService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 会员登录记录(UmsMemberLoginLog)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:47:26
 */

@RestController
@RequestMapping("/api/umsMemberLoginLog")
public class UmsMemberLoginLogController {

    /**
     * 服务对象
     */
    private final UmsMemberLoginLogService umsMemberLoginLogService;

    public UmsMemberLoginLogController(UmsMemberLoginLogService umsMemberLoginLogService) {
        this.umsMemberLoginLogService = umsMemberLoginLogService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 UmsMemberLoginLog", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.umsMemberLoginLogService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 UmsMemberLoginLog", response = Result.class)
    public Result addUmsMemberLoginLog(@Valid @RequestBody UmsMemberLoginLog umsMemberLoginLog) {
        return Result.success(umsMemberLoginLogService.insert(umsMemberLoginLog));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 UmsMemberLoginLog", response = Result.class)
    public Result updateUmsMemberLoginLog(@RequestBody UmsMemberLoginLog umsMemberLoginLog) {
        return Result.success(umsMemberLoginLogService.update(umsMemberLoginLog));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 UmsMemberLoginLog", response = Result.class)
    public Result deleteUmsMemberLoginLog(@PathVariable("id") Long id) {
        return Result.success(umsMemberLoginLogService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 UmsMemberLoginLog列表(分页)", response = Result.class)
    public Result listUmsMemberLoginLog(@RequestParam(defaultValue = "0") Integer page,
                                        @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(umsMemberLoginLogService.queryAllByLimit(page, size));
    }


}