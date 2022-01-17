package cn.yhj.wei.mapper;


import cn.yhj.wei.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
	//登录
	public User login(@Param(value = "userCode") String userCode,
					  @Param(value = "userPassword") String userPassword);

	//分页
	public List<User> selectUserFenYe(@Param("userName") String userName);


	//添加用户
	public int addUser(User user);

	//删除用户
	public int delUser(@Param(value = "id")Integer id);


	//根据id查全部
	public User getUserById(@Param(value = "id") Integer id);

	//修改用户
	public int updateUser(User user);
}
