package com.jia.wmsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.wmsmall.model.WmsWareInfo;
import org.springframework.stereotype.Component;


/**
 * 仓库信息(WmsWareInfo)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:29:36
 */

@Component
public interface WmsWareInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsWareInfo queryById(Long id);

    /**
     * 新增数据
     *
     * @param wmsWareInfo 实例对象
     * @return 实例对象
     */
    WmsWareInfo insert(WmsWareInfo wmsWareInfo);

    /**
     * 修改数据
     *
     * @param wmsWareInfo 实例对象
     * @return 实例对象
     */
    WmsWareInfo update(WmsWareInfo wmsWareInfo);

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