package com.jia.smsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.smsmall.model.SmsHomeSubjectSpu;
import org.springframework.stereotype.Component;


/**
 * 专题商品(SmsHomeSubjectSpu)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:22:22
 */

@Component
public interface SmsHomeSubjectSpuService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsHomeSubjectSpu queryById(Long id);

    /**
     * 新增数据
     *
     * @param smsHomeSubjectSpu 实例对象
     * @return 实例对象
     */
    SmsHomeSubjectSpu insert(SmsHomeSubjectSpu smsHomeSubjectSpu);

    /**
     * 修改数据
     *
     * @param smsHomeSubjectSpu 实例对象
     * @return 实例对象
     */
    SmsHomeSubjectSpu update(SmsHomeSubjectSpu smsHomeSubjectSpu);

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