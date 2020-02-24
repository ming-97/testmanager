package com.pctc.action;

import java.util.List;
import java.util.Map;

import javax.crypto.Cipher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pctc.model.CourseChapter;
import com.pctc.model.CourseChapterExample;
import com.pctc.model.Institutions;
import com.pctc.model.InstitutionsExample;
import com.pctc.model.InstitutionsExample.Criteria;
import com.pctc.model.QuestionBnak;
import com.pctc.model.QuestionBnakExample;
import com.pctc.model.QuestionCourse;
import com.pctc.model.QuestionCourseChapter;
import com.pctc.model.QuestionCourseChapterExample;
import com.pctc.model.QuestionCourseExample;
import com.pctc.model.QuestionDaily;
import com.pctc.model.QuestionDailyExample;
import com.pctc.model.QuestionType;
import com.pctc.model.QuestionTypeExample;
import com.pctc.model.Teacher;
import com.pctc.model.TeacherExample;
import com.pctc.service.CourseChapterService;
import com.pctc.service.InstitutionsService;
import com.pctc.service.QuestionBankService;
import com.pctc.service.QuestionCourseChapterService;
import com.pctc.service.QuestionCourseService;
import com.pctc.service.QuestionDailyService;
import com.pctc.service.QuestionTypeService;
import com.pctc.service.TeacherService;

@Controller
@RequestMapping("returnPage")
public class Topage {

	@Autowired
	private QuestionTypeService questionTypeService;// 注入题型service

	@Autowired
	private QuestionBankService questionBankService;
	
	@Autowired 
	private QuestionDailyService questionDailyService;
	
	@Autowired
	private QuestionCourseService questionCourseService;
	
	@Autowired
	private QuestionCourseChapterService questionCourseChapterService;
	
	
	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private InstitutionsService institutionsService;
	
	@Autowired
	private CourseChapterService courseChapterService;

	/**
	 * 跳转到添加题库可以页面
	 * 
	 * @return
	 */
	@RequestMapping("toaddQuestion")
	public String toAddQuestion(ModelMap map) {
		QuestionTypeExample example1=new QuestionTypeExample();
		com.pctc.model.QuestionTypeExample.Criteria criteria1=example1.createCriteria();
		criteria1.andQtDeleteEqualTo(false);
		List<QuestionType> list = questionTypeService.selectAllQuestionType(example1);
		map.put("qTypelist", list);
		CourseChapterExample example=new CourseChapterExample();
		com.pctc.model.CourseChapterExample.Criteria criteria=example.createCriteria();
		criteria.andCcDeleteEqualTo(false);
		List<CourseChapter> list2=courseChapterService.selectAllCourseChapter(example);
		map.put("courseChapter", list2);
		InstitutionsExample example2=new InstitutionsExample();
		Criteria criteria2=example2.createCriteria();
		criteria2.andInsDeleteEqualTo(false);//查询条件
		List<Institutions> list3=institutionsService.selectAllInstitutions(example2);
		map.put("institutions", list3);
		return "question/questionbankadd";// 将查询的题型信息返回到添加页面
	}
	// 跳转到每日一练管理页面
	@RequestMapping("toDaily")
	public String toDaliy() {
		return "question/dailyPractice";
	}

	//跳转到课程练习主管理界面
	@RequestMapping("toCourse")
	public String toCourse() {
		return "question/coursePractice";
	}
	
	
	//返回添加课程练习页面
	@RequestMapping("toAddQuestionCourse")
	public String toAddQuestionCourse(HttpServletRequest request,Map<String , Object> map){
		QuestionBnakExample qBnakExample=new QuestionBnakExample();
		com.pctc.model.QuestionBnakExample.Criteria criteria=qBnakExample.createCriteria();
		criteria.andQbDeleteEqualTo(false);
		Teacher teacher=(Teacher)request.getSession().getAttribute("teacher");
		criteria.andQbInsidEqualTo(teacher.gettInsid());
		List<QuestionBnak> list=questionBankService.selectAllQuestion(qBnakExample);
		map.put("qBnaks", list);
		return "question/questioncourseadd";
	}
	
	//跳转到更新课程练习页面
	@RequestMapping("toupdateQuestionCourse")
	public String toupdateQuestionCourse(Map<String , Object> map,QuestionCourse qCourse){
		qCourse=questionCourseService.selectQuestionCourseById(qCourse);//查询要修改的信息
		//System.err.println(qCourse);
		QuestionBnakExample qBnakExample=new QuestionBnakExample();
		com.pctc.model.QuestionBnakExample.Criteria criteria=qBnakExample.createCriteria();
		criteria.andQbDeleteEqualTo(false);
		List<QuestionBnak> list=questionBankService.selectAllQuestion(qBnakExample);//查询所有信息
		map.put("qCourse", qCourse);
		map.put("qBnaks", list);
		return "question/questioncourseupdate";
	}
	
/*	//跳转到章节练习主管理界面
	@RequestMapping("toChapter")
	public String toChapter() {
		return "question/chapterPractice";
	}*/
	
	

	// 添加每日一练题库
	@RequestMapping("toaddQuestionDaily")
	public String toAddQuestionDaily(HttpServletRequest request,Map<String , Object> map) {
		QuestionBnakExample qBnakExample=new QuestionBnakExample();
		com.pctc.model.QuestionBnakExample.Criteria criteria=qBnakExample.createCriteria();
		criteria.andQbDeleteEqualTo(false);
		Teacher teacher=(Teacher)request.getSession().getAttribute("teacher");		
		criteria.andQbInsidEqualTo(teacher.gettInsid());
		List<QuestionBnak> list=questionBankService.selectAllQuestion(qBnakExample);
		map.put("qBnaks", list);
		QuestionTypeExample example1=new QuestionTypeExample();
		com.pctc.model.QuestionTypeExample.Criteria criteria1=example1.createCriteria();
		criteria1.andQtDeleteEqualTo(false);
		List<QuestionType> list2=questionTypeService.selectAllQuestionType(example1);		
		map.put("questionType", list2);
		return "question/questiondailyadd";
	}

	// 根据页面传入的参数去数据库查找数据，。将查找到的数据返回给修改页面
	@RequestMapping("toupdateQuestionBnak")
	public String toupdateQuestionBnak(QuestionBnak qBnak, Map<String, Object> map) {
		if (qBnak.getQbId() != null && !"".equals(qBnak.getQbId().toString().trim())) {
			qBnak = questionBankService.getQusetionBankById(qBnak.getQbId());
		}
		CourseChapterExample example=new CourseChapterExample();
		com.pctc.model.CourseChapterExample.Criteria criteria=example.createCriteria();
		criteria.andCcDeleteEqualTo(false);
		List<CourseChapter> list2=courseChapterService.selectAllCourseChapter(example);
		map.put("courseChapter", list2);
		QuestionTypeExample example1=new QuestionTypeExample();
		com.pctc.model.QuestionTypeExample.Criteria criteria2=example1.createCriteria();
		criteria2.andQtDeleteEqualTo(false);
		List<QuestionType> list = questionTypeService.selectAllQuestionType(example1);
		map.put("qTypelist", list);
		map.put("questionBnak", qBnak);
		return "question/questionbankupdate";// 返回修改页面
	}
	
	//条主导跟新每日一练界面
	@RequestMapping("toupdateQuestionDaily")
	public String toupdateQuestion(QuestionDaily qDaily,ModelMap modelMap){
		qDaily=questionDailyService.getQuestionDailyById(qDaily.getQdId());
		modelMap.put("qdaily", qDaily);
		QuestionBnakExample qBnakExample=new QuestionBnakExample();
		com.pctc.model.QuestionBnakExample.Criteria criteria=qBnakExample.createCriteria();
		criteria.andQbDeleteEqualTo(false);
		List<QuestionBnak> list=questionBankService.selectAllQuestion(qBnakExample);
		modelMap.put("qBnaks", list);
		return "question/questiondailyupdate";
	}
	
	//跳转到教师管理页面
	@RequestMapping("toadmin-role")
	public String toAdminRole(Model model,@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum){
		 Page<Object> page =PageHelper.startPage(pageNum,10);//第几页第几条
		   TeacherExample teacherExample =new TeacherExample();
		   com.pctc.model.TeacherExample.Criteria criteria=teacherExample.createCriteria();
		   criteria.andTDeleteEqualTo(false);
		   List<Teacher> teachers = teacherService.seleteByExample(teacherExample);
		   //分页插件信息PageInfo
		   PageInfo<Teacher> info =new PageInfo<Teacher>(teachers,3);		   
		   model.addAttribute("teachers", teachers);
		   model.addAttribute("infos", info);
		return "question/admin-role";
	}
	
	//跳转到添加教师页面
	@RequestMapping("toadmin-role-add")
	public String toAdminRoleAdd(Map<String, Object> map,Institutions institutions){
		InstitutionsExample example=new InstitutionsExample();
		Criteria criteria=example.createCriteria();
		criteria.andInsDeleteEqualTo(false);
		List<Institutions> list=institutionsService.selectAllInstitutions(example);
		map.put("institutions", list);
		return "question/admin-role-add";
	}
	
	
	
	
	//跳赚到更新章节练习页面
	@RequestMapping("toupdateQuestionCourseChapter")
	public String toupdateQuestionCourseChater(QuestionCourseChapter qCourseChapter,Map<String, Object> map){
		qCourseChapter=questionCourseChapterService.selectQuestionCourseChapter(qCourseChapter.getQccId());
		map.put("qCourseChapter", qCourseChapter);
		QuestionBnakExample qBnakExample=null;
		List<QuestionBnak> list=questionBankService.selectAllQuestion(qBnakExample);
		map.put("qBnaks", list);
		return "question/questioncoursechapterupdate";
	}
	
	
	//跳转到添加章节练习界面
	@RequestMapping("toAddQuestionCourseChapter")
	public String toAddQuestionCourseChapter(HttpServletRequest request,Map<String, Object> map){
		QuestionBnakExample qBnakExample=new QuestionBnakExample();
		com.pctc.model.QuestionBnakExample.Criteria criteria=qBnakExample.createCriteria();
		criteria.andQbDeleteEqualTo(false);
		Teacher teacher=(Teacher)request.getSession().getAttribute("teacher");//获取session中的值
		criteria.andQbInsidEqualTo(teacher.gettInsid());
		List<QuestionBnak> list=questionBankService.selectAllQuestion(qBnakExample);
		map.put("qBnaks", list);
		QuestionTypeExample example1=new QuestionTypeExample();
		com.pctc.model.QuestionTypeExample.Criteria criteria1=example1.createCriteria();
		criteria1.andQtDeleteEqualTo(false);
		List<QuestionType> list2=questionTypeService.selectAllQuestionType(example1);		
		map.put("questionType", list2);
		return "question/questiondailycoursechapteradd";
		
	}
	
	
	
	//跳转到题库管理主页
	@RequestMapping("toQuestionInfo")
	public String toQuestionInfo(Map<String, Object> map){
		QuestionBnakExample qBnakExample=new QuestionBnakExample();
		com.pctc.model.QuestionBnakExample.Criteria criteria=qBnakExample.createCriteria();
		criteria.andQbDeleteEqualTo(false);
		List<QuestionBnak> list=questionBankService.selectAllQuestion(qBnakExample);
		map.put("questionBnak", list);
		return "question/questionbankmanager";
	}
	
	
	
	//跳转到每日一练主页
	@RequestMapping("toquestoinDaily")
	public String toQuestoinDaily(Map<String , Object> map){
		QuestionDailyExample example=new QuestionDailyExample();
		com.pctc.model.QuestionDailyExample.Criteria criteria=example.createCriteria();
		criteria.andQdDeleteEqualTo(false);
		List<QuestionDaily> list=questionDailyService.getAllQuestionDaily(example);
		map.put("questionDaily", list);
		return "question/questiondaily";
	}
	
	//跳转到章节练习主页
	@RequestMapping("toquestoinCourseChapter")
	public String toQuestionCourseChaper(Map<String , Object> map){
		QuestionCourseChapterExample example=new QuestionCourseChapterExample();
		com.pctc.model.QuestionCourseChapterExample.Criteria criteria=example.createCriteria();
		criteria.andQccDeleteEqualTo(false);
		List<QuestionCourseChapter> list=questionCourseChapterService.selectAllQuestionCourseChapter(example);
		map.put("qcoursechapter", list);
		return "question/questioncoursechapter";
	}
	
	
	
	//跳转到课程练习主界面
	@RequestMapping("toquestoinCourse")
	public String toquestionCourse(Map<String, Object> map){
		QuestionCourseExample example=new QuestionCourseExample();
	    com.pctc.model.QuestionCourseExample.Criteria criteria=example.createCriteria();
		criteria.andQcDeleteEqualTo(false);
		List<QuestionCourse> list=questionCourseService.selectAllQuestionCourse(example);
		map.put("questionCourse", list);
		return "question/questioncourse";
	}
}
