<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
pageContext.setAttribute("webpath", path);
%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="static/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="static/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="static/css/style.css" rel="stylesheet" type="text/css" />
<link href="static/css/style.css" rel="stylesheet" type="text/css" />
<link href="static/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>教师管理</title>
<style type="text/css">
#checkUsername{
color: red;
}
</style>
</head>
<body>
<div class="pd-20">
	<form action="teacher/updateTeacher" method="post" class="form form-horizontal" id="form-user-character-add">
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>角色名称：</label>
			<div class="formControls col-10">
				<input type="text" class="input-text" value="${teachersss.tUsername }" placeholder="" id="user-name" name="tUsername" datatype="*4-16" nullmsg="用户账户不能为空">
				<span id="checkUsername"></span>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>密码：</label>
			<div class="formControls col-10">
				<input type="text" class="input-text" value="${teachersss.tPassword }" placeholder="" id="" name="tPassword" datatype="*4-16" nullmsg="用户账户不能为空">
				<input type="hidden" value="${teachersss.tId }" name="tId"/>
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-2">权限：</label>
			<div class="formControls col-10">
				<input type="text" class="input-text" value="${teachersss.tPermissionNo }" placeholder="" id="" name="tPermissionNo">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-2">机构：</label>
			<div class="formControls col-10">
				<select name="tInsid" class="input-text">
						<c:forEach items="${institutions }" var="institution">
							<option value="${teachersss.tInsid }">${institution.insId }</option>
						</c:forEach>
				</select>
			</div>
		</div>
		
		

		<div class="row cl">
			<div class="col-10 col-offset-2">
				<button type="submit" class="btn btn-success radius" id="admin-role-save" name="admin-role-save"><i class="icon-ok"></i> 确定</button>
			</div>
		</div>
	</form>
</div>
<script type="text/javascript" src="static/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="static/lib/laypage/1.2/laypage.js"></script> 
<script type="text/javascript" src="static/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="static/js/H-ui.js"></script> 
<script type="text/javascript" src="static/js/H-ui.admin.js"></script> 
<script type="text/javascript" src="static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript">
$(document).ready(
function(){
 $("#user-name").blur(
 
	    function()
	    {	
	    	
	    //真实场景下的ajax调用		
		$.ajax(
	    			{
	    		  url: "teacher/teacherAddForm",
	    		  cache: false,
	    		  type: "GET",
	    		  dataType:"json",
	    		  async: true,
         		  data: {tUsername:$("#user-name").val()},
	    		  success:function(msg){ 
	    		     //业务代码，改变页面的数据		     
	    		     if (msg==true)
	    		     {
	    		      $("#checkUsername").text("此用户已存在！！");
	    		      $("#user-name").focus();
	    		   	
	    		     }
	    		     else
	    		     {
	    		       $("#checkUsername").text("");
	    		       $("#tPassword").focus();
	    		     }
	    		   },
	    		   
	    	 	  error:function(errordata){
	   				alert("wrong!!"+"用户名不能为空！！");
	   			   } 
	    		}
	    		);
	    }
	    );	    
}
);

</script> 



</body>
</html>