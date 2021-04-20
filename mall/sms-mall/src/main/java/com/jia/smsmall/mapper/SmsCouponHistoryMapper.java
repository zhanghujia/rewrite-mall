package com.jia.smsmall.mapper;

import com.jia.smsmall.model.SmsCouponHistory;
import org.springframework.stereotype.Repository;
import com.jia.mallcommon.utils.tk.mapper.Mapper;

/**
 * 优惠券领取历史记录(SmsCouponHistory)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-15 14:21:40
 */

@Repository
public interface SmsCouponHistoryMapper extends Mapper<SmsCouponHistory> {

}