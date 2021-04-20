package com.jia.umsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.umsmall.model.UmsMember;
import com.jia.umsmall.service.UmsMemberService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 会员(UmsMember)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:46:53
 */

@RestController
@RequestMapping("/api/umsMember")
public class UmsMemberController {

    /**
     * 服务对象
     */
    private final UmsMemberService umsMemberService;

    public UmsMemberController(UmsMemberService umsMemberService) {
        this.umsMemberService = umsMemberService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 UmsMember", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.umsMemberService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 UmsMember", response = Result.class)
    public Result addUmsMember(@Valid @RequestBody UmsMember umsMember) {
        return Result.success(umsMemberService.insert(umsMember));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 UmsMember", response = Result.class)
    public Result updateUmsMember(@RequestBody UmsMember umsMember) {
        return Result.success(umsMemberService.update(umsMember));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 UmsMember", response = Result.class)
    public Result deleteUmsMember(@PathVariable("id") Long id) {
        return Result.success(umsMemberService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 UmsMember列表(分页)", response = Result.class)
    public Result listUmsMember(@RequestParam(defaultValue = "0") Integer page,
                                @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(umsMemberService.queryAllByLimit(page, size));
    }


}