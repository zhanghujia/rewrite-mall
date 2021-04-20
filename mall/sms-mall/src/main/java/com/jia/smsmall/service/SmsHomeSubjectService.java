package com.jia.smsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.smsmall.model.SmsHomeSubject;
import org.springframework.stereotype.Component;


/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:22:13
 */

@Component
public interface SmsHomeSubjectService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsHomeSubject queryById(Long id);

    /**
     * 新增数据
     *
     * @param smsHomeSubject 实例对象
     * @return 实例对象
     */
    SmsHomeSubject insert(SmsHomeSubject smsHomeSubject);

    /**
     * 修改数据
     *
     * @param smsHomeSubject 实例对象
     * @return 实例对象
     */
    SmsHomeSubject update(SmsHomeSubject smsHomeSubject);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 分页查询多条数据
     *
     * @param page 页码
     * @param size 查询条数
     * @return 对象列表
     */
    PageInfo queryAllByLimit(int page, int size);


}