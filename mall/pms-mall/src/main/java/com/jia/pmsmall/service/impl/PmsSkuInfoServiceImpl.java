package com.jia.pmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.mapper.PmsSkuInfoMapper;
import com.jia.pmsmall.model.PmsSkuInfo;
import com.jia.pmsmall.service.PmsSkuInfoService;
import org.springframework.stereotype.Service;

/**
 * sku信息(PmsSkuInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:14:54
 */

@Service("pmsSkuInfoService")
public class PmsSkuInfoServiceImpl implements PmsSkuInfoService {

    private final PmsSkuInfoMapper pmsSkuInfoMapper;

    public PmsSkuInfoServiceImpl(PmsSkuInfoMapper pmsSkuInfoMapper) {
        this.pmsSkuInfoMapper = pmsSkuInfoMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param skuId 主键
     * @return 实例对象
     */
    @Override
    public PmsSkuInfo queryById(Long skuId) {
        return this.pmsSkuInfoMapper.selectByPrimaryKey(skuId);
    }

    /**
     * 新增数据
     *
     * @param pmsSkuInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuInfo insert(PmsSkuInfo pmsSkuInfo) {
        this.pmsSkuInfoMapper.insert(pmsSkuInfo);
        return pmsSkuInfo;
    }

    /**
     * 修改数据
     *
     * @param pmsSkuInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSkuInfo update(PmsSkuInfo pmsSkuInfo) {
        this.pmsSkuInfoMapper.updateByPrimaryKeySelective(pmsSkuInfo);
        return this.queryById(pmsSkuInfo.getSkuId());
    }

    /**
     * 通过主键删除数据
     *
     * @param skuId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long skuId) {
        return this.pmsSkuInfoMapper.deleteByPrimaryKey(skuId) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.pmsSkuInfoMapper::selectAll);
    }
}