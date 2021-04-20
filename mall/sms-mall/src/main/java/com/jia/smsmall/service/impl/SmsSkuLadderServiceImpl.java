package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsSkuLadderMapper;
import com.jia.smsmall.model.SmsSkuLadder;
import com.jia.smsmall.service.SmsSkuLadderService;
import org.springframework.stereotype.Service;

/**
 * 商品阶梯价格(SmsSkuLadder)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:24:21
 */

@Service("smsSkuLadderService")
public class SmsSkuLadderServiceImpl implements SmsSkuLadderService {

    private final SmsSkuLadderMapper smsSkuLadderMapper;

    public SmsSkuLadderServiceImpl(SmsSkuLadderMapper smsSkuLadderMapper) {
        this.smsSkuLadderMapper = smsSkuLadderMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSkuLadder queryById(Long id) {
        return this.smsSkuLadderMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsSkuLadder 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSkuLadder insert(SmsSkuLadder smsSkuLadder) {
        this.smsSkuLadderMapper.insert(smsSkuLadder);
        return smsSkuLadder;
    }

    /**
     * 修改数据
     *
     * @param smsSkuLadder 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSkuLadder update(SmsSkuLadder smsSkuLadder) {
        this.smsSkuLadderMapper.updateByPrimaryKeySelective(smsSkuLadder);
        return this.queryById(smsSkuLadder.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSkuLadderMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsSkuLadderMapper::selectAll);
    }
}