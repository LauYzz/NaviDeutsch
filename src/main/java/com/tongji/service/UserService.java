package com.tongji.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tongji.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface UserService extends IService<User> {
	public int changePasswd(String newPasswd, String userId);

}
