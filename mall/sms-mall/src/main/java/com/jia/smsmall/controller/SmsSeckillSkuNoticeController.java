package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsSeckillSkuNotice;
import com.jia.smsmall.service.SmsSeckillSkuNoticeService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:23:18
 */

@RestController
@RequestMapping("/api/smsSeckillSkuNotice")
public class SmsSeckillSkuNoticeController {

    /**
     * 服务对象
     */
    private final SmsSeckillSkuNoticeService smsSeckillSkuNoticeService;

    public SmsSeckillSkuNoticeController(SmsSeckillSkuNoticeService smsSeckillSkuNoticeService) {
        this.smsSeckillSkuNoticeService = smsSeckillSkuNoticeService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsSeckillSkuNotice", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsSeckillSkuNoticeService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsSeckillSkuNotice", response = Result.class)
    public Result addSmsSeckillSkuNotice(@Valid @RequestBody SmsSeckillSkuNotice smsSeckillSkuNotice) {
        return Result.success(smsSeckillSkuNoticeService.insert(smsSeckillSkuNotice));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsSeckillSkuNotice", response = Result.class)
    public Result updateSmsSeckillSkuNotice(@RequestBody SmsSeckillSkuNotice smsSeckillSkuNotice) {
        return Result.success(smsSeckillSkuNoticeService.update(smsSeckillSkuNotice));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsSeckillSkuNotice", response = Result.class)
    public Result deleteSmsSeckillSkuNotice(@PathVariable("id") Long id) {
        return Result.success(smsSeckillSkuNoticeService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsSeckillSkuNotice列表(分页)", response = Result.class)
    public Result listSmsSeckillSkuNotice(@RequestParam(defaultValue = "0") Integer page,
                                          @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsSeckillSkuNoticeService.queryAllByLimit(page, size));
    }


}