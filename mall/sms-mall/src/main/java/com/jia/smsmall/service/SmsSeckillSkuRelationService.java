package com.jia.smsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.smsmall.model.SmsSeckillSkuRelation;
import org.springframework.stereotype.Component;


/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:23:27
 */

@Component
public interface SmsSeckillSkuRelationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsSeckillSkuRelation queryById(Long id);

    /**
     * 新增数据
     *
     * @param smsSeckillSkuRelation 实例对象
     * @return 实例对象
     */
    SmsSeckillSkuRelation insert(SmsSeckillSkuRelation smsSeckillSkuRelation);

    /**
     * 修改数据
     *
     * @param smsSeckillSkuRelation 实例对象
     * @return 实例对象
     */
    SmsSeckillSkuRelation update(SmsSeckillSkuRelation smsSeckillSkuRelation);

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