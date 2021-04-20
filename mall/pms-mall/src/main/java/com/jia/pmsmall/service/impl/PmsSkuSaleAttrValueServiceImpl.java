package com.jia.pmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.mapper.PmsSkuSaleAttrValueMapper;
import com.jia.pmsmall.model.PmsSkuSaleAttrValue;
import com.jia.pmsmall.service.PmsSkuSaleAttrValueService;
import org.springframework.stereotype.Service;

/**
 * sku销售属性&值(PmsSkuSaleAttrValue)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:14:58
 */

@Service("pmsSkuSaleAttrValueService")
public class PmsSkuSaleAttrValueServiceImpl implements PmsSkuSaleAttrValueService {

    private final PmsSkuSaleAttrValueMapper pmsSkuSaleAttrValueMapper;

    public PmsSkuSaleAttrValueServiceImpl(PmsSkuSaleAttrValueMapper pmsSkuSaleAttrValueMapper) {
        this.pmsSkuSaleAttrValueMapper = pmsSkuSaleAttrValueMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSkuSaleAttrValue queryById(Long id) {
        return this.pmsSkuSaleAttrValueMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuSaleAttrValue insert(PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        this.pmsSkuSaleAttrValueMapper.insert(pmsSkuSaleAttrValue);
        return pmsSkuSaleAttrValue;
    }

    /**
     * 修改数据
     *
     * @param pmsSkuSaleAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuSaleAttrValue update(PmsSkuSaleAttrValue pmsSkuSaleAttrValue) {
        this.pmsSkuSaleAttrValueMapper.updateByPrimaryKeySelective(pmsSkuSaleAttrValue);
        return this.queryById(pmsSkuSaleAttrValue.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSkuSaleAttrValueMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.pmsSkuSaleAttrValueMapper::selectAll);
    }
}