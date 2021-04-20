package com.jia.wmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.wmsmall.mapper.WmsWareOrderTaskDetailMapper;
import com.jia.wmsmall.model.WmsWareOrderTaskDetail;
import com.jia.wmsmall.service.WmsWareOrderTaskDetailService;
import org.springframework.stereotype.Service;

/**
 * 库存工作单(WmsWareOrderTaskDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:29:52
 */

@Service("wmsWareOrderTaskDetailService")
public class WmsWareOrderTaskDetailServiceImpl implements WmsWareOrderTaskDetailService {

    private final WmsWareOrderTaskDetailMapper wmsWareOrderTaskDetailMapper;

    public WmsWareOrderTaskDetailServiceImpl(WmsWareOrderTaskDetailMapper wmsWareOrderTaskDetailMapper) {
        this.wmsWareOrderTaskDetailMapper = wmsWareOrderTaskDetailMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTaskDetail queryById(Long id) {
        return this.wmsWareOrderTaskDetailMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param wmsWareOrderTaskDetail 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTaskDetail insert(WmsWareOrderTaskDetail wmsWareOrderTaskDetail) {
        this.wmsWareOrderTaskDetailMapper.insert(wmsWareOrderTaskDetail);
        return wmsWareOrderTaskDetail;
    }

    /**
     * 修改数据
     *
     * @param wmsWareOrderTaskDetail 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareOrderTaskDetail update(WmsWareOrderTaskDetail wmsWareOrderTaskDetail) {
        this.wmsWareOrderTaskDetailMapper.updateByPrimaryKeySelective(wmsWareOrderTaskDetail);
        return this.queryById(wmsWareOrderTaskDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsWareOrderTaskDetailMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.wmsWareOrderTaskDetailMapper::selectAll);
    }
}