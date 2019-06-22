package cn.qnxx.modules.admin.service;

import cn.qnxx.modules.admin.entity.DailyCommentRanking;
import cn.qnxx.modules.admin.entity.SalesOneHourse;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @Classname IUserService
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/6/17 16:31
 * @Created by Happy-微冷的雨
 */
public interface SalesOneHourseService extends IService<SalesOneHourse>{
    public List<SalesOneHourse> selectList(Map<String, Object> map);
}
