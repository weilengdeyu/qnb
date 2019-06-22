package cn.qnxx.modules.admin.service;

import cn.qnxx.modules.admin.entity.User;
import cn.qnxx.modules.admin.util.R;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * @Classname IUserService
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/6/17 16:31
 * @Created by Happy-微冷的雨
 */
public interface IUserService extends IService<User>{
    public R getUser(Map<String,Object> map);
}
