package com.jia.umsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.umsmall.mapper.UmsMemberStatisticsInfoMapper;
import com.jia.umsmall.model.UmsMemberStatisticsInfo;
import com.jia.umsmall.service.UmsMemberStatisticsInfoService;
import org.springframework.stereotype.Service;

/**
 * 会员统计信息(UmsMemberStatisticsInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:47:48
 */

@Service("umsMemberStatisticsInfoService")
public class UmsMemberStatisticsInfoServiceImpl implements UmsMemberStatisticsInfoService {

    private final UmsMemberStatisticsInfoMapper umsMemberStatisticsInfoMapper;

    public UmsMemberStatisticsInfoServiceImpl(UmsMemberStatisticsInfoMapper umsMemberStatisticsInfoMapper) {
        this.umsMemberStatisticsInfoMapper = umsMemberStatisticsInfoMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberStatisticsInfo queryById(Long id) {
        return this.umsMemberStatisticsInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param umsMemberStatisticsInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberStatisticsInfo insert(UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        this.umsMemberStatisticsInfoMapper.insert(umsMemberStatisticsInfo);
        return umsMemberStatisticsInfo;
    }

    /**
     * 修改数据
     *
     * @param umsMemberStatisticsInfo 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberStatisticsInfo update(UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        this.umsMemberStatisticsInfoMapper.updateByPrimaryKeySelective(umsMemberStatisticsInfo);
        return this.queryById(umsMemberStatisticsInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberStatisticsInfoMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.umsMemberStatisticsInfoMapper::selectAll);
    }
}