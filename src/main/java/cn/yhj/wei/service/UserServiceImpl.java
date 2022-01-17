package cn.yhj.wei.service;

import cn.yhj.wei.bean.User;
import cn.yhj.wei.mapper.UserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @package: cn.yhj.naoshi.service
 * @ClassName: UserService
 * @author: yhj.
 * @date : 2022-01-10 00:11
 **/

@Service
public class UserServiceImpl implements UserService{
    @Resource
    UserMapper userMapper;

    //登录
    @Override
    public User login(String userCode, String userPassword) {
        return  userMapper.login(userCode,userPassword);
    }

    //分页
    @Override
    public PageInfo<User> UserFen(String userName,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> lists = userMapper.selectUserFenYe(userName);
        PageInfo<User> pageInfo = new PageInfo<User>(lists);
        return pageInfo;
    }

    //删除
    @Override
    public boolean delUser(Integer id) throws Exception {
        int Id = 0;
        try {
            Id = userMapper.delUser(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(Id>0){
            return true;
        }else{
            return false;
        }
    }

    //添加
    @Override
    public boolean add(User user) {
        if (userMapper.addUser(user)>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public User getUserById(Integer id){
        return userMapper.getUserById(id);
    }

    @Override
    public boolean update(User user) {
        if (userMapper.updateUser(user)>0){
            return true;
        }else{
            return false;
        }
    }
}
