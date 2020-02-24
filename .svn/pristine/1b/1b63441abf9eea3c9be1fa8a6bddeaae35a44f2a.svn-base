package com.pctc.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pctc.model.Teacher;
import com.pctc.model.TeacherExample;
import com.pctc.model.TeacherExample.Criteria;
import com.pctc.service.TeacherService;

@Controller
@RequestMapping("/teacherlogin")
public class TeacherLoginAction {

	@Autowired
	private TeacherService teacherService;

	// 登录
	@RequestMapping(value = "/teacherLogin")
	public String teacherLogin(HttpServletRequest request,Teacher teacher,Map<String, Object> map,HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		TeacherExample teacherExample = new TeacherExample();
		Criteria criteria = teacherExample.createCriteria();
		
		if (teacher.gettUsername() != null && !"".equals(teacher.gettUsername())) {
			criteria.andTUsernameEqualTo(teacher.gettUsername());
			criteria.andTDeleteEqualTo(false);
			List<Teacher> teachers=teacherService.seleteByExample(teacherExample);
		if (teachers.size()>0) {		
			if (teachers.get(0).gettPassword().equals(teacher.gettPassword())) {
				HttpSession session=request.getSession();
				Teacher teacher1=teachers.get(0);
				session.setAttribute("teacher", teacher1);
			}else {
				out.print("<script language=\"javascript\">alert('密码错误，请重新登录！');window.location.href='/maventestmanager/teacherlogin.jsp'</script>");
				out.flush();
				out.close();
			}
		}
		else {
			out.print("<script language=\"javascript\">alert('用户名不存在，请重新输入！');window.location.href='/maventestmanager/teacherlogin.jsp'</script>");
			out.flush();
			out.close();
		}
		}
		else if(teacher.gettUsername() == null || "".equals(teacher.gettUsername())){
			out.print("<script language=\"javascript\">alert('用户名不能为空，请重新输入！');window.location.href='/maventestmanager/teacherlogin.jsp'</script>");
			out.flush();
			out.close();	
		}
		
		return "question/teacherIndex";
	}
}
