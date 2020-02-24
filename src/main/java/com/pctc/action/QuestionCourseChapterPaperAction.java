package com.pctc.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pctc.model.Course;
import com.pctc.model.CourseChapter;
import com.pctc.model.CourseChapterExample;
import com.pctc.model.CourseExample;
import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionCourse;
import com.pctc.model.QuestionCourseChapter;
import com.pctc.model.QuestionCourseChapterExample;
import com.pctc.model.QuestionCourseExample;
import com.pctc.model.QuestionError;
import com.pctc.model.QuestionErrorExample;
import com.pctc.model.QuestionPaper;
import com.pctc.model.QuestionPaperExample;
import com.pctc.model.QuestionType;
import com.pctc.model.Student;
import com.pctc.model.CourseExample.Criteria;
import com.pctc.service.CourseChapterService;
import com.pctc.service.CourseService;
import com.pctc.service.QuestionBankService;
import com.pctc.service.QuestionCourseChapterService;
import com.pctc.service.QuestionCourseService;
import com.pctc.service.QuestionErrorService;
import com.pctc.service.QuestionPaperService;
import com.pctc.service.QuestionTypeService;
import com.pctc.service.StudentService;

/**
 * 章节练习控制器
 * @author zks
 * @date 2019-10-24
 * @version 0.1
 *
 */

@Controller
@RequestMapping("questionCourseChapterPaper")
//获取session值
@SessionAttributes(value={"student"}, types={String.class})
public class QuestionCourseChapterPaperAction {
	
	//注入课程service
	@Autowired 
    private CourseService courseService;
		
		
	//注入课程练习service
	@Autowired 
	private QuestionCourseService questionCourseService;

		
	//注入题库service
	@Autowired
	private QuestionBankService questionBankService;
			
		
	//注入题型service
	@Autowired
	private QuestionTypeService questionTypeService;
		
		
	//注入答题service
	@Autowired
	private QuestionPaperService questionPaperService;
	
	
	//注入章节service
	@Autowired
	private CourseChapterService courseChapterService;
	
	
	//注入章节练习service
	@Autowired
	private QuestionCourseChapterService questionCourseChapterService;
	
	
	//注入学生service
	@Autowired
	private StudentService studentService;
			
		
	//注入错题service
	@Autowired
	private QuestionErrorService questionErrorService;
	
	
	
	//1.跳转到课程选择页面
	@RequestMapping("questionCourseChapterTestPage")
	public String questionCourseTestPage(Map<String, Object> map){
		//从课程表查询所有课程信息
		CourseExample courseExample=new CourseExample();
		com.pctc.model.CourseExample.Criteria criteria=courseExample.createCriteria();
		criteria.andCDeleteEqualTo(false);
		List<Course> courseList=courseService.seleteAllCourse(courseExample);
		map.put("courseList", courseList);
		return "questionpapers/questionCourseChapterChooseCourse";
	}
	
	
	//2.跳转到章节选择页面
	@RequestMapping("questionCourseChapterToChooseChapter")
	public String questionCourseChapterToChooseChapter(Course course,Map<String, Object> map){
		CourseExample courseExample=new CourseExample();
		Criteria criteria=courseExample.createCriteria();
		//根据用户选择的课程名得到相应的课程信息
		criteria.andCNameEqualTo(course.getcName());
		criteria.andCDeleteEqualTo(false);
		List<Course> courseList=courseService.seleteAllCourse(courseExample);
		//得到相应的课程id
		long cId=courseList.get(0).getcId();
		
		CourseChapterExample courseChapterExample=new CourseChapterExample();
		com.pctc.model.CourseChapterExample.Criteria criteria1=courseChapterExample.createCriteria();
		
		//根据课程id得到相应的所有章节信息
		criteria1.andCcCidEqualTo(cId);
		List<CourseChapter> courseChapterList=courseChapterService.selectAllCourseChapter(courseChapterExample);
		
		//存入map中
		map.put("courseChapterList", courseChapterList);
		
		
		
		
		return "questionpapers/questionCourseChapterChooseChapter";
	}
	
	
	//1.3跳转到章节测试页面
	@RequestMapping("questionCourseChapterFrom")
	public String questionCourseChapterFrom(CourseChapter courseChapter,Map<String, Object> map,HttpServletRequest request){
		QuestionBnak questionBank=new QuestionBnak();
		List<QuestionBnak> questionBnakList1=new ArrayList<QuestionBnak>();
		List<QuestionBnak> questionBnakList2=new ArrayList<QuestionBnak>();
		List<QuestionBnak> questionBnakList3=new ArrayList<QuestionBnak>();
		
		CourseChapterExample courseChapterExample=new CourseChapterExample();
		com.pctc.model.CourseChapterExample.Criteria criteria=courseChapterExample.createCriteria();
		//根据用户选择的章节名得到相应的章节信息
		criteria.andCcNameEqualTo(courseChapter.getCcName());
		criteria.andCcDeleteEqualTo(false);
		List<CourseChapter> courseChapterList=courseChapterService.selectAllCourseChapter(courseChapterExample);
		//得到相应的章节id
		long ccId=courseChapterList.get(0).getCcId();
		QuestionCourseChapterExample questionCourseChapterExample=new QuestionCourseChapterExample();
		com.pctc.model.QuestionCourseChapterExample.Criteria criteria1=questionCourseChapterExample.createCriteria();
		//根据章节id得到相应的章节测试信息
		criteria1.andQccCcidEqualTo(ccId);
		criteria1.andQccDeleteEqualTo(false);
		List<QuestionCourseChapter> questionCourseChapterList=questionCourseChapterService.selectAllQuestionCourseChapter(questionCourseChapterExample);
		//页面存值questionCourse
		request.setAttribute("questionCourseChapter", questionCourseChapterList.get(0));
		//取出所有课程测试试题id
		String qccIds[]=questionCourseChapterList.get(0).getQccQbid().split(",");
		
		for(int i=0;i<qccIds.length;i++){
    		long qbId1=Long.parseLong(qccIds[i]);
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
    	map.put("courseChapter", courseChapter);
    	

		return "questionpapers/questionCourseChapterTest1";
	}
	
	
	//1.4答题信息入库验证
	@ResponseBody
	@RequestMapping("questionCourseChapterFormInfo1")
	public boolean questionDailyFormInfo1(Map<String, Object> map,QuestionPaper questionPaper){
		//获取session中存贮的student对象
		Student student=(Student)map.get("student");
		boolean flag=false;
		QuestionPaperExample questionPaperExample=new QuestionPaperExample();
		com.pctc.model.QuestionPaperExample.Criteria criteria=questionPaperExample.createCriteria();
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
    @RequestMapping("questionCourseChapterFormInfo")
	public String dailySuccess(HttpServletRequest request,Map<String, Object> map){
    	//1.答题信息入库
    	//获取session中存贮的student对象
		Student student1=(Student)map.get("student");
		long qccId=Long.parseLong(request.getParameter("qccId"));
					
		QuestionCourseChapterExample questionCourseChapterExample=new QuestionCourseChapterExample();
		com.pctc.model.QuestionCourseChapterExample.Criteria criteria=questionCourseChapterExample.createCriteria();
		criteria.andQccIdEqualTo(qccId);
		//根据章节id得到相应的章节测试信息
		List<QuestionCourseChapter> questionCourseChapterList=questionCourseChapterService.selectAllQuestionCourseChapter(questionCourseChapterExample);
		//取出所有试题id
		String qccIds[]=questionCourseChapterList.get(0).getQccQbid().split(",");
		//循环插入map
		for(int i=0;i<qccIds.length;i++){
						
			QuestionPaper questionPaper=new QuestionPaper();
			questionPaper.setQpSid(student1.getsId());
			questionPaper.setQpQbid(Long.parseLong(qccIds[i]));
			questionPaper.setQpInsid(Long.parseLong(request.getParameter("qccInsid")));
			questionPaper.setQpAnswer(request.getParameter(qccIds[i]));
			questionPaper.setQpName(request.getParameter("qpName"));
			questionPaper.setQpCreateBy(request.getParameter("qpSid"));
			questionPaper.setQpCreateTime(new Date());
			questionPaper.setQpDelete(false);
			map.put(qccIds[i], questionPaper);
						
		}
		for(int i=0;i<qccIds.length;i++){
			//向答题表插入数据
			questionPaperService.addQuestionPaper((QuestionPaper)map.get(qccIds[i]));
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
//			if(!questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
			//解决了答题为空的问题（可以提交白卷）
			if(!questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
				QuestionError questionError=new QuestionError();
				//注意questionErrorExample定义一定要放在循环中，让他每次循环构建新的对象
				QuestionErrorExample questionErrorExample=new QuestionErrorExample();
				com.pctc.model.QuestionErrorExample.Criteria criteria11=questionErrorExample.createCriteria();
				criteria11.andQeQpidEqualTo(qpQbid);
				criteria11.andQeSidEqualTo(student1.getsId());
				//根据试题id查询错题信息
				List <QuestionError> questionErrorList=questionErrorService.getAllQuesionError(questionErrorExample);
				for(QuestionError error:questionErrorList){
					System.err.println(error);
				}
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

}
