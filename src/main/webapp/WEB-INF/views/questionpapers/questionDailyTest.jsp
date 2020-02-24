<%@page import="java.util.Map"%>
<%@page import="com.pctc.model.QuestionDaily"%>
<%@ page language="java" contentType="text/html; charset=utf-8"  pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("webpath", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="static/js/jquery-1.8.3.js"></script>
<script type="text/css">



</script>
  <script type="text/javascript">
$(document).ready(
function doAjax(){

 $("#qpName").blur(
 
	    function()
	    {	
	    	
	    //真实场景下的ajax调用		
		$.ajax(
	    			{
	    				
	    		  url: "questionDailyPaper/questionDailyFormInfo1",
	    		  
	    		  cache: false,
	    		  
	    		  type: "GET",
	    		  
	    		  dataType:"json",
	    		  
	    		  async: true,
	    		  
         		  data: {qpName:$("#qpName").val()},
         		  
	    		  success:function(msg){ 
	    		     
	    		     //业务代码，改变页面的数据		     
	    		    // alert(msg);
	    		     
	    		     if (msg==true)
	    		     {
	    		      $("#qpSid").focus();
	    		      $("#tip").text("此试卷名称已存在！");
	    		      $("#qpName").focus();
	    		     }  
	    		   }, 
	    		  error:function(errordata){
	   				alert("wrong!!"+errordata);
	   			   } 
	    		});
	    });	    
}
);


function checkId() {
    var id = $("#qpSid").val();
    var qpName = $("#qpName").val();
    var $idPrompt = $("#id_prompt");
    /* var regId = /^\d$/; */
    if(id==""){
    	$("#qpSid").focus();
    	$idPrompt.html("您输入的学号id不能为空,请重新输入！！！");
    	$("#qpName").focus();
    	return false;
    }
    /* if (regId.test(id) == false) {
        $idPrompt.html("您输入的学号id只能由数字组成,请重新输入!!!");
        return false;
    } */
    else{
    	$codeId.html("");
        return true;
    }
    
    
}



function checkName() {
    var qpName = $("#qpName").val();
    var $tip = $("#tip");
    if(qpName==""){
    	$tip.html("您输入的试卷名称不能为空,请重新输入！！！");
    	return false;
    }else{
    	 $codeId.html("");
    	    doAjax();
    	 return true;
    }

   
}

</script> 
<title>Insert title here</title>
</head>
<body style="background-color:#6ed3ff">
<% 
int i=0;
int j=0;
int k=0;
QuestionDaily questionDaily=(QuestionDaily)request.getAttribute("questionDaily"); 
%>


<table width="75%" border="0" align="center" style="background-color:#ffedf0" >
<tr>
<td>
<h1 align="center" style="color:red;text-shadow: 2px 2px 2px black;" >每日一练</h1>
<form action="questionDailyPaper/questionDailyFormInfo" method="post">
 <a style="padding-left:300px">请输入试卷名称唯一标识：</a><input type="text" name="qpName" id="qpName" onblur="checkName()"><span id="tip" style="color:red"></span><br/>
 <a style="padding-left:300px">请输入您的学号id：</a><input type="text" name="qpSid" id="qpSid" onblur="checkId()"><span id="id_prompt" style="color:red"></span><br/>
<hr>

<input type="hidden" value="<%=questionDaily.getQdInsid() %>" name="qdInsid">
<input type="hidden" value="<%=questionDaily.getQdId() %>" name="qdId">

<h3>一。选择题</h3>
<c:forEach items="${questionBnakList1}" var="questionBank1">
<input type="hidden" value="${questionBank1.qbId}" name="qpQbId">
<a style="color:red"><%=i=i+1%>.</a>${questionBank1.qbContent}<br/>
<ol>
<label><input name="abc<%=i%>" type="radio" value="A"/>A.${questionBank1.qbOptionsA}</label>
<input name="${questionBank1.qbId}" type="radio" value="A"/>A.${questionBank1.qbOptionsA}<br><br>
<input name="${questionBank1.qbId}" type="radio" value="B"/>B.${questionBank1.qbOptionsB}<br><br>
<input name="${questionBank1.qbId}" type="radio" value="C"/>C.${questionBank1.qbOptionsC}<br><br>
<input name="${questionBank1.qbId}" type="radio" value="D"/>D.${questionBank1.qbOptionsD}<br><br>
</ol>
<br/>
</c:forEach>
<br/>

<h3>二。填空题</h3>
<c:forEach items="${questionBnakList2}" var="questionBank2">
<input type="hidden" value="${questionBank2.qbId}" name="qpQbId">
<a style="color:red"><%=j=j+1%>.</a>${questionBank2.qbContent}<br/>
<ol>
<input type="text" name="${questionBank2.qbId}">
</ol>
<br/>
</c:forEach>
<br/>


<h3>三。判断题</h3>
<c:forEach items="${questionBnakList3}" var="questionBank3">
<input type="hidden" value="${questionBank3.qbId}" name="qpQbId">
<a style="color:red"><%=k=k+1%>.</a>${questionBank3.qbContent}<br/>
<ol>
<label><input name="${questionBank3.qbId}" type="radio" value="是"/>是</label>
<label><input name="${questionBank3.qbId}" type="radio" value="不是"/>不是</label>
</ol>

<br/>
</c:forEach>
<br/><br/><br/>
<hr>
<input type="submit" value="提交" style="margin-left:650px;text-align:center;width:200px;heigh:100px;background-color:#6ed3ff;color:black"/>

</form>
</td>
</tr>
</table>
</body>
</html> 

