package com.jia.umsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.umsmall.model.UmsMemberReceiveAddress;
import com.jia.umsmall.service.UmsMemberReceiveAddressService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * 会员收货地址(UmsMemberReceiveAddress)表控制层
 *
 * @author makejava
 * @since 2020-10-15 14:47:37
 */

@RestController
@RequestMapping("/api/umsMemberReceiveAddress")
public class UmsMemberReceiveAddressController {

    /**
     * 服务对象
     */
    private final UmsMemberReceiveAddressService umsMemberReceiveAddressService;

    public UmsMemberReceiveAddressController(UmsMemberReceiveAddressService umsMemberReceiveAddressService) {
        this.umsMemberReceiveAddressService = umsMemberReceiveAddressService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "依据主键获取 UmsMemberReceiveAddress", response = Result.class)
    public Result selectDetail(@PathVariable("id") Long id) {
        return Result.success(this.umsMemberReceiveAddressService.queryById(id));
    }

    @PostMapping("/insert")
    @ApiOperation(value = "新增 UmsMemberReceiveAddress", response = Result.class)
    public Result addUmsMemberReceiveAddress(@Valid @RequestBody UmsMemberReceiveAddress umsMemberReceiveAddress) {
        return Result.success(umsMemberReceiveAddressService.insert(umsMemberReceiveAddress));
    }

    @PutMapping("/update")
    @ApiOperation(value = "修改 UmsMemberReceiveAddress", response = Result.class)
    public Result updateUmsMemberReceiveAddress(@RequestBody UmsMemberReceiveAddress umsMemberReceiveAddress) {
        return Result.success(umsMemberReceiveAddressService.update(umsMemberReceiveAddress));
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "依据主键删除 UmsMemberReceiveAddress", response = Result.class)
    public Result deleteUmsMemberReceiveAddress(@PathVariable("id") Long id) {
        return Result.success(umsMemberReceiveAddressService.deleteById(id));
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取 UmsMemberReceiveAddress列表(分页)", response = Result.class)
    public Result listUmsMemberReceiveAddress(@RequestParam(defaultValue = "0") Integer page,
                                              @RequestParam(defaultValue = "0") Integer size) {
        return Result.success(umsMemberReceiveAddressService.queryAllByLimit(page, size));
    }


}