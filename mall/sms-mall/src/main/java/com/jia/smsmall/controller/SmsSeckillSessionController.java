package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsSeckillSession;
import com.jia.smsmall.service.SmsSeckillSessionService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 秒杀活动场次(SmsSeckillSession)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:23:04
 */

@RestController
@RequestMapping("/api/smsSeckillSession")
public class SmsSeckillSessionController {

    /**
     * 服务对象
     */
    private final SmsSeckillSessionService smsSeckillSessionService;

    public SmsSeckillSessionController(SmsSeckillSessionService smsSeckillSessionService) {
        this.smsSeckillSessionService = smsSeckillSessionService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsSeckillSession", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsSeckillSessionService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsSeckillSession", response = Result.class)
    public Result addSmsSeckillSession(@Valid @RequestBody SmsSeckillSession smsSeckillSession) {
        return Result.success(smsSeckillSessionService.insert(smsSeckillSession));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsSeckillSession", response = Result.class)
    public Result updateSmsSeckillSession(@RequestBody SmsSeckillSession smsSeckillSession) {
        return Result.success(smsSeckillSessionService.update(smsSeckillSession));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsSeckillSession", response = Result.class)
    public Result deleteSmsSeckillSession(@PathVariable("id") Long id) {
        return Result.success(smsSeckillSessionService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsSeckillSession列表(分页)", response = Result.class)
    public Result listSmsSeckillSession(@RequestParam(defaultValue = "0") Integer page,
                                        @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsSeckillSessionService.queryAllByLimit(page, size));
    }


}