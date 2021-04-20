package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsHomeSubjectSpuMapper;
import com.jia.smsmall.model.SmsHomeSubjectSpu;
import com.jia.smsmall.service.SmsHomeSubjectSpuService;
import org.springframework.stereotype.Service;

/**
 * 专题商品(SmsHomeSubjectSpu)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:22:25
 */

@Service("smsHomeSubjectSpuService")
public class SmsHomeSubjectSpuServiceImpl implements SmsHomeSubjectSpuService {

    private final SmsHomeSubjectSpuMapper smsHomeSubjectSpuMapper;

    public SmsHomeSubjectSpuServiceImpl(SmsHomeSubjectSpuMapper smsHomeSubjectSpuMapper) {
        this.smsHomeSubjectSpuMapper = smsHomeSubjectSpuMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsHomeSubjectSpu queryById(Long id) {
        return this.smsHomeSubjectSpuMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsHomeSubjectSpu 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeSubjectSpu insert(SmsHomeSubjectSpu smsHomeSubjectSpu) {
        this.smsHomeSubjectSpuMapper.insert(smsHomeSubjectSpu);
        return smsHomeSubjectSpu;
    }

    /**
     * 修改数据
     *
     * @param smsHomeSubjectSpu 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeSubjectSpu update(SmsHomeSubjectSpu smsHomeSubjectSpu) {
        this.smsHomeSubjectSpuMapper.updateByPrimaryKeySelective(smsHomeSubjectSpu);
        return this.queryById(smsHomeSubjectSpu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsHomeSubjectSpuMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsHomeSubjectSpuMapper::selectAll);
    }
}