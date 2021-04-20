package com.jia.omsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.omsmall.mapper.OmsOrderReturnApplyMapper;
import com.jia.omsmall.model.OmsOrderReturnApply;
import com.jia.omsmall.service.OmsOrderReturnApplyService;
import org.springframework.stereotype.Service;

/**
 * 订单退货申请(OmsOrderReturnApply)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:00:49
 */

@Service("omsOrderReturnApplyService")
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService {

    private final OmsOrderReturnApplyMapper omsOrderReturnApplyMapper;

    public OmsOrderReturnApplyServiceImpl(OmsOrderReturnApplyMapper omsOrderReturnApplyMapper) {
        this.omsOrderReturnApplyMapper = omsOrderReturnApplyMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnApply queryById(Long id) {
        return this.omsOrderReturnApplyMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param omsOrderReturnApply 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnApply insert(OmsOrderReturnApply omsOrderReturnApply) {
        this.omsOrderReturnApplyMapper.insert(omsOrderReturnApply);
        return omsOrderReturnApply;
    }

    /**
     * 修改数据
     *
     * @param omsOrderReturnApply 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderReturnApply update(OmsOrderReturnApply omsOrderReturnApply) {
        this.omsOrderReturnApplyMapper.updateByPrimaryKeySelective(omsOrderReturnApply);
        return this.queryById(omsOrderReturnApply.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderReturnApplyMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.omsOrderReturnApplyMapper::selectAll);
    }
}