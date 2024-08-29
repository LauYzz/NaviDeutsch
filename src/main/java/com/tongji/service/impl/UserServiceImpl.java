package com.tongji.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tongji.entity.User;
import com.tongji.mapper.UserMapper;
import com.tongji.service.UserService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int changePasswd(String newPasswd, String userId) {
		return userMapper.changePasswd(newPasswd, userId);
	}

}
