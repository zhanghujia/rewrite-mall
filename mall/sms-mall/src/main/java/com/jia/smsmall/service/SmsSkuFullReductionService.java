package com.jia.smsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.smsmall.model.SmsSkuFullReduction;
import org.springframework.stereotype.Component;


/**
 * 商品满减信息(SmsSkuFullReduction)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:24:00
 */

@Component
public interface SmsSkuFullReductionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsSkuFullReduction queryById(Long id);

    /**
     * 新增数据
     *
     * @param smsSkuFullReduction 实例对象
     * @return 实例对象
     */
    SmsSkuFullReduction insert(SmsSkuFullReduction smsSkuFullReduction);

    /**
     * 修改数据
     *
     * @param smsSkuFullReduction 实例对象
     * @return 实例对象
     */
    SmsSkuFullReduction update(SmsSkuFullReduction smsSkuFullReduction);

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