package cn.qnxx.modules.admin.service;

import cn.qnxx.modules.admin.entity.Cp;
import cn.qnxx.modules.admin.entity.SalesPm;
import cn.qnxx.modules.admin.util.R;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @Classname IUserService
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/6/17 16:31
 * @Created by Happy-微冷的雨
 */
public interface ICpService extends IService<Cp>{
    public R findAllCp();
    public List<Cp> selectListTop5(Map<String, Object> map);
    public List<Cp> selectListLast5(Map<String, Object> map);

}
