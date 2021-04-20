package com.jia.pmsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.model.PmsProductAttrValue;
import org.springframework.stereotype.Component;


/**
 * spu属性值(PmsProductAttrValue)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:14:45
 */

@Component
public interface PmsProductAttrValueService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsProductAttrValue queryById(Long id);

    /**
     * 新增数据
     *
     * @param pmsProductAttrValue 实例对象
     * @return 实例对象
     */
    PmsProductAttrValue insert(PmsProductAttrValue pmsProductAttrValue);

    /**
     * 修改数据
     *
     * @param pmsProductAttrValue 实例对象
     * @return 实例对象
     */
    PmsProductAttrValue update(PmsProductAttrValue pmsProductAttrValue);

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