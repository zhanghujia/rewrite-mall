package com.jia.pmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.mapper.PmsAttrAttrgroupRelationMapper;
import com.jia.pmsmall.model.PmsAttrAttrgroupRelation;
import com.jia.pmsmall.service.PmsAttrAttrgroupRelationService;
import org.springframework.stereotype.Service;

/**
 * 属性&属性分组关联(PmsAttrAttrgroupRelation)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:14:26
 */

@Service("pmsAttrAttrgroupRelationService")
public class PmsAttrAttrgroupRelationServiceImpl implements PmsAttrAttrgroupRelationService {

    private final PmsAttrAttrgroupRelationMapper pmsAttrAttrgroupRelationMapper;

    public PmsAttrAttrgroupRelationServiceImpl(PmsAttrAttrgroupRelationMapper pmsAttrAttrgroupRelationMapper) {
        this.pmsAttrAttrgroupRelationMapper = pmsAttrAttrgroupRelationMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsAttrAttrgroupRelation queryById(Long id) {
        return this.pmsAttrAttrgroupRelationMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param pmsAttrAttrgroupRelation 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttrAttrgroupRelation insert(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation) {
        this.pmsAttrAttrgroupRelationMapper.insert(pmsAttrAttrgroupRelation);
        return pmsAttrAttrgroupRelation;
    }

    /**
     * 修改数据
     *
     * @param pmsAttrAttrgroupRelation 实例对象
     * @return 实例对象
     */
    @Override
    public PmsAttrAttrgroupRelation update(PmsAttrAttrgroupRelation pmsAttrAttrgroupRelation) {
        this.pmsAttrAttrgroupRelationMapper.updateByPrimaryKeySelective(pmsAttrAttrgroupRelation);
        return this.queryById(pmsAttrAttrgroupRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsAttrAttrgroupRelationMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.pmsAttrAttrgroupRelationMapper::selectAll);
    }
}