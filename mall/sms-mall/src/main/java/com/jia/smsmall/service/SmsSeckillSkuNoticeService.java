package com.jia.smsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.smsmall.model.SmsSeckillSkuNotice;
import org.springframework.stereotype.Component;


/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:23:13
 */

@Component
public interface SmsSeckillSkuNoticeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SmsSeckillSkuNotice queryById(Long id);

    /**
     * 新增数据
     *
     * @param smsSeckillSkuNotice 实例对象
     * @return 实例对象
     */
    SmsSeckillSkuNotice insert(SmsSeckillSkuNotice smsSeckillSkuNotice);

    /**
     * 修改数据
     *
     * @param smsSeckillSkuNotice 实例对象
     * @return 实例对象
     */
    SmsSeckillSkuNotice update(SmsSeckillSkuNotice smsSeckillSkuNotice);

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