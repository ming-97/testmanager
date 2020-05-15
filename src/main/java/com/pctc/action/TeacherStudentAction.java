package com.pctc.action;

import java.text.SimpleDateFormat;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pctc.model.Student;
import com.pctc.model.StudentExample;
import com.pctc.model.Teacher;
import com.pctc.model.StudentExample.Criteria;
import com.pctc.service.TeacherStudentService;

@Controller
@RequestMapping("/teacher")
public class TeacherStudentAction {

	@Autowired
	private TeacherStudentService studentService;

	// ��ת������ҳ��
	@RequestMapping("/studentAddInput")
	public String addStudentPage() {
		return "student/student-add";
	}

	// ִ������ѧ��ҵ��
	@RequestMapping(value = "/studentAddForm", method = RequestMethod.POST)
	public String addStudent(HttpServletRequest request,Student student, Map<String, Object> map) {
		Teacher teacher=(Teacher)request.getSession().getAttribute("teacher");//��ȡsession�е�ֵ
		student.setsCreateBy(teacher.gettUsername());
		student.setsCreateTime(new Date());
		student.setsDelete(false);
		studentService.addStudent(student);
		return "success";
	}

	// ��ѯ�������ݣ�Map<String, Object> map�Ǵ洢���ݵ�ҳ����
	@RequestMapping(value = "/students")
	public String getStudents(Map<String, Object> map) {
		StudentExample studentExample = new StudentExample();
		Criteria criteria = studentExample.createCriteria();
		criteria.andSDeleteEqualTo(false);
		List<Student> students = studentService.getStudent(studentExample);
		map.put("students", students);
		return "student/student-list";
	}

	// ������ҳ��ѯ��������
	@RequestMapping("/studentsPageIf")

	public String getStudentsPageIf(@RequestParam(value = "pagenum", defaultValue = "1") Integer pagenum,
			Map<String, Object> map, Student student) {
		// ���ڲ�ѯ֮ǰ ��ҳ���PageHelper
		Page<Object> page = PageHelper.startPage(pagenum, 5);// �ڼ�ҳ��ÿҳ������
		StudentExample studentExample = new StudentExample();
		Criteria criteria = studentExample.createCriteria();
		if (student.getsUsername() != null && !"".equals(student.getsUsername())) {
			criteria.andSUsernameLike("%" + student.getsUsername() + "%");
		}
		if (student.getsId() != null) {
			criteria.andSIdEqualTo(student.getsId());
		}
		if (student.getsInsid() != null) {
			criteria.andSInsidEqualTo(student.getsInsid());
		}
		if (student.getsCreateTime() != null) {
			criteria.andSCreateTimeEqualTo(student.getsCreateTime());
		}
		criteria.andSDeleteEqualTo(false);

		List<Student> students = studentService.getStudent(studentExample);

		// ��ҳ�����ϢPageInfo
		PageInfo<Student> info = new PageInfo<Student>(students, 5);
		map.put("students", students);
		map.put("infos", info);
		return "student/student-list";
	}

	// ��ת�޸�ҳ��
	@RequestMapping("/studentUpdate")
	public String studentUpdateInput(@RequestParam(value = "sId") Long sId, Map<String, Object> map) {
		Student student = studentService.getStudent(sId);
		map.put("student", student);

		return "student/student-update";
	}

	// �޸�����
	@RequestMapping(value = "/updateStudent", method = RequestMethod.POST)
	public String updateStudent(HttpServletRequest request,Student student, Map<String, Object> map) {
		Teacher teacher=(Teacher)request.getSession().getAttribute("teacher");//��ȡsession�е�ֵ
		student.setsModifyTime(new Date());
		student.setsModifyBy(teacher.gettUsername());
		studentService.updateStudent(student);
		return "success";

	}

	// ɾ������
	@ResponseBody
	@RequestMapping(value ="/studentDelete", method = RequestMethod.POST)
	public int deleteStudent(Long sId) {
		int i=0;
		i=studentService.deleteStudentFalse(sId);
		return i;
	}

	// ����������ѯ��������ͬ���Ͳ�������
	// ���ص�������json����
	@ResponseBody
	@RequestMapping("/studentName1")
	public boolean getStudentName1(Student student) {
		boolean exits = false;
		StudentExample studentExample = new StudentExample();
		Criteria criteria = studentExample.createCriteria();
		if (student.getsUsername() != null && !student.getsUsername().trim().equals("")) {
			criteria.andSUsernameEqualTo(student.getsUsername());
			criteria.andSDeleteEqualTo(false);
		}
		List<Student> students = studentService.getStudent(studentExample);
		
		if (students.size() > 0){
			exits = true;
		}else{
			exits = false;
		}
		return exits;
	}

	// ������ʱ�����͵Ĵ�������
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// true����������ֵΪ��
	}
}