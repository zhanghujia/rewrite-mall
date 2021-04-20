package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.model.PmsCommentReplay;
import com.jia.pmsmall.service.PmsCommentReplayService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 商品评价回复关系(PmsCommentReplay)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:14:43
 */

@RestController
@RequestMapping("/api/pmsCommentReplay")
public class PmsCommentReplayController {

    /**
     * 服务对象
     */
    private final PmsCommentReplayService pmsCommentReplayService;

    public PmsCommentReplayController(PmsCommentReplayService pmsCommentReplayService) {
        this.pmsCommentReplayService = pmsCommentReplayService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 PmsCommentReplay", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.pmsCommentReplayService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 PmsCommentReplay", response = Result.class)
    public Result addPmsCommentReplay(@Valid @RequestBody PmsCommentReplay pmsCommentReplay) {
        return Result.success(pmsCommentReplayService.insert(pmsCommentReplay));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 PmsCommentReplay", response = Result.class)
    public Result updatePmsCommentReplay(@RequestBody PmsCommentReplay pmsCommentReplay) {
        return Result.success(pmsCommentReplayService.update(pmsCommentReplay));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 PmsCommentReplay", response = Result.class)
    public Result deletePmsCommentReplay(@PathVariable("id") Long id) {
        return Result.success(pmsCommentReplayService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 PmsCommentReplay列表(分页)", response = Result.class)
    public Result listPmsCommentReplay(@RequestParam(defaultValue = "0") Integer page,
                                       @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(pmsCommentReplayService.queryAllByLimit(page, size));
    }


}