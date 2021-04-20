package com.jia.omsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.omsmall.mapper.OmsOrderReturnReasonMapper;
import com.jia.omsmall.model.OmsOrderReturnReason;
import com.jia.omsmall.service.OmsOrderReturnReasonService;
import org.springframework.stereotype.Service;

/**
 * 退货原因(OmsOrderReturnReason)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:00:57
 */

@Service("omsOrderReturnReasonService")
public class OmsOrderReturnReasonServiceImpl implements OmsOrderReturnReasonService {

    private final OmsOrderReturnReasonMapper omsOrderReturnReasonMapper;

    public OmsOrderReturnReasonServiceImpl(OmsOrderReturnReasonMapper omsOrderReturnReasonMapper) {
        this.omsOrderReturnReasonMapper = omsOrderReturnReasonMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnReason queryById(Long id) {
        return this.omsOrderReturnReasonMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param omsOrderReturnReason 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnReason insert(OmsOrderReturnReason omsOrderReturnReason) {
        this.omsOrderReturnReasonMapper.insert(omsOrderReturnReason);
        return omsOrderReturnReason;
    }

    /**
     * 修改数据
     *
     * @param omsOrderReturnReason 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnReason update(OmsOrderReturnReason omsOrderReturnReason) {
        this.omsOrderReturnReasonMapper.updateByPrimaryKeySelective(omsOrderReturnReason);
        return this.queryById(omsOrderReturnReason.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderReturnReasonMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.omsOrderReturnReasonMapper::selectAll);
    }
}