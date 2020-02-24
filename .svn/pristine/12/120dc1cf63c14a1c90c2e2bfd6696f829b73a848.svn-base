<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="questionCourseChapterToChooseChapter" method="post">
请选择您要进行测试 课程名称：
<select  name="cName">
<c:forEach items="${courseList}" var="course">
<option>${course.cName}</option>
</c:forEach>
</select>
<input type="submit" value="确定"> 
</form>
</body>
</html>