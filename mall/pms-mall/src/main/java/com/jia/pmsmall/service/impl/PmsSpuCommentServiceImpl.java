package com.jia.pmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.mapper.PmsSpuCommentMapper;
import com.jia.pmsmall.model.PmsSpuComment;
import com.jia.pmsmall.service.PmsSpuCommentService;
import org.springframework.stereotype.Service;

/**
 * 商品评价(PmsSpuComment)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:15:02
 */

@Service("pmsSpuCommentService")
public class PmsSpuCommentServiceImpl implements PmsSpuCommentService {

    private final PmsSpuCommentMapper pmsSpuCommentMapper;

    public PmsSpuCommentServiceImpl(PmsSpuCommentMapper pmsSpuCommentMapper) {
        this.pmsSpuCommentMapper = pmsSpuCommentMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSpuComment queryById(Long id) {
        return this.pmsSpuCommentMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param pmsSpuComment 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuComment insert(PmsSpuComment pmsSpuComment) {
        this.pmsSpuCommentMapper.insert(pmsSpuComment);
        return pmsSpuComment;
    }

    /**
     * 修改数据
     *
     * @param pmsSpuComment 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuComment update(PmsSpuComment pmsSpuComment) {
        this.pmsSpuCommentMapper.updateByPrimaryKeySelective(pmsSpuComment);
        return this.queryById(pmsSpuComment.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSpuCommentMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.pmsSpuCommentMapper::selectAll);
    }
}