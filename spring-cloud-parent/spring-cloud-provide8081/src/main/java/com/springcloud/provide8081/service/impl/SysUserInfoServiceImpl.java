package com.springcloud.provide8081.service.impl;

import com.springcloud.dao.SysUserInfoDao;
import com.springcloud.entity.SysUserInfo;
import com.springcloud.provide8081.service.SysUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户信息表(SysUserInfo)表服务实现类
 *
 * @author makejava
 * @since 2019-01-04 15:47:33
 */
@Service("sysUserInfoService")
@Transactional(rollbackFor = Exception.class)
public class SysUserInfoServiceImpl implements SysUserInfoService {

    @Autowired
    private SysUserInfoDao sysUserInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysUserInfo queryById(Integer id) {
        return sysUserInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysUserInfo> queryAllByLimit(int offset, int limit) {
        return sysUserInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysUserInfo 实例对象
     * @return 是否成功
     */
    @Override
    public boolean insert(SysUserInfo sysUserInfo) {
        return sysUserInfoDao.insert(sysUserInfo) > 0;
    }

    /**
     * 根据给定字段查询数据
     *
     * @param sysUserInfo 实例对象
     * @return 实例对象
     */
    @Override
    public List<SysUserInfo> queryAll(SysUserInfo sysUserInfo) {
        return sysUserInfoDao.queryAll(sysUserInfo);
    }

    /**
     * 修改数据
     *
     * @param sysUserInfo 实例对象
     * @return 是否成功
     */
    @Override
    public boolean update(SysUserInfo sysUserInfo) {
        return sysUserInfoDao.update(sysUserInfo) > 0;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return sysUserInfoDao.deleteById(id) > 0;
    }
}