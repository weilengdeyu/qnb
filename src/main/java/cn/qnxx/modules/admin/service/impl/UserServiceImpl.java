package cn.qnxx.modules.admin.service.impl;

import cn.qnxx.modules.admin.entity.User;
import cn.qnxx.modules.admin.mapper.UserMapper;
import cn.qnxx.modules.admin.service.IUserService;
import cn.qnxx.modules.admin.util.R;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Classname UserServiceImpl
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/6/17 16:32
 * @Created by Happy-微冷的雨
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public R getUser(Map<String, Object> map) {
        List<User> users = userMapper.selectByMap(map);
        if (users.size()>0){
            return R.success("success",users.get(0));
        }
        return R.success("success",null);
    }
}
