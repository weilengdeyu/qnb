package cn.qnxx.modules.admin.controller;

import cn.qnxx.modules.admin.entity.SalesTop;
import cn.qnxx.modules.admin.entity.VolumeBrand;
import cn.qnxx.modules.admin.service.ISalesTopService;
import cn.qnxx.modules.admin.service.IVolumeBrandService;
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
public class VolumeBrandController {
    @Autowired
    private IVolumeBrandService volumeBrandService;

    @RequestMapping("/findAllVolumeBrandpAjax")
    public R findAllVolumeBrandpAjax(String date){
        Map<String, Object> datamap=new HashMap<String,Object>();
        datamap.put("date",date);
        List<VolumeBrand> list=volumeBrandService.selectList(datamap);
        //品牌集合
        List<String> brandList=new ArrayList<String>();
        //销售额集合
        List<Integer> numList=new ArrayList<Integer>();
        for (VolumeBrand item:list) {
            brandList.add(item.getPlatform());
            numList.add(item.getCount());
        }
        Map<String,Object> map=new TreeMap<String,Object>();
        map.put("brandlist",brandList); //
        map.put("numlist",numList); //
        return R.success("sales",map);
    }
    //获取所有的品牌名称
    @RequestMapping("/getDataByBrand")
    public R getDataByBrand(String brand){
        Map<String, Object> datamap=new HashMap<String,Object>();
        datamap.put("commodity",brand);
        List<VolumeBrand> list=volumeBrandService.selectList(datamap);
        //品牌集合
        List<String> brandList=new ArrayList<String>();
        for (VolumeBrand item:list) {
            brandList.add(item.getCommodity());
        }
        Map<String,Object> map=new TreeMap<String,Object>();
        map.put("brandlist2",brandList); //
        return R.success("sales",map);
    }
    @RequestMapping("/getAllBrand")
    public R getAllBrand(){
        List<VolumeBrand> list=volumeBrandService.selectAll(null);
        Map<String,Object> map=new TreeMap<String,Object>();
        map.put("list",list); //
        return R.success("sales",map);
    }
}
