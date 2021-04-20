package com.jia.pmsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.model.PmsCommentReplay;
import org.springframework.stereotype.Component;


/**
 * 商品评价回复关系(PmsCommentReplay)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:14:41
 */

@Component
public interface PmsCommentReplayService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsCommentReplay queryById(Long id);

    /**
     * 新增数据
     *
     * @param pmsCommentReplay 实例对象
     * @return 实例对象
     */
    PmsCommentReplay insert(PmsCommentReplay pmsCommentReplay);

    /**
     * 修改数据
     *
     * @param pmsCommentReplay 实例对象
     * @return 实例对象
     */
    PmsCommentReplay update(PmsCommentReplay pmsCommentReplay);

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