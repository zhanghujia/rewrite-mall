package com.jia.wmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.wmsmall.mapper.WmsWareInfoMapper;
import com.jia.wmsmall.model.WmsWareInfo;
import com.jia.wmsmall.service.WmsWareInfoService;
import org.springframework.stereotype.Service;

/**
 * 仓库信息(WmsWareInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:29:38
 */

@Service("wmsWareInfoService")
public class WmsWareInfoServiceImpl implements WmsWareInfoService {

    private final WmsWareInfoMapper wmsWareInfoMapper;

    public WmsWareInfoServiceImpl(WmsWareInfoMapper wmsWareInfoMapper) {
        this.wmsWareInfoMapper = wmsWareInfoMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsWareInfo queryById(Long id) {
        return this.wmsWareInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param wmsWareInfo 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareInfo insert(WmsWareInfo wmsWareInfo) {
        this.wmsWareInfoMapper.insert(wmsWareInfo);
        return wmsWareInfo;
    }

    /**
     * 修改数据
     *
     * @param wmsWareInfo 实例对象
     * @return 实例对象
     */
    @Override
    public WmsWareInfo update(WmsWareInfo wmsWareInfo) {
        this.wmsWareInfoMapper.updateByPrimaryKeySelective(wmsWareInfo);
        return this.queryById(wmsWareInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsWareInfoMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.wmsWareInfoMapper::selectAll);
    }
}