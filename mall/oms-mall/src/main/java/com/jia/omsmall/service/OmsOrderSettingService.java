package com.jia.omsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.omsmall.model.OmsOrderSetting;
import org.springframework.stereotype.Component;


/**
 * 订单配置信息(OmsOrderSetting)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:01:04
 */

@Component
public interface OmsOrderSettingService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderSetting queryById(Long id);

    /**
     * 新增数据
     *
     * @param omsOrderSetting 实例对象
     * @return 实例对象
     */
    OmsOrderSetting insert(OmsOrderSetting omsOrderSetting);

    /**
     * 修改数据
     *
     * @param omsOrderSetting 实例对象
     * @return 实例对象
     */
    OmsOrderSetting update(OmsOrderSetting omsOrderSetting);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 分页查询多条数据
     *
     * @param page 页码
     * @param size 查询条数
     * @return 对象列表
     */
    PageInfo queryAllByLimit(int page, int size);


}