package com.jia.omsmall.mapper;

import com.jia.mallcommon.utils.tk.mapper.Mapper;
import com.jia.omsmall.model.OmsOrder;
import org.springframework.stereotype.Repository;

/**
 * 订单(OmsOrder)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-15 14:00:24
 */

@Repository
public interface OmsOrderMapper extends Mapper<OmsOrder> {

}