package cn.qnxx.modules.admin.service.impl;

import cn.qnxx.modules.admin.entity.Platform;
import cn.qnxx.modules.admin.entity.SalesTop;
import cn.qnxx.modules.admin.mapper.PlatformMapper;
import cn.qnxx.modules.admin.mapper.SalesTopMapper;
import cn.qnxx.modules.admin.service.IPlatformService;
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
public class PlatformServiceImpl extends ServiceImpl<PlatformMapper,Platform> implements IPlatformService {
    @Autowired
    private PlatformMapper platformMapper;

    public List<Platform> selectList(Map<String, Object> map){
        return platformMapper.selectByMap(map);
    }
}
