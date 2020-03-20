package com.lening.controller;/**
 * 创建人： 张金威
 * 创建时间： 2020/3/19 16:14
 * 简述：
 */

import com.lening.pojo.UserBean;
import com.lening.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * ━━━━━━神兽出没━━━━━━
 * 　　　┏┓　　　┏┓
 * 　　┏┛┻━━━┛┻┓
 * 　　┃　　　　　　　┃
 * 　　┃　　　━　　　┃
 * 　　┃　┳┛　┗┳　┃
 * 　　┃　　　　　　　┃
 * 　　┃　　　┻　　　┃
 * 　　┃　　　　　　　┃
 * 　　┗━┓　　　┏━┛
 * 　　　　┃　　　┃  神兽保佑
 * 　　　　┃　　　┃  代码无bug　　
 * 　　　　┃　　　┗━━━┓
 * 　　　　┃　　　　　　　┣┓
 * 　　　　┃　　　　　　　┏┛
 * 　　　　┗┓┓┏━┳┓┏┛
 * 　　　　　┃┫┫　┃┫┫
 * 　　　　　┗┻┛　┗┻┛
 * ━━━━━━高山仰止,景行行止.虽不能至,心向往之。━━━━━━
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("queryAll")
    @ResponseBody
    public List<UserBean> queryAll(){
        System.out.println("第一次修改");
        System.out.println("上传到github");
        List<UserBean> list = userService.queryAll();
        return list;
    }

}
