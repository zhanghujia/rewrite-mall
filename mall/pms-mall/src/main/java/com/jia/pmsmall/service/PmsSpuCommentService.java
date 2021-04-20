package com.jia.pmsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.model.PmsSpuComment;
import org.springframework.stereotype.Component;


/**
 * 商品评价(PmsSpuComment)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:15:01
 */

@Component
public interface PmsSpuCommentService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSpuComment queryById(Long id);

    /**
     * 新增数据
     *
     * @param pmsSpuComment 实例对象
     * @return 实例对象
     */
    PmsSpuComment insert(PmsSpuComment pmsSpuComment);

    /**
     * 修改数据
     *
     * @param pmsSpuComment 实例对象
     * @return 实例对象
     */
    PmsSpuComment update(PmsSpuComment pmsSpuComment);

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