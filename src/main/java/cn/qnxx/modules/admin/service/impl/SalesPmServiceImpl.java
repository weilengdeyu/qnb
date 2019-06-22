package cn.qnxx.modules.admin.service.impl;

import cn.qnxx.modules.admin.entity.SalesPm;
import cn.qnxx.modules.admin.entity.User;
import cn.qnxx.modules.admin.mapper.SalesPmrMapper;
import cn.qnxx.modules.admin.mapper.UserMapper;
import cn.qnxx.modules.admin.service.ISalesPmService;
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
public class SalesPmServiceImpl extends ServiceImpl<SalesPmrMapper,SalesPm> implements ISalesPmService {
    @Autowired
    private SalesPmrMapper salesPmrMapper;
    @Override
    public R findAllSalesPm() {
       return null;
    }
    public List<SalesPm> selectList(Map<String, Object> map){
        return salesPmrMapper.selectByMap(map);
    }
}
