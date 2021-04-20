package com.jia.omsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.omsmall.mapper.OmsOrderItemMapper;
import com.jia.omsmall.model.OmsOrderItem;
import com.jia.omsmall.service.OmsOrderItemService;
import org.springframework.stereotype.Service;

/**
 * 订单项信息(OmsOrderItem)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:00:34
 */

@Service("omsOrderItemService")
public class OmsOrderItemServiceImpl implements OmsOrderItemService {

    private final OmsOrderItemMapper omsOrderItemMapper;

    public OmsOrderItemServiceImpl(OmsOrderItemMapper omsOrderItemMapper) {
        this.omsOrderItemMapper = omsOrderItemMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrderItem queryById(Long id) {
        return this.omsOrderItemMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param omsOrderItem 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderItem insert(OmsOrderItem omsOrderItem) {
        this.omsOrderItemMapper.insert(omsOrderItem);
        return omsOrderItem;
    }

    /**
     * 修改数据
     *
     * @param omsOrderItem 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderItem update(OmsOrderItem omsOrderItem) {
        this.omsOrderItemMapper.updateByPrimaryKeySelective(omsOrderItem);
        return this.queryById(omsOrderItem.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderItemMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.omsOrderItemMapper::selectAll);
    }
}