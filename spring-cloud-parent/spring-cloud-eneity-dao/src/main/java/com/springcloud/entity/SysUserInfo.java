package com.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户信息表(SysUserInfo)实体类
 *
 * @author makejava
 * @since 2018-12-04 11:39:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class SysUserInfo implements Serializable {
    private static final long serialVersionUID = 861405298101815606L;
    /**
     * 自增主键
     */
    private Integer id;
    /**
     * 登录名
     */
    private String loginName;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 性别
     */
    private String sex;
    /**
     * 所属部门ID
     */
    private Integer depId;
    /**
     * 状态(1:正常,0:删除)
     */
    private String userStatus;
    /**
     * 是否启用(1:是,0:否)
     */
    private String isStart;
    /**
     * 创建时间
     */
    private Date creatTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 密码
     */
    private String loginPassword;


}