package cn.qnxx.modules.admin.controller;

import cn.qnxx.modules.admin.service.IUserService;
import cn.qnxx.modules.admin.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname UserController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/6/17 17:05
 * @Created by Happy-微冷的雨
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    //1.1 登录
    @RequestMapping("/login")
    public  R login(String username, String password, HttpSession session){
        Map<String,Object> map = new HashMap<>();
        if (StringUtils.isEmpty(username)){
            return R.error("用户名不能为空");
        }
        if (StringUtils.isEmpty(password)){
            return R.error("密码不能为空");
        }
        session.setAttribute("uinfo",username);
        return userService.getUser(map);
    }
    //1.2 注销
    @RequestMapping("/logout")
    public R logout(HttpSession session){
        //清除session
        session.removeAttribute("uinfo");
        //跳转到登录
        return R.success("logout ok");
    }

    //1.3 获取session中的内容
    @RequestMapping("/getSessionData")
    public R getSessionData(HttpSession session){
        Object uinfo = session.getAttribute("uinfo");
        if (uinfo!=null)
        return R.success(uinfo.toString());
        return null;
    }

}
