package com.jia.omsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.omsmall.mapper.OmsPaymentInfoMapper;
import com.jia.omsmall.model.OmsPaymentInfo;
import com.jia.omsmall.service.OmsPaymentInfoService;
import org.springframework.stereotype.Service;

/**
 * 支付信息表(OmsPaymentInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:01:16
 */

@Service("omsPaymentInfoService")
public class OmsPaymentInfoServiceImpl implements OmsPaymentInfoService {

    private final OmsPaymentInfoMapper omsPaymentInfoMapper;

    public OmsPaymentInfoServiceImpl(OmsPaymentInfoMapper omsPaymentInfoMapper) {
        this.omsPaymentInfoMapper = omsPaymentInfoMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsPaymentInfo queryById(Long id) {
        return this.omsPaymentInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param omsPaymentInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OmsPaymentInfo insert(OmsPaymentInfo omsPaymentInfo) {
        this.omsPaymentInfoMapper.insert(omsPaymentInfo);
        return omsPaymentInfo;
    }

    /**
     * 修改数据
     *
     * @param omsPaymentInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OmsPaymentInfo update(OmsPaymentInfo omsPaymentInfo) {
        this.omsPaymentInfoMapper.updateByPrimaryKeySelective(omsPaymentInfo);
        return this.queryById(omsPaymentInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsPaymentInfoMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.omsPaymentInfoMapper::selectAll);
    }
}