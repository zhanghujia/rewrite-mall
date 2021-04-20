package com.jia.wmsmall.mapper;

import com.jia.wmsmall.model.WmsPurchase;
import org.springframework.stereotype.Repository;
import com.jia.mallcommon.utils.tk.mapper.Mapper;

/**
 * 采购信息(WmsPurchase)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-15 14:29:24
 */

@Repository
public interface WmsPurchaseMapper extends Mapper<WmsPurchase> {

}