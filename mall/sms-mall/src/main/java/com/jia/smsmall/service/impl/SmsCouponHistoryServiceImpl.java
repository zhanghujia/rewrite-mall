package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsCouponHistoryMapper;
import com.jia.smsmall.model.SmsCouponHistory;
import com.jia.smsmall.service.SmsCouponHistoryService;
import org.springframework.stereotype.Service;

/**
 * 优惠券领取历史记录(SmsCouponHistory)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:21:41
 */

@Service("smsCouponHistoryService")
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService {

    private final SmsCouponHistoryMapper smsCouponHistoryMapper;

    public SmsCouponHistoryServiceImpl(SmsCouponHistoryMapper smsCouponHistoryMapper) {
        this.smsCouponHistoryMapper = smsCouponHistoryMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsCouponHistory queryById(Long id) {
        return this.smsCouponHistoryMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsCouponHistory 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponHistory insert(SmsCouponHistory smsCouponHistory) {
        this.smsCouponHistoryMapper.insert(smsCouponHistory);
        return smsCouponHistory;
    }

    /**
     * 修改数据
     *
     * @param smsCouponHistory 实例对象
     * @return 实例对象
     */
    @Override
    public SmsCouponHistory update(SmsCouponHistory smsCouponHistory) {
        this.smsCouponHistoryMapper.updateByPrimaryKeySelective(smsCouponHistory);
        return this.queryById(smsCouponHistory.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsCouponHistoryMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsCouponHistoryMapper::selectAll);
    }
}