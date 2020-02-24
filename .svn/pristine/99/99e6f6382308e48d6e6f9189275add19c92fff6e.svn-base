<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<link href="static/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="http://lib.h-ui.net/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>题库列表</title>
</head>
<body>
<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 题库管理 <span class="c-gray en">&gt;</span> 题库信息 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="pd-20">
	<form action="questionCourseChapterManager/insertQuestionCourseChapter" method="post">
	<div class="text-c"> 
		<input type="text" name="qbContent"  id="select" placeholder="题目内容" style="width:250px" class="input-text">
		<button name="" id="" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜题目</button>
	</div>
	</form>	
	
	<form action="questionCourseChapterManager/insertQuestionCourseChapter" method="post">
<%-- 	<div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"> <a class="btn btn-primary radius" onclick="article_add('添加每日一练题目','returnPage/toaddQuestionDaily')" href="javascript:;"><i class="Hui-iconfont">&#xe600;</i> 添加题目</a></span> <span class="r">共有数据：<strong>${pageInfo.total }</strong> 条</span> </div>
 --%>	<button name="" id="" class="btn btn-success" type="submit"> 确定</button>
	<div class="mt-20">
		<table class="table table-border table-bordered table-bg table-hover table-sort">
			<thead>
				<tr class="text-c">
					<th width="25"><input type="checkbox" name="" value=""></th>
					<th width="80">ID</th>
					<th width="300">题目</th>
					<th width="80">章节号</th>
					<th width="80">机构代号</th>
					<th width="100">创建者</th>
					<th width="100">创建时间</th> 
					<th width="100">修改者</th>
					<th width="100">更新时间</th>
					<th width="75">正确答案</th> 
					<!-- <th width="60">版本号</th> -->
					<!-- <th width="75">状态</th> 
					<th width="100">操作</th> -->
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${qBnaks }" var="qBank">
				<tr class="text-c">
					<td><input type="checkbox" value="${qBank.qbId }" name="names"></td>
					<td>${qBank.qbId }</td>
					<td class="text-l"><u style="cursor:pointer" class="text-primary" onClick="article_edit1('题目详情','question/selectQuestionByNameToPage?qbContent=${qBank.qbContent }','520')" title="查看">${qBank.qbContent }</u></td>
					<td>${qBank.qbCcid }<input type="hidden" name="qccCcid" value="${qBank.qbCcid }"></td>
					<td>${qBank.qbInsid }<input type="hidden" name="qccInsid" value="${qBank.qbInsid }"></td>
					<td>${qBank.qbCreateBy }</td>
					<td><fmt:formatDate value="${qBank.qbCreateTime}" pattern="yyyy-MM-dd"/></td>
					<td>${qBank.qbModifyBy }</td>
					<td><fmt:formatDate value="${qBank.qbModifyTime}" pattern="yyyy-MM-dd"/></td>
					<td>${qBank.qbAnswer }</td>
					<!-- <td class="td-status"><span class="label label-success radius">已发布</span></td> -->
<%-- 					<td class="f-14 td-manage"><a style="text-decoration:none" onClick="article_stop(this,'10001')" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_edit('修改题目','returnPage/toupdateQuestionBnak?qbId=${qBank.qbId}','10001')" href="javascript:;" title="编辑"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="article_del(this,'${qBank.qbId }')" href="javascript:;" title="删除"><i class="Hui-iconfont">&#xe6e2;</i></a></td>
 --%>				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>	
	</form>
</div>
<script type="text/javascript" src="static/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="static/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="static/lib/datatables/1.10.0/jquery.dataTables.min.js"></script> 
<script type="text/javascript" src="static/js/H-ui.js"></script> 
<script type="text/javascript" src="static/js/H-ui.admin.js"></script>
<script type="text/javascript">
$('.table-sort').dataTable({
	"aaSorting": [[ 1, "desc" ]],//默认第几个排序
	"bStateSave": true,//状态保存
	"aoColumnDefs": [
	  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	  {"orderable":false,"aTargets":[0,9]}// 制定列不参与排序
	]
});

/*资讯-添加*/
function article_add(title,url,w,h){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	});
	layer.full(index);
}
/*资讯-编辑*/
function article_edit(title,url,id,w,h){
	var index = layer.open({
		type: 2,
		title: title,
		content: url
	}); 
	layer.full(index); 
	//layer_show(title, url, w, h);
}
/* 题目详情 */
function article_edit1(title,url,id,w,h){
	 /* 	var index = layer.open({
			type: 2,
			title: title,
			content: url
		}); 
		layer.full(index); */
		layer_show(title, url, w, h);
	}


/*资讯-删除*/
function article_del(obj,id){
	layer.confirm('确认要删除吗？',function(index){
		$.ajax({
			type: 'POST',
			url: 'questionCourseChapterManager/deleteQuestionCourseChapter?qdId='+id,
			dataType: 'json',
			success: function(data){
				if(data==1){
				layer.msg('已删除!',{icon:1,time:2000});
				location.href="returnPage/toQuestionInfo";
			}
				else{
					layer.msg('删除失败！',{icon:1,time:2000});
					location.href="returnPage/toquestoinDaily";
				}
			},
			error:function(data) {
				console.log(data.msg);
			},
		});

		 /* $(obj).parents("tr").remove();
		layer.msg('已删除!',1);  */
	});
}
/*资讯-审核*/
function article_shenhe(obj,id){
	layer.confirm('审核文章？', {
		btn: ['通过','不通过'], 
		shade: false
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="article_start(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
		$(obj).remove();
		layer.msg('已发布', {icon:6,time:1000});
	},
	function(){
		$(obj).parents("tr").find(".td-manage").prepend('<a class="c-primary" onClick="article_shenqing(this,id)" href="javascript:;" title="申请上线">申请上线</a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-danger radius">未通过</span>');
		$(obj).remove();
    	layer.msg('未通过', {icon:5,time:1000});
	});	
}
/*资讯-下架*/
function article_stop(obj,id){
	layer.confirm('确认要下架吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="article_start(this,id)" href="javascript:;" title="发布"><i class="Hui-iconfont">&#xe603;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-defaunt radius">已下架</span>');
		$(obj).remove();
		layer.msg('已下架!',{icon: 5,time:1000});
	});
}

/*资讯-发布*/
function article_start(obj,id){
	layer.confirm('确认要发布吗？',function(index){
		$(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="article_stop(this,id)" href="javascript:;" title="下架"><i class="Hui-iconfont">&#xe6de;</i></a>');
		$(obj).parents("tr").find(".td-status").html('<span class="label label-success radius">已发布</span>');
		$(obj).remove();
		layer.msg('已发布!',{icon: 6,time:1000});
	});
}
/*资讯-申请上线*/
function article_shenqing(obj,id){
	$(obj).parents("tr").find(".td-status").html('<span class="label label-default radius">待审核</span>');
	$(obj).parents("tr").find(".td-manage").html("");
	layer.msg('已提交申请，耐心等待审核!', {icon: 1,time:2000});
}
</script> 
</body>
</html>




















