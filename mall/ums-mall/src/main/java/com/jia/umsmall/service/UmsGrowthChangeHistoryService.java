package com.jia.umsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.umsmall.model.UmsGrowthChangeHistory;
import org.springframework.stereotype.Component;


/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:46:38
 */

@Component
public interface UmsGrowthChangeHistoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsGrowthChangeHistory queryById(Long id);

    /**
     * 新增数据
     *
     * @param umsGrowthChangeHistory 实例对象
     * @return 实例对象
     */
    UmsGrowthChangeHistory insert(UmsGrowthChangeHistory umsGrowthChangeHistory);

    /**
     * 修改数据
     *
     * @param umsGrowthChangeHistory 实例对象
     * @return 实例对象
     */
    UmsGrowthChangeHistory update(UmsGrowthChangeHistory umsGrowthChangeHistory);

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