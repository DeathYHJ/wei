package cn.yhj.wei.service;

import cn.yhj.wei.bean.User;
import com.github.pagehelper.PageInfo;


import java.util.List;

public interface UserService {
    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<User> UserFen(String userName,int pageNum, int pageSize);

    /**
     * 登录
     * @param userCode
     * @param userPassword
     * @return
     */
    public User login(String userCode, String userPassword);

    /**
     * 删除
     * @param id
     * @return
     * @throws Exception
     */
    public boolean delUser(Integer id) throws Exception;

    /**
     * 添加用户
     * @param user
     * @return
     */
    public boolean add(User user);

    public User getUserById(Integer id);

    public boolean update(User user);
}
