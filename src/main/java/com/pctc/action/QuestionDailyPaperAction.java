package com.pctc.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;



import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.aspectj.weaver.patterns.IfPointcut.IfFalsePointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pctc.model.Grade;
import com.pctc.model.GradeExample;
import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionBnakExample;
import com.pctc.model.QuestionDaily;
import com.pctc.model.QuestionDailyExample;
import com.pctc.model.QuestionError;
import com.pctc.model.QuestionErrorExample;
import com.pctc.model.QuestionPaper;
import com.pctc.model.QuestionPaperExample;
import com.pctc.model.QuestionType;
import com.pctc.model.Student;
import com.pctc.model.StudentExample;
import com.pctc.model.QuestionPaperExample.Criteria;
import com.pctc.service.GradeService;
import com.pctc.service.QuestionBankService;
import com.pctc.service.QuestionDailyService;
import com.pctc.service.QuestionErrorService;
import com.pctc.service.QuestionPaperService;
import com.pctc.service.QuestionTypeService;
import com.pctc.service.StudentService;
/**
 * 每日一练控制器
 * @author zks
 *@date 2019-10-21
 *@version 0.1
 */

@Controller
@RequestMapping("questionDailyPaper")
//获取session值
@SessionAttributes(value={"student"}, types={String.class})
public class QuestionDailyPaperAction {
	
	    //注入每日一练service
		@Autowired
		private QuestionDailyService questionDailyService;
		
		//注入题库service
		@Autowired
		private QuestionBankService questionBankService;
		
		//注入题型service
		@Autowired
		private QuestionTypeService questionTypeService;
		
		//注入答题service
		@Autowired
		private QuestionPaperService questionPaperService;
		
		//注入学生service
		@Autowired
		private StudentService studentService;
		
		//注入错题service
		@Autowired
		private QuestionErrorService questionErrorService;
		
		//注入分数service
		@Autowired
		private GradeService gradeService;
		
		
		//1.1 跳转到每日一练测试选择页面
		@RequestMapping("questionDailyTestPage")
		public String questionDailyTestPage(Map<String, Object> map){
			QuestionDailyExample questionDailyExample=new QuestionDailyExample();
			com.pctc.model.QuestionDailyExample.Criteria criteria=questionDailyExample.createCriteria();
			//找出未被删除的测试
			criteria.andQdDeleteEqualTo(false);
			List<QuestionDaily> questionDailys=questionDailyService.getAllQuestionDaily(questionDailyExample);
			map.put("questionDailys", questionDailys);
			return "questionpapers/questionDailyChoose";
		}
		
		
		//1.2 跳转到每日一练测试页面
		@RequestMapping("questionDailyForm")
		public String questionDailyForm(HttpServletRequest request,Map<String, Object> map){
			long qdId=Long.parseLong(request.getParameter("qdId"));
			QuestionDaily questionDaily=new QuestionDaily();
			QuestionBnak questionBank=new QuestionBnak();
			List<QuestionBnak> questionBnakList1=new ArrayList<QuestionBnak>();
			List<QuestionBnak> questionBnakList2=new ArrayList<QuestionBnak>();
			List<QuestionBnak> questionBnakList3=new ArrayList<QuestionBnak>();
			//获取每日一练表中的所有试题信息
			questionDaily=questionDailyService.getQuestionDailyById(qdId);
			//页面存值questionDaily
			request.setAttribute("questionDaily", questionDaily);
			//从数据库取出所有试题id
			String qbIds[]=questionDaily.getQdQbid().split(",");
			
			
	    	for(int i=0;i<qbIds.length;i++){
	    		long qbId1=Long.parseLong(qbIds[i]);
	    		//从题库表获取相应的试题信息
	    		questionBank=questionBankService.getQusetionBankById(qbId1);
	    	
	    		//从题型表获取对应题型的id
	    		QuestionType questionType1=new QuestionType();
	    		QuestionType questionType2=new QuestionType();
	    		QuestionType questionType3=new QuestionType();
	    		
	    		questionType1=questionTypeService.getQuestionTypeName("选择题");
	    		questionType2=questionTypeService.getQuestionTypeName("填空题");
	    		questionType3=questionTypeService.getQuestionTypeName("判断题");
	    		request.setAttribute("questionType1", questionType1);
	    		request.setAttribute("questionType2", questionType2);
	    		request.setAttribute("questionType3", questionType3);
	    		
	    		
	    		//判断是否为选择题
	    		if(questionBank.getQbQtid()==questionType1.getQtId()){
	    			questionBnakList1.add(questionBank);
	    		}
	    		//判断是否为填空题
	    		else if(questionBank.getQbQtid()==questionType2.getQtId()){
	    			questionBnakList2.add(questionBank);
	    		}
	    		//判断是否为判断题
	    		else if(questionBank.getQbQtid()==questionType3.getQtId()){
	    			questionBnakList3.add(questionBank);
	    		}
	    		  																	
	    		
	    	}
	    	//存入map中
	    	map.put("questionBnakList1", questionBnakList1);
	    	map.put("questionBnakList2", questionBnakList2);
	    	map.put("questionBnakList3", questionBnakList3);
	    	
			return "questionpapers/questionDailyTest1";
			
		}
		
		//1.3答题信息入库验证
		@ResponseBody
		@RequestMapping("questionDailyFormInfo1")
		public boolean questionDailyFormInfo1(Map<String, Object> map,QuestionPaper questionPaper){
			//获取session中存贮的student对象
			Student student=(Student)map.get("student");
			boolean flag=false;
			
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			Criteria criteria=questionPaperExample.createCriteria();
			//判断输入信息是否为空或者含有空格
			if(questionPaper.getQpName()!=null&&!"".equals(questionPaper.getQpName().trim())){
				//判断该学生id下的试卷名称是否唯一
				criteria.andQpNameEqualTo(questionPaper.getQpName());
				criteria.andQpSidEqualTo(student.getsId());
			
			//根据输入信息从答题信息中查找
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			//如果找到了返回true，没有找到返回false
			if(questionPaperList.size()>0){
				flag=true;
				
			}else{
				flag=false;
			}
			}
			return flag;
		}
		
		//1.4 答题信息入库操作   以及错题入库操作
		@RequestMapping("questionDailyFormInfo")
		public String dailySuccess(HttpServletRequest request,Map<String, Object> map){
			//1.答题信息入库
			//获取session中存贮的student对象
			Student student1=(Student)map.get("student");
			
			long qdId=Long.parseLong(request.getParameter("qdId"));
			
			QuestionDaily questionDaily=new QuestionDaily();
			//获取每日一练表中的所有试题信息
			questionDaily=questionDailyService.getQuestionDailyById(qdId);
			//创建一个数组来存放试题id号
			String qdIds[]=questionDaily.getQdQbid().split(",");
			//循环插入map
			for(int i=0;i<qdIds.length;i++){
				
				QuestionPaper questionPaper=new QuestionPaper();
				questionPaper.setQpSid(student1.getsId());
				questionPaper.setQpQbid(Long.parseLong(qdIds[i]));
				questionPaper.setQpInsid(student1.getsInsid());
				questionPaper.setQpAnswer(request.getParameter(qdIds[i]));
				questionPaper.setQpName(request.getParameter("qpName"));
				questionPaper.setQpCreateBy(student1.getsId().toString());
				questionPaper.setQpCreateTime(new Date());
				questionPaper.setQpDelete(false);
				map.put(qdIds[i], questionPaper);
				
			}
			for(int i=0;i<qdIds.length;i++){
				/*System.err.println(map.get(qdIds[i]));*/
				//向答题表插入数据
				questionPaperService.addQuestionPaper((QuestionPaper)map.get(qdIds[i]));
			}
			
			
			//2.向错题库添加错题操作
			//设置查找条件
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			com.pctc.model.QuestionPaperExample.Criteria criteria1=questionPaperExample.createCriteria();
			criteria1.andQpDeleteEqualTo(false);
			//查询所有答题信息
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			//取出所有的答题信息
			QuestionBnak questionBnak=new QuestionBnak();
			for(int i=0;i<questionPaperList.size();i++){
				//循环取出每一个答题信息的试题id
				long qpQbid=questionPaperList.get(i).getQpQbid();
				//根据id从题库取出试题信息
				questionBnak=questionBankService.getQusetionBankById(qpQbid);
				//判断答题信息中学生答案是否与题库中试题答案一致
				//注意：字符串比较不能直接写“==”，要用equals方法，否则一直为false!!!
//				if(!questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
				//解决了答题为空的问题（可以提交白卷）
				if(!questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
					QuestionError questionError=new QuestionError();
					//注意questionErrorExample定义一定要放在循环中，让他每次循环构建新的对象
					QuestionErrorExample questionErrorExample=new QuestionErrorExample();
					com.pctc.model.QuestionErrorExample.Criteria criteria=questionErrorExample.createCriteria();
					criteria.andQeQpidEqualTo(qpQbid);
					criteria.andQeSidEqualTo(student1.getsId());
					//根据试题id查询错题信息
					List <QuestionError> questionErrorList=questionErrorService.getAllQuesionError(questionErrorExample);
					
					//判断错题库中是否有该试题（避免重复添加）
					if(questionErrorList.size()>0){
						
					}
				    else{
				    	
				    	Student student=new Student();
				    	student=studentService.getStudent(questionPaperList.get(i).getQpSid());
						questionError.setQeSid(questionPaperList.get(i).getQpSid());
						questionError.setQeQpid(questionPaperList.get(i).getQpQbid());
						questionError.setQeInsid(student.getsInsid());
						questionError.setQeCreateBy(student.getsUsername());
						questionError.setQeCreateTime(questionPaperList.get(i).getQpCreateTime());
						questionError.setQeDelete(false);
						//向错题表中添加错题
						questionErrorService.addQuestionError(questionError);
					}
				}	
			}
			
			
			return "questionpapers/questionInfoSuccess";
			
		}
		
	
		
		//2.1跳转选择学生id页面
		/*@RequestMapping("questionPaperPage")
		public String questionDailyFormInfo(Map<String, Object> map){
			StudentExample studentExample=new StudentExample();
			com.pctc.model.StudentExample.Criteria criteria=studentExample.createCriteria();
			//找出未被删除的学生信息
			criteria.andSDeleteEqualTo(false);
			//从学生表中得到符合条件全部的学生信息
			List<Student> studentList=studentService.getStudent(studentExample);
			map.put("studentList", studentList);
			return "questionPaperChooseSid";
		}*/
		
		//2.2跳转选择试卷名称页面
		@RequestMapping("questionPaperPage")
		public String questionDailyPaperToForm1(Map<String, Object> map){
			//获取session中存贮的student对象
			Student student=(Student)map.get("student");
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			Criteria criteria=questionPaperExample.createCriteria();
			System.err.println(student);
			//获取条件用户选择的学生id
			criteria.andQpSidEqualTo(student.getsId());
			criteria.andQpDeleteEqualTo(false);
			
			//从考试表中拿到所有符合条件的答题信息
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
            //防止符合条件的答题信息库为空
			if(questionPaperList.size()==0){
				return "questionpapers/questionPaperInfoError";
			}else{
				//定义一个存放试卷名称的list
				List<QuestionPaper> questionPapers=new ArrayList<QuestionPaper>();
				
				//防止试卷名称重复
				for(int i=0;i<questionPaperList.size()-1;i++){
					if(!questionPaperList.get(i).getQpName().equals(questionPaperList.get(i+1).getQpName())){
						questionPapers.add(questionPaperList.get(i));
					}
				}
				questionPapers.add(questionPaperList.get(questionPaperList.size()-1));
				map.put("questionPapers", questionPapers);
				return "questionpapers/questionPaperChooseQpname";
			}
			
			
		}	
				
				
		//2.3查看答题信息页面
		@RequestMapping("questionPaperToInfo")
		public String questionDailyPaperToInfo(Map<String, Object> map,HttpServletRequest request,QuestionPaper questionpaper){
			//获取session中存贮的student对象
			Student student=(Student)map.get("student");
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			Criteria criteria=questionPaperExample.createCriteria();
			//获取用户选择的条件
			criteria.andQpSidEqualTo(student.getsId());
			criteria.andQpNameEqualTo(questionpaper.getQpName());
			//从考试表中拿到所有符合条件的答题信息
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			request.setAttribute("questionPaper", questionPaperList.get(0));
			
			
			//定义一个数组用来存放所有的试题id信息
			Long qbIds[]=new Long[questionPaperList.size()];
			//把id信息赋值进入该数组
			for(int i=0;i<questionPaperList.size();i++){
				qbIds[i]=questionPaperList.get(i).getQpQbid();
			}
			List<QuestionBnak> questionBnaks1=new ArrayList<QuestionBnak>();
			List<QuestionBnak> questionBnaks2=new ArrayList<QuestionBnak>();
			List<QuestionBnak> questionBnaks3=new ArrayList<QuestionBnak>();
			
			List<QuestionPaper> questionPaperList1=new ArrayList<QuestionPaper>();
			List<QuestionPaper> questionPaperList2=new ArrayList<QuestionPaper>();
			List<QuestionPaper> questionPaperList3=new ArrayList<QuestionPaper>();
			
			for(int i=0;i<qbIds.length;i++){
				QuestionBnak questionBank=new QuestionBnak();
				questionBank=questionBankService.getQusetionBankById(qbIds[i]);
				
	    		//从题型表获取对应题型的id
	    		QuestionType questionType1=new QuestionType();
	    		QuestionType questionType2=new QuestionType();
	    		QuestionType questionType3=new QuestionType();
	    	
	    		
	    		questionType1=questionTypeService.getQuestionTypeName("选择题");
	    		questionType2=questionTypeService.getQuestionTypeName("填空题");
	    		questionType3=questionTypeService.getQuestionTypeName("判断题");
	    		request.setAttribute("questionType1", questionType1);
	    		request.setAttribute("questionType2", questionType2);
	    		request.setAttribute("questionType3", questionType3);
	    		
	    		
	    		
	    		//判断是否为选择题
	    		if(questionBank.getQbQtid()==questionType1.getQtId()){
	    			
	    			questionPaperList1.add(questionPaperList.get(i));
	    			questionBnaks1.add(questionBank);
	    			
	    		}
	    		//判断是否为填空题
	    		else if(questionBank.getQbQtid()==questionType2.getQtId()){
	    			questionPaperList2.add(questionPaperList.get(i));
	    			questionBnaks2.add(questionBank);
	    		}
	    		//判断是否为判断题
	    		else if(questionBank.getQbQtid()==questionType3.getQtId()){
	    			questionPaperList3.add(questionPaperList.get(i));
	    			questionBnaks3.add(questionBank);
	    		}
	    		
	    	}
		 
			
				System.err.println(questionPaperList.get(0));
			
		  	
    		//存入map中
	    	map.put("questionPaperList1", questionPaperList1);
	    	map.put("questionPaperList2", questionPaperList2);
	    	map.put("questionPaperList3", questionPaperList3);
	    	map.put("questionBnakList1", questionBnaks1);
	    	map.put("questionBnakList2", questionBnaks2);
	    	map.put("questionBnakList3", questionBnaks3);
			
		
			return "questionpapers/questionPaperInfo1";
		}
		
		
		/*//3.1跳转到选择学生id错题页面
		@RequestMapping("questionErrorPage")
		public String questionErrorPage(Map<String, Object> map){
			//设置查找条件
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			com.pctc.model.QuestionPaperExample.Criteria criteria1=questionPaperExample.createCriteria();
			criteria1.andQpDeleteEqualTo(false);
			//查询所有答题信息
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			//取出所有的答题信息
			QuestionBnak questionBnak=new QuestionBnak();
			for(int i=0;i<questionPaperList.size();i++){
				//循环取出每一个答题信息的试题id
				long qpQbid=questionPaperList.get(i).getQpQbid();
				//根据id从题库取出试题信息
				questionBnak=questionBankService.getQusetionBankById(qpQbid);
				//判断答题信息中学生答案是否与题库中试题答案一致
				//注意：字符串比较不能直接写“==”，要用equals方法，否则一直为false!!!
				if(!questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
					QuestionError questionError=new QuestionError();
					//注意questionErrorExample定义一定要放在循环中，让他每次循环构建新的对象
					QuestionErrorExample questionErrorExample=new QuestionErrorExample();
					com.pctc.model.QuestionErrorExample.Criteria criteria=questionErrorExample.createCriteria();
					criteria.andQeQpidEqualTo(qpQbid);
					//根据试题id查询错题信息
					List <QuestionError> questionErrorList=questionErrorService.getAllQuesionError(questionErrorExample);
					//判断错题库中是否有该试题（避免重复添加）
					if(questionErrorList.size()>0){
						
					}
				    else{
				    	
				    	Student student=new Student();
				    	student=studentService.getStudent(questionPaperList.get(i).getQpSid());
						questionError.setQeSid(questionPaperList.get(i).getQpSid());
						questionError.setQeQpid(questionPaperList.get(i).getQpQbid());
						questionError.setQeInsid(student.getsInsid());
						questionError.setQeCreateBy(student.getsUsername());
						questionError.setQeCreateTime(questionPaperList.get(i).getQpCreateTime());
						questionError.setQeDelete(false);
						//向错题表中添加错题
						questionErrorService.addQuestionError(questionError);
					}
				}	
			}
			
			QuestionErrorExample errorExample=null;
			//查询错题库中所有的数据
//			List<QuestionError> questionErrorList=questionErrorService.getAllQuesionError(errorExample);
			List<QuestionError> errors=questionErrorService.getAllQuesionError(errorExample);
			//定义一个存放学生id的list
			List<QuestionError> errors=new ArrayList<QuestionError>();
			
			//防止学生id重复
			for(int i=0;i<questionErrorList.size()-1;i++){
				if(questionErrorList.get(i).getQeSid()!=questionErrorList.get(i+1).getQeSid()){
					errors.add(questionErrorList.get(i));
				}
			}
			map.put("errors", errors);
			
			
			return "questionErrorChooseSid";
		}
		*/
		
		
		//3.2跳转到错题页面
		@RequestMapping("questionErrorPage")
//		@RequestMapping("questionErrorToInfo")
		public String questionErrorToInfo(Map<String, Object> map,HttpServletRequest request){
			//获取session中存贮的student对象
			Student student=(Student)map.get("student");
			
			
			
			
			//2.显示错题操作
			QuestionErrorExample questionErrorExample=new QuestionErrorExample();
			com.pctc.model.QuestionErrorExample.Criteria criteria=questionErrorExample.createCriteria();
	        //将用户选择的学生id带入查询条件中
			criteria.andQeSidEqualTo(student.getsId());
			criteria.andQeDeleteEqualTo(false);
			//将错题库中所有id为用户选择的学生id的错题找出来
			List <QuestionError> questionErrorList=questionErrorService.getAllQuesionError(questionErrorExample);
			//防止符合条件的错题库为空
			if(questionErrorList.size()==0){
				return "questionpapers/questionErrorInfoError";
			}else{
				List<QuestionBnak> questionBnaks1=new ArrayList<QuestionBnak>();
				List<QuestionBnak> questionBnaks2=new ArrayList<QuestionBnak>();
				List<QuestionBnak> questionBnaks3=new ArrayList<QuestionBnak>();
				//遍历错题信息
				for(int i=0;i<questionErrorList.size();i++){
					long qbId=questionErrorList.get(i).getQeQpid();
					QuestionBnak questionBank=questionBankService.getQusetionBankById(qbId);
					//从题型表获取对应题型的id
		    		QuestionType questionType1=new QuestionType();
		    		QuestionType questionType2=new QuestionType();
		    		QuestionType questionType3=new QuestionType();
		    		
		    		questionType1=questionTypeService.getQuestionTypeName("选择题");
		    		questionType2=questionTypeService.getQuestionTypeName("填空题");
		    		questionType3=questionTypeService.getQuestionTypeName("判断题");
		    		request.setAttribute("questionType1", questionType1);
		    		request.setAttribute("questionType2", questionType2);
		    		request.setAttribute("questionType3", questionType3);
		    		
		    		//判断是否为选择题
		    		if(questionBank.getQbQtid()==questionType1.getQtId()){
		    			
		    			questionBnaks1.add(questionBank);
		    		}
		    		//判断是否为填空题
		    		else if(questionBank.getQbQtid()==questionType2.getQtId()){
		    			questionBnaks2.add(questionBank);
		    		}
		    		//判断是否为判断题
		    		else if(questionBank.getQbQtid()==questionType3.getQtId()){
		    			questionBnaks3.add(questionBank);
		    		}
				}
				
				//存入map中
		    	map.put("questionBnakList1", questionBnaks1);
		    	map.put("questionBnakList2", questionBnaks2);
		    	map.put("questionBnakList3", questionBnaks3);
				
				return "questionpapers/questionErrorInfo1";
			}
			
		}
		
		
		//4.1跳转选择学生id页面
		/*@RequestMapping("questionGradePage")
		public String questionGradePage(Map<String, Object> map){
			StudentExample studentExample=new StudentExample();
			com.pctc.model.StudentExample.Criteria criteria=studentExample.createCriteria();
			criteria.andSDeleteEqualTo(false);
			//从学生表中得到全部的学生信息
			List<Student> studentList=studentService.getStudent(studentExample);
			map.put("studentList", studentList);
			return "questionGradeChooseSid";
		}*/
		
		//4.2跳转选择试卷名称页面
		@RequestMapping("questionGradePage")
		public String questionGradeToForm(Map<String, Object> map,HttpServletRequest request){
			//获取session中存贮的student对象
			Student student=(Student)map.get("student");
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			Criteria criteria=questionPaperExample.createCriteria();
			//获取条件用户选择的学生id
			criteria.andQpSidEqualTo(student.getsId());
			criteria.andQpDeleteEqualTo(false);
			request.setAttribute("sId", student.getsId());
			//从考试表中拿到所有符合条件的答题信息
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			//防止答题信息库为空
			if(questionPaperList.size()==0){
				return "questionpapers/questionGradeInfoError";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
			}else{
				//定义一个存放试卷名称的list
				List<QuestionPaper> questionPapers=new ArrayList<QuestionPaper>();
				
				//防止试卷名称重复
				for(int i=0;i<questionPaperList.size()-1;i++){
					if(!questionPaperList.get(i).getQpName().equals(questionPaperList.get(i+1).getQpName())){
						questionPapers.add(questionPaperList.get(i));
					}
				}
				
				
				
				questionPapers.add(questionPaperList.get(questionPaperList.size()-1));
				
				map.put("questionPapers", questionPapers);
				
				return "questionpapers/questionGradeChooseQpname";
			}
			
		}
		
		//4.3试卷答题分数计算以及入库
		@RequestMapping("questionGradeToInfo")
		public String questionGradeToInfo(Map<String, Object> map,HttpServletRequest request,QuestionPaper questionpaper){
			//从页面获取学生id
			Long sId=Long.parseLong(request.getParameter("sId"));
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			Criteria criteria=questionPaperExample.createCriteria();
			//获取用户选择的条件
			criteria.andQpSidEqualTo(sId);
			criteria.andQpNameEqualTo(questionpaper.getQpName());
			//从考试表中拿到所有符合条件的答题信息
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			QuestionBnak questionBnak=new QuestionBnak();
			
			//从题型表获取对应题型的id
			QuestionType questionType1=new QuestionType();
    		QuestionType questionType2=new QuestionType();
    		QuestionType questionType3=new QuestionType();
    		
    		//定义总分数
    		int sum=0;
			for(int i=0;i<questionPaperList.size();i++){
				
				//循环取出每一个答题信息的试题id
				long qpQbid=questionPaperList.get(i).getQpQbid();
				
				//根据id从题库取出试题信息
				questionBnak=questionBankService.getQusetionBankById(qpQbid);
				
				//判断是什么题型
				questionType1=questionTypeService.getQuestionTypeName("选择题");
	    		questionType2=questionTypeService.getQuestionTypeName("填空题");
	    		questionType3=questionTypeService.getQuestionTypeName("判断题");
	    		//如果为选择题
	    		
				if(questionBnak.getQbQtid()==questionType1.getQtId()){
					//若答案正确
					/*if(questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
						sum=sum+questionType1.getQtGrade();
						
					}*/
					//解决了答题为空的问题（可以提交白卷）
					if(questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
						sum=sum+questionType1.getQtGrade();
						
					}
				}
				//如果为填空题
                if(questionBnak.getQbQtid()==questionType2.getQtId()){
                	/*if(questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
						sum=sum+questionType2.getQtGrade();
						
					}*/
                	//解决了答题为空的问题（可以提交白卷）
                	if(questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
						sum=sum+questionType2.getQtGrade();
						
					}
					
				}
				//如果为判断题
                if(questionBnak.getQbQtid()==questionType3.getQtId()){
                	/*if(questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
						sum=sum+questionType3.getQtGrade();
						
					}*/
                	//解决了答题为空的问题（可以提交白卷）
                	if(questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
						sum=sum+questionType3.getQtGrade();
						
					}
				}
                
				
			}
			
			//查询数据库是否已存在该试卷分数，防止重复入库
			GradeExample gradeExample1=new GradeExample();
			com.pctc.model.GradeExample.Criteria criteria2=gradeExample1.createCriteria();
			criteria2.andGQpnameEqualTo(questionpaper.getQpName());
			List<Grade> gradesList=gradeService.getGrade(gradeExample1);
			System.err.println(gradesList.size());
			
			if(gradesList.size()==0){
				//分数入库操作
				Student student=studentService.getStudent(sId);
				Grade grade=new Grade();
				grade.setgSid(sId);
				grade.setgQpname(questionpaper.getQpName());
				grade.setgInsid(student.getsInsid());
				grade.setgGrade(sum);
				grade.setgCreateBy(student.getsUsername());
				grade.setgCreateTime(questionpaper.getQpCreateTime());
				grade.setgDelete(false);
				gradeService.addGrade(grade);
			}
			
			//查询分数操作
			GradeExample gradeExample2=new GradeExample();
			com.pctc.model.GradeExample.Criteria criteria3=gradeExample2.createCriteria();
			criteria3.andGQpnameEqualTo(questionpaper.getQpName());
			List<Grade> grades=gradeService.getGrade(gradeExample2);
			map.put("grades", grades);
			
			return "questionpapers/questionGradeInfo";
	
		}
		
		
		//5.教师查看学生答题信息功能
		//5.1 跳转到教师选择学生学号页面
		@RequestMapping("questionPaperPageTeacher")
		public String questionPaperPageTeacher(Map<String, Object> map){
			//查询所有未被删除的学生信息
			StudentExample studentExample=new StudentExample();
			com.pctc.model.StudentExample.Criteria criteria=studentExample.createCriteria();
			criteria.andSDeleteEqualTo(false);
			List<Student> students=studentService.getStudent(studentExample);
			//map存值
			map.put("students", students);
			return "questionpapers/questionPaperPageTeacherChooseSUsername";
		}
		
		
		
		//5.2 跳转到教师选择查看试卷名称页面
		@RequestMapping("questionPaperPageTeacherToChooseQpName")
		public String questionPaperPageTeacherToChooseQpName(Student student,Map<String, Object> map,HttpServletRequest request){
			//先根据教师选择的学生学号去学生库中找到学生id
			StudentExample studentExample=new StudentExample();
			com.pctc.model.StudentExample.Criteria criteria=studentExample.createCriteria();
			criteria.andSUsernameEqualTo(student.getsUsername());
			List<Student> students=studentService.getStudent(studentExample);
			
			//页面存值
			long sId=students.get(0).getsId();
			request.setAttribute("sId", sId);
			
			
			//再根据得到的学生id去答题库中寻找对应的答题信息
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			com.pctc.model.QuestionPaperExample.Criteria criteria1=questionPaperExample.createCriteria();
			criteria1.andQpSidEqualTo(sId);
			criteria1.andQpDeleteEqualTo(false);
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			
			//如果答题库中没有该学生的答题信息
			if(questionPaperList.size()==0){
				return "questionpapers/questionPaperPageTeacherChooseQpNameError";
			
			}else{
				//定义一个存放试卷名称的list
				List<QuestionPaper> questionPapers=new ArrayList<QuestionPaper>();
				
				//防止试卷名称重复
				for(int i=0;i<questionPaperList.size()-1;i++){
					if(!questionPaperList.get(i).getQpName().equals(questionPaperList.get(i+1).getQpName())){
						questionPapers.add(questionPaperList.get(i));
					}
				}
				questionPapers.add(questionPaperList.get(questionPaperList.size()-1));
				map.put("questionPapers", questionPapers);
				return "questionpapers/questionPaperPageTeacherChooseQpName";
			}
		}
		
		
		//5.3 跳转到显示学生答题信息页面
		@RequestMapping("questionPaperPageTeacherToInfo")
		public String questionPaperPageTeacherToInfo(Map<String, Object> map,HttpServletRequest request,QuestionPaper questionpaper){
			long sId=Long.parseLong(request.getParameter("sId"));
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			Criteria criteria=questionPaperExample.createCriteria();
			//获取用户选择的条件
			criteria.andQpSidEqualTo(sId);
			criteria.andQpNameEqualTo(questionpaper.getQpName());
			//从考试表中拿到所有符合条件的答题信息
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			request.setAttribute("questionPaper", questionPaperList.get(0));
			
			
			//定义一个数组用来存放所有的试题id信息
			Long qbIds[]=new Long[questionPaperList.size()];
			//把id信息赋值进入该数组
			for(int i=0;i<questionPaperList.size();i++){
				qbIds[i]=questionPaperList.get(i).getQpQbid();
			}
			List<QuestionBnak> questionBnaks1=new ArrayList<QuestionBnak>();
			List<QuestionBnak> questionBnaks2=new ArrayList<QuestionBnak>();
			List<QuestionBnak> questionBnaks3=new ArrayList<QuestionBnak>();
			
			List<QuestionPaper> questionPaperList1=new ArrayList<QuestionPaper>();
			List<QuestionPaper> questionPaperList2=new ArrayList<QuestionPaper>();
			List<QuestionPaper> questionPaperList3=new ArrayList<QuestionPaper>();
			
			for(int i=0;i<qbIds.length;i++){
				QuestionBnak questionBank=new QuestionBnak();
				questionBank=questionBankService.getQusetionBankById(qbIds[i]);
				
	    		//从题型表获取对应题型的id
	    		QuestionType questionType1=new QuestionType();
	    		QuestionType questionType2=new QuestionType();
	    		QuestionType questionType3=new QuestionType();
	    	
	    		
	    		questionType1=questionTypeService.getQuestionTypeName("选择题");
	    		questionType2=questionTypeService.getQuestionTypeName("填空题");
	    		questionType3=questionTypeService.getQuestionTypeName("判断题");
	    		request.setAttribute("questionType1", questionType1);
	    		request.setAttribute("questionType2", questionType2);
	    		request.setAttribute("questionType3", questionType3);
	    		
	    		
	    		
	    		//判断是否为选择题
	    		if(questionBank.getQbQtid()==questionType1.getQtId()){
	    			
	    			questionPaperList1.add(questionPaperList.get(i));
	    			questionBnaks1.add(questionBank);
	    			
	    		}
	    		//判断是否为填空题
	    		else if(questionBank.getQbQtid()==questionType2.getQtId()){
	    			questionPaperList2.add(questionPaperList.get(i));
	    			questionBnaks2.add(questionBank);
	    		}
	    		//判断是否为判断题
	    		else if(questionBank.getQbQtid()==questionType3.getQtId()){
	    			questionPaperList3.add(questionPaperList.get(i));
	    			questionBnaks3.add(questionBank);
	    		}
	    		
	    	}
		 
			
				System.err.println(questionPaperList.get(0));
			
		  	
    		//存入map中
	    	map.put("questionPaperList1", questionPaperList1);
	    	map.put("questionPaperList2", questionPaperList2);
	    	map.put("questionPaperList3", questionPaperList3);
	    	map.put("questionBnakList1", questionBnaks1);
	    	map.put("questionBnakList2", questionBnaks2);
	    	map.put("questionBnakList3", questionBnaks3);
			
		
	    	return "questionpapers/questionPaperPageTeacherInfo";
		}
			
			
		//6.教师查看学生测试成绩功能
		//6.1 跳转到选择学生学号页面
		@RequestMapping("questionGradePageTeacher")
		public String questionGradePageTeacher(Map<String, Object> map){
			//查询所有未被删除的学生信息
			StudentExample studentExample=new StudentExample();
			com.pctc.model.StudentExample.Criteria criteria=studentExample.createCriteria();
			criteria.andSDeleteEqualTo(false);
			List<Student> students=studentService.getStudent(studentExample);
			//map存值
			map.put("students", students);
			return "questionpapers/questionGradePageTeacherChooseSUsername";
		}
		
		
		//6.2跳转到教师选择查看试卷名称页面
		@RequestMapping("questionGradePageTeacherToChooseQpName")
		public String questionGradePageTeacherToInfo(Student student,Map<String, Object> map,HttpServletRequest request){
			//先根据教师选择的学生学号去学生库中找到学生id
			StudentExample studentExample=new StudentExample();
			com.pctc.model.StudentExample.Criteria criteria=studentExample.createCriteria();
			criteria.andSUsernameEqualTo(student.getsUsername());
			List<Student> students=studentService.getStudent(studentExample);
			
			//页面存值
			long sId=students.get(0).getsId();
			request.setAttribute("sId", sId);
			
			
			//再根据得到的学生id去答题库中寻找对应的答题信息
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			com.pctc.model.QuestionPaperExample.Criteria criteria1=questionPaperExample.createCriteria();
			criteria1.andQpSidEqualTo(sId);
			criteria1.andQpDeleteEqualTo(false);
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			
			//如果答题库中没有该学生的答题信息
			if(questionPaperList.size()==0){
				return "questionpapers/questionGradePageTeacherChooseQpNameError";
			
			}else{
				//定义一个存放试卷名称的list
				List<QuestionPaper> questionPapers=new ArrayList<QuestionPaper>();
				
				//防止试卷名称重复
				for(int i=0;i<questionPaperList.size()-1;i++){
					if(!questionPaperList.get(i).getQpName().equals(questionPaperList.get(i+1).getQpName())){
						questionPapers.add(questionPaperList.get(i));
					}
				}
				questionPapers.add(questionPaperList.get(questionPaperList.size()-1));
				map.put("questionPapers", questionPapers);
				return "questionpapers/questionGradePageTeacherChooseQpName";
			}
		}
		
		
		
		//6.3试卷答题分数计算以及入库
		@RequestMapping("questionGradePageTeacherToInfo")
		public String questionGradePageTeacherToInfo(Map<String, Object> map,HttpServletRequest request,QuestionPaper questionpaper){
			//从页面获取学生id
			Long sId=Long.parseLong(request.getParameter("sId"));
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			Criteria criteria=questionPaperExample.createCriteria();
			//获取用户选择的条件
			criteria.andQpSidEqualTo(sId);
			criteria.andQpNameEqualTo(questionpaper.getQpName());
			//从考试表中拿到所有符合条件的答题信息
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			QuestionBnak questionBnak=new QuestionBnak();
			
			//从题型表获取对应题型的id
			QuestionType questionType1=new QuestionType();
    		QuestionType questionType2=new QuestionType();
    		QuestionType questionType3=new QuestionType();
    		
    		//定义总分数
    		int sum=0;
			for(int i=0;i<questionPaperList.size();i++){
				
				//循环取出每一个答题信息的试题id
				long qpQbid=questionPaperList.get(i).getQpQbid();
				
				//根据id从题库取出试题信息
				questionBnak=questionBankService.getQusetionBankById(qpQbid);
				
				//判断是什么题型
				questionType1=questionTypeService.getQuestionTypeName("选择题");
	    		questionType2=questionTypeService.getQuestionTypeName("填空题");
	    		questionType3=questionTypeService.getQuestionTypeName("判断题");
	    		//如果为选择题
	    		
				if(questionBnak.getQbQtid()==questionType1.getQtId()){
					//若答案正确
					/*if(questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
						sum=sum+questionType1.getQtGrade();
						
					}*/
					//解决了答题为空的问题（可以提交白卷）
					if(questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
						sum=sum+questionType1.getQtGrade();
						
					}
				}
				//如果为填空题
                if(questionBnak.getQbQtid()==questionType2.getQtId()){
                	/*if(questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
						sum=sum+questionType2.getQtGrade();
						
					}*/
                	//解决了答题为空的问题（可以提交白卷）
                	if(questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
						sum=sum+questionType2.getQtGrade();
						
					}
					
				}
				//如果为判断题
                if(questionBnak.getQbQtid()==questionType3.getQtId()){
                	/*if(questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
						sum=sum+questionType3.getQtGrade();
						
					}*/
                	//解决了答题为空的问题（可以提交白卷）
                	if(questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
						sum=sum+questionType3.getQtGrade();
						
					}
				}
                
				
			}
			
			//查询数据库是否已存在该试卷分数，防止重复入库
			GradeExample gradeExample1=new GradeExample();
			com.pctc.model.GradeExample.Criteria criteria2=gradeExample1.createCriteria();
			criteria2.andGQpnameEqualTo(questionpaper.getQpName());
			List<Grade> gradesList=gradeService.getGrade(gradeExample1);
			System.err.println(gradesList.size());
			
			if(gradesList.size()==0){
				//分数入库操作
				Student student=studentService.getStudent(sId);
				Grade grade=new Grade();
				grade.setgSid(sId);
				grade.setgQpname(questionpaper.getQpName());
				grade.setgInsid(student.getsInsid());
				grade.setgGrade(sum);
				grade.setgCreateBy(student.getsUsername());
				grade.setgCreateTime(questionpaper.getQpCreateTime());
				grade.setgDelete(false);
				gradeService.addGrade(grade);
			}
			
			//查询分数操作
			GradeExample gradeExample2=new GradeExample();
			com.pctc.model.GradeExample.Criteria criteria3=gradeExample2.createCriteria();
			criteria3.andGQpnameEqualTo(questionpaper.getQpName());
			List<Grade> grades=gradeService.getGrade(gradeExample2);
			map.put("grades", grades);
			
			return "questionpapers/questionGradePageTeacherInfo";
		}
		
		
		
		
		
		

		/*//表单是时间类型的处理方法			
		@InitBinder
		public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			dateFormat.setLenient(false);
			binder.registerCustomEditor(Date.class, new CustomDateEditor(
					dateFormat, false));
		}*/
		
		
		
		
		

}
