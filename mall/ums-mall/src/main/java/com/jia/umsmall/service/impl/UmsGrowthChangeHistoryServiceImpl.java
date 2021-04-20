package com.jia.umsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.umsmall.mapper.UmsGrowthChangeHistoryMapper;
import com.jia.umsmall.model.UmsGrowthChangeHistory;
import com.jia.umsmall.service.UmsGrowthChangeHistoryService;
import org.springframework.stereotype.Service;

/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:46:40
 */

@Service("umsGrowthChangeHistoryService")
public class UmsGrowthChangeHistoryServiceImpl implements UmsGrowthChangeHistoryService {

    private final UmsGrowthChangeHistoryMapper umsGrowthChangeHistoryMapper;

    public UmsGrowthChangeHistoryServiceImpl(UmsGrowthChangeHistoryMapper umsGrowthChangeHistoryMapper) {
        this.umsGrowthChangeHistoryMapper = umsGrowthChangeHistoryMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsGrowthChangeHistory queryById(Long id) {
        return this.umsGrowthChangeHistoryMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param umsGrowthChangeHistory 实例对象
     * @return 实例对象
     */
    @Override
    public UmsGrowthChangeHistory insert(UmsGrowthChangeHistory umsGrowthChangeHistory) {
        this.umsGrowthChangeHistoryMapper.insert(umsGrowthChangeHistory);
        return umsGrowthChangeHistory;
    }

    /**
     * 修改数据
     *
     * @param umsGrowthChangeHistory 实例对象
     * @return 实例对象
     */
    @Override
    public UmsGrowthChangeHistory update(UmsGrowthChangeHistory umsGrowthChangeHistory) {
        this.umsGrowthChangeHistoryMapper.updateByPrimaryKeySelective(umsGrowthChangeHistory);
        return this.queryById(umsGrowthChangeHistory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsGrowthChangeHistoryMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.umsGrowthChangeHistoryMapper::selectAll);
    }
}