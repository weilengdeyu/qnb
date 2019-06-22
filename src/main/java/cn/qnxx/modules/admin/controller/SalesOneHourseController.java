package cn.qnxx.modules.admin.controller;

import cn.qnxx.modules.admin.entity.DailyCommentRanking;
import cn.qnxx.modules.admin.entity.SalesOneHourse;
import cn.qnxx.modules.admin.service.IDailyCommentRankingService;
import cn.qnxx.modules.admin.service.SalesOneHourseService;
import cn.qnxx.modules.admin.util.R;
import org.springframework.beans.factory.annotation.Autowired;
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
public class SalesOneHourseController {
    @Autowired
    private SalesOneHourseService salesOneHourseService;
    @RequestMapping("/findAllSalesOneHourseAjax")
    public R findAllSalesOneHourseAjax(String date){
        Map<String, Object> datamap=new HashMap<String,Object>();
        datamap.put("date",date);
        List<SalesOneHourse> list=salesOneHourseService.selectList(datamap);
        //时段集合
        List<Integer> timeList=new ArrayList<Integer>();
        //交易量集合
        List<Integer> numList=new ArrayList<Integer>();
        //交易额集合
        List<Double> valueList=new ArrayList<Double>();
        for (SalesOneHourse item:list) {
            timeList.add(item.getTimeslot());
            numList.add(item.getNumberoftransactions());
            valueList.add(item.getTurnover());
        }
        Map<String,Object> map=new TreeMap<String,Object>();
        map.put("timelist",timeList); // 时段集合
        map.put("numlist",numList); //  交易量集合
        map.put("valuelist",valueList);  //交易额集合
        return R.success("sales",map);
    }
}
