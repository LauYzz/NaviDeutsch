package com.tongji.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tongji.entity.User;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
	//修改密码
	@Update("update user set password=#{newPasswd} where phone=#{userId}")
	public int changePasswd(String newPasswdd,String userId);

	@Select("SELECT name from user where phone=#{userId}")
    public String selectNameById(String userId);


}
