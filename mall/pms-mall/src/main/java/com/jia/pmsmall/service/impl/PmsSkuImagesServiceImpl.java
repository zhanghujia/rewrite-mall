package com.jia.pmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.mapper.PmsSkuImagesMapper;
import com.jia.pmsmall.model.PmsSkuImages;
import com.jia.pmsmall.service.PmsSkuImagesService;
import org.springframework.stereotype.Service;

/**
 * sku图片(PmsSkuImages)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:14:50
 */

@Service("pmsSkuImagesService")
public class PmsSkuImagesServiceImpl implements PmsSkuImagesService {

    private final PmsSkuImagesMapper pmsSkuImagesMapper;

    public PmsSkuImagesServiceImpl(PmsSkuImagesMapper pmsSkuImagesMapper) {
        this.pmsSkuImagesMapper = pmsSkuImagesMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSkuImages queryById(Long id) {
        return this.pmsSkuImagesMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param pmsSkuImages 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuImages insert(PmsSkuImages pmsSkuImages) {
        this.pmsSkuImagesMapper.insert(pmsSkuImages);
        return pmsSkuImages;
    }

    /**
     * 修改数据
     *
     * @param pmsSkuImages 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuImages update(PmsSkuImages pmsSkuImages) {
        this.pmsSkuImagesMapper.updateByPrimaryKeySelective(pmsSkuImages);
        return this.queryById(pmsSkuImages.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSkuImagesMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.pmsSkuImagesMapper::selectAll);
    }
}