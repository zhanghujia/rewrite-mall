package com.jia.smsmall.mapper;

import com.jia.smsmall.model.SmsCoupon;
import org.springframework.stereotype.Repository;
import com.jia.mallcommon.utils.tk.mapper.Mapper;

/**
 * 优惠券信息(SmsCoupon)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-15 14:21:33
 */

@Repository
public interface SmsCouponMapper extends Mapper<SmsCoupon> {

}