package cn.qnxx.modules.admin.service.impl;

import cn.qnxx.modules.admin.entity.Cp;
import cn.qnxx.modules.admin.entity.Effect;
import cn.qnxx.modules.admin.entity.SalesPm;
import cn.qnxx.modules.admin.mapper.CpMapper;
import cn.qnxx.modules.admin.mapper.SalesPmrMapper;
import cn.qnxx.modules.admin.service.ICpService;
import cn.qnxx.modules.admin.service.ISalesPmService;
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
public class CpServiceImpl extends ServiceImpl<CpMapper,Cp> implements ICpService {
    @Autowired
    private CpMapper cpMapper;
    @Override
    public R findAllCp() {
        return null;
    }

    @Override
    public List<Cp> selectListTop5(Map<String, Object> map) {
        return cpMapper.selectList(new QueryWrapper<Cp>()
                .eq("date",map.get("date"))
                .orderByDesc("cp").last("limit 5"));
    }

    @Override
    public List<Cp> selectListLast5(Map<String, Object> map) {
        return cpMapper.selectList(new QueryWrapper<Cp>()
                .eq("date",map.get("date"))
                .orderByAsc("cp").last("limit 5"));
    }
}
