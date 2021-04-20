package com.jia.umsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.umsmall.model.UmsMemberLevel;
import org.springframework.stereotype.Component;


/**
 * 会员等级(UmsMemberLevel)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:47:13
 */

@Component
public interface UmsMemberLevelService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMemberLevel queryById(Long id);

    /**
     * 新增数据
     *
     * @param umsMemberLevel 实例对象
     * @return 实例对象
     */
    UmsMemberLevel insert(UmsMemberLevel umsMemberLevel);

    /**
     * 修改数据
     *
     * @param umsMemberLevel 实例对象
     * @return 实例对象
     */
    UmsMemberLevel update(UmsMemberLevel umsMemberLevel);

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