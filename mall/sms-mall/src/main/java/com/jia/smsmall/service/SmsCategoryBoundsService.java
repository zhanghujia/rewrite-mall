package com.jia.smsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.smsmall.model.SmsCategoryBounds;
import org.springframework.stereotype.Component;


/**
 * 商品分类积分设置(SmsCategoryBounds)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:21:29
 */

@Component
public interface SmsCategoryBoundsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsCategoryBounds queryById(Long id);

    /**
     * 新增数据
     *
     * @param smsCategoryBounds 实例对象
     * @return 实例对象
     */
    SmsCategoryBounds insert(SmsCategoryBounds smsCategoryBounds);

    /**
     * 修改数据
     *
     * @param smsCategoryBounds 实例对象
     * @return 实例对象
     */
    SmsCategoryBounds update(SmsCategoryBounds smsCategoryBounds);

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