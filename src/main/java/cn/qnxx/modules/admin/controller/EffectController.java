package cn.qnxx.modules.admin.controller;

import cn.qnxx.modules.admin.entity.Effect;
import cn.qnxx.modules.admin.entity.SalesTop;
import cn.qnxx.modules.admin.service.IEffectService;
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
public class EffectController {
    @Autowired
    private IEffectService effectService;
    @RequestMapping("/findAllEffectAjax")
    public R findAllEffectAjax(String date,Integer ptype){
        Map<String, Object> datamap=new HashMap<String,Object>();
        datamap.put("date",date);
        datamap.put("ptype",ptype);
       /* List<SalesTop> list = salesTopService.selectList(datamap);*/
        List<Effect> list=effectService.selectList(datamap);
        //偏好集合
        List<String> likeList=new ArrayList<String>();
        //偏号名称集合
        Map<String,Object> map;
        List<Map<String, Object>> list1 = new ArrayList<Map<String,Object>>();
        for (Effect item:list) {
            map=new TreeMap<String,Object>();
            map.put("value",item.getPercentage());
            map.put("name", item.getEname());
            likeList.add(item.getEname());
            list1.add(map);
        }
      /*  Map<String,Object> mm=new TreeMap<String,Object>();
        mm.put("brandlist",likeList); //
        list1.add(mm);*/
       /* map.put("likelist",brandList); //
        map.put("percentlist",numList); //*/

        return R.success("sales",list1);
    }
}
