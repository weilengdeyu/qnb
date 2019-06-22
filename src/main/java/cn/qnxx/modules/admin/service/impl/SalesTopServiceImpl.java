package cn.qnxx.modules.admin.service.impl;

import cn.qnxx.modules.admin.entity.SalesPm;
import cn.qnxx.modules.admin.entity.SalesTop;
import cn.qnxx.modules.admin.mapper.SalesPmrMapper;
import cn.qnxx.modules.admin.mapper.SalesTopMapper;
import cn.qnxx.modules.admin.service.ISalesPmService;
import cn.qnxx.modules.admin.service.ISalesTopService;
import cn.qnxx.modules.admin.util.R;
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
public class SalesTopServiceImpl extends ServiceImpl<SalesTopMapper,SalesTop> implements ISalesTopService {
    @Autowired
    private SalesTopMapper salesTopMapper;

    public List<SalesTop> selectList(Map<String, Object> map){
       /* return salesTopMapper.selectByMap(map);*/
       return salesTopMapper.selectList(new QueryWrapper<SalesTop>()
               .eq("date",map.get("date")).orderByDesc("amount").last("limit 10"));
    }
}
