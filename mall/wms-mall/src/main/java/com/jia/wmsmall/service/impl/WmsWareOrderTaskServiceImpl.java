package com.jia.wmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.wmsmall.mapper.WmsWareOrderTaskMapper;
import com.jia.wmsmall.model.WmsWareOrderTask;
import com.jia.wmsmall.service.WmsWareOrderTaskService;
import org.springframework.stereotype.Service;

/**
 * 库存工作单(WmsWareOrderTask)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:29:44
 */

@Service("wmsWareOrderTaskService")
public class WmsWareOrderTaskServiceImpl implements WmsWareOrderTaskService {

    private final WmsWareOrderTaskMapper wmsWareOrderTaskMapper;

    public WmsWareOrderTaskServiceImpl(WmsWareOrderTaskMapper wmsWareOrderTaskMapper) {
        this.wmsWareOrderTaskMapper = wmsWareOrderTaskMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTask queryById(Long id) {
        return this.wmsWareOrderTaskMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param wmsWareOrderTask 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTask insert(WmsWareOrderTask wmsWareOrderTask) {
        this.wmsWareOrderTaskMapper.insert(wmsWareOrderTask);
        return wmsWareOrderTask;
    }

    /**
     * 修改数据
     *
     * @param wmsWareOrderTask 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTask update(WmsWareOrderTask wmsWareOrderTask) {
        this.wmsWareOrderTaskMapper.updateByPrimaryKeySelective(wmsWareOrderTask);
        return this.queryById(wmsWareOrderTask.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsWareOrderTaskMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.wmsWareOrderTaskMapper::selectAll);
    }
}