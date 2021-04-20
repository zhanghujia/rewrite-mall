package com.jia.wmsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.wmsmall.model.WmsWareOrderTask;
import org.springframework.stereotype.Component;


/**
 * 库存工作单(WmsWareOrderTask)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:29:43
 */

@Component
public interface WmsWareOrderTaskService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    WmsWareOrderTask queryById(Long id);

    /**
     * 新增数据
     *
     * @param wmsWareOrderTask 实例对象
     * @return 实例对象
     */
    WmsWareOrderTask insert(WmsWareOrderTask wmsWareOrderTask);

    /**
     * 修改数据
     *
     * @param wmsWareOrderTask 实例对象
     * @return 实例对象
     */
    WmsWareOrderTask update(WmsWareOrderTask wmsWareOrderTask);

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