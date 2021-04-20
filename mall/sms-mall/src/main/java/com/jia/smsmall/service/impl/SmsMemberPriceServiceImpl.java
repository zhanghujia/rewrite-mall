package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsMemberPriceMapper;
import com.jia.smsmall.model.SmsMemberPrice;
import com.jia.smsmall.service.SmsMemberPriceService;
import org.springframework.stereotype.Service;

/**
 * 商品会员价格(SmsMemberPrice)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:22:36
 */

@Service("smsMemberPriceService")
public class SmsMemberPriceServiceImpl implements SmsMemberPriceService {

    private final SmsMemberPriceMapper smsMemberPriceMapper;

    public SmsMemberPriceServiceImpl(SmsMemberPriceMapper smsMemberPriceMapper) {
        this.smsMemberPriceMapper = smsMemberPriceMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsMemberPrice queryById(Long id) {
        return this.smsMemberPriceMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsMemberPrice 实例对象
     * @return 实例对象
     */
    @Override
    public SmsMemberPrice insert(SmsMemberPrice smsMemberPrice) {
        this.smsMemberPriceMapper.insert(smsMemberPrice);
        return smsMemberPrice;
    }

    /**
     * 修改数据
     *
     * @param smsMemberPrice 实例对象
     * @return 实例对象
     */
    @Override
    public SmsMemberPrice update(SmsMemberPrice smsMemberPrice) {
        this.smsMemberPriceMapper.updateByPrimaryKeySelective(smsMemberPrice);
        return this.queryById(smsMemberPrice.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsMemberPriceMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsMemberPriceMapper::selectAll);
    }
}