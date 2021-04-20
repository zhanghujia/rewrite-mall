package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsCouponSpuCategoryRelationMapper;
import com.jia.smsmall.model.SmsCouponSpuCategoryRelation;
import com.jia.smsmall.service.SmsCouponSpuCategoryRelationService;
import org.springframework.stereotype.Service;

/**
 * 优惠券分类关联(SmsCouponSpuCategoryRelation)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:21:48
 */

@Service("smsCouponSpuCategoryRelationService")
public class SmsCouponSpuCategoryRelationServiceImpl implements SmsCouponSpuCategoryRelationService {

    private final SmsCouponSpuCategoryRelationMapper smsCouponSpuCategoryRelationMapper;

    public SmsCouponSpuCategoryRelationServiceImpl(SmsCouponSpuCategoryRelationMapper smsCouponSpuCategoryRelationMapper) {
        this.smsCouponSpuCategoryRelationMapper = smsCouponSpuCategoryRelationMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuCategoryRelation queryById(Long id) {
        return this.smsCouponSpuCategoryRelationMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsCouponSpuCategoryRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuCategoryRelation insert(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation) {
        this.smsCouponSpuCategoryRelationMapper.insert(smsCouponSpuCategoryRelation);
        return smsCouponSpuCategoryRelation;
    }

    /**
     * 修改数据
     *
     * @param smsCouponSpuCategoryRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuCategoryRelation update(SmsCouponSpuCategoryRelation smsCouponSpuCategoryRelation) {
        this.smsCouponSpuCategoryRelationMapper.updateByPrimaryKeySelective(smsCouponSpuCategoryRelation);
        return this.queryById(smsCouponSpuCategoryRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsCouponSpuCategoryRelationMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsCouponSpuCategoryRelationMapper::selectAll);
    }
}