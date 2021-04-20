package com.jia.umsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.umsmall.model.UmsMemberCollectSpu;
import com.jia.umsmall.service.UmsMemberCollectSpuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 会员收藏的商品(UmsMemberCollectSpu)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:46:59
 */

@RestController
@RequestMapping("/api/umsMemberCollectSpu")
public class UmsMemberCollectSpuController {

    /**
     * 服务对象
     */
    private final UmsMemberCollectSpuService umsMemberCollectSpuService;

    public UmsMemberCollectSpuController(UmsMemberCollectSpuService umsMemberCollectSpuService) {
        this.umsMemberCollectSpuService = umsMemberCollectSpuService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 UmsMemberCollectSpu", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.umsMemberCollectSpuService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 UmsMemberCollectSpu", response = Result.class)
    public Result addUmsMemberCollectSpu(@Valid @RequestBody UmsMemberCollectSpu umsMemberCollectSpu) {
        return Result.success(umsMemberCollectSpuService.insert(umsMemberCollectSpu));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 UmsMemberCollectSpu", response = Result.class)
    public Result updateUmsMemberCollectSpu(@RequestBody UmsMemberCollectSpu umsMemberCollectSpu) {
        return Result.success(umsMemberCollectSpuService.update(umsMemberCollectSpu));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 UmsMemberCollectSpu", response = Result.class)
    public Result deleteUmsMemberCollectSpu(@PathVariable("id") Long id) {
        return Result.success(umsMemberCollectSpuService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 UmsMemberCollectSpu列表(分页)", response = Result.class)
    public Result listUmsMemberCollectSpu(@RequestParam(defaultValue = "0") Integer page,
                                          @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(umsMemberCollectSpuService.queryAllByLimit(page, size));
    }


}