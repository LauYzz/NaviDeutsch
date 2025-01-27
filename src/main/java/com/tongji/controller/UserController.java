package com.tongji.controller;


import com.tongji.dto.PersonalInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import com.tongji.common.ReturnCode;
import com.tongji.common.ServerResponse;
//import com.pointedInquery.config.LoginInterceptor;
import com.tongji.entity.User;
import com.tongji.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	//对密码进行MD5加密
	private String getMD5Str(String passwd) {
		return DigestUtils.md5DigestAsHex(passwd.getBytes());
	}
	

	@PostMapping("/login")
	public ServerResponse<String> login(@RequestParam String userId,@RequestParam String passwd){
		//用户账号不存在

		System.out.println(userId);
		System.out.println(passwd);

		if(userId==null||userService.count()==0) {
			return ServerResponse.failure(ReturnCode.USERID_OR_PASSWORD_ERROR);
		}
		User user=userService.getById(userId);
		System.out.println("userId: "+getMD5Str(passwd));
		System.out.println("database: "+user.getPassword());
		//密码错误
		if(!getMD5Str(passwd).equals(user.getPassword())) {
			return ServerResponse.failure(ReturnCode.USERID_OR_PASSWORD_ERROR);
		}
		//String token=LoginInterceptor.GenerateToken(userId);
		return ServerResponse.success("ok");
	}

	@PostMapping("/register")
	public ServerResponse<Boolean> register(@RequestParam String userId,@RequestParam String passwd){
		System.out.println(userId);
		System.out.println(passwd);

		if(userId==null||passwd==null) {
			return ServerResponse.failure(ReturnCode.INFO_EMPTY);
		}
		//账号没有被注册过
		if(userService.getById(userId)!=null) {
			return ServerResponse.failure(ReturnCode.USERID_USED);
		}
		User user=new User();
		user.setPhone(userId);
		//对密码进行加密
		user.setPassword(getMD5Str(passwd));
		if(userService.save(user))
			return ServerResponse.success(true);
		else {
			return ServerResponse.failure(ReturnCode.RC999);
		}
	}

	//返回用户个人信息，同时将密码设为null避免泄露
	@PostMapping("/myInfo")
	public PersonalInfoDto myInfo(@RequestParam String userId) {
		User user = userService.getById(userId);
		PersonalInfoDto personalInfoDto=new PersonalInfoDto(user.getPhone(),user.getName(),user.getSchool());
		return personalInfoDto;
	}
	
	@PostMapping("/changeInfo")
	public boolean changeInfo(@RequestBody User user){
		return userService.saveOrUpdate(user);
	}


}
