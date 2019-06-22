package cn.qnxx.modules.admin.controller;

import cn.qnxx.modules.admin.entity.Cp;
import cn.qnxx.modules.admin.entity.SalesTop;
import cn.qnxx.modules.admin.service.ICpService;
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
public class CpController {
    @Autowired
    private ICpService cpService;
    @RequestMapping("/findAllCpTop5Ajax")
    public R findAllCpTop5Ajax(String date){
        Map<String, Object> datamap=new HashMap<String,Object>();
        datamap.put("date",date);
        List<Cp> list=cpService.selectListTop5(datamap);
        //品牌集合
        List<String> brandList=new ArrayList<String>();
        //性价比集合
        List<String> numList=new ArrayList<String>();
        for (Cp item:list) {
            brandList.add(item.getBrand());
            numList.add(item.getCp());
        }
        Map<String,Object> map=new TreeMap<String,Object>();
        map.put("brandlist",brandList); //
        map.put("numlist",numList); //
        return R.success("sales",map);
    }
    @RequestMapping("/findAllCpLast5Ajax")
    public R findAllCpLast5Ajax(String date){
        Map<String, Object> datamap=new HashMap<String,Object>();
        datamap.put("date",date);
        List<Cp> list=cpService.selectListLast5(datamap);
        //品牌集合
        List<String> brandList=new ArrayList<String>();
        //性价比集合
        List<String> numList=new ArrayList<String>();
        for (Cp item:list) {
            brandList.add(item.getBrand());
            numList.add(item.getCp());
        }
        Map<String,Object> map=new TreeMap<String,Object>();
        map.put("brandlist",brandList); //
        map.put("numlist",numList); //
        return R.success("sales",map);
    }
}
