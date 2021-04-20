package com.jia.smsmall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jia.smsmall.mapper.SmsSeckillSessionMapper;
import com.jia.smsmall.model.SmsSeckillSession;
import com.jia.smsmall.service.SmsSeckillSessionService;
import org.springframework.stereotype.Service;

/**
 * 秒杀活动场次(SmsSeckillSession)表服务实现类
 *
 * @author makejava
 * @since 2020-10-15 14:23:01
 */

@Service("smsSeckillSessionService")
public class SmsSeckillSessionServiceImpl implements SmsSeckillSessionService {

    private final SmsSeckillSessionMapper smsSeckillSessionMapper;

    public SmsSeckillSessionServiceImpl(SmsSeckillSessionMapper smsSeckillSessionMapper) {
        this.smsSeckillSessionMapper = smsSeckillSessionMapper;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SmsSeckillSession queryById(Long id) {
        return this.smsSeckillSessionMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增数据
     *
     * @param smsSeckillSession 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillSession insert(SmsSeckillSession smsSeckillSession) {
        this.smsSeckillSessionMapper.insert(smsSeckillSession);
        return smsSeckillSession;
    }

    /**
     * 修改数据
     *
     * @param smsSeckillSession 实例对象
     * @return 实例对象
     */
    @Override
    public SmsSeckillSession update(SmsSeckillSession smsSeckillSession) {
        this.smsSeckillSessionMapper.updateByPrimaryKeySelective(smsSeckillSession);
        return this.queryById(smsSeckillSession.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.smsSeckillSessionMapper.deleteByPrimaryKey(id) > 0;
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
        return PageHelper.startPage(page, size).doSelectPageInfo(this.smsSeckillSessionMapper::selectAll);
    }
}