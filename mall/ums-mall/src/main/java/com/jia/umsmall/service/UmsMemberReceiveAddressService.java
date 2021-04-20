package com.jia.umsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.umsmall.model.UmsMemberReceiveAddress;
import org.springframework.stereotype.Component;


/**
 * 会员收货地址(UmsMemberReceiveAddress)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:47:33
 */

@Component
public interface UmsMemberReceiveAddressService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UmsMemberReceiveAddress queryById(Long id);

    /**
     * 新增数据
     *
     * @param umsMemberReceiveAddress 实例对象
     * @return 实例对象
     */
    UmsMemberReceiveAddress insert(UmsMemberReceiveAddress umsMemberReceiveAddress);

    /**
     * 修改数据
     *
     * @param umsMemberReceiveAddress 实例对象
     * @return 实例对象
     */
    UmsMemberReceiveAddress update(UmsMemberReceiveAddress umsMemberReceiveAddress);

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