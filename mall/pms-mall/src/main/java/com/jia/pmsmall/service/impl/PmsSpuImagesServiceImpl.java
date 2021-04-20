package com.jia.pmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.mapper.PmsSpuImagesMapper;
import com.jia.pmsmall.model.PmsSpuImages;
import com.jia.pmsmall.service.PmsSpuImagesService;
import org.springframework.stereotype.Service;

/**
 * spu图片(PmsSpuImages)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:15:06
 */

@Service("pmsSpuImagesService")
public class PmsSpuImagesServiceImpl implements PmsSpuImagesService {

    private final PmsSpuImagesMapper pmsSpuImagesMapper;

    public PmsSpuImagesServiceImpl(PmsSpuImagesMapper pmsSpuImagesMapper) {
        this.pmsSpuImagesMapper = pmsSpuImagesMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSpuImages queryById(Long id) {
        return this.pmsSpuImagesMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param pmsSpuImages 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuImages insert(PmsSpuImages pmsSpuImages) {
        this.pmsSpuImagesMapper.insert(pmsSpuImages);
        return pmsSpuImages;
    }

    /**
     * 修改数据
     *
     * @param pmsSpuImages 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuImages update(PmsSpuImages pmsSpuImages) {
        this.pmsSpuImagesMapper.updateByPrimaryKeySelective(pmsSpuImages);
        return this.queryById(pmsSpuImages.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSpuImagesMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.pmsSpuImagesMapper::selectAll);
    }
}