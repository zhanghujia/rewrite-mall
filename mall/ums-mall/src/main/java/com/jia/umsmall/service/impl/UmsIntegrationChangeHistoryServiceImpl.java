package com.jia.umsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.umsmall.mapper.UmsIntegrationChangeHistoryMapper;
import com.jia.umsmall.model.UmsIntegrationChangeHistory;
import com.jia.umsmall.service.UmsIntegrationChangeHistoryService;
import org.springframework.stereotype.Service;

/**
 * 积分变化历史记录(UmsIntegrationChangeHistory)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:46:45
 */

@Service("umsIntegrationChangeHistoryService")
public class UmsIntegrationChangeHistoryServiceImpl implements UmsIntegrationChangeHistoryService {

    private final UmsIntegrationChangeHistoryMapper umsIntegrationChangeHistoryMapper;

    public UmsIntegrationChangeHistoryServiceImpl(UmsIntegrationChangeHistoryMapper umsIntegrationChangeHistoryMapper) {
        this.umsIntegrationChangeHistoryMapper = umsIntegrationChangeHistoryMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsIntegrationChangeHistory queryById(Long id) {
        return this.umsIntegrationChangeHistoryMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param umsIntegrationChangeHistory 实例对象
     * @return 实例对象
     */
    @Override
    public UmsIntegrationChangeHistory insert(UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        this.umsIntegrationChangeHistoryMapper.insert(umsIntegrationChangeHistory);
        return umsIntegrationChangeHistory;
    }

    /**
     * 修改数据
     *
     * @param umsIntegrationChangeHistory 实例对象
     * @return 实例对象
     */
    @Override
    public UmsIntegrationChangeHistory update(UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        this.umsIntegrationChangeHistoryMapper.updateByPrimaryKeySelective(umsIntegrationChangeHistory);
        return this.queryById(umsIntegrationChangeHistory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsIntegrationChangeHistoryMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.umsIntegrationChangeHistoryMapper::selectAll);
    }
}