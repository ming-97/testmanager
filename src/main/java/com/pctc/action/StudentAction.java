package com.pctc.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pctc.model.Student;
import com.pctc.service.StudentService;

@Controller
@RequestMapping("/student")
@SessionAttributes(value = { "student" }, types = { String.class })
public class StudentAction {

	@Autowired
	private StudentService studentService;

	// ��ѯѧ��������Ϣ
	@RequestMapping("/students")
	public String getStdudents() {

		return "student/student-information";
	}

	// ��ת�޸�����ҳ��
	@RequestMapping("/toUpdatePassword")
	public String toUpdatePassword() {

		return "student/update-password";
	}

	// �޸�����
	@RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
	public String updatePassword(Student student, Map<String, Object> map) {
		System.out.println(student.getsPassword());
		if (student.getsPassword()!=null && !"".equals(student.getsPassword())) {
			Student student1=(Student) map.get("student");
			
			student.setsModifyBy(student1.getsUsername());
			student.setsModifyTime(new Date());

			studentService.updateStudent(student);
			return "success";
		}
		return null;
				
	}
	
	//�鿴������Ϣ
	@RequestMapping("/studentShow")
	public String getStdudent() {

		return "student/student-show";
	}
	

	// ������ʱ�����͵Ĵ�������
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// true����������ֵΪ��
	}

}