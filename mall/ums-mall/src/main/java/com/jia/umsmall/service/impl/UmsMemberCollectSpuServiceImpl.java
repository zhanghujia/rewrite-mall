package com.jia.umsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.umsmall.mapper.UmsMemberCollectSpuMapper;
import com.jia.umsmall.model.UmsMemberCollectSpu;
import com.jia.umsmall.service.UmsMemberCollectSpuService;
import org.springframework.stereotype.Service;

/**
 * 会员收藏的商品(UmsMemberCollectSpu)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:46:58
 */

@Service("umsMemberCollectSpuService")
public class UmsMemberCollectSpuServiceImpl implements UmsMemberCollectSpuService {

    private final UmsMemberCollectSpuMapper umsMemberCollectSpuMapper;

    public UmsMemberCollectSpuServiceImpl(UmsMemberCollectSpuMapper umsMemberCollectSpuMapper) {
        this.umsMemberCollectSpuMapper = umsMemberCollectSpuMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSpu queryById(Long id) {
        return this.umsMemberCollectSpuMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param umsMemberCollectSpu 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSpu insert(UmsMemberCollectSpu umsMemberCollectSpu) {
        this.umsMemberCollectSpuMapper.insert(umsMemberCollectSpu);
        return umsMemberCollectSpu;
    }

    /**
     * 修改数据
     *
     * @param umsMemberCollectSpu 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMemberCollectSpu update(UmsMemberCollectSpu umsMemberCollectSpu) {
        this.umsMemberCollectSpuMapper.updateByPrimaryKeySelective(umsMemberCollectSpu);
        return this.queryById(umsMemberCollectSpu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberCollectSpuMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.umsMemberCollectSpuMapper::selectAll);
    }
}