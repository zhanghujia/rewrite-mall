package com.jia.pmsmall.controller;

import com.jia.mallcommon.utils.result.Result;
import com.jia.pmsmall.oss.QiNiuUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JIA
 */
@RestController
@RequestMapping("/api/common")
public class CommonController {

    private final QiNiuUtil qiNiuUtil;

    public CommonController(QiNiuUtil qiNiuUtil) {
        this.qiNiuUtil = qiNiuUtil;
    }

    @GetMapping("/upToken")
    @ApiOperation(value = "", response = Result.class)
    public Result getUpToken() {
        return Result.success(qiNiuUtil.getUpToken());
    }

}

