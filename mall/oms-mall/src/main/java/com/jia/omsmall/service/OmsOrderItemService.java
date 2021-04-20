package com.jia.omsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.omsmall.model.OmsOrderItem;
import org.springframework.stereotype.Component;


/**
 * 订单项信息(OmsOrderItem)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:00:32
 */

@Component
public interface OmsOrderItemService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsOrderItem queryById(Long id);

    /**
     * 新增数据
     *
     * @param omsOrderItem 实例对象
     * @return 实例对象
     */
    OmsOrderItem insert(OmsOrderItem omsOrderItem);

    /**
     * 修改数据
     *
     * @param omsOrderItem 实例对象
     * @return 实例对象
     */
    OmsOrderItem update(OmsOrderItem omsOrderItem);

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