package com.jia.pmsmall.service;

import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.model.PmsSpuImages;
import org.springframework.stereotype.Component;


/**
 * spu图片(PmsSpuImages)表服务接口
 *
 * @author makejava
 * @since 2020-10-15 14:15:06
 */

@Component
public interface PmsSpuImagesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PmsSpuImages queryById(Long id);

    /**
     * 新增数据
     *
     * @param pmsSpuImages 实例对象
     * @return 实例对象
     */
    PmsSpuImages insert(PmsSpuImages pmsSpuImages);

    /**
     * 修改数据
     *
     * @param pmsSpuImages 实例对象
     * @return 实例对象
     */
    PmsSpuImages update(PmsSpuImages pmsSpuImages);

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