package com.jia.wmsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.wmsmall.model.WmsWareOrderTaskDetail;
import org.springframework.stereotype.Component;


/**
 * 库存工作单(WmsWareOrderTaskDetail)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:29:51
 */

@Component
public interface WmsWareOrderTaskDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsWareOrderTaskDetail queryById(Long id);

    /**
     * 新增数据
     *
     * @param wmsWareOrderTaskDetail 实例对象
     * @return 实例对象
     */
    WmsWareOrderTaskDetail insert(WmsWareOrderTaskDetail wmsWareOrderTaskDetail);

    /**
     * 修改数据
     *
     * @param wmsWareOrderTaskDetail 实例对象
     * @return 实例对象
     */
    WmsWareOrderTaskDetail update(WmsWareOrderTaskDetail wmsWareOrderTaskDetail);

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