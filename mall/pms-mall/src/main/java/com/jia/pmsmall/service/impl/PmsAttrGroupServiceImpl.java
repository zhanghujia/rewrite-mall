package com.jia.pmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.mapper.PmsAttrGroupMapper;
import com.jia.pmsmall.model.PmsAttrGroup;
import com.jia.pmsmall.service.PmsAttrGroupService;
import org.springframework.stereotype.Service;

/**
 * 属性分组(PmsAttrGroup)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:14:30
 */

@Service("pmsAttrGroupService")
public class PmsAttrGroupServiceImpl implements PmsAttrGroupService {

    private final PmsAttrGroupMapper pmsAttrGroupMapper;

    public PmsAttrGroupServiceImpl(PmsAttrGroupMapper pmsAttrGroupMapper) {
        this.pmsAttrGroupMapper = pmsAttrGroupMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param attrGroupId 主键
     * @return 实例对象
     */
    @Override
    public PmsAttrGroup queryById(Long attrGroupId) {
        return this.pmsAttrGroupMapper.selectByPrimaryKey(attrGroupId);
    }

    /**
     * 新增数据
     *
     * @param pmsAttrGroup 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttrGroup insert(PmsAttrGroup pmsAttrGroup) {
        this.pmsAttrGroupMapper.insert(pmsAttrGroup);
        return pmsAttrGroup;
    }

    /**
     * 修改数据
     *
     * @param pmsAttrGroup 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttrGroup update(PmsAttrGroup pmsAttrGroup) {
        this.pmsAttrGroupMapper.updateByPrimaryKeySelective(pmsAttrGroup);
        return this.queryById(pmsAttrGroup.getAttrGroupId());
    }

    /**
     * 通过主键删除数据
     *
     * @param attrGroupId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long attrGroupId) {
        return this.pmsAttrGroupMapper.deleteByPrimaryKey(attrGroupId) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.pmsAttrGroupMapper::selectAll);
    }
}