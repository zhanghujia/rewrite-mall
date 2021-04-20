package com.jia.umsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.umsmall.mapper.UmsMemberCollectSubjectMapper;
import com.jia.umsmall.model.UmsMemberCollectSubject;
import com.jia.umsmall.service.UmsMemberCollectSubjectService;
import org.springframework.stereotype.Service;

/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:47:05
 */

@Service("umsMemberCollectSubjectService")
public class UmsMemberCollectSubjectServiceImpl implements UmsMemberCollectSubjectService {

    private final UmsMemberCollectSubjectMapper umsMemberCollectSubjectMapper;

    public UmsMemberCollectSubjectServiceImpl(UmsMemberCollectSubjectMapper umsMemberCollectSubjectMapper) {
        this.umsMemberCollectSubjectMapper = umsMemberCollectSubjectMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSubject queryById(Long id) {
        return this.umsMemberCollectSubjectMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param umsMemberCollectSubject 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSubject insert(UmsMemberCollectSubject umsMemberCollectSubject) {
        this.umsMemberCollectSubjectMapper.insert(umsMemberCollectSubject);
        return umsMemberCollectSubject;
    }

    /**
     * 修改数据
     *
     * @param umsMemberCollectSubject 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSubject update(UmsMemberCollectSubject umsMemberCollectSubject) {
        this.umsMemberCollectSubjectMapper.updateByPrimaryKeySelective(umsMemberCollectSubject);
        return this.queryById(umsMemberCollectSubject.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberCollectSubjectMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.umsMemberCollectSubjectMapper::selectAll);
    }
}