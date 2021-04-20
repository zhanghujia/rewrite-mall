package com.jia.omsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.omsmall.mapper.OmsRefundInfoMapper;
import com.jia.omsmall.model.OmsRefundInfo;
import com.jia.omsmall.service.OmsRefundInfoService;
import org.springframework.stereotype.Service;

/**
 * 退款信息(OmsRefundInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:01:26
 */

@Service("omsRefundInfoService")
public class OmsRefundInfoServiceImpl implements OmsRefundInfoService {

    private final OmsRefundInfoMapper omsRefundInfoMapper;

    public OmsRefundInfoServiceImpl(OmsRefundInfoMapper omsRefundInfoMapper) {
        this.omsRefundInfoMapper = omsRefundInfoMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsRefundInfo queryById(Long id) {
        return this.omsRefundInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param omsRefundInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OmsRefundInfo insert(OmsRefundInfo omsRefundInfo) {
        this.omsRefundInfoMapper.insert(omsRefundInfo);
        return omsRefundInfo;
    }

    /**
     * 修改数据
     *
     * @param omsRefundInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OmsRefundInfo update(OmsRefundInfo omsRefundInfo) {
        this.omsRefundInfoMapper.updateByPrimaryKeySelective(omsRefundInfo);
        return this.queryById(omsRefundInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsRefundInfoMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.omsRefundInfoMapper::selectAll);
    }
}