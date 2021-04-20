package com.jia.wmsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.wmsmall.model.WmsPurchase;
import org.springframework.stereotype.Component;


/**
 * 采购信息(WmsPurchase)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:29:25
 */

@Component
public interface WmsPurchaseService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsPurchase queryById(Long id);

    /**
     * 新增数据
     *
     * @param wmsPurchase 实例对象
     * @return 实例对象
     */
    WmsPurchase insert(WmsPurchase wmsPurchase);

    /**
     * 修改数据
     *
     * @param wmsPurchase 实例对象
     * @return 实例对象
     */
    WmsPurchase update(WmsPurchase wmsPurchase);

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