package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsCategoryBoundsMapper;
import com.jia.smsmall.model.SmsCategoryBounds;
import com.jia.smsmall.service.SmsCategoryBoundsService;
import org.springframework.stereotype.Service;

/**
 * 商品分类积分设置(SmsCategoryBounds)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:21:29
 */

@Service("smsCategoryBoundsService")
public class SmsCategoryBoundsServiceImpl implements SmsCategoryBoundsService {

    private final SmsCategoryBoundsMapper smsCategoryBoundsMapper;

    public SmsCategoryBoundsServiceImpl(SmsCategoryBoundsMapper smsCategoryBoundsMapper) {
        this.smsCategoryBoundsMapper = smsCategoryBoundsMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsCategoryBounds queryById(Long id) {
        return this.smsCategoryBoundsMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsCategoryBounds 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCategoryBounds insert(SmsCategoryBounds smsCategoryBounds) {
        this.smsCategoryBoundsMapper.insert(smsCategoryBounds);
        return smsCategoryBounds;
    }

    /**
     * 修改数据
     *
     * @param smsCategoryBounds 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCategoryBounds update(SmsCategoryBounds smsCategoryBounds) {
        this.smsCategoryBoundsMapper.updateByPrimaryKeySelective(smsCategoryBounds);
        return this.queryById(smsCategoryBounds.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsCategoryBoundsMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsCategoryBoundsMapper::selectAll);
    }
}