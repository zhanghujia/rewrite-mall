package com.jia.omsmall.mapper;

import com.jia.omsmall.model.OmsOrderItem;
import org.springframework.stereotype.Repository;
import com.jia.mallcommon.utils.tk.mapper.Mapper;

/**
 * 订单项信息(OmsOrderItem)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-15 14:00:31
 */

@Repository
public interface OmsOrderItemMapper extends Mapper<OmsOrderItem> {

}