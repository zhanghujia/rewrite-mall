package com.jia.smsmall.mapper;

import com.jia.smsmall.model.SmsCouponSpuRelation;
import org.springframework.stereotype.Repository;
import com.jia.mallcommon.utils.tk.mapper.Mapper;

/**
 * 优惠券与产品关联(SmsCouponSpuRelation)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-15 14:21:53
 */

@Repository
public interface SmsCouponSpuRelationMapper extends Mapper<SmsCouponSpuRelation> {

}