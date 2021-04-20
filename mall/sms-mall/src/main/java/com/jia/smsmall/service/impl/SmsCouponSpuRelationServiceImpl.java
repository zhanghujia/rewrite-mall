package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsCouponSpuRelationMapper;
import com.jia.smsmall.model.SmsCouponSpuRelation;
import com.jia.smsmall.service.SmsCouponSpuRelationService;
import org.springframework.stereotype.Service;

/**
 * 优惠券与产品关联(SmsCouponSpuRelation)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:21:56
 */

@Service("smsCouponSpuRelationService")
public class SmsCouponSpuRelationServiceImpl implements SmsCouponSpuRelationService {

    private final SmsCouponSpuRelationMapper smsCouponSpuRelationMapper;

    public SmsCouponSpuRelationServiceImpl(SmsCouponSpuRelationMapper smsCouponSpuRelationMapper) {
        this.smsCouponSpuRelationMapper = smsCouponSpuRelationMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuRelation queryById(Long id) {
        return this.smsCouponSpuRelationMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsCouponSpuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuRelation insert(SmsCouponSpuRelation smsCouponSpuRelation) {
        this.smsCouponSpuRelationMapper.insert(smsCouponSpuRelation);
        return smsCouponSpuRelation;
    }

    /**
     * 修改数据
     *
     * @param smsCouponSpuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponSpuRelation update(SmsCouponSpuRelation smsCouponSpuRelation) {
        this.smsCouponSpuRelationMapper.updateByPrimaryKeySelective(smsCouponSpuRelation);
        return this.queryById(smsCouponSpuRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsCouponSpuRelationMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsCouponSpuRelationMapper::selectAll);
    }
}