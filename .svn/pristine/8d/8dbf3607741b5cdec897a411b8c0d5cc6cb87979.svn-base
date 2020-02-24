<%@page import="com.pctc.model.QuestionPaper"%>
<%@page import="com.pctc.model.QuestionBnak"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=utf-8" 
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<title>Insert title here</title>
</head>
<body>
<form action="" method="post">

<% 
int i=0;
int j=0;
int k=0;
QuestionPaper questionPaper=(QuestionPaper)request.getAttribute("questionPaper");


%>
<h1 align="center" style="color:black">学生答题信息如下：</h1>
<%-- <input type="hidden" value="<%=questionDaily.getQdInsid() %>" name="qpInsid">
<input type="hidden" value="<%=questionDaily.getQdId() %>" name="qdId"> --%>
<h2 align="center" style="color:red">试卷名称为：<%=questionPaper.getQpName() %></h2>
<%-- <h2 align="center" style="color:blue">学生id为：<%=questionPaper.getQpSid() %></h2> --%>

<h3>一。选择题</h3>
<c:forEach items="${questionPaperList1}" var="questionPaper1">
<a style="color:red"><%=i=i+1%>.</a>
<label>${questionPaper1.qpAnswer}</label>
<br/>
</c:forEach>
<br/>

<h3>二。填空题</h3>
<c:forEach items="${questionPaperList2}" var="questionPaper2">
<td><a style="color:red"><%=j=j+1%>.</a>${questionPaper2.qpAnswer}<br/></td>
<br/>
</c:forEach>
<br/>


<h3>三。判断题</h3>
<c:forEach items="${questionPaperList3}" var="questionPaper3">
<td><a style="color:red"><%=k=k+1%>.</a>${questionPaper3.qpAnswer}<br/></td>
<br/>
</c:forEach>
</form>
</body>
</html>