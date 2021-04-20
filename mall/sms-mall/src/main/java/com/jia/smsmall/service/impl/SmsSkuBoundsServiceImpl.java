package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsSkuBoundsMapper;
import com.jia.smsmall.model.SmsSkuBounds;
import com.jia.smsmall.service.SmsSkuBoundsService;
import org.springframework.stereotype.Service;

/**
 * 商品sku积分设置(SmsSkuBounds)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:23:46
 */

@Service("smsSkuBoundsService")
public class SmsSkuBoundsServiceImpl implements SmsSkuBoundsService {

    private final SmsSkuBoundsMapper smsSkuBoundsMapper;

    public SmsSkuBoundsServiceImpl(SmsSkuBoundsMapper smsSkuBoundsMapper) {
        this.smsSkuBoundsMapper = smsSkuBoundsMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSkuBounds queryById(Long id) {
        return this.smsSkuBoundsMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsSkuBounds 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSkuBounds insert(SmsSkuBounds smsSkuBounds) {
        this.smsSkuBoundsMapper.insert(smsSkuBounds);
        return smsSkuBounds;
    }

    /**
     * 修改数据
     *
     * @param smsSkuBounds 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSkuBounds update(SmsSkuBounds smsSkuBounds) {
        this.smsSkuBoundsMapper.updateByPrimaryKeySelective(smsSkuBounds);
        return this.queryById(smsSkuBounds.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSkuBoundsMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsSkuBoundsMapper::selectAll);
    }
}