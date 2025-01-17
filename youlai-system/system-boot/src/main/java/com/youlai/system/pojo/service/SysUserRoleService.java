package com.youlai.system.pojo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.youlai.system.pojo.entity.SysUserRole;

import java.util.List;

public interface SysUserRoleService extends IService<SysUserRole> {

    /**
     * 保存用户角色
     *
     * @param userId
     * @param roleIds
     * @return
     */
     boolean saveUserRoles(Long userId, List<Long> roleIds);
}
