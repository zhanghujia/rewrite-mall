package com.jia.pmsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.pmsmall.mapper.PmsCategoryMapper;
import com.jia.pmsmall.model.PmsCategory;
import com.jia.pmsmall.service.PmsCategoryService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 商品三级分类(PmsCategory)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:14:38
 */

@Service("pmsCategoryService")
public class PmsCategoryServiceImpl implements PmsCategoryService {

    private final PmsCategoryMapper pmsCategoryMapper;

    public PmsCategoryServiceImpl(PmsCategoryMapper pmsCategoryMapper) {
        this.pmsCategoryMapper = pmsCategoryMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param catId 主键
     * @return 实例对象
     */
    @Override
    public PmsCategory queryById(Long catId) {
        return this.pmsCategoryMapper.selectByPrimaryKey(catId);
    }

    /**
     * 新增数据
     *
     * @param pmsCategory 实例对象
     * @return 实例对象
     */
    @Override
    public PmsCategory insert(PmsCategory pmsCategory) {
        this.pmsCategoryMapper.insert(pmsCategory);
        return pmsCategory;
    }

    /**
     * 修改数据
     *
     * @param pmsCategory 实例对象
     * @return 实例对象
     */
    @Override
    public PmsCategory update(PmsCategory pmsCategory) {
        this.pmsCategoryMapper.updateByPrimaryKeySelective(pmsCategory);
        return this.queryById(pmsCategory.getCatId());
    }

    /**
     * 通过主键删除数据
     *
     * @param catId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long catId) {
        return this.pmsCategoryMapper.deleteByPrimaryKey(catId) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.pmsCategoryMapper::selectAll);
    }

    @Override
    public List<PmsCategory> queryAllByTree() {
        List<PmsCategory> pmsCategories = pmsCategoryMapper.selectAll();
        List<PmsCategory> collect = pmsCategories.stream()
                .filter(pmsCategory -> pmsCategory.getParentCid() == 0)
                .peek((menu) -> menu.setChildren(getChildren(menu, pmsCategories)))
                .sorted(Comparator.comparingInt(menu -> (menu.getSort() == null ? 0 : menu.getSort())))
                .collect(Collectors.toList());
        return collect;
    }

    private List<PmsCategory> getChildren(PmsCategory root, List<PmsCategory> all) {
        List<PmsCategory> collect = all.stream()
                .filter(pmsCategory -> pmsCategory.getParentCid().equals(root.getCatId()))
                .peek(pmsCategory -> pmsCategory.setChildren(getChildren(pmsCategory, all)))
                .sorted(Comparator.comparingInt(pmsCategory -> (pmsCategory.getSort() == null ? 0 : pmsCategory.getSort())))
                .collect(Collectors.toList());
        return collect;
    }

}