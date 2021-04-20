package com.jia.pmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.mapper.PmsSpuInfoMapper;
import com.jia.pmsmall.model.PmsSpuInfo;
import com.jia.pmsmall.service.PmsSpuInfoService;
import org.springframework.stereotype.Service;

/**
 * spu信息(PmsSpuInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:15:10
 */

@Service("pmsSpuInfoService")
public class PmsSpuInfoServiceImpl implements PmsSpuInfoService {

    private final PmsSpuInfoMapper pmsSpuInfoMapper;

    public PmsSpuInfoServiceImpl(PmsSpuInfoMapper pmsSpuInfoMapper) {
        this.pmsSpuInfoMapper = pmsSpuInfoMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsSpuInfo queryById(Long id) {
        return this.pmsSpuInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param pmsSpuInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuInfo insert(PmsSpuInfo pmsSpuInfo) {
        this.pmsSpuInfoMapper.insert(pmsSpuInfo);
        return pmsSpuInfo;
    }

    /**
     * 修改数据
     *
     * @param pmsSpuInfo 实例对象
     * @return 实例对象
     */
    @Override
    public PmsSpuInfo update(PmsSpuInfo pmsSpuInfo) {
        this.pmsSpuInfoMapper.updateByPrimaryKeySelective(pmsSpuInfo);
        return this.queryById(pmsSpuInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsSpuInfoMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.pmsSpuInfoMapper::selectAll);
    }
}