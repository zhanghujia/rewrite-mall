package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsCouponMapper;
import com.jia.smsmall.model.SmsCoupon;
import com.jia.smsmall.service.SmsCouponService;
import org.springframework.stereotype.Service;

/**
 * 优惠券信息(SmsCoupon)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:21:35
 */

@Service("smsCouponService")
public class SmsCouponServiceImpl implements SmsCouponService {

    private final SmsCouponMapper smsCouponMapper;

    public SmsCouponServiceImpl(SmsCouponMapper smsCouponMapper) {
        this.smsCouponMapper = smsCouponMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsCoupon queryById(Long id) {
        return this.smsCouponMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsCoupon 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCoupon insert(SmsCoupon smsCoupon) {
        this.smsCouponMapper.insert(smsCoupon);
        return smsCoupon;
    }

    /**
     * 修改数据
     *
     * @param smsCoupon 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCoupon update(SmsCoupon smsCoupon) {
        this.smsCouponMapper.updateByPrimaryKeySelective(smsCoupon);
        return this.queryById(smsCoupon.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsCouponMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsCouponMapper::selectAll);
    }
}