package cn.qnxx.modules.admin.service;

import cn.qnxx.modules.admin.entity.Effect;
import cn.qnxx.modules.admin.entity.SalesTop;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @Classname IUserService
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/6/17 16:31
 * @Created by Happy-微冷的雨
 */
public interface IEffectService extends IService<Effect>{
    public List<Effect> selectList(Map<String, Object> map);
}
