package com.jia.umsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.umsmall.model.UmsMemberStatisticsInfo;
import com.jia.umsmall.service.UmsMemberStatisticsInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 会员统计信息(UmsMemberStatisticsInfo)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:47:51
 */

@RestController
@RequestMapping("/api/umsMemberStatisticsInfo")
public class UmsMemberStatisticsInfoController {

    /**
     * 服务对象
     */
    private final UmsMemberStatisticsInfoService umsMemberStatisticsInfoService;

    public UmsMemberStatisticsInfoController(UmsMemberStatisticsInfoService umsMemberStatisticsInfoService) {
        this.umsMemberStatisticsInfoService = umsMemberStatisticsInfoService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 UmsMemberStatisticsInfo", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.umsMemberStatisticsInfoService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 UmsMemberStatisticsInfo", response = Result.class)
    public Result addUmsMemberStatisticsInfo(@Valid @RequestBody UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        return Result.success(umsMemberStatisticsInfoService.insert(umsMemberStatisticsInfo));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 UmsMemberStatisticsInfo", response = Result.class)
    public Result updateUmsMemberStatisticsInfo(@RequestBody UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        return Result.success(umsMemberStatisticsInfoService.update(umsMemberStatisticsInfo));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 UmsMemberStatisticsInfo", response = Result.class)
    public Result deleteUmsMemberStatisticsInfo(@PathVariable("id") Long id) {
        return Result.success(umsMemberStatisticsInfoService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 UmsMemberStatisticsInfo列表(分页)", response = Result.class)
    public Result listUmsMemberStatisticsInfo(@RequestParam(defaultValue = "0") Integer page,
                                              @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(umsMemberStatisticsInfoService.queryAllByLimit(page, size));
    }


}