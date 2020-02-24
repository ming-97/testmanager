package com.pctc.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionCourse;
import com.pctc.model.QuestionCourseChapter;
import com.pctc.model.QuestionCourseExample;
import com.pctc.model.QuestionCourseExample.Criteria;
import com.pctc.model.QuestionDailyExample;
import com.pctc.model.Teacher;
import com.pctc.service.QuestionBankService;
import com.pctc.service.QuestionCourseService;

import net.sf.jsqlparser.statement.update.Update;

@Controller
@RequestMapping("questionCourseManager")
public class QuestionCourseManager {

	@Autowired
	private QuestionCourseService questionCourseService;
	
	@Autowired
	private QuestionBankService questionBankService;
	
	
	//添加课程练习题目
	@RequestMapping("insertQuestionCourse")
	public String  insertQuestionCourse(HttpServletRequest request,QuestionCourse qCourse,Map<String , Object> map){
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
		if(qCourse!=null && !"".equals(qCourse)){
			qCourse.setQcDelete(false);
			qCourse.setQcCreateTime(new Date());
			qCourse.setQcQbid(str);
			Teacher teacher=(Teacher)request.getSession().getAttribute("teacher");//获取session中的值
			qCourse.setQcCreateBy(teacher.gettUsername());//设置默认的创建者
			qCourse.setQcInsid(teacher.gettInsid());
			questionCourseService.insertQuestionCourse(qCourse);
		}
		return "forward:../returnPage/toquestoinCourse";
	}
	
	
	//查询所有课程连练习题目
	@RequestMapping("selectAllQuestionCourse")
	public String selectAllQuestionCourse(QuestionCourseExample courseExample, Map<String, Object> map,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
		Criteria criteria=courseExample.createCriteria();
		criteria.andQcDeleteEqualTo(false);
		Page<QuestionCourse> page=PageHelper.startPage(pageNum,3);
		List<QuestionCourse> list =questionCourseService.selectAllQuestionCourse(courseExample);
		PageInfo<QuestionCourse> pageInfo=new PageInfo<QuestionCourse>(list,5);
		System.out.println(list);
		map.put("questionCourse", list);
		map.put("pageInfo", pageInfo);
		return "question/questionCourseList";	
	}
	
	
		//查看题目详情
		@RequestMapping("selectQuestionCourseByNameToPage")	
		public String selectQuestionCourseByName(QuestionCourse qCourse,Map<String, Object> map){
			String[] strings=qCourse.getQcQbid().split(",");
			List<QuestionBnak> list=new ArrayList<QuestionBnak>();
			QuestionBnak qBnak=null;
			for(int i=0;i<strings.length;i++){
				qBnak=questionBankService.getQusetionBankById(Long.parseLong(strings[i]));
				list.add(qBnak);
			}
			map.put("qBnaks", list);
			return "question/questioncoursechaptercontent";
		}
	
	
	
	//修改课程连习题目
	@RequestMapping("updateQuestionCourse")
	public String UpdateQuestionCourse(HttpServletRequest request,QuestionCourse qCourse,Map<String, Object> map){
		if(qCourse!=null&&!"".equals(qCourse))
			qCourse.setQcModifyTime(new Date());
			qCourse.setQcDelete(false);
			Teacher teacher=(Teacher)request.getSession().getAttribute("teacher");//获取session中的值
			qCourse.setQcModifyBy(teacher.gettUsername());
			questionCourseService.updateQuestionCourse(qCourse);
		return "redirect:../returnPage/toquestoinCourse";
	}
	
	
	
	//删除课程练习题目
	@ResponseBody
	@RequestMapping("deleteQuestionCourse")
	public int deleteQuestionCourse(QuestionCourse qCourse){
		int count=0;
		qCourse.setQcDelete(true);
		int i=questionCourseService.updateQuestionCourse(qCourse);
		if(i>0){
			count=1;
		}else{
			count=0;
		}
		return count;
	}
	
	
	
	
	
	
	//校验添加的题目是否在题库中
	@ResponseBody
	@RequestMapping("checkqcQbid")
	public boolean checkqcQbid(QuestionCourse qCourse){
		boolean exits=false;
		if(qCourse!=null&&!"".equals(qCourse.getQcQbid().trim())){
			String string=qCourse.getQcQbid();
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
			if("".equals(qCourse.getQcQbid().trim())){
				exits=false;
			}
				return exits;
	}
	
	
	
	
	
	//初始化时间函数
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
		       //true:允许输入空值，false:不能为空值    
	}
	
}
