package com.jia.pmsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.model.PmsSpuInfoDesc;
import org.springframework.stereotype.Component;


/**
 * spu信息介绍(PmsSpuInfoDesc)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:15:14
 */

@Component
public interface PmsSpuInfoDescService {

    /**
     * 通过ID查询单条数据
     *
     * @param spuId 主键
     * @return 实例对象
     */
    PmsSpuInfoDesc queryById(Long spuId);

    /**
     * 新增数据
     *
     * @param pmsSpuInfoDesc 实例对象
     * @return 实例对象
     */
    PmsSpuInfoDesc insert(PmsSpuInfoDesc pmsSpuInfoDesc);

    /**
     * 修改数据
     *
     * @param pmsSpuInfoDesc 实例对象
     * @return 实例对象
     */
    PmsSpuInfoDesc update(PmsSpuInfoDesc pmsSpuInfoDesc);

    /**
     * 通过主键删除数据
     *
     * @param spuId 主键
     * @return 是否成功
     */
    boolean deleteById(Long spuId);

    /**
     * 分页查询多条数据
     *
     * @param page 页码
     * @param size 查询条数
     * @return 对象列表
     */
    PageInfo queryAllByLimit(int page, int size);


}