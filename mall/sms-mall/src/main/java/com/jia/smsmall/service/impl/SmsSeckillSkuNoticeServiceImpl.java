package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsSeckillSkuNoticeMapper;
import com.jia.smsmall.model.SmsSeckillSkuNotice;
import com.jia.smsmall.service.SmsSeckillSkuNoticeService;
import org.springframework.stereotype.Service;

/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:23:15
 */

@Service("smsSeckillSkuNoticeService")
public class SmsSeckillSkuNoticeServiceImpl implements SmsSeckillSkuNoticeService {

    private final SmsSeckillSkuNoticeMapper smsSeckillSkuNoticeMapper;

    public SmsSeckillSkuNoticeServiceImpl(SmsSeckillSkuNoticeMapper smsSeckillSkuNoticeMapper) {
        this.smsSeckillSkuNoticeMapper = smsSeckillSkuNoticeMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuNotice queryById(Long id) {
        return this.smsSeckillSkuNoticeMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsSeckillSkuNotice 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuNotice insert(SmsSeckillSkuNotice smsSeckillSkuNotice) {
        this.smsSeckillSkuNoticeMapper.insert(smsSeckillSkuNotice);
        return smsSeckillSkuNotice;
    }

    /**
     * 修改数据
     *
     * @param smsSeckillSkuNotice 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillSkuNotice update(SmsSeckillSkuNotice smsSeckillSkuNotice) {
        this.smsSeckillSkuNoticeMapper.updateByPrimaryKeySelective(smsSeckillSkuNotice);
        return this.queryById(smsSeckillSkuNotice.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSeckillSkuNoticeMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsSeckillSkuNoticeMapper::selectAll);
    }
}