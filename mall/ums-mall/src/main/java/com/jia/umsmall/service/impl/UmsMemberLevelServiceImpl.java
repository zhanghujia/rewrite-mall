package com.jia.umsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.umsmall.mapper.UmsMemberLevelMapper;
import com.jia.umsmall.model.UmsMemberLevel;
import com.jia.umsmall.service.UmsMemberLevelService;
import org.springframework.stereotype.Service;

/**
 * 会员等级(UmsMemberLevel)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:47:14
 */

@Service("umsMemberLevelService")
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {

    private final UmsMemberLevelMapper umsMemberLevelMapper;

    public UmsMemberLevelServiceImpl(UmsMemberLevelMapper umsMemberLevelMapper) {
        this.umsMemberLevelMapper = umsMemberLevelMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberLevel queryById(Long id) {
        return this.umsMemberLevelMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param umsMemberLevel 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberLevel insert(UmsMemberLevel umsMemberLevel) {
        this.umsMemberLevelMapper.insert(umsMemberLevel);
        return umsMemberLevel;
    }

    /**
     * 修改数据
     *
     * @param umsMemberLevel 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberLevel update(UmsMemberLevel umsMemberLevel) {
        this.umsMemberLevelMapper.updateByPrimaryKeySelective(umsMemberLevel);
        return this.queryById(umsMemberLevel.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberLevelMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.umsMemberLevelMapper::selectAll);
    }
}