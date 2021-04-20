package com.jia.pmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.mapper.PmsCommentReplayMapper;
import com.jia.pmsmall.model.PmsCommentReplay;
import com.jia.pmsmall.service.PmsCommentReplayService;
import org.springframework.stereotype.Service;

/**
 * 商品评价回复关系(PmsCommentReplay)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:14:42
 */

@Service("pmsCommentReplayService")
public class PmsCommentReplayServiceImpl implements PmsCommentReplayService {

    private final PmsCommentReplayMapper pmsCommentReplayMapper;

    public PmsCommentReplayServiceImpl(PmsCommentReplayMapper pmsCommentReplayMapper) {
        this.pmsCommentReplayMapper = pmsCommentReplayMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsCommentReplay queryById(Long id) {
        return this.pmsCommentReplayMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param pmsCommentReplay 实例对象
     * @return 实例对象
     */
    @Override
    public PmsCommentReplay insert(PmsCommentReplay pmsCommentReplay) {
        this.pmsCommentReplayMapper.insert(pmsCommentReplay);
        return pmsCommentReplay;
    }

    /**
     * 修改数据
     *
     * @param pmsCommentReplay 实例对象
     * @return 实例对象
     */
    @Override
    public PmsCommentReplay update(PmsCommentReplay pmsCommentReplay) {
        this.pmsCommentReplayMapper.updateByPrimaryKeySelective(pmsCommentReplay);
        return this.queryById(pmsCommentReplay.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsCommentReplayMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.pmsCommentReplayMapper::selectAll);
    }
}