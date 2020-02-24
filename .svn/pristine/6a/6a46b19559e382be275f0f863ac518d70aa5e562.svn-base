<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	pageContext.setAttribute("webpath", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<script type="text/javascript" src="lib/PIE_IE678.js"></script>
<![endif]-->
<link href="static/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="static/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="static/css/style.css" rel="stylesheet" type="text/css" />
<link href="static/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet"
	type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>角色管理</title>
</head>
<body>
	<nav class="breadcrumb"> <i class="Hui-iconfont">&#xe67f;</i> 首页
	<span class="c-gray en">&gt;</span> 管理员管理 <span class="c-gray en">&gt;</span>
	角色管理 <a class="btn btn-success radius r mr-20"
		style="line-height: 1.6em; margin-top: 3px"
		href="javascript:location.replace(location.href);" title="刷新"><i
		class="Hui-iconfont">&#xe68f;</i></a></nav>
	 <div class="pd-20">
		<%--<div class="cl pd-5 bg-1 bk-gray">
			<span class="l"> <a href="javascript:;" onclick="datadel()"
				class="btn btn-danger radius"><i class="Hui-iconfont">&#xe6e2;</i>
					返回首页</a> <a class="btn btn-primary radius" href="javascript:;"
				onclick="admin_role_add('添加教师','returnPage/toadmin-role-add','800')"><i
					class="Hui-iconfont">&#xe600;</i> 添加教师</a>
			</span> <span class="r">共有数据：<strong>${infos.total}</strong> 条
			</span>
		</div> --%>
		<form action="teacher/updateteacherPassword"  method="post">
		<table class="table table-border table-bordered table-hover table-bg">
			<thead>
				<tr>
					<th scope="col" colspan="6">角色管理</th>
				</tr>
				<tr class="text-c">
					<!-- <th width="25"><input type="checkbox" value="" name=""></th> -->
					<th width="40">ID</th>
					<th width="200">用户名</th>
					<th width="200">密码</th>
					<th>所属机构</th>
					<th width="300">创建时间</th>
				</tr>
			</thead>
			<tbody>
					<tr class="text-c">
						<td id="tId">${teacher.tId }</td>
						<td>${teacher.tUsername }</td>
						<td><u style="cursor:pointer" class="text-primary" title="查看"><input  style="" type="text" class="input-text" value="${teacher.tPassword }" placeholder="" id="" name="tPassword"></u></td>
						<td>${teacher.tInsid }</td>
						<td><fmt:formatDate value="${teacher.tCreateTime}"
								pattern="yyyy-MM-dd" /></td>
					</tr>
			</tbody>
		</table>
			<button name="" id="" class="btn btn-success" type="submit"> 确定</button>		
</form>
	</div>
	<script type="text/javascript"
		src="static/lib/jquery/1.9.1/jquery.min.js"></script>
	<script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script>
	<script type="text/javascript"
		src="static/lib/My97DatePicker/WdatePicker.js"></script>
	<script type="text/javascript" src="static/js/H-ui.js"></script>
	<script type="text/javascript" src="static/js/H-ui.admin.js"></script>
</body>
</html>