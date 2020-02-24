package com.pctc.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pctc.model.Institutions;
import com.pctc.model.InstitutionsExample;
import com.pctc.model.Teacher;
import com.pctc.model.TeacherExample;
import com.pctc.model.TeacherExample.Criteria;
import com.pctc.service.InstitutionsService;
import com.pctc.service.TeacherService;

import aj.org.objectweb.asm.Type;

@Controller
@RequestMapping("teacher")
public class TeacherAction {

	@Autowired
	private TeacherService teacherService;
	
	
	@Autowired
	private InstitutionsService institutionsService;

	// 查询所有教师信息
	@RequestMapping("teachers")
	public String seleteTeacher(Map<String, Object> map) {
		TeacherExample teacherExample = null;
		List<Teacher> teachers = teacherService.seleteByExample(teacherExample);
		map.put("teachers", teachers);
		return "seleteteacher";

	}

	// 多条件查询
	@RequestMapping("toteacherifmanyPage")
	public String toteacherifmanyPage() {
		return "teacherList";
	}
	
	//挑转到个人主页
	@RequestMapping("selectMyself")
	public String selectMyself(){
		return "question/myselfinfo";
	}
	
	//跳转到修改密码页面
	@RequestMapping("toupdatePassword")
	public String updatePassword(Teacher teacher,Map<String, Object> map){
		teacher=teacherService.selectTeacher(teacher.gettId());
		map.put("teacher", teacher);
		return "question/myselfinfoupdate";
	}
	
	//修改密码
	@RequestMapping("updateteacherPassword")
	public String updatePassword1(Teacher teacher,Map<String, Object> map){
		teacherService.updateTeacher(teacher);
		return "redirect:../teacher/selectMyself";
	}
	
	
	@RequestMapping("teacherifmany")
	public String seleteTeacherIfMany(Map<String, Object> map, Teacher teacher) {

		TeacherExample teacherExample = new TeacherExample();
		Criteria criteria = teacherExample.createCriteria();
		if (teacher.gettUsername() != null && !"".equals(teacher.gettUsername().trim()))
			criteria.andTUsernameEqualTo(teacher.gettUsername());
		if (teacher.gettPassword() != null && !"".equals(teacher.gettPassword().trim()))
			criteria.andTPasswordEqualTo(teacher.gettPassword());
		List<Teacher> teachers = teacherService.seleteByExample(teacherExample);
		map.put("teachers", teachers);
		return "teacherList";
	}

	// 跳转的添加页面
	@RequestMapping("teacherAddInput")
	public String addTeacher() {
		return "teacherAdd";
	}

	// 执行添加教师业务
	@RequestMapping(value = "teacherAddForm1")
	public String addStudent(HttpServletRequest request,Teacher teacher, Map<String, Object> map) {
		// 当前用户名是否存在
		Teacher teacher2=(Teacher)request.getSession().getAttribute("teacher");
		//System.err.println(teacher2);
		teacher.settInsid(teacher2.gettInsid());
		teacher.settCreateBy(teacher2.gettUsername());
		teacher.settDelete(false);
		teacher.settCreateTime(new Date());
		if (teacher.gettUsername() != null && !"".equals(teacher.gettUsername().trim())){
			if(teacher.gettPassword()!=null&&!"".equals(teacher.gettPassword().trim())){
				teacherService.inseltTeacher(teacher);
			}
			return "redirect:../returnPage/toadmin-role";
		}else{
			return "redirect:../returnPage/toadmin-role-add";
		}	
	}

	//ajax调用，添加前检查库中是都已有该数据
	@ResponseBody
	@RequestMapping(value = "teacherAddForm")
	public boolean addTeacher(Teacher teacher) {
		boolean exits = false;
		teacher.settDelete(false);
		TeacherExample teacherExample = new TeacherExample();
		Criteria criteria = teacherExample.createCriteria();
		if (teacher.gettUsername() != null && !teacher.gettUsername().trim().equals(""))
		{
			criteria.andTUsernameEqualTo(teacher.gettUsername());
		List<Teacher> teachers = teacherService.seleteByExample(teacherExample);
		if (teachers.size() > 0)
			exits = true;
		else
			exits = false;
		}
		else{
			exits=false;
		}
		return exits;
	}

	// 分页查询所有数据
	@RequestMapping("teacherPage")
	public String getTeacherpage(@RequestParam(value = "pagenum", defaultValue = "1") Integer pagenum,
			Map<String, Object> map) {
		// 放在查询之前，分页插件PageHelper
		Page<Object> page = PageHelper.startPage(pagenum, 10);// 第几页第几条
		TeacherExample teacherExample = new TeacherExample();
		List<Teacher> teachers = teacherService.seleteByExample(teacherExample);
		// 分页插件信息PageInfo
		PageInfo<Teacher> info = new PageInfo<Teacher>(teachers, 3);
		map.put("teachers", teachers);
		map.put("infos", info);
		return "teacherList2";
	}

	// 查询所有教师信息
	@RequestMapping("updatedeleteTeacher")
	public String updatedeleteTeacher(Map<String, Object> map) {
		TeacherExample teacherExample = null;
		List<Teacher> teachers = teacherService.seleteByExample(teacherExample);
		map.put("teacherss", teachers);
		return "question/admin-role";

	}

	// 跳转的修改页面
	@RequestMapping("updateTeacherUi")
	public String updateTeacherUi(Long tId, Map<String, Object> map) {
		Teacher teacher = teacherService.selectTeacher(tId);
		if (teacher != null) {
			InstitutionsExample example=new InstitutionsExample();
			com.pctc.model.InstitutionsExample.Criteria criteria=example.createCriteria();
			criteria.andInsDeleteEqualTo(false);
			List<Institutions> list=institutionsService.selectAllInstitutions(example);
			map.put("institutions", list);
			map.put("teachersss", teacher);
		}
		return "question/admin-role-update";
	}

	// 修改数据
	@RequestMapping("updateTeacher")
	public String updateTeacher(HttpServletRequest request,Teacher teacher,Map<String, Object> map) {
		teacher.settDelete(false);
		Teacher teacher2=(Teacher)request.getSession().getAttribute("teacher");//获取session中的值
		teacher.settModifyBy(teacher2.gettUsername());
		teacher.settModifyTime(new Date());
		teacherService.updateTeacher(teacher);
		return "redirect:../returnPage/toadmin-role";
	}

	// 真删除数据
	@RequestMapping("deleteTeacher")
	public String deleteTeacher(Long tId) {
		teacherService.deleteTeacher(tId);
		return "success";

	}


	
	
	
	//假删除
	@ResponseBody
	@RequestMapping(value="deleteTeacherFalse",method=RequestMethod.POST)
	public int deleteTeacherFalse(Teacher teacher,Map<String, Object> map) {
		int i=0;
		int count=teacherService.deleteTeacherFalse(teacher.gettId());
		if(count==0){
			i=0;
		}else{
			i=1;
		}
		return i;
	}

}
