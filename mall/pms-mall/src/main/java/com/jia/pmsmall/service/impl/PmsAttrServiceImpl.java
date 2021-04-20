package com.jia.pmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.mapper.PmsAttrMapper;
import com.jia.pmsmall.model.PmsAttr;
import com.jia.pmsmall.service.PmsAttrService;
import org.springframework.stereotype.Service;

/**
 * 商品属性(PmsAttr)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:14:21
 */

@Service("pmsAttrService")
public class PmsAttrServiceImpl implements PmsAttrService {

    private final PmsAttrMapper pmsAttrMapper;

    public PmsAttrServiceImpl(PmsAttrMapper pmsAttrMapper) {
        this.pmsAttrMapper = pmsAttrMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param attrId 主键
     * @return 实例对象
     */
    @Override
    public PmsAttr queryById(Long attrId) {
        return this.pmsAttrMapper.selectByPrimaryKey(attrId);
    }

    /**
     * 新增数据
     *
     * @param pmsAttr 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttr insert(PmsAttr pmsAttr) {
        this.pmsAttrMapper.insert(pmsAttr);
        return pmsAttr;
    }

    /**
     * 修改数据
     *
     * @param pmsAttr 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttr update(PmsAttr pmsAttr) {
        this.pmsAttrMapper.updateByPrimaryKeySelective(pmsAttr);
        return this.queryById(pmsAttr.getAttrId());
    }

    /**
     * 通过主键删除数据
     *
     * @param attrId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long attrId) {
        return this.pmsAttrMapper.deleteByPrimaryKey(attrId) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.pmsAttrMapper::selectAll);
    }
}