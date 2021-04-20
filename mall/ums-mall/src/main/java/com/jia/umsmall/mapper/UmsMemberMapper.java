package com.jia.umsmall.mapper;

import com.jia.umsmall.model.UmsMember;
import org.springframework.stereotype.Repository;
import com.jia.mallcommon.utils.tk.mapper.Mapper;

/**
 * 会员(UmsMember)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-15 14:46:49
 */

@Repository
public interface UmsMemberMapper extends Mapper<UmsMember> {

}