package cn.qnxx.modules.admin.quartz;

import cn.qnxx.modules.admin.entity.SalesPm;
import cn.qnxx.modules.admin.service.ISalesPmService;
import cn.qnxx.modules.admin.service.impl.WebSocketServer;
import cn.qnxx.modules.admin.util.R;
import com.alibaba.fastjson.JSON;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.*;

/**
 * 定义任务类
 */
public class QuartzDemo implements Job {
	@Autowired
	private ISalesPmService salesPmService;
    /**
	 * 任务被触发时所执行的方法
	 */
	public void execute(JobExecutionContext arg0) throws JobExecutionException {

		//System.out.println("Execute...."+new Date());
		Map<String, Object> datamap=new HashMap<String,Object>();
		datamap.put("date","2013-10-20");
		List<SalesPm> list = salesPmService.selectList(datamap);
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
		R r= R.success("sales",map);

		try {
			String result = JSON.toJSONString(r);
			WebSocketServer.sendInfo(result, "33");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}