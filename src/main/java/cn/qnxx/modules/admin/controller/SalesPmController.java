package cn.qnxx.modules.admin.controller;

import cn.qnxx.modules.admin.entity.SalesPm;
import cn.qnxx.modules.admin.service.ISalesPmService;
import cn.qnxx.modules.admin.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @Classname SalesPmController
 * @Description 微冷的雨训练营 www.cnblogs.com/weilengdeyu
 * @Date 2019/6/18 14:06
 * @Created by Happy-微冷的雨
 */
@RestController
@RequestMapping("/sales")
public class SalesPmController {
    @Autowired
    private ISalesPmService salesPmService;
    @RequestMapping("/findAllSalesAjax")
    public R findAllSalesAjax(String date){
        Map<String, Object> datamap=new HashMap<String,Object>();
        datamap.put("date",date);
        List<SalesPm> list = salesPmService.selectList(datamap);
       /* List<SalesPm> list = salesPmService.list();*/
        //销售平台集合
        List<String> dateList=new ArrayList<String>();
        //销量集合
        List<Integer> numList=new ArrayList<Integer>();
        for (SalesPm item:list) {
            dateList.add(item.getName());
            numList.add(item.getNum());
        }
        Map<String,Object> map=new TreeMap<String,Object>();
        map.put("datelist",dateList); //
        map.put("numlist",numList); //
        return R.success("sales",map);
    }
}
