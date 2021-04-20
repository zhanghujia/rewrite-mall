package com.jia.omsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.omsmall.mapper.OmsOrderOperateHistoryMapper;
import com.jia.omsmall.model.OmsOrderOperateHistory;
import com.jia.omsmall.service.OmsOrderOperateHistoryService;
import org.springframework.stereotype.Service;

/**
 * 订单操作历史记录(OmsOrderOperateHistory)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:00:40
 */

@Service("omsOrderOperateHistoryService")
public class OmsOrderOperateHistoryServiceImpl implements OmsOrderOperateHistoryService {

    private final OmsOrderOperateHistoryMapper omsOrderOperateHistoryMapper;

    public OmsOrderOperateHistoryServiceImpl(OmsOrderOperateHistoryMapper omsOrderOperateHistoryMapper) {
        this.omsOrderOperateHistoryMapper = omsOrderOperateHistoryMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrderOperateHistory queryById(Long id) {
        return this.omsOrderOperateHistoryMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param omsOrderOperateHistory 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderOperateHistory insert(OmsOrderOperateHistory omsOrderOperateHistory) {
        this.omsOrderOperateHistoryMapper.insert(omsOrderOperateHistory);
        return omsOrderOperateHistory;
    }

    /**
     * 修改数据
     *
     * @param omsOrderOperateHistory 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderOperateHistory update(OmsOrderOperateHistory omsOrderOperateHistory) {
        this.omsOrderOperateHistoryMapper.updateByPrimaryKeySelective(omsOrderOperateHistory);
        return this.queryById(omsOrderOperateHistory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderOperateHistoryMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.omsOrderOperateHistoryMapper::selectAll);
    }
}