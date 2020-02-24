<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<LINK rel="Bookmark" href="static/favicon.ico" >
<LINK rel="Shortcut Icon" href="static/favicon.ico" />

<link href="static/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="static/css/H-ui.admin.css" rel="stylesheet" type="text/css" />
<link href="static/skin/default/skin.css" rel="stylesheet" type="text/css" id="skin" />
<link href="static/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<link href="static/css/style.css" rel="stylesheet" type="text/css" />

<title>学生首页</title>
<meta name="keywords" content="H-ui.admin v2.3,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v2.3，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<header class="Hui-header cl"> <a class="Hui-logo l" title="H-ui.admin v2.3" >考试管理平台</a> <a class="Hui-logo-m l"  title="H-ui.admin">H-ui</a> <span class="Hui-subtitle l">V2.3</span>
	
	<ul class="Hui-userbar">
		<li>学生</li>
		<li class="dropDown dropDown_hover"><a class="dropDown_A">${student.sUsername}<i class="Hui-iconfont">&#xe6d5;</i></a>
			<ul class="dropDown-menu radius box-shadow">
				<li><a onclick="member_show('个人信息','student/studentShow','10001','360','400')">个人信息</a></li>
				<li><a href="studentlogin.jsp">切换账户</a></li>
				<li><a href="studentlogin.jsp">退出</a></li>
			</ul>
		</li>
		<li id="Hui-msg"> <a href="https://mail.qq.com/cgi-bin/loginpage" target="_blank" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>
		<li id="Hui-skin" class="dropDown right dropDown_hover"><a href="javascript:;" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
			<ul class="dropDown-menu radius box-shadow">
				<li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
				<li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
				<li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
				<li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
				<li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
				<li><a href="javascript:;" data-val="orange" title="绿色">橙色</a></li>
			</ul>
		</li>
	</ul>
	<a aria-hidden="false" class="Hui-nav-toggle" href="#"></a> </header>
<aside class="Hui-aside">
	<input runat="server" id="divScrollValue" type="hidden" value="" />
	<div class="menu_dropdown bk_2">
		
	
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe62d;</i> 学生中心<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="student/students" href="javascript:void(0)">个人信息</a></li>
				</ul>
			</dd>
		</dl>
		
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe616;</i> 学习测试中心<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a _href="questionDailyPaper/questionDailyTestPage" href="javascript:void(0)">每日一练测试</a></li>
					<li><a _href="questionCoursePaper/questionCourseTestPage" href="javascript:void(0)">课程练习测试</a></li>
					<li><a _href="questionCourseChapterPaper/questionCourseChapterTestPage" href="javascript:void(0)">章节练习测试</a></li>
				</ul>
			</dd>
		</dl>
		
		
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe616;</i> 测试管理中心<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>

					<li><a _href="questionDailyPaper/questionPaperPage" href="javascript:void(0)">查看答题信息</a></li>
					<li><a _href="questionDailyPaper/questionErrorPage" href="javascript:void(0)">查看错题库</a></li>
					<li><a _href="questionDailyPaper/questionGradePage" href="javascript:void(0)">查看测试分数</a></li>

					
				</ul>
			</dd>
		</dl>
			
	
	</div>
</aside>
<div class="dislpayArrow"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<section class="Hui-article-box">
	<div id="Hui-tabNav" class="Hui-tabNav">
		<div class="Hui-tabNav-wp">
			<ul id="min_title_list" class="acrossTab cl">
				<li class="active"><span title="我的桌面" data-href="welcome.html">我的桌面</span><em></em></li>
			</ul>
		</div>
		<div class="Hui-tabNav-more btn-group"><a id="js-tabNav-prev" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d4;</i></a><a id="js-tabNav-next" class="btn radius btn-default size-S" href="javascript:;"><i class="Hui-iconfont">&#xe6d7;</i></a></div>
	</div>
	<div id="iframe_box" class="Hui-article">
		<div class="show_iframe">
			<div style="display:none" class="loading"></div>
			<iframe scrolling="yes" frameborder="0" src="welcome1.jsp"></iframe>
		</div>
	</div>
</section>
<script type="text/javascript" src="static/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="static/js/H-ui.js"></script> 
<script type="text/javascript" src="static/js/H-ui.admin.js"></script> 
<script type="text/javascript">

if(window.history.replaceState) {
	window.history.replaceState(null,null,window.location.href);
}


/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}

/*用户-查看*/
function member_show(title, url, id, w, h) {
	layer_show(title, url, w, h);
}

</script> 
<script type="text/javascript">
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "//hm.baidu.com/hm.js?080836300300be57b7f34f4b3e97d911";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s)})();
var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3F080836300300be57b7f34f4b3e97d911' type='text/javascript'%3E%3C/script%3E"));
</script>
</body>
</html>