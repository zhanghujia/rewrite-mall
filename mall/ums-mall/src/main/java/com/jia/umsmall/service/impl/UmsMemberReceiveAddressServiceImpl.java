package com.jia.umsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.umsmall.mapper.UmsMemberReceiveAddressMapper;
import com.jia.umsmall.model.UmsMemberReceiveAddress;
import com.jia.umsmall.service.UmsMemberReceiveAddressService;
import org.springframework.stereotype.Service;

/**
 * 会员收货地址(UmsMemberReceiveAddress)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:47:35
 */

@Service("umsMemberReceiveAddressService")
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {

    private final UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    public UmsMemberReceiveAddressServiceImpl(UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper) {
        this.umsMemberReceiveAddressMapper = umsMemberReceiveAddressMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberReceiveAddress queryById(Long id) {
        return this.umsMemberReceiveAddressMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param umsMemberReceiveAddress 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberReceiveAddress insert(UmsMemberReceiveAddress umsMemberReceiveAddress) {
        this.umsMemberReceiveAddressMapper.insert(umsMemberReceiveAddress);
        return umsMemberReceiveAddress;
    }

    /**
     * 修改数据
     *
     * @param umsMemberReceiveAddress 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberReceiveAddress update(UmsMemberReceiveAddress umsMemberReceiveAddress) {
        this.umsMemberReceiveAddressMapper.updateByPrimaryKeySelective(umsMemberReceiveAddress);
        return this.queryById(umsMemberReceiveAddress.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberReceiveAddressMapper.deleteByPrimaryKey(id) > 0;
    }

    /**
     * 分页查询多条数据
     *
     * @param page 页码
     * @param size 查询条数
     * @return 对象列表
     */
    @Override
    public PageInfo queryAllByLimit(int page, int size) {
        return PageHelper.startPage(page, size).doSelectPageInfo(this.umsMemberReceiveAddressMapper::selectAll);
    }
}