package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsSkuFullReductionMapper;
import com.jia.smsmall.model.SmsSkuFullReduction;
import com.jia.smsmall.service.SmsSkuFullReductionService;
import org.springframework.stereotype.Service;

/**
 * 商品满减信息(SmsSkuFullReduction)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:24:03
 */

@Service("smsSkuFullReductionService")
public class SmsSkuFullReductionServiceImpl implements SmsSkuFullReductionService {

    private final SmsSkuFullReductionMapper smsSkuFullReductionMapper;

    public SmsSkuFullReductionServiceImpl(SmsSkuFullReductionMapper smsSkuFullReductionMapper) {
        this.smsSkuFullReductionMapper = smsSkuFullReductionMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSkuFullReduction queryById(Long id) {
        return this.smsSkuFullReductionMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsSkuFullReduction 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSkuFullReduction insert(SmsSkuFullReduction smsSkuFullReduction) {
        this.smsSkuFullReductionMapper.insert(smsSkuFullReduction);
        return smsSkuFullReduction;
    }

    /**
     * 修改数据
     *
     * @param smsSkuFullReduction 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSkuFullReduction update(SmsSkuFullReduction smsSkuFullReduction) {
        this.smsSkuFullReductionMapper.updateByPrimaryKeySelective(smsSkuFullReduction);
        return this.queryById(smsSkuFullReduction.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSkuFullReductionMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsSkuFullReductionMapper::selectAll);
    }
}