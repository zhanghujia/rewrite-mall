package com.jia.umsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.umsmall.mapper.UmsMemberLoginLogMapper;
import com.jia.umsmall.model.UmsMemberLoginLog;
import com.jia.umsmall.service.UmsMemberLoginLogService;
import org.springframework.stereotype.Service;

/**
 * 会员登录记录(UmsMemberLoginLog)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:47:24
 */

@Service("umsMemberLoginLogService")
public class UmsMemberLoginLogServiceImpl implements UmsMemberLoginLogService {

    private final UmsMemberLoginLogMapper umsMemberLoginLogMapper;

    public UmsMemberLoginLogServiceImpl(UmsMemberLoginLogMapper umsMemberLoginLogMapper) {
        this.umsMemberLoginLogMapper = umsMemberLoginLogMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberLoginLog queryById(Long id) {
        return this.umsMemberLoginLogMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param umsMemberLoginLog 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberLoginLog insert(UmsMemberLoginLog umsMemberLoginLog) {
        this.umsMemberLoginLogMapper.insert(umsMemberLoginLog);
        return umsMemberLoginLog;
    }

    /**
     * 修改数据
     *
     * @param umsMemberLoginLog 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberLoginLog update(UmsMemberLoginLog umsMemberLoginLog) {
        this.umsMemberLoginLogMapper.updateByPrimaryKeySelective(umsMemberLoginLog);
        return this.queryById(umsMemberLoginLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberLoginLogMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.umsMemberLoginLogMapper::selectAll);
    }
}