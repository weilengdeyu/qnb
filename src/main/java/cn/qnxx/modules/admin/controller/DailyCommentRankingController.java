package cn.qnxx.modules.admin.controller;

import cn.qnxx.modules.admin.entity.DailyCommentRanking;
import cn.qnxx.modules.admin.entity.SalesTop;
import cn.qnxx.modules.admin.service.IDailyCommentRankingService;
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
public class DailyCommentRankingController {
    @Autowired
    private IDailyCommentRankingService dailyCommentRankingService;
    @RequestMapping("/findAllSalesDailyCommentRankingAjax")
    public R findAllSalesDailyCommentRankingAjax(String date){
        Map<String, Object> datamap=new HashMap<String,Object>();
        datamap.put("date",date);
        List<DailyCommentRanking> list=dailyCommentRankingService.selectList(datamap);
        //品牌集合
        List<String> brandList=new ArrayList<String>();
        //关注度集合
        List<Integer> numList=new ArrayList<Integer>();
        for (DailyCommentRanking item:list) {
            brandList.add(item.getBrand());
            numList.add(item.getComments());
        }
        Map<String,Object> map=new TreeMap<String,Object>();
        map.put("brandlist",brandList); //
        map.put("numlist",numList); //
        return R.success("sales",map);
    }
}
