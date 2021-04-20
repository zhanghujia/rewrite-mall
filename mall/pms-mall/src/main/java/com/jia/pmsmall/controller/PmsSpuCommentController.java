package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.model.PmsSpuComment;
import com.jia.pmsmall.service.PmsSpuCommentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 商品评价(PmsSpuComment)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:15:03
 */

@RestController
@RequestMapping("/api/pmsSpuComment")
public class PmsSpuCommentController {

    /**
     * 服务对象
     */
    private final PmsSpuCommentService pmsSpuCommentService;

    public PmsSpuCommentController(PmsSpuCommentService pmsSpuCommentService) {
        this.pmsSpuCommentService = pmsSpuCommentService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 PmsSpuComment", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.pmsSpuCommentService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 PmsSpuComment", response = Result.class)
    public Result addPmsSpuComment(@Valid @RequestBody PmsSpuComment pmsSpuComment) {
        return Result.success(pmsSpuCommentService.insert(pmsSpuComment));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 PmsSpuComment", response = Result.class)
    public Result updatePmsSpuComment(@RequestBody PmsSpuComment pmsSpuComment) {
        return Result.success(pmsSpuCommentService.update(pmsSpuComment));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 PmsSpuComment", response = Result.class)
    public Result deletePmsSpuComment(@PathVariable("id") Long id) {
        return Result.success(pmsSpuCommentService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 PmsSpuComment列表(分页)", response = Result.class)
    public Result listPmsSpuComment(@RequestParam(defaultValue = "0") Integer page,
                                    @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(pmsSpuCommentService.queryAllByLimit(page, size));
    }


}