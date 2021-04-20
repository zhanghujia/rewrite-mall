package com.jia.omsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.omsmall.model.OmsPaymentInfo;
import org.springframework.stereotype.Component;


/**
 * 支付信息表(OmsPaymentInfo)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:01:14
 */

@Component
public interface OmsPaymentInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OmsPaymentInfo queryById(Long id);

    /**
     * 新增数据
     *
     * @param omsPaymentInfo 实例对象
     * @return 实例对象
     */
    OmsPaymentInfo insert(OmsPaymentInfo omsPaymentInfo);

    /**
     * 修改数据
     *
     * @param omsPaymentInfo 实例对象
     * @return 实例对象
     */
    OmsPaymentInfo update(OmsPaymentInfo omsPaymentInfo);

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