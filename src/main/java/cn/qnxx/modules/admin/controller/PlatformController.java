package cn.qnxx.modules.admin.controller;

import cn.qnxx.modules.admin.entity.Platform;
import cn.qnxx.modules.admin.entity.SalesTop;
import cn.qnxx.modules.admin.service.IPlatformService;
import cn.qnxx.modules.admin.service.ISalesTopService;
import cn.qnxx.modules.admin.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.*;

/**
 * @Classname SalesPmController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/6/18 14:06
 * @Created by Happy-微冷的雨
 */
@RestController
@RequestMapping("/sales")
public class PlatformController {
    @Autowired
    private IPlatformService platformService;
    @RequestMapping("/findAllSalesPlatformAjax")
    public R findAllSalesPlatformAjax(String date){
        Map<String, Object> datamap=new HashMap<String,Object>();
        datamap.put("date",date);
        List<Platform> list=platformService.list();
        Map<String,Object> map=new TreeMap<String,Object>();
        map.put("list",list);
        return R.success("sales",map);
    }
}
