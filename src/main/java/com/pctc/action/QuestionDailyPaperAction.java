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
 * ÿ��һ��������
 * @author zks
 *@date 2019-10-21
 *@version 0.1
 */

@Controller
@RequestMapping("questionDailyPaper")
//��ȡsessionֵ
@SessionAttributes(value={"student"}, types={String.class})
public class QuestionDailyPaperAction {
	
	    //ע��ÿ��һ��service
		@Autowired
		private QuestionDailyService questionDailyService;
		
		//ע�����service
		@Autowired
		private QuestionBankService questionBankService;
		
		//ע������service
		@Autowired
		private QuestionTypeService questionTypeService;
		
		//ע�����service
		@Autowired
		private QuestionPaperService questionPaperService;
		
		//ע��ѧ��service
		@Autowired
		private StudentService studentService;
		
		//ע�����service
		@Autowired
		private QuestionErrorService questionErrorService;
		
		//ע�����service
		@Autowired
		private GradeService gradeService;
		
		
		//1.1 ��ת��ÿ��һ������ѡ��ҳ��
		@RequestMapping("questionDailyTestPage")
		public String questionDailyTestPage(Map<String, Object> map){
			QuestionDailyExample questionDailyExample=new QuestionDailyExample();
			com.pctc.model.QuestionDailyExample.Criteria criteria=questionDailyExample.createCriteria();
			//�ҳ�δ��ɾ���Ĳ���
			criteria.andQdDeleteEqualTo(false);
			List<QuestionDaily> questionDailys=questionDailyService.getAllQuestionDaily(questionDailyExample);
			map.put("questionDailys", questionDailys);
			return "questionpapers/questionDailyChoose";
		}
		
		
		//1.2 ��ת��ÿ��һ������ҳ��
		@RequestMapping("questionDailyForm")
		public String questionDailyForm(HttpServletRequest request,Map<String, Object> map){
			long qdId=Long.parseLong(request.getParameter("qdId"));
			QuestionDaily questionDaily=new QuestionDaily();
			QuestionBnak questionBank=new QuestionBnak();
			List<QuestionBnak> questionBnakList1=new ArrayList<QuestionBnak>();
			List<QuestionBnak> questionBnakList2=new ArrayList<QuestionBnak>();
			List<QuestionBnak> questionBnakList3=new ArrayList<QuestionBnak>();
			//��ȡÿ��һ�����е�����������Ϣ
			questionDaily=questionDailyService.getQuestionDailyById(qdId);
			//ҳ���ֵquestionDaily
			request.setAttribute("questionDaily", questionDaily);
			//�����ݿ�ȡ����������id
			String qbIds[]=questionDaily.getQdQbid().split(",");
			
			
	    	for(int i=0;i<qbIds.length;i++){
	    		long qbId1=Long.parseLong(qbIds[i]);
	    		//��������ȡ��Ӧ��������Ϣ
	    		questionBank=questionBankService.getQusetionBankById(qbId1);
	    	
	    		//�����ͱ���ȡ��Ӧ���͵�id
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
	    	
			return "questionpapers/questionDailyTest1";
			
		}
		
		//1.3������Ϣ�����֤
		@ResponseBody
		@RequestMapping("questionDailyFormInfo1")
		public boolean questionDailyFormInfo1(Map<String, Object> map,QuestionPaper questionPaper){
			//��ȡsession�д�����student����
			Student student=(Student)map.get("student");
			boolean flag=false;
			
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			Criteria criteria=questionPaperExample.createCriteria();
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
		@RequestMapping("questionDailyFormInfo")
		public String dailySuccess(HttpServletRequest request,Map<String, Object> map){
			//1.������Ϣ���
			//��ȡsession�д�����student����
			Student student1=(Student)map.get("student");
			
			long qdId=Long.parseLong(request.getParameter("qdId"));
			
			QuestionDaily questionDaily=new QuestionDaily();
			//��ȡÿ��һ�����е�����������Ϣ
			questionDaily=questionDailyService.getQuestionDailyById(qdId);
			//����һ���������������id��
			String qdIds[]=questionDaily.getQdQbid().split(",");
			//ѭ������map
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
				//��������������
				questionPaperService.addQuestionPaper((QuestionPaper)map.get(qdIds[i]));
			}
			
			
			//2.���������Ӵ������
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
//				if(!questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
				//����˴���Ϊ�յ����⣨�����ύ�׾���
				if(!questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
					QuestionError questionError=new QuestionError();
					//ע��questionErrorExample����һ��Ҫ����ѭ���У�����ÿ��ѭ�������µĶ���
					QuestionErrorExample questionErrorExample=new QuestionErrorExample();
					com.pctc.model.QuestionErrorExample.Criteria criteria=questionErrorExample.createCriteria();
					criteria.andQeQpidEqualTo(qpQbid);
					criteria.andQeSidEqualTo(student1.getsId());
					//��������id��ѯ������Ϣ
					List <QuestionError> questionErrorList=questionErrorService.getAllQuesionError(questionErrorExample);
					
					//�жϴ�������Ƿ��и����⣨�����ظ����ӣ�
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
						//�����������Ӵ���
						questionErrorService.addQuestionError(questionError);
					}
				}	
			}
			
			
			return "questionpapers/questionInfoSuccess";
			
		}
		
	
		
		//2.1��תѡ��ѧ��idҳ��
		/*@RequestMapping("questionPaperPage")
		public String questionDailyFormInfo(Map<String, Object> map){
			StudentExample studentExample=new StudentExample();
			com.pctc.model.StudentExample.Criteria criteria=studentExample.createCriteria();
			//�ҳ�δ��ɾ����ѧ����Ϣ
			criteria.andSDeleteEqualTo(false);
			//��ѧ�����еõ���������ȫ����ѧ����Ϣ
			List<Student> studentList=studentService.getStudent(studentExample);
			map.put("studentList", studentList);
			return "questionPaperChooseSid";
		}*/
		
		//2.2��תѡ���Ծ�����ҳ��
		@RequestMapping("questionPaperPage")
		public String questionDailyPaperToForm1(Map<String, Object> map){
			//��ȡsession�д�����student����
			Student student=(Student)map.get("student");
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			Criteria criteria=questionPaperExample.createCriteria();
			System.err.println(student);
			//��ȡ�����û�ѡ���ѧ��id
			criteria.andQpSidEqualTo(student.getsId());
			criteria.andQpDeleteEqualTo(false);
			
			//�ӿ��Ա����õ����з��������Ĵ�����Ϣ
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
            //��ֹ���������Ĵ�����Ϣ��Ϊ��
			if(questionPaperList.size()==0){
				return "questionpapers/questionPaperInfoError";
			}else{
				//����һ������Ծ����Ƶ�list
				List<QuestionPaper> questionPapers=new ArrayList<QuestionPaper>();
				
				//��ֹ�Ծ������ظ�
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
				
				
		//2.3�鿴������Ϣҳ��
		@RequestMapping("questionPaperToInfo")
		public String questionDailyPaperToInfo(Map<String, Object> map,HttpServletRequest request,QuestionPaper questionpaper){
			//��ȡsession�д�����student����
			Student student=(Student)map.get("student");
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			Criteria criteria=questionPaperExample.createCriteria();
			//��ȡ�û�ѡ�������
			criteria.andQpSidEqualTo(student.getsId());
			criteria.andQpNameEqualTo(questionpaper.getQpName());
			//�ӿ��Ա����õ����з��������Ĵ�����Ϣ
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			request.setAttribute("questionPaper", questionPaperList.get(0));
			
			
			//����һ����������������е�����id��Ϣ
			Long qbIds[]=new Long[questionPaperList.size()];
			//��id��Ϣ��ֵ���������
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
				
	    		//�����ͱ���ȡ��Ӧ���͵�id
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
	    			
	    			questionPaperList1.add(questionPaperList.get(i));
	    			questionBnaks1.add(questionBank);
	    			
	    		}
	    		//�ж��Ƿ�Ϊ�����
	    		else if(questionBank.getQbQtid()==questionType2.getQtId()){
	    			questionPaperList2.add(questionPaperList.get(i));
	    			questionBnaks2.add(questionBank);
	    		}
	    		//�ж��Ƿ�Ϊ�ж���
	    		else if(questionBank.getQbQtid()==questionType3.getQtId()){
	    			questionPaperList3.add(questionPaperList.get(i));
	    			questionBnaks3.add(questionBank);
	    		}
	    		
	    	}
		 
			
				System.err.println(questionPaperList.get(0));
			
		  	
    		//����map��
	    	map.put("questionPaperList1", questionPaperList1);
	    	map.put("questionPaperList2", questionPaperList2);
	    	map.put("questionPaperList3", questionPaperList3);
	    	map.put("questionBnakList1", questionBnaks1);
	    	map.put("questionBnakList2", questionBnaks2);
	    	map.put("questionBnakList3", questionBnaks3);
			
		
			return "questionpapers/questionPaperInfo1";
		}
		
		
		/*//3.1��ת��ѡ��ѧ��id����ҳ��
		@RequestMapping("questionErrorPage")
		public String questionErrorPage(Map<String, Object> map){
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
				if(!questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
					QuestionError questionError=new QuestionError();
					//ע��questionErrorExample����һ��Ҫ����ѭ���У�����ÿ��ѭ�������µĶ���
					QuestionErrorExample questionErrorExample=new QuestionErrorExample();
					com.pctc.model.QuestionErrorExample.Criteria criteria=questionErrorExample.createCriteria();
					criteria.andQeQpidEqualTo(qpQbid);
					//��������id��ѯ������Ϣ
					List <QuestionError> questionErrorList=questionErrorService.getAllQuesionError(questionErrorExample);
					//�жϴ�������Ƿ��и����⣨�����ظ����ӣ�
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
						//�����������Ӵ���
						questionErrorService.addQuestionError(questionError);
					}
				}	
			}
			
			QuestionErrorExample errorExample=null;
			//��ѯ����������е�����
//			List<QuestionError> questionErrorList=questionErrorService.getAllQuesionError(errorExample);
			List<QuestionError> errors=questionErrorService.getAllQuesionError(errorExample);
			//����һ�����ѧ��id��list
			List<QuestionError> errors=new ArrayList<QuestionError>();
			
			//��ֹѧ��id�ظ�
			for(int i=0;i<questionErrorList.size()-1;i++){
				if(questionErrorList.get(i).getQeSid()!=questionErrorList.get(i+1).getQeSid()){
					errors.add(questionErrorList.get(i));
				}
			}
			map.put("errors", errors);
			
			
			return "questionErrorChooseSid";
		}
		*/
		
		
		//3.2��ת������ҳ��
		@RequestMapping("questionErrorPage")
//		@RequestMapping("questionErrorToInfo")
		public String questionErrorToInfo(Map<String, Object> map,HttpServletRequest request){
			//��ȡsession�д�����student����
			Student student=(Student)map.get("student");
			
			
			
			
			//2.��ʾ�������
			QuestionErrorExample questionErrorExample=new QuestionErrorExample();
			com.pctc.model.QuestionErrorExample.Criteria criteria=questionErrorExample.createCriteria();
	        //���û�ѡ���ѧ��id�����ѯ������
			criteria.andQeSidEqualTo(student.getsId());
			criteria.andQeDeleteEqualTo(false);
			//�������������idΪ�û�ѡ���ѧ��id�Ĵ����ҳ���
			List <QuestionError> questionErrorList=questionErrorService.getAllQuesionError(questionErrorExample);
			//��ֹ���������Ĵ����Ϊ��
			if(questionErrorList.size()==0){
				return "questionpapers/questionErrorInfoError";
			}else{
				List<QuestionBnak> questionBnaks1=new ArrayList<QuestionBnak>();
				List<QuestionBnak> questionBnaks2=new ArrayList<QuestionBnak>();
				List<QuestionBnak> questionBnaks3=new ArrayList<QuestionBnak>();
				//����������Ϣ
				for(int i=0;i<questionErrorList.size();i++){
					long qbId=questionErrorList.get(i).getQeQpid();
					QuestionBnak questionBank=questionBankService.getQusetionBankById(qbId);
					//�����ͱ���ȡ��Ӧ���͵�id
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
		    			
		    			questionBnaks1.add(questionBank);
		    		}
		    		//�ж��Ƿ�Ϊ�����
		    		else if(questionBank.getQbQtid()==questionType2.getQtId()){
		    			questionBnaks2.add(questionBank);
		    		}
		    		//�ж��Ƿ�Ϊ�ж���
		    		else if(questionBank.getQbQtid()==questionType3.getQtId()){
		    			questionBnaks3.add(questionBank);
		    		}
				}
				
				//����map��
		    	map.put("questionBnakList1", questionBnaks1);
		    	map.put("questionBnakList2", questionBnaks2);
		    	map.put("questionBnakList3", questionBnaks3);
				
				return "questionpapers/questionErrorInfo1";
			}
			
		}
		
		
		//4.1��תѡ��ѧ��idҳ��
		/*@RequestMapping("questionGradePage")
		public String questionGradePage(Map<String, Object> map){
			StudentExample studentExample=new StudentExample();
			com.pctc.model.StudentExample.Criteria criteria=studentExample.createCriteria();
			criteria.andSDeleteEqualTo(false);
			//��ѧ�����еõ�ȫ����ѧ����Ϣ
			List<Student> studentList=studentService.getStudent(studentExample);
			map.put("studentList", studentList);
			return "questionGradeChooseSid";
		}*/
		
		//4.2��תѡ���Ծ�����ҳ��
		@RequestMapping("questionGradePage")
		public String questionGradeToForm(Map<String, Object> map,HttpServletRequest request){
			//��ȡsession�д�����student����
			Student student=(Student)map.get("student");
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			Criteria criteria=questionPaperExample.createCriteria();
			//��ȡ�����û�ѡ���ѧ��id
			criteria.andQpSidEqualTo(student.getsId());
			criteria.andQpDeleteEqualTo(false);
			request.setAttribute("sId", student.getsId());
			//�ӿ��Ա����õ����з��������Ĵ�����Ϣ
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			//��ֹ������Ϣ��Ϊ��
			if(questionPaperList.size()==0){
				return "questionpapers/questionGradeInfoError";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
			}else{
				//����һ������Ծ����Ƶ�list
				List<QuestionPaper> questionPapers=new ArrayList<QuestionPaper>();
				
				//��ֹ�Ծ������ظ�
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
		
		//4.3�Ծ�������������Լ����
		@RequestMapping("questionGradeToInfo")
		public String questionGradeToInfo(Map<String, Object> map,HttpServletRequest request,QuestionPaper questionpaper){
			//��ҳ���ȡѧ��id
			Long sId=Long.parseLong(request.getParameter("sId"));
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			Criteria criteria=questionPaperExample.createCriteria();
			//��ȡ�û�ѡ�������
			criteria.andQpSidEqualTo(sId);
			criteria.andQpNameEqualTo(questionpaper.getQpName());
			//�ӿ��Ա����õ����з��������Ĵ�����Ϣ
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			QuestionBnak questionBnak=new QuestionBnak();
			
			//�����ͱ���ȡ��Ӧ���͵�id
			QuestionType questionType1=new QuestionType();
    		QuestionType questionType2=new QuestionType();
    		QuestionType questionType3=new QuestionType();
    		
    		//�����ܷ���
    		int sum=0;
			for(int i=0;i<questionPaperList.size();i++){
				
				//ѭ��ȡ��ÿһ��������Ϣ������id
				long qpQbid=questionPaperList.get(i).getQpQbid();
				
				//����id�����ȡ��������Ϣ
				questionBnak=questionBankService.getQusetionBankById(qpQbid);
				
				//�ж���ʲô����
				questionType1=questionTypeService.getQuestionTypeName("ѡ����");
	    		questionType2=questionTypeService.getQuestionTypeName("�����");
	    		questionType3=questionTypeService.getQuestionTypeName("�ж���");
	    		//���Ϊѡ����
	    		
				if(questionBnak.getQbQtid()==questionType1.getQtId()){
					//������ȷ
					/*if(questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
						sum=sum+questionType1.getQtGrade();
						
					}*/
					//����˴���Ϊ�յ����⣨�����ύ�׾���
					if(questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
						sum=sum+questionType1.getQtGrade();
						
					}
				}
				//���Ϊ�����
                if(questionBnak.getQbQtid()==questionType2.getQtId()){
                	/*if(questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
						sum=sum+questionType2.getQtGrade();
						
					}*/
                	//����˴���Ϊ�յ����⣨�����ύ�׾���
                	if(questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
						sum=sum+questionType2.getQtGrade();
						
					}
					
				}
				//���Ϊ�ж���
                if(questionBnak.getQbQtid()==questionType3.getQtId()){
                	/*if(questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
						sum=sum+questionType3.getQtGrade();
						
					}*/
                	//����˴���Ϊ�յ����⣨�����ύ�׾���
                	if(questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
						sum=sum+questionType3.getQtGrade();
						
					}
				}
                
				
			}
			
			//��ѯ���ݿ��Ƿ��Ѵ��ڸ��Ծ���������ֹ�ظ����
			GradeExample gradeExample1=new GradeExample();
			com.pctc.model.GradeExample.Criteria criteria2=gradeExample1.createCriteria();
			criteria2.andGQpnameEqualTo(questionpaper.getQpName());
			List<Grade> gradesList=gradeService.getGrade(gradeExample1);
			System.err.println(gradesList.size());
			
			if(gradesList.size()==0){
				//����������
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
			
			//��ѯ��������
			GradeExample gradeExample2=new GradeExample();
			com.pctc.model.GradeExample.Criteria criteria3=gradeExample2.createCriteria();
			criteria3.andGQpnameEqualTo(questionpaper.getQpName());
			List<Grade> grades=gradeService.getGrade(gradeExample2);
			map.put("grades", grades);
			
			return "questionpapers/questionGradeInfo";
	
		}
		
		
		//5.��ʦ�鿴ѧ��������Ϣ����
		//5.1 ��ת����ʦѡ��ѧ��ѧ��ҳ��
		@RequestMapping("questionPaperPageTeacher")
		public String questionPaperPageTeacher(Map<String, Object> map){
			//��ѯ����δ��ɾ����ѧ����Ϣ
			StudentExample studentExample=new StudentExample();
			com.pctc.model.StudentExample.Criteria criteria=studentExample.createCriteria();
			criteria.andSDeleteEqualTo(false);
			List<Student> students=studentService.getStudent(studentExample);
			//map��ֵ
			map.put("students", students);
			return "questionpapers/questionPaperPageTeacherChooseSUsername";
		}
		
		
		
		//5.2 ��ת����ʦѡ��鿴�Ծ�����ҳ��
		@RequestMapping("questionPaperPageTeacherToChooseQpName")
		public String questionPaperPageTeacherToChooseQpName(Student student,Map<String, Object> map,HttpServletRequest request){
			//�ȸ��ݽ�ʦѡ���ѧ��ѧ��ȥѧ�������ҵ�ѧ��id
			StudentExample studentExample=new StudentExample();
			com.pctc.model.StudentExample.Criteria criteria=studentExample.createCriteria();
			criteria.andSUsernameEqualTo(student.getsUsername());
			List<Student> students=studentService.getStudent(studentExample);
			
			//ҳ���ֵ
			long sId=students.get(0).getsId();
			request.setAttribute("sId", sId);
			
			
			//�ٸ��ݵõ���ѧ��idȥ�������Ѱ�Ҷ�Ӧ�Ĵ�����Ϣ
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			com.pctc.model.QuestionPaperExample.Criteria criteria1=questionPaperExample.createCriteria();
			criteria1.andQpSidEqualTo(sId);
			criteria1.andQpDeleteEqualTo(false);
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			
			//����������û�и�ѧ���Ĵ�����Ϣ
			if(questionPaperList.size()==0){
				return "questionpapers/questionPaperPageTeacherChooseQpNameError";
			
			}else{
				//����һ������Ծ����Ƶ�list
				List<QuestionPaper> questionPapers=new ArrayList<QuestionPaper>();
				
				//��ֹ�Ծ������ظ�
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
		
		
		//5.3 ��ת����ʾѧ��������Ϣҳ��
		@RequestMapping("questionPaperPageTeacherToInfo")
		public String questionPaperPageTeacherToInfo(Map<String, Object> map,HttpServletRequest request,QuestionPaper questionpaper){
			long sId=Long.parseLong(request.getParameter("sId"));
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			Criteria criteria=questionPaperExample.createCriteria();
			//��ȡ�û�ѡ�������
			criteria.andQpSidEqualTo(sId);
			criteria.andQpNameEqualTo(questionpaper.getQpName());
			//�ӿ��Ա����õ����з��������Ĵ�����Ϣ
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			request.setAttribute("questionPaper", questionPaperList.get(0));
			
			
			//����һ����������������е�����id��Ϣ
			Long qbIds[]=new Long[questionPaperList.size()];
			//��id��Ϣ��ֵ���������
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
				
	    		//�����ͱ���ȡ��Ӧ���͵�id
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
	    			
	    			questionPaperList1.add(questionPaperList.get(i));
	    			questionBnaks1.add(questionBank);
	    			
	    		}
	    		//�ж��Ƿ�Ϊ�����
	    		else if(questionBank.getQbQtid()==questionType2.getQtId()){
	    			questionPaperList2.add(questionPaperList.get(i));
	    			questionBnaks2.add(questionBank);
	    		}
	    		//�ж��Ƿ�Ϊ�ж���
	    		else if(questionBank.getQbQtid()==questionType3.getQtId()){
	    			questionPaperList3.add(questionPaperList.get(i));
	    			questionBnaks3.add(questionBank);
	    		}
	    		
	    	}
		 
			
				System.err.println(questionPaperList.get(0));
			
		  	
    		//����map��
	    	map.put("questionPaperList1", questionPaperList1);
	    	map.put("questionPaperList2", questionPaperList2);
	    	map.put("questionPaperList3", questionPaperList3);
	    	map.put("questionBnakList1", questionBnaks1);
	    	map.put("questionBnakList2", questionBnaks2);
	    	map.put("questionBnakList3", questionBnaks3);
			
		
	    	return "questionpapers/questionPaperPageTeacherInfo";
		}
			
			
		//6.��ʦ�鿴ѧ�����Գɼ�����
		//6.1 ��ת��ѡ��ѧ��ѧ��ҳ��
		@RequestMapping("questionGradePageTeacher")
		public String questionGradePageTeacher(Map<String, Object> map){
			//��ѯ����δ��ɾ����ѧ����Ϣ
			StudentExample studentExample=new StudentExample();
			com.pctc.model.StudentExample.Criteria criteria=studentExample.createCriteria();
			criteria.andSDeleteEqualTo(false);
			List<Student> students=studentService.getStudent(studentExample);
			//map��ֵ
			map.put("students", students);
			return "questionpapers/questionGradePageTeacherChooseSUsername";
		}
		
		
		//6.2��ת����ʦѡ��鿴�Ծ�����ҳ��
		@RequestMapping("questionGradePageTeacherToChooseQpName")
		public String questionGradePageTeacherToInfo(Student student,Map<String, Object> map,HttpServletRequest request){
			//�ȸ��ݽ�ʦѡ���ѧ��ѧ��ȥѧ�������ҵ�ѧ��id
			StudentExample studentExample=new StudentExample();
			com.pctc.model.StudentExample.Criteria criteria=studentExample.createCriteria();
			criteria.andSUsernameEqualTo(student.getsUsername());
			List<Student> students=studentService.getStudent(studentExample);
			
			//ҳ���ֵ
			long sId=students.get(0).getsId();
			request.setAttribute("sId", sId);
			
			
			//�ٸ��ݵõ���ѧ��idȥ�������Ѱ�Ҷ�Ӧ�Ĵ�����Ϣ
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			com.pctc.model.QuestionPaperExample.Criteria criteria1=questionPaperExample.createCriteria();
			criteria1.andQpSidEqualTo(sId);
			criteria1.andQpDeleteEqualTo(false);
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			
			//����������û�и�ѧ���Ĵ�����Ϣ
			if(questionPaperList.size()==0){
				return "questionpapers/questionGradePageTeacherChooseQpNameError";
			
			}else{
				//����һ������Ծ����Ƶ�list
				List<QuestionPaper> questionPapers=new ArrayList<QuestionPaper>();
				
				//��ֹ�Ծ������ظ�
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
		
		
		
		//6.3�Ծ�������������Լ����
		@RequestMapping("questionGradePageTeacherToInfo")
		public String questionGradePageTeacherToInfo(Map<String, Object> map,HttpServletRequest request,QuestionPaper questionpaper){
			//��ҳ���ȡѧ��id
			Long sId=Long.parseLong(request.getParameter("sId"));
			QuestionPaperExample questionPaperExample=new QuestionPaperExample();
			Criteria criteria=questionPaperExample.createCriteria();
			//��ȡ�û�ѡ�������
			criteria.andQpSidEqualTo(sId);
			criteria.andQpNameEqualTo(questionpaper.getQpName());
			//�ӿ��Ա����õ����з��������Ĵ�����Ϣ
			List<QuestionPaper> questionPaperList=questionPaperService.getAllQuestionPaper(questionPaperExample);
			QuestionBnak questionBnak=new QuestionBnak();
			
			//�����ͱ���ȡ��Ӧ���͵�id
			QuestionType questionType1=new QuestionType();
    		QuestionType questionType2=new QuestionType();
    		QuestionType questionType3=new QuestionType();
    		
    		//�����ܷ���
    		int sum=0;
			for(int i=0;i<questionPaperList.size();i++){
				
				//ѭ��ȡ��ÿһ��������Ϣ������id
				long qpQbid=questionPaperList.get(i).getQpQbid();
				
				//����id�����ȡ��������Ϣ
				questionBnak=questionBankService.getQusetionBankById(qpQbid);
				
				//�ж���ʲô����
				questionType1=questionTypeService.getQuestionTypeName("ѡ����");
	    		questionType2=questionTypeService.getQuestionTypeName("�����");
	    		questionType3=questionTypeService.getQuestionTypeName("�ж���");
	    		//���Ϊѡ����
	    		
				if(questionBnak.getQbQtid()==questionType1.getQtId()){
					//������ȷ
					/*if(questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
						sum=sum+questionType1.getQtGrade();
						
					}*/
					//����˴���Ϊ�յ����⣨�����ύ�׾���
					if(questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
						sum=sum+questionType1.getQtGrade();
						
					}
				}
				//���Ϊ�����
                if(questionBnak.getQbQtid()==questionType2.getQtId()){
                	/*if(questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
						sum=sum+questionType2.getQtGrade();
						
					}*/
                	//����˴���Ϊ�յ����⣨�����ύ�׾���
                	if(questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
						sum=sum+questionType2.getQtGrade();
						
					}
					
				}
				//���Ϊ�ж���
                if(questionBnak.getQbQtid()==questionType3.getQtId()){
                	/*if(questionPaperList.get(i).getQpAnswer().equals(questionBnak.getQbAnswer())){
						sum=sum+questionType3.getQtGrade();
						
					}*/
                	//����˴���Ϊ�յ����⣨�����ύ�׾���
                	if(questionBnak.getQbAnswer().equals(questionPaperList.get(i).getQpAnswer())){
						sum=sum+questionType3.getQtGrade();
						
					}
				}
                
				
			}
			
			//��ѯ���ݿ��Ƿ��Ѵ��ڸ��Ծ���������ֹ�ظ����
			GradeExample gradeExample1=new GradeExample();
			com.pctc.model.GradeExample.Criteria criteria2=gradeExample1.createCriteria();
			criteria2.andGQpnameEqualTo(questionpaper.getQpName());
			List<Grade> gradesList=gradeService.getGrade(gradeExample1);
			System.err.println(gradesList.size());
			
			if(gradesList.size()==0){
				//����������
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
			
			//��ѯ��������
			GradeExample gradeExample2=new GradeExample();
			com.pctc.model.GradeExample.Criteria criteria3=gradeExample2.createCriteria();
			criteria3.andGQpnameEqualTo(questionpaper.getQpName());
			List<Grade> grades=gradeService.getGrade(gradeExample2);
			map.put("grades", grades);
			
			return "questionpapers/questionGradePageTeacherInfo";
		}
		
		
		
		
		
		

		/*//������ʱ�����͵Ĵ�������			
		@InitBinder
		public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			dateFormat.setLenient(false);
			binder.registerCustomEditor(Date.class, new CustomDateEditor(
					dateFormat, false));
		}*/
		
		
		
		
		

}