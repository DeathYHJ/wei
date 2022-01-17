package cn.yhj.wei.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

@ConfigurationProperties(prefix = "user")
@Component
@NoArgsConstructor   //无参构造方法
@ToString //自动生成toString方法
@Data  //生成get和set，toString等函数
public class User {
	private Integer id; //id
	private String userCode; //用户编码
	private String userName; //用户名称
	private String userPassword; //用户密码
	private Integer gender;  //性别
	private Date birthday;  //出生日期
	private String phone;   //电话
	private String address; //地址
	private Integer userRole;    //用户角色
	private Integer createdBy;   //创建者
	private Date creationDate; //创建时间
	private Integer modifyBy;     //更新者
	private Date modifyDate;   //更新时间
	private Integer age;//年龄

	public void setAge(Integer age) {
		this.age = age;
	}

	public User(String userName, String userPassword){
		this.userName = userName;
		this.userPassword = userPassword;
	}

}
