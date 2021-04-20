package com.jia.wmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.wmsmall.mapper.WmsPurchaseDetailMapper;
import com.jia.wmsmall.model.WmsPurchaseDetail;
import com.jia.wmsmall.service.WmsPurchaseDetailService;
import org.springframework.stereotype.Service;

/**
 * (WmsPurchaseDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:29:31
 */

@Service("wmsPurchaseDetailService")
public class WmsPurchaseDetailServiceImpl implements WmsPurchaseDetailService {

    private final WmsPurchaseDetailMapper wmsPurchaseDetailMapper;

    public WmsPurchaseDetailServiceImpl(WmsPurchaseDetailMapper wmsPurchaseDetailMapper) {
        this.wmsPurchaseDetailMapper = wmsPurchaseDetailMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public WmsPurchaseDetail queryById(Long id) {
        return this.wmsPurchaseDetailMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param wmsPurchaseDetail 实例对象
     * @return 实例对象
     */
    @Override
    public WmsPurchaseDetail insert(WmsPurchaseDetail wmsPurchaseDetail) {
        this.wmsPurchaseDetailMapper.insert(wmsPurchaseDetail);
        return wmsPurchaseDetail;
    }

    /**
     * 修改数据
     *
     * @param wmsPurchaseDetail 实例对象
     * @return 实例对象
     */
    @Override
    public WmsPurchaseDetail update(WmsPurchaseDetail wmsPurchaseDetail) {
        this.wmsPurchaseDetailMapper.updateByPrimaryKeySelective(wmsPurchaseDetail);
        return this.queryById(wmsPurchaseDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.wmsPurchaseDetailMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.wmsPurchaseDetailMapper::selectAll);
    }
}