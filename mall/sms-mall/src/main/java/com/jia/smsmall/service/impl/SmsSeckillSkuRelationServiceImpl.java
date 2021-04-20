package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsSeckillSkuRelationMapper;
import com.jia.smsmall.model.SmsSeckillSkuRelation;
import com.jia.smsmall.service.SmsSeckillSkuRelationService;
import org.springframework.stereotype.Service;

/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:23:30
 */

@Service("smsSeckillSkuRelationService")
public class SmsSeckillSkuRelationServiceImpl implements SmsSeckillSkuRelationService {

    private final SmsSeckillSkuRelationMapper smsSeckillSkuRelationMapper;

    public SmsSeckillSkuRelationServiceImpl(SmsSeckillSkuRelationMapper smsSeckillSkuRelationMapper) {
        this.smsSeckillSkuRelationMapper = smsSeckillSkuRelationMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuRelation queryById(Long id) {
        return this.smsSeckillSkuRelationMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsSeckillSkuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuRelation insert(SmsSeckillSkuRelation smsSeckillSkuRelation) {
        this.smsSeckillSkuRelationMapper.insert(smsSeckillSkuRelation);
        return smsSeckillSkuRelation;
    }

    /**
     * 修改数据
     *
     * @param smsSeckillSkuRelation 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuRelation update(SmsSeckillSkuRelation smsSeckillSkuRelation) {
        this.smsSeckillSkuRelationMapper.updateByPrimaryKeySelective(smsSeckillSkuRelation);
        return this.queryById(smsSeckillSkuRelation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSeckillSkuRelationMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsSeckillSkuRelationMapper::selectAll);
    }
}