package com.jia.omsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.omsmall.mapper.OmsOrderSettingMapper;
import com.jia.omsmall.model.OmsOrderSetting;
import com.jia.omsmall.service.OmsOrderSettingService;
import org.springframework.stereotype.Service;

/**
 * 订单配置信息(OmsOrderSetting)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:01:06
 */

@Service("omsOrderSettingService")
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {

    private final OmsOrderSettingMapper omsOrderSettingMapper;

    public OmsOrderSettingServiceImpl(OmsOrderSettingMapper omsOrderSettingMapper) {
        this.omsOrderSettingMapper = omsOrderSettingMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OmsOrderSetting queryById(Long id) {
        return this.omsOrderSettingMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param omsOrderSetting 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderSetting insert(OmsOrderSetting omsOrderSetting) {
        this.omsOrderSettingMapper.insert(omsOrderSetting);
        return omsOrderSetting;
    }

    /**
     * 修改数据
     *
     * @param omsOrderSetting 实例对象
     * @return 实例对象
     */
    @Override
    public OmsOrderSetting update(OmsOrderSetting omsOrderSetting) {
        this.omsOrderSettingMapper.updateByPrimaryKeySelective(omsOrderSetting);
        return this.queryById(omsOrderSetting.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.omsOrderSettingMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.omsOrderSettingMapper::selectAll);
    }
}