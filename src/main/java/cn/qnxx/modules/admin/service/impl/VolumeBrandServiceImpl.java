package cn.qnxx.modules.admin.service.impl;

import cn.qnxx.modules.admin.entity.SalesTop;
import cn.qnxx.modules.admin.entity.VolumeBrand;
import cn.qnxx.modules.admin.mapper.SalesTopMapper;
import cn.qnxx.modules.admin.mapper.VolumeBrandMapper;
import cn.qnxx.modules.admin.service.ISalesTopService;
import cn.qnxx.modules.admin.service.IVolumeBrandService;
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
public class VolumeBrandServiceImpl extends ServiceImpl<VolumeBrandMapper,VolumeBrand> implements IVolumeBrandService {
    @Autowired
    private VolumeBrandMapper volumeBrandMapper;

    public List<VolumeBrand> selectList(Map<String, Object> map){
       return volumeBrandMapper.selectList(new QueryWrapper<VolumeBrand>()
               .eq("commodity",map.get("date")).groupBy("platform").select("platform","sum(count) as count"));
    }

    @Override
    public List<VolumeBrand> selectAll(Map<String, Object> map) {
        return volumeBrandMapper.selectList(new QueryWrapper<VolumeBrand>().last("limit 10"));
    }
}
