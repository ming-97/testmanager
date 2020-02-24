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
<link href="static/lib/icheck/icheck.css" rel="stylesheet" type="text/css" />
<link href="static/lib/Hui-iconfont/1.0.1/iconfont.css" rel="stylesheet" type="text/css" />
<link href="static/lib/webuploader/0.1.5/webuploader.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>新增题目</title>
</head>
<body>
<div class="pd-20">
	<form action="question/updateQuestionBnak" method="post" class="form form-horizontal" id="form-article-add" enctype="multipart/form-data">
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>题目内容：</label>
			<div class="formControls col-10">
				<input type="text" class="input-text" value="${questionBnak.qbContent }" placeholder="" id="" name="qbContent">
			</div>
		</div>
		<div class="row cl">
			<label class="form-label col-2">选项A：</label>
				<div class="formControls col-2"> 
					<input type="text" class="input-text" value="${questionBnak.qbOptionsA }" placeholder="" id="" name="qbOptionsA">
				</div>
		</div>
		<div class="row cl">
			<label class="form-label col-2">选项B：</label>
				<div class="formControls col-2">
					<input type="text" class="input-text" value="${questionBnak.qbOptionsB }" placeholder="" id="" name="qbOptionsB">
				</div>
		</div>
		<div class="row cl">
			<label class="form-label col-2">选项C：</label>
				<div class="formControls col-2"> 
					<input type="text" class="input-text" value="${questionBnak.qbOptionsC }" placeholder="" id="" name="qbOptionsC">
				</div>
		</div>
		<div class="row cl">
			<label class="form-label col-2">选项D：</label>
				<div class="formControls col-2"> 
					<input type="text" class="input-text" value="${questionBnak.qbOptionsD }" placeholder="" id="" name="qbOptionsD">
					<input type="hidden" name="qbInsid" value="${questionBnak.qbInsid }"/>
<%-- 					<input type="hidden" name="qbCreateTime" value="<fmt:formatDate value="${questionBnak.qbCreateTime }" pattern="yyyy-MM-dd"/>"/>
 --%>					<input type="hidden" value="${questionBnak.qbId }" name="qbId"/>
<%-- 					<input type="hidden" value="${questionBnak.qbCreateBy }" name="qbCreateBy">
 --%>				</div>
		</div>
		<div class="row cl">
			<label class="form-label col-2">正确答案：</label>
				<div class="formControls col-2"> 
					<input type="text" class="input-text" value="${questionBnak.qbAnswer }" placeholder="" id="" name="qbAnswer">
				</div>
		</div>
			
		<div class="row cl">
			<label class="form-label col-2"><span class="c-red">*</span>题型分类：</label>
			<div class="formControls col-2"> <span class="select-box">
				<select name="qtName" class="select">
					<c:forEach items="${qTypelist }" var="type">
						<option>${type.qtName }</option>
					</c:forEach>
				</select>
				</span>
			 </div>
			<label class="form-label col-2"><span class="c-red">*</span>章节：</label>
			<div class="formControls col-2"> <span class="select-box">
				<select name="ccName" class="select">
				<c:forEach items="${courseChapter }" var="coursechapter">
					<option>${coursechapter.ccName }</option>
				</c:forEach>
				</select>
				</span> 
			</div>
			<%-- <label class="form-label col-2"><span class="c-red">*</span>机构：</label>
			<div class="formControls col-2"> <span class="select-box">
				<select name="qbInsid" class="select">
				<c:forEach items="${institutions }" var="institutions">
					<option>${institutions.insId }</option>
				</c:forEach>
				</select>
				</span> 
			</div> --%>
			<!-- <label class="form-label col-2">排序值：</label>
			<div class="formControls col-2">
				<input type="text" class="input-text" value="0" placeholder="" id="" name="">
			</div> -->
		</div>
		<!-- <div class="row cl">
			<label class="form-label col-2">关键词：</label>
			<div class="formControls col-10">
				<input type="text" class="input-text" value="0" placeholder="" id="" name="">
			</div>
		</div> -->
		<!-- <div class="row cl">
			<label class="form-label col-2">文章摘要：</label>
			<div class="formControls col-10">
				<textarea name="" cols="" rows="" class="textarea"  placeholder="说点什么...最少输入10个字符" datatype="*10-100" dragonfly="true" nullmsg="备注不能为空！" onKeyUp="textarealength(this,200)"></textarea>
				<p class="textarea-numberbar"><em class="textarea-length">0</em>/200</p>
			</div>
		</div> -->
		<div class="row cl">
			<label class="form-label col-2">试题图片：</label>
			<div class="formControls col-10">
				<div class="uploader-thum-container">
					<div id="fileList" class="uploader-list"></div>
					<div id="filePicker">选择图片</div>
					<button id="btn-star" class="btn btn-default btn-uploadstar radius ml-10">开始上传</button>
				</div>
			</div>
		</div>
<!-- 		<div class="row cl">
			<label class="form-label col-2">文章内容：</label>
			<div class="formControls col-10"> 
				<script id="editor" type="text/plain" style="width:100%;height:400px;"></script> 
			</div>
		</div> -->
		<div class="row cl">
			<div class="col-10 col-offset-2">
				<button onClick="article_save_submit();" class="btn btn-primary radius" type="submit"><i class="Hui-iconfont">&#xe632;</i> 保存并提交审核</button>
				<button onClick="article_save();" class="btn btn-secondary radius" type="button"><i class="Hui-iconfont">&#xe632;</i> 保存草稿</button>
				<button onClick="layer_close();" class="btn btn-default radius" type="button">&nbsp;&nbsp;取消&nbsp;&nbsp;</button>
			</div>
		</div>
	</form>
</div>
<script type="text/javascript" src="static/lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/lib/layer/1.9.3/layer.js"></script> 
<script type="text/javascript" src="static/lib/My97DatePicker/WdatePicker.js"></script> 
<script type="text/javascript" src="static/lib/icheck/jquery.icheck.min.js"></script> 
<script type="text/javascript" src="static/lib/Validform/5.3.2/Validform.min.js"></script> 
<script type="text/javascript" src="static/lib/webuploader/0.1.5/webuploader.min.js"></script> 
<script type="text/javascript" src="static/lib/ueditor/1.4.3/ueditor.config.js"></script> 
<script type="text/javascript" src="static/lib/ueditor/1.4.3/ueditor.all.min.js"> </script> 
<script type="text/javascript" src="static/lib/ueditor/1.4.3/lang/zh-cn/zh-cn.js"></script> 
<script type="text/javascript" src="static/js/H-ui.js"></script> 
<script type="text/javascript" src="static/js/H-ui.admin.js"></script> 
<script type="text/javascript">
$(function(){
	$('.skin-minimal input').iCheck({
		checkboxClass: 'icheckbox-blue',
		radioClass: 'iradio-blue',
		increaseArea: '20%'
	});
	
	$list = $("#fileList"),
	$btn = $("#btn-star"),
	state = "pending",
	uploader;

	var uploader = WebUploader.create({
		auto: true,
		swf: 'lib/webuploader/0.1.5/Uploader.swf',
	
		// 文件接收服务端。
		server: 'http://lib.h-ui.net/webuploader/0.1.5/server/fileupload.php',
	
		// 选择文件的按钮。可选。
		// 内部根据当前运行是创建，可能是input元素，也可能是flash.
		pick: '#filePicker',
	
		// 不压缩image, 默认如果是jpeg，文件上传前会压缩一把再上传！
		resize: false,
		// 只允许选择图片文件。
		accept: {
			title: 'Images',
			extensions: 'gif,jpg,jpeg,bmp,png',
			mimeTypes: 'image/*'
		}
	});
	uploader.on( 'fileQueued', function( file ) {
		var $li = $(
			'<div id="' + file.id + '" class="item">' +
				'<div class="pic-box"><img></div>'+
				'<div class="info">' + file.name + '</div>' +
				'<p class="state">等待上传...</p>'+
			'</div>'
		),
		$img = $li.find('img');
		$list.append( $li );
	
		// 创建缩略图
		// 如果为非图片文件，可以不用调用此方法。
		// thumbnailWidth x thumbnailHeight 为 100 x 100
		uploader.makeThumb( file, function( error, src ) {
			if ( error ) {
				$img.replaceWith('<span>不能预览</span>');
				return;
			}
	
			$img.attr( 'src', src );
		}, thumbnailWidth, thumbnailHeight );
	});
	// 文件上传过程中创建进度条实时显示。
	uploader.on( 'uploadProgress', function( file, percentage ) {
		var $li = $( '#'+file.id ),
			$percent = $li.find('.progress-box .sr-only');
	
		// 避免重复创建
		if ( !$percent.length ) {
			$percent = $('<div class="progress-box"><span class="progress-bar radius"><span class="sr-only" style="width:0%"></span></span></div>').appendTo( $li ).find('.sr-only');
		}
		$li.find(".state").text("上传中");
		$percent.css( 'width', percentage * 100 + '%' );
	});
	
	// 文件上传成功，给item添加成功class, 用样式标记上传成功。
	uploader.on( 'uploadSuccess', function( file ) {
		$( '#'+file.id ).addClass('upload-state-success').find(".state").text("已上传");
	});
	
	// 文件上传失败，显示上传出错。
	uploader.on( 'uploadError', function( file ) {
		$( '#'+file.id ).addClass('upload-state-error').find(".state").text("上传出错");
	});
	
	// 完成上传完了，成功或者失败，先删除进度条。
	uploader.on( 'uploadComplete', function( file ) {
		$( '#'+file.id ).find('.progress-box').fadeOut();
	});
	uploader.on('all', function (type) {
        if (type === 'startUpload') {
            state = 'uploading';
        } else if (type === 'stopUpload') {
            state = 'paused';
        } else if (type === 'uploadFinished') {
            state = 'done';
        }

        if (state === 'uploading') {
            $btn.text('暂停上传');
        } else {
            $btn.text('开始上传');
        }
    });

    $btn.on('click', function () {
        if (state === 'uploading') {
            uploader.stop();
        } else {
            uploader.upload();
        }
    });

	
	
	var ue = UE.getEditor('editor');
	
});

function mobanxuanze(){
	
}
</script>
</body>
</html>