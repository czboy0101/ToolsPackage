package com.wlq.modules.sys.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wlq.modules.sys.service.SysUserService;
import com.wlq.modules.tmp.mapper.SysUserMapper;
import com.wlq.modules.tmp.model.SysUser;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 管理员表 服务实现类
 * </p>
 *
 * @author MyBatisPlus
 * @since 2020-05-31
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
	
}
