package cn.qnxx.modules.admin.service.impl;

import cn.qnxx.modules.admin.entity.DailyCommentRanking;
import cn.qnxx.modules.admin.entity.SalesTop;
import cn.qnxx.modules.admin.mapper.DailyCommentRankingMapper;
import cn.qnxx.modules.admin.mapper.SalesTopMapper;
import cn.qnxx.modules.admin.service.IDailyCommentRankingService;
import cn.qnxx.modules.admin.service.ISalesTopService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
public class DailyCommentRankingServiceImpl extends ServiceImpl<DailyCommentRankingMapper,DailyCommentRanking> implements IDailyCommentRankingService {
    @Autowired
    private DailyCommentRankingMapper dailyCommentRankingMapper;

    public List<DailyCommentRanking> selectList(Map<String, Object> map){
       return dailyCommentRankingMapper.selectList(new QueryWrapper<DailyCommentRanking>()
               .eq("date",map.get("date")).orderByDesc("comments").last("limit 10"));
    }
}
