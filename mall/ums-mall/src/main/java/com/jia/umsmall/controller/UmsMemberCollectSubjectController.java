package com.jia.umsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.umsmall.model.UmsMemberCollectSubject;
import com.jia.umsmall.service.UmsMemberCollectSubjectService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:47:07
 */

@RestController
@RequestMapping("/api/umsMemberCollectSubject")
public class UmsMemberCollectSubjectController {

    /**
     * 服务对象
     */
    private final UmsMemberCollectSubjectService umsMemberCollectSubjectService;

    public UmsMemberCollectSubjectController(UmsMemberCollectSubjectService umsMemberCollectSubjectService) {
        this.umsMemberCollectSubjectService = umsMemberCollectSubjectService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 UmsMemberCollectSubject", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.umsMemberCollectSubjectService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 UmsMemberCollectSubject", response = Result.class)
    public Result addUmsMemberCollectSubject(@Valid @RequestBody UmsMemberCollectSubject umsMemberCollectSubject) {
        return Result.success(umsMemberCollectSubjectService.insert(umsMemberCollectSubject));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 UmsMemberCollectSubject", response = Result.class)
    public Result updateUmsMemberCollectSubject(@RequestBody UmsMemberCollectSubject umsMemberCollectSubject) {
        return Result.success(umsMemberCollectSubjectService.update(umsMemberCollectSubject));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 UmsMemberCollectSubject", response = Result.class)
    public Result deleteUmsMemberCollectSubject(@PathVariable("id") Long id) {
        return Result.success(umsMemberCollectSubjectService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 UmsMemberCollectSubject列表(分页)", response = Result.class)
    public Result listUmsMemberCollectSubject(@RequestParam(defaultValue = "0") Integer page,
                                              @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(umsMemberCollectSubjectService.queryAllByLimit(page, size));
    }


}