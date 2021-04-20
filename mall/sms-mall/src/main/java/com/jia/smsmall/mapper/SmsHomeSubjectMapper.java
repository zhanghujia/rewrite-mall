package com.jia.smsmall.mapper;

import com.jia.smsmall.model.SmsHomeSubject;
import org.springframework.stereotype.Repository;
import com.jia.mallcommon.utils.tk.mapper.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-15 14:22:11
 */

@Repository
public interface SmsHomeSubjectMapper extends Mapper<SmsHomeSubject> {

}