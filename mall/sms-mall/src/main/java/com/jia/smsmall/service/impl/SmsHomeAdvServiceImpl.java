package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsHomeAdvMapper;
import com.jia.smsmall.model.SmsHomeAdv;
import com.jia.smsmall.service.SmsHomeAdvService;
import org.springframework.stereotype.Service;

/**
 * 首页轮播广告(SmsHomeAdv)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:22:05
 */

@Service("smsHomeAdvService")
public class SmsHomeAdvServiceImpl implements SmsHomeAdvService {

    private final SmsHomeAdvMapper smsHomeAdvMapper;

    public SmsHomeAdvServiceImpl(SmsHomeAdvMapper smsHomeAdvMapper) {
        this.smsHomeAdvMapper = smsHomeAdvMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsHomeAdv queryById(Long id) {
        return this.smsHomeAdvMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsHomeAdv 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeAdv insert(SmsHomeAdv smsHomeAdv) {
        this.smsHomeAdvMapper.insert(smsHomeAdv);
        return smsHomeAdv;
    }

    /**
     * 修改数据
     *
     * @param smsHomeAdv 实例对象
     * @return 实例对象
     */
    @Override
    public SmsHomeAdv update(SmsHomeAdv smsHomeAdv) {
        this.smsHomeAdvMapper.updateByPrimaryKeySelective(smsHomeAdv);
        return this.queryById(smsHomeAdv.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsHomeAdvMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsHomeAdvMapper::selectAll);
    }
}