package com.jia.smsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.smsmall.model.SmsSkuBounds;
import org.springframework.stereotype.Component;


/**
 * 商品sku积分设置(SmsSkuBounds)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:23:43
 */

@Component
public interface SmsSkuBoundsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsSkuBounds queryById(Long id);

    /**
     * 新增数据
     *
     * @param smsSkuBounds 实例对象
     * @return 实例对象
     */
    SmsSkuBounds insert(SmsSkuBounds smsSkuBounds);

    /**
     * 修改数据
     *
     * @param smsSkuBounds 实例对象
     * @return 实例对象
     */
    SmsSkuBounds update(SmsSkuBounds smsSkuBounds);

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