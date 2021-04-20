package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsSeckillPromotionMapper;
import com.jia.smsmall.model.SmsSeckillPromotion;
import com.jia.smsmall.service.SmsSeckillPromotionService;
import org.springframework.stereotype.Service;

/**
 * 秒杀活动(SmsSeckillPromotion)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:22:48
 */

@Service("smsSeckillPromotionService")
public class SmsSeckillPromotionServiceImpl implements SmsSeckillPromotionService {

    private final SmsSeckillPromotionMapper smsSeckillPromotionMapper;

    public SmsSeckillPromotionServiceImpl(SmsSeckillPromotionMapper smsSeckillPromotionMapper) {
        this.smsSeckillPromotionMapper = smsSeckillPromotionMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSeckillPromotion queryById(Long id) {
        return this.smsSeckillPromotionMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsSeckillPromotion 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillPromotion insert(SmsSeckillPromotion smsSeckillPromotion) {
        this.smsSeckillPromotionMapper.insert(smsSeckillPromotion);
        return smsSeckillPromotion;
    }

    /**
     * 修改数据
     *
     * @param smsSeckillPromotion 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillPromotion update(SmsSeckillPromotion smsSeckillPromotion) {
        this.smsSeckillPromotionMapper.updateByPrimaryKeySelective(smsSeckillPromotion);
        return this.queryById(smsSeckillPromotion.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSeckillPromotionMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsSeckillPromotionMapper::selectAll);
    }
}