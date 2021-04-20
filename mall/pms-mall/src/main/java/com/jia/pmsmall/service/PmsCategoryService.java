package com.jia.pmsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.model.PmsCategory;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * 商品三级分类(PmsCategory)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:14:37
 */

@Component
public interface PmsCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param catId 主键
     * @return 实例对象
     */
    PmsCategory queryById(Long catId);

    /**
     * 新增数据
     *
     * @param pmsCategory 实例对象
     * @return 实例对象
     */
    PmsCategory insert(PmsCategory pmsCategory);

    /**
     * 修改数据
     *
     * @param pmsCategory 实例对象
     * @return 实例对象
     */
    PmsCategory update(PmsCategory pmsCategory);

    /**
     * 通过主键删除数据
     *
     * @param catId 主键
     * @return 是否成功
     */
    boolean deleteById(Long catId);

    /**
     * 分页查询多条数据
     *
     * @param page 页码
     * @param size 查询条数
     * @return 对象列表
     */
    PageInfo queryAllByLimit(int page, int size);


    /**
     * 树形导航结构
     *
     * @return 实例对象数组
     */
    List<PmsCategory> queryAllByTree();


}