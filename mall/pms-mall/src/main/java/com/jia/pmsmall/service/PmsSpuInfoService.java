package com.jia.pmsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.model.PmsSpuInfo;
import org.springframework.stereotype.Component;


/**
 * spu信息(PmsSpuInfo)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:15:10
 */

@Component
public interface PmsSpuInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSpuInfo queryById(Long id);

    /**
     * 新增数据
     *
     * @param pmsSpuInfo 实例对象
     * @return 实例对象
     */
    PmsSpuInfo insert(PmsSpuInfo pmsSpuInfo);

    /**
     * 修改数据
     *
     * @param pmsSpuInfo 实例对象
     * @return 实例对象
     */
    PmsSpuInfo update(PmsSpuInfo pmsSpuInfo);

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