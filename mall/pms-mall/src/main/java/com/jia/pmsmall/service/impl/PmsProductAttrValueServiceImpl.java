package com.jia.pmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.mapper.PmsProductAttrValueMapper;
import com.jia.pmsmall.model.PmsProductAttrValue;
import com.jia.pmsmall.service.PmsProductAttrValueService;
import org.springframework.stereotype.Service;

/**
 * spu属性值(PmsProductAttrValue)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:14:46
 */

@Service("pmsProductAttrValueService")
public class PmsProductAttrValueServiceImpl implements PmsProductAttrValueService {

    private final PmsProductAttrValueMapper pmsProductAttrValueMapper;

    public PmsProductAttrValueServiceImpl(PmsProductAttrValueMapper pmsProductAttrValueMapper) {
        this.pmsProductAttrValueMapper = pmsProductAttrValueMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PmsProductAttrValue queryById(Long id) {
        return this.pmsProductAttrValueMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param pmsProductAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttrValue insert(PmsProductAttrValue pmsProductAttrValue) {
        this.pmsProductAttrValueMapper.insert(pmsProductAttrValue);
        return pmsProductAttrValue;
    }

    /**
     * 修改数据
     *
     * @param pmsProductAttrValue 实例对象
     * @return 实例对象
     */
    @Override
    public PmsProductAttrValue update(PmsProductAttrValue pmsProductAttrValue) {
        this.pmsProductAttrValueMapper.updateByPrimaryKeySelective(pmsProductAttrValue);
        return this.queryById(pmsProductAttrValue.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.pmsProductAttrValueMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.pmsProductAttrValueMapper::selectAll);
    }
}