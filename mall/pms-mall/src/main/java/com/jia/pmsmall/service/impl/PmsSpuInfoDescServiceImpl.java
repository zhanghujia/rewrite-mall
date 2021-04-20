package com.jia.pmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.mapper.PmsSpuInfoDescMapper;
import com.jia.pmsmall.model.PmsSpuInfoDesc;
import com.jia.pmsmall.service.PmsSpuInfoDescService;
import org.springframework.stereotype.Service;

/**
 * spu信息介绍(PmsSpuInfoDesc)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:15:15
 */

@Service("pmsSpuInfoDescService")
public class PmsSpuInfoDescServiceImpl implements PmsSpuInfoDescService {

    private final PmsSpuInfoDescMapper pmsSpuInfoDescMapper;

    public PmsSpuInfoDescServiceImpl(PmsSpuInfoDescMapper pmsSpuInfoDescMapper) {
        this.pmsSpuInfoDescMapper = pmsSpuInfoDescMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param spuId 主键
     * @return 实例对象
     */
    @Override
    public PmsSpuInfoDesc queryById(Long spuId) {
        return this.pmsSpuInfoDescMapper.selectByPrimaryKey(spuId);
    }

    /**
     * 新增数据
     *
     * @param pmsSpuInfoDesc 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuInfoDesc insert(PmsSpuInfoDesc pmsSpuInfoDesc) {
        this.pmsSpuInfoDescMapper.insert(pmsSpuInfoDesc);
        return pmsSpuInfoDesc;
    }

    /**
     * 修改数据
     *
     * @param pmsSpuInfoDesc 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuInfoDesc update(PmsSpuInfoDesc pmsSpuInfoDesc) {
        this.pmsSpuInfoDescMapper.updateByPrimaryKeySelective(pmsSpuInfoDesc);
        return this.queryById(pmsSpuInfoDesc.getSpuId());
    }

    /**
     * 通过主键删除数据
     *
     * @param spuId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long spuId) {
        return this.pmsSpuInfoDescMapper.deleteByPrimaryKey(spuId) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.pmsSpuInfoDescMapper::selectAll);
    }
}