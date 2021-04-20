package com.jia.pmsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.model.PmsAttr;
import org.springframework.stereotype.Component;


/**
 * 商品属性(PmsAttr)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:14:20
 */

@Component
public interface PmsAttrService {

    /**
     * 通过ID查询单条数据
     *
     * @param attrId 主键
     * @return 实例对象
     */
    PmsAttr queryById(Long attrId);

    /**
     * 新增数据
     *
     * @param pmsAttr 实例对象
     * @return 实例对象
     */
    PmsAttr insert(PmsAttr pmsAttr);

    /**
     * 修改数据
     *
     * @param pmsAttr 实例对象
     * @return 实例对象
     */
    PmsAttr update(PmsAttr pmsAttr);

    /**
     * 通过主键删除数据
     *
     * @param attrId 主键
     * @return 是否成功
     */
    boolean deleteById(Long attrId);

    /**
     * 分页查询多条数据
     *
     * @param page 页码
     * @param size 查询条数
     * @return 对象列表
     */
    PageInfo queryAllByLimit(int page, int size);


}