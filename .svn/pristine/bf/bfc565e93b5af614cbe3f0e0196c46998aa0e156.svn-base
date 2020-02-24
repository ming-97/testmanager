<%@page import="com.pctc.model.QuestionBnak"%>
<%@page import="java.util.Map"%>
<%@page import="com.pctc.model.QuestionDaily"%>
<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center" style="color:red">错题库</h1>
<form action="" method="post">

<% 
int i=0;
int j=0;
int k=0;
%>


<h3>一。选择题</h3>
<c:forEach items="${questionBnakList1}" var="questionBank1">
<input type="hidden" value="${questionBank1.qbId}" name="qpQbId">
<td><a style="color:red"><%=i=i+1%>.</a>${questionBank1.qbContent}<a style="color:red">(${questionBank1.qbAnswer})</a><br/></td>
<td>

<label><input name="${questionBank1.qbId}" type="radio" value="A"/>A.${questionBank1.qbOptionsA}</label>
<label><input name="${questionBank1.qbId}" type="radio" value="B"/>B.${questionBank1.qbOptionsB}</label>
<label><input name="${questionBank1.qbId}" type="radio" value="C"/>C.${questionBank1.qbOptionsC}</label>
<label><input name="${questionBank1.qbId}" type="radio" value="D"/>D.${questionBank1.qbOptionsD}</label>

</td>
<br/>
</c:forEach>
<br/>

<h3>二。填空题</h3>
<c:forEach items="${questionBnakList2}" var="questionBank2">
<input type="hidden" value="${questionBank2.qbId}" name="qpQbId">
<td><a style="color:red"><%=j=j+1%>.</a>${questionBank2.qbContent}<a style="color:red">正确答案为：${questionBank2.qbAnswer}</a><br/></td>
<input type="text" name="${questionBank2.qbId}">
<br/>
</c:forEach>
<br/>


<h3>三。判断题</h3>
<c:forEach items="${questionBnakList3}" var="questionBank3">
<input type="hidden" value="${questionBank3.qbId}" name="qpQbId">
<td><a style="color:red"><%=k=k+1%>.</a>${questionBank3.qbContent}<a style="color:red">正确答案为：${questionBank3.qbAnswer}</a><br/></td>
<td>
<label><input name="${questionBank3.qbId}" type="radio" value="正确"/>正确</label>
<label><input name="${questionBank3.qbId}" type="radio" value="错误"/>错误</label>

</td>
<br/>
</c:forEach>
<br/><br/><br/>
</form>
</body>
</html>