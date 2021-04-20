package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsHomeSubjectMapper;
import com.jia.smsmall.model.SmsHomeSubject;
import com.jia.smsmall.service.SmsHomeSubjectService;
import org.springframework.stereotype.Service;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】(SmsHomeSubject)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:22:14
 */

@Service("smsHomeSubjectService")
public class SmsHomeSubjectServiceImpl implements SmsHomeSubjectService {

    private final SmsHomeSubjectMapper smsHomeSubjectMapper;

    public SmsHomeSubjectServiceImpl(SmsHomeSubjectMapper smsHomeSubjectMapper) {
        this.smsHomeSubjectMapper = smsHomeSubjectMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsHomeSubject queryById(Long id) {
        return this.smsHomeSubjectMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsHomeSubject 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeSubject insert(SmsHomeSubject smsHomeSubject) {
        this.smsHomeSubjectMapper.insert(smsHomeSubject);
        return smsHomeSubject;
    }

    /**
     * 修改数据
     *
     * @param smsHomeSubject 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeSubject update(SmsHomeSubject smsHomeSubject) {
        this.smsHomeSubjectMapper.updateByPrimaryKeySelective(smsHomeSubject);
        return this.queryById(smsHomeSubject.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsHomeSubjectMapper.deleteByPrimaryKey(id) > 0;
    }

    /**
     * 分页查询多条数据
     *
     * @param page 页码
     * @param size 查询条数
     * @return 对象列表
     */
    @Override
    public PageInfo queryAllByLimit(int page, int size) {
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsHomeSubjectMapper::selectAll);
    }
}