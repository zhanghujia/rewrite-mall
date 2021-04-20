package com.jia.omsmall.feign;

import com.jia.mallcommon.utils.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 10696
 */

@FeignClient("pms-mall")
public interface PmsFeignService {

    /**
     * 获取全部
     * @return Result
     */
    @RequestMapping("/api/pmsSkuInfo/list")
    public Result getAll();

}
