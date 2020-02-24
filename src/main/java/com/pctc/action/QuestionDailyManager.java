package com.pctc.action;


import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionDaily;
import com.pctc.model.QuestionDailyExample;
import com.pctc.model.QuestionDailyExample.Criteria;
import com.pctc.model.Teacher;
import com.pctc.service.QuestionBankService;
import com.pctc.service.QuestionDailyService;
/**
 * 每日一练控制器
 * @author zw
 *
 */
@Controller
@RequestMapping("questionDailyManager")
public class QuestionDailyManager {

	@Autowired
	private QuestionDailyService qDailyService;
	
	@Autowired
	private QuestionBankService questionBankService;
	
	
	//添加每日一练题目
	@RequestMapping("insertQuestionDaily")
	public String addQuesitonDaily(HttpServletRequest request,QuestionDaily qDaily, Map<String, Object> map,Model model) {
		
		String[]  ssss=request.getParameterValues("names");
		 String str=new String();
		if(ssss.length>0){
		 for(int i=0;i<ssss.length;i++){//将字符串数字转化成字符串
			 if(i==ssss.length-1){
			 str+=ssss[i];
			 }
			 else{
				 str+=ssss[i]+",";
			 }
		 }
		}
		if (qDaily != null&& !"".equals(qDaily)) {
			QuestionDaily qDaily2=qDailyService.getQuestionDailyById(qDaily.getQdId());
			qDaily.setQdDelete(false);//设置默认不删除
			qDaily.setQdCreateTime(new Date());//设置创建时间
			qDaily.setQdQbid(str);
			Teacher teacher=(Teacher)request.getSession().getAttribute("teacher");//获取session中的值
			qDaily.setQdInsid(teacher.gettInsid());
			qDaily.setQdCreateBy(teacher.gettUsername());
			qDailyService.insertQuestionDaily(qDaily);//入库操作
			return "forward:../returnPage/toquestoinDaily";
		}
		else{
			return "redirect:../returnPage/toquestoinDaily";
		}
	}
	
	//查询所有每日一练信息
	@RequestMapping("selectAllQuesitonDaily")
	public String selectAllQuestionDaily(QuestionDailyExample dailyExample, Map<String, Object> map,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
		Criteria criteria = dailyExample.createCriteria();
		criteria.andQdDeleteEqualTo(false);
		Page<QuestionDaily> page=PageHelper.startPage(pageNum,3);
		List<QuestionDaily> list = qDailyService.getAllQuestionDaily(dailyExample);
		PageInfo<QuestionDaily> pageInfo = new PageInfo<QuestionDaily>(list, 5);
		map.put("questionDaily", list);
		map.put("pageInfo", pageInfo);
		return "question/questionDailyList";
	}
	
	//根据题目id的查询题目到页面
	@RequestMapping("selectQuestionDailyByNameToPage")
	public String selectQuestionDailyByNameToPage(QuestionDaily qDaily,Map<String, Object> map){
		QuestionDailyExample example=new QuestionDailyExample();
		Criteria criteria=example.createCriteria();
		criteria.andQdDeleteEqualTo(false);
		String[] strings=qDaily.getQdQbid().split(",");
		List<QuestionBnak> list=new ArrayList<QuestionBnak>();
		QuestionBnak qBnak=null;
		for(int i=0;i<strings.length;i++){
			qBnak=questionBankService.getQusetionBankById(Long.parseLong(strings[i]));
			list.add(qBnak);
		}
		map.put("qBnaks", list);
		return "question/questiondailycontent";
	}
	
	
	
	
	//当页面题目id失去焦点是出发该方法
	@ResponseBody
	@RequestMapping("checkQdqbId")
	public boolean CheckQdqbId(QuestionDaily qDaily){
		boolean exits=false;
		if(qDaily!=null&&!"".equals(qDaily.getQdQbid().trim())){
		String string=qDaily.getQdQbid();
		String[] str=string.split(",");//用字符串划分
		List<QuestionBnak> list=new ArrayList<QuestionBnak>();
		for (String string2:str){
			long i =Long.parseLong(string2);
			QuestionBnak qBnak=questionBankService.getQusetionBankById(i);//根据页面传递的题目号去题库中查询
			if(qBnak!=null&&!"".equals(qBnak)){
				list.add(qBnak);
			}
		}
		if(list.size()==str.length){
			exits=false;
		}
		else{
			exits=true;
		}	
		}
		if("".equals(qDaily.getQdQbid().trim())){
			exits=false;
		}
			return exits;
	}
	
	//跟新每日一练题目
	@RequestMapping("updateQuestionDaily")
	public String updateQuestionDaily(HttpServletRequest request,QuestionDaily qDaily,Map<String, Object> map){
		qDaily.setQdModifyTime(new Date());
		Teacher teacher=(Teacher)request.getSession().getAttribute("teacher");//获取session中的值
		qDaily.setQdModifyBy(teacher.gettUsername());
		qDailyService.updateQuestionDaily(qDaily);
		return "redirect:../returnPage/toquestoinDaily";
	}
	
	//删除每日一练题目
	@ResponseBody
	@RequestMapping(value="deleteQuestionDaily",method=RequestMethod.POST)
	public int deleteQuestionDaily(QuestionDaily qDaily){
		int count=0;
		qDaily.setQdDelete(true);
		int i=qDailyService.updateQuestionDaily(qDaily);
		if(i>0){
			count=1;
		}else{
			count =0;
		}
		return count;
	}
	
	
	
	

}
