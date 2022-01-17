package cn.yhj.wei.controller;


import cn.yhj.wei.bean.User;
import cn.yhj.wei.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @package: cn.yhj.naoshi.controller
 * @ClassName: UserController
 * @author: yhj.
 * @date : 2022-01-10 00:13
 **/

@Controller
public class UserController {
    @Autowired
    UserService userService;


    @ResponseBody
    @GetMapping("/testPageHelper1")  //分页查询
    public PageInfo<User> testPageHelper1(@RequestParam(defaultValue="1")Integer currentPage,
                                          @RequestParam(defaultValue="10")Integer pageSize,
                                          @RequestParam(value = "userName",required = false) String userName){
        PageInfo<User> queryResult = userService.UserFen(userName,currentPage, pageSize);
        return queryResult;
    }


    /**
     * 删除用户
     * @param id
     * @return
     * @throws Exception
     */
    @ResponseBody
    @GetMapping("/delUser")
    public Map delete(@RequestParam("id") Integer id) throws Exception {
        boolean b = userService.delUser(id);
        Map<String,Object> map = new HashMap<>();
        map.put("flag",b);
        return map;
    }

    //跳转到用户页面
    @GetMapping("/ulist")
    public String ulist(){
        return "ulist";
    }


    /**
     * 进入到添加页
     * @return
     */
    @GetMapping("/uadd")
    public String uadd(){
        return "uadd";
    }


    /**
     * 添加到数据库
     * @param user
     * @return
     */
    @ResponseBody
    @PostMapping("/addUser")
    public Map saveProduct(User user){
        boolean b = userService.add(user);
        Map<String,Object> map = new HashMap<>();
        map.put("flag",b);
        return map;
    }

    /**
     * 进入到添加页
     * @return
     */
    @GetMapping("/uupda")
    public String uupda(){
        return "uupda";
    }

    /**
     * 根据ID查出页面信息
     * @param id
     * @return
     */
    @ResponseBody
    @PostMapping("/getUserById")
    public User getProductByIds(@RequestParam("id") Integer id){
        User user = userService.getUserById(id);
        return user;
    }

    /**
     * 修改操作到数据库
     * @param
     * @return
     */
    @ResponseBody
    @PostMapping("/updateUser")
    public Map editProducts(User user){
        boolean b = userService.update(user);
        Map<String,Object> map = new HashMap<>();
        map.put("flag",b);
        return map;
    }

}
