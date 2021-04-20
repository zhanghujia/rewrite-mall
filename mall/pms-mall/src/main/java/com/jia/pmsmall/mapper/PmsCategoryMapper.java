package com.jia.pmsmall.mapper;

import com.jia.pmsmall.model.PmsCategory;
import org.springframework.stereotype.Repository;
import com.jia.mallcommon.utils.tk.mapper.Mapper;

/**
 * 商品三级分类(PmsCategory)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-15 14:14:37
 */

@Repository
public interface PmsCategoryMapper extends Mapper<PmsCategory> {

}