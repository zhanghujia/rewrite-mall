package com.jia.smsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.smsmall.model.SmsMemberPrice;
import com.jia.smsmall.service.SmsMemberPriceService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 商品会员价格(SmsMemberPrice)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:22:38
 */

@RestController
@RequestMapping("/api/smsMemberPrice")
public class SmsMemberPriceController {

    /**
     * 服务对象
     */
    private final SmsMemberPriceService smsMemberPriceService;

    public SmsMemberPriceController(SmsMemberPriceService smsMemberPriceService) {
        this.smsMemberPriceService = smsMemberPriceService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 SmsMemberPrice", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.smsMemberPriceService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 SmsMemberPrice", response = Result.class)
    public Result addSmsMemberPrice(@Valid @RequestBody SmsMemberPrice smsMemberPrice) {
        return Result.success(smsMemberPriceService.insert(smsMemberPrice));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 SmsMemberPrice", response = Result.class)
    public Result updateSmsMemberPrice(@RequestBody SmsMemberPrice smsMemberPrice) {
        return Result.success(smsMemberPriceService.update(smsMemberPrice));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 SmsMemberPrice", response = Result.class)
    public Result deleteSmsMemberPrice(@PathVariable("id") Long id) {
        return Result.success(smsMemberPriceService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 SmsMemberPrice列表(分页)", response = Result.class)
    public Result listSmsMemberPrice(@RequestParam(defaultValue = "0") Integer page,
                                     @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(smsMemberPriceService.queryAllByLimit(page, size));
    }


}