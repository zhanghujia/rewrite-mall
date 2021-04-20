package com.jia.wmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.wmsmall.mapper.WmsPurchaseMapper;
import com.jia.wmsmall.model.WmsPurchase;
import com.jia.wmsmall.service.WmsPurchaseService;
import org.springframework.stereotype.Service;

/**
 * 采购信息(WmsPurchase)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:29:26
 */

@Service("wmsPurchaseService")
public class WmsPurchaseServiceImpl implements WmsPurchaseService {

    private final WmsPurchaseMapper wmsPurchaseMapper;

    public WmsPurchaseServiceImpl(WmsPurchaseMapper wmsPurchaseMapper) {
        this.wmsPurchaseMapper = wmsPurchaseMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsPurchase queryById(Long id) {
        return this.wmsPurchaseMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param wmsPurchase 实例对象
     * @return 实例对象
     */
    @Override
    public WmsPurchase insert(WmsPurchase wmsPurchase) {
        this.wmsPurchaseMapper.insert(wmsPurchase);
        return wmsPurchase;
    }

    /**
     * 修改数据
     *
     * @param wmsPurchase 实例对象
     * @return 实例对象
     */
    @Override
    public WmsPurchase update(WmsPurchase wmsPurchase) {
        this.wmsPurchaseMapper.updateByPrimaryKeySelective(wmsPurchase);
        return this.queryById(wmsPurchase.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsPurchaseMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.wmsPurchaseMapper::selectAll);
    }
}