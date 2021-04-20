package com.jia.omsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.omsmall.mapper.OmsOrderMapper;
import com.jia.omsmall.model.OmsOrder;
import com.jia.omsmall.service.OmsOrderService;
import org.springframework.stereotype.Service;

/**
 * 订单(OmsOrder)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:00:26
 */

@Service("omsOrderService")
public class OmsOrderServiceImpl implements OmsOrderService {

    private final OmsOrderMapper omsOrderMapper;

    public OmsOrderServiceImpl(OmsOrderMapper omsOrderMapper) {
        this.omsOrderMapper = omsOrderMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrder queryById(Long id) {
        return this.omsOrderMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param omsOrder 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrder insert(OmsOrder omsOrder) {
        this.omsOrderMapper.insert(omsOrder);
        return omsOrder;
    }

    /**
     * 修改数据
     *
     * @param omsOrder 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrder update(OmsOrder omsOrder) {
        this.omsOrderMapper.updateByPrimaryKeySelective(omsOrder);
        return this.queryById(omsOrder.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.omsOrderMapper::selectAll);
    }
}