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
 * �½���ϰ������
 * @author zks
 * @date 2019-10-24
 * @version 0.1
 *
 */

@Controller
@RequestMapping("questionCourseChapterPaper")
//��ȡsessionֵ
@SessionAttributes(value={"student"}, types={String.class})
public class QuestionCourseChapterPaperAction {
	
	//ע��γ�service
	@Autowired 
    private CourseService courseService;
		
		
	//ע��γ���ϰservice
	@Autowired 
	private QuestionCourseService questionCourseService;

		
	//ע�����service
	@Autowired
	private QuestionBankService questionBankService;
			
		
	//ע������service
	@Autowired
	private QuestionTypeService questionTypeService;
		
		
	//ע�����service
	@Autowired
	private QuestionPaperService questionPaperService;
	
	
	//ע���½�service
	@Autowired
	private CourseChapterService courseChapterService;
	
	
	//ע���½���ϰservice
	@Autowired
	private QuestionCourseChapterService questionCourseChapterService;
	
	
	//ע��ѧ��service
	@Autowired
	private StudentService studentService;
			
		
	//ע�����service
	@Autowired
	private QuestionErrorService questionErrorService;
	
	
	
	//1.��ת���γ�ѡ��ҳ��
	@RequestMapping("questionCourseChapterTestPage")
	public String questionCourseTestPage(Map<String, Object> map){
		//�ӿγ̱��ѯ���пγ���Ϣ
		CourseExample courseExample=new CourseExample();
		com.pctc.model.CourseExample.Criteria criteria=courseExample.createCriteria();
		criteria.andCDeleteEqualTo(false);
		List<Course> courseList=courseService.seleteAllCourse(courseExample);
		map.put("courseList", courseList);
		return "questionpapers/questionCourseChapterChooseCourse";
	}
	
	
	//2.��ת���½�ѡ��ҳ��
	@RequestMapping("questionCourseChapterToChooseChapter")
	public String questionCourseChapterToChooseChapter(Course course,Map<String, Object> map){
		CourseExample courseExample=new CourseExample();
		Criteria criteria=courseExample.createCriteria();
		//�����û�ѡ��Ŀγ����õ���Ӧ�Ŀγ���Ϣ
		criteria.andCNameEqualTo(course.getcName());
		criteria.andCDeleteEqualTo(false);
		List<Course> courseList=courseService.seleteAllCourse(courseExample);
		//�õ���Ӧ�Ŀγ�id
		long cId=courseList.get(0).getcId();
		
		CourseChapterExample courseChapterExample=new CourseChapterExample();
		com.pctc.model.CourseChapterExample.Criteria criteria1=courseChapterExample.createCriteria();
		
		//���ݿγ�id�õ���Ӧ�������½���Ϣ
		criteria1.andCcCidEqualTo(cId);
		List<CourseChapter> courseChapterList=courseChapterService.selectAllCourseChapter(courseChapterExample);
		
		//����map��
		map.put("courseChapterList", courseChapterList);
		
		
		
		
		return "questionpapers/questionCourseChapterChooseChapter";
	}
	
	
	//1.3��ת���½ڲ���ҳ��
	@RequestMapping("questionCourseChapterFrom")
	public String questionCourseChapterFrom(CourseChapter courseChapter,Map<String, Object> map,HttpServletRequest request){
		QuestionBnak questionBank=new QuestionBnak();
		List<QuestionBnak> questionBnakList1=new ArrayList<QuestionBnak>();
		List<QuestionBnak> questionBnakList2=new ArrayList<QuestionBnak>();
		List<QuestionBnak> questionBnakList3=new ArrayList<QuestionBnak>();
		
		CourseChapterExample courseChapterExample=new CourseChapterExample();
		com.pctc.model.CourseChapterExample.Criteria criteria=courseChapterExample.createCriteria();
		//�����û�ѡ����½����õ���Ӧ���½���Ϣ
		criteria.andCcNameEqualTo(courseChapter.getCcName());
		criteria.andCcDeleteEqualTo(false);
		List<CourseChapter> courseChapterList=courseChapterService.selectAllCourseChapter(courseChapterExample);
		//�õ���Ӧ���½�id
		long ccId=courseChapterList.get(0).getCcId();
		QuestionCourseChapterExample questionCourseChapterExample=new QuestionCourseChapterExample();
		com.pctc.model.QuestionCourseChapterExample.Criteria criteria1=questionCourseChapterExample.createCriteria();
		//�����½�id�õ���Ӧ���½ڲ�����Ϣ
		criteria1.andQccCcidEqualTo(ccId);
		criteria1.andQccDeleteEqualTo(false);
		List<QuestionCourseChapter> questionCourseChapterList=questionCourseChapterService.selectAllQuestionCourseChapter(questionCourseChapterExample);
		//ҳ���ֵquestionCourse
		request.setAttribute("questionCourseChapter", questionCourseChapterList.get(0));
		//ȡ�����пγ̲�������id
		String qccIds[]=questionCourseChapterList.get(0).getQccQbid().split(",");
		
		for(int i=0;i<qccIds.length;i++){
    		long qbId1=Long.parseLong(qccIds[i]);
    		//�������ȡ��Ӧ��������Ϣ
    		questionBank=questionBankService.getQusetionBankById(qbId1);
    	
    		//�����ͱ��ȡ��Ӧ���͵�id
    		QuestionType questionType1=new QuestionType();
    		QuestionType questionType2=new QuestionType();
    		QuestionType questionType3=new QuestionType();
    		
    		questionType1=questionTypeService.getQuestionTypeName("ѡ����");
    		questionType2=questionTypeService.getQuestionTypeName("�����");
    		questionType3=questionTypeService.getQuestionTypeName("�ж���");
       		request.setAttribute("questionType1", questionType1);
    		request.setAttribute("questionType2", questionType2);
    		request.setAttribute("questionType3", questionType3);
    		
    		
    		//�ж��Ƿ�Ϊѡ����
    		if(questionBank.getQbQtid()==questionType1.getQtId()){
    			questionBnakList1.add(questionBank);
    		}
    		//�ж��Ƿ�Ϊ�����
    		else if(questionBank.getQbQtid()==questionType2.getQtId()){
    			questionBnakList2.add(questionBank);
    		}
    		//�ж��Ƿ�Ϊ�ж���
    		else if(questionBank.getQbQtid()==questionType3.getQtId()){
    			questionBnakList3.add(questionBank);
    		}
    		  																	
    		
    	}
    	//����map��
    	map.put("questionBnakList1", questionBnakList1);
    	map.put("questionBnakList2", questionBnakList2);
    	map.put("questionBnakList3", questionBnakList3);
    	map.put("courseChapter", courseChapter);
    	

		return "questionpapers/questionCourseChapterTest1";
	}
	
	
	//1.4������Ϣ�����֤
	@ResponseBody
	@RequestMapping("questionCourseChapterFormInfo1")
	public boolean questionDailyFormInfo1(Map<String, Object> map,QuestionPaper questionPaper){
		//��ȡsession�д�����student����
		Student student=(Student)map.get("student");
		boolean flag=false;
		QuestionPaperExample questionPaperExample=new QuestionPaperExample();
		com.pctc.model.QuestionPaperExample.Criteria criteria=questionPaperExample.createCriteria();
		//�ж�������Ϣ�Ƿ�Ϊ�ջ��ߺ��пո�
		if(questionPaper.getQpName()!=null&&!"".equals(questionPaper.getQpName().trim())){
			//�жϸ�ѧ��id�µ��Ծ������Ƿ�Ψһ
			criteria.andQpNameEqualTo(questionPaper.getQpName());
			criteria.andQpSidEqualTo(student.getsId());
					
		//����������Ϣ�Ӵ�����Ϣ�в���
		List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
		//����ҵ��˷���true��û���ҵ�����false
		if(questionPaperList.size()>0){
			flag=true;
						
		}else{
			flag=false;
		}
		}
		return flag;
	}
	
	
	//1.4 ������Ϣ������   �Լ�����������
    @RequestMapping("questionCourseChapterFormInfo")
	public String dailySuccess(HttpServletRequest request,Map<String, Object> map){
    	//1.������Ϣ���
    	//��ȡsession�д�����student����
		Student student1=(Student)map.get("student");
		long qccId=Long.parseLong(request.getParameter("qccId"));
					
		QuestionCourseChapterExample questionCourseChapterExample=new QuestionCourseChapterExample();
		com.pctc.model.QuestionCourseChapterExample.Criteria criteria=questionCourseChapterExample.createCriteria();
		criteria.andQccIdEqualTo(qccId);
		//�����½�id�õ���Ӧ���½ڲ�����Ϣ
		List<QuestionCourseChapter> questionCourseChapterList=questionCourseChapterService.selectAllQuestionCourseChapter(questionCourseChapterExample);
		//ȡ����������id
		String qccIds[]=questionCourseChapterList.get(0).getQccQbid().split(",");
		//ѭ������map
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
			//�������������
			questionPaperService.addQuestionPaper((QuestionPaper)map.get(qccIds[i]));
		}
		
		
		
		//2.��������Ӵ������
		//���ò�������
		QuestionPaperExample questionPaperExample=new QuestionPaperExample();
		com.pctc.model.QuestionPaperExample.Criteria criteria1=questionPaperExample.createCriteria();
		criteria1.andQpDeleteEqualTo(false);
		//��ѯ���д�����Ϣ
		List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
		//ȡ�����еĴ�����Ϣ
		QuestionBnak questionBnak=new QuestionBnak();
		for(int i=0;i<questionPaperList.size();i++){
			//ѭ��ȡ��ÿһ��������Ϣ������id
			long qpQbid=questionPaperList.get(i).getQpQbid();
			//����id�����ȡ��������Ϣ
			questionBnak=questionBankService.getQusetionBankById(qpQbid);
			//�жϴ�����Ϣ��ѧ�����Ƿ�������������һ��
			//ע�⣺�ַ����Ƚϲ���ֱ��д��==����Ҫ��equals����������һֱΪfalse!!!
//			if(!questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
			//����˴���Ϊ�յ����⣨�����ύ�׾�
			if(!questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
				QuestionError questionError=new QuestionError();
				//ע��questionErrorExample����һ��Ҫ����ѭ���У�����ÿ��ѭ�������µĶ���
				QuestionErrorExample questionErrorExample=new QuestionErrorExample();
				com.pctc.model.QuestionErrorExample.Criteria criteria11=questionErrorExample.createCriteria();
				criteria11.andQeQpidEqualTo(qpQbid);
				criteria11.andQeSidEqualTo(student1.getsId());
				//��������id��ѯ������Ϣ
				List <QuestionError> questionErrorList=questionErrorService.getAllQuesionError(questionErrorExample);
				for(QuestionError error:questionErrorList){
					System.err.println(error);
				}
				//�жϴ�������Ƿ��и����⣨�����ظ���ӣ�
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
					//����������Ӵ���
					questionErrorService.addQuestionError(questionError);
				}
			}
		}
					
	   return "questionpapers/questionInfoSuccess";
					
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

}
