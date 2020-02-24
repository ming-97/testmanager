<%@page import="java.util.Map"%>
<%@page import="com.pctc.model.QuestionPaper"%>
<%@page import="com.pctc.model.QuestionType"%>
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
<title>每日一练</title>
</head>
<link href="static/css/main.css" rel="stylesheet" type="text/css" />
<link href="static/css/iconfont.css" rel="stylesheet" type="text/css" />
<link href="static/css/test.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.hasBeenAnswer {
			background: #5d9cec;
			color:#fff;
		}

</style>

<body>
<% 
int i=0;
int i1=0;
int j=0;
int j1=0;
int k=0;
int k1=0;

int l=0;
int l1=0;
int m=0;
int m1=0;
int n=0;
int n1=0;
QuestionPaper questionPaper=(QuestionPaper)request.getAttribute("questionPaper");
QuestionType questionType1=(QuestionType)request.getAttribute("questionType1");
QuestionType questionType2=(QuestionType)request.getAttribute("questionType2");
QuestionType questionType3=(QuestionType)request.getAttribute("questionType3");
%>

<div class="main">
		<!--nr start-->
		<div class="test_main">
			<div class="nr_left">
				<div class="test">
					<form action="questionDailyPaper/questionDailyFormInfo" method="post">
						
						
						<h1 align="center" style="color:red;text-shadow: 2px 2px 2px black;font-size:30px" >学生答题信息如下：</h1><br>
						<h2 align="center" style="color:red">试卷名称为：<%=questionPaper.getQpName() %><fmt:formatDate value="<%=questionPaper.getQpCreateTime() %>" pattern="yyyy-MM-dd"/></h2>
											
							<div class="test_content">
								<div class="test_content_title">
									<h2>选择题</h2>
									<p>
										<span>共</span><i class="content_lit">30</i><span>题，</span><span>合计</span><i class="content_fs"><%=questionType1.getQtGrade()*30%></i><span>分</span>
									</p>
								</div>
							</div>
							<div class="test_content_nr">
								<ul>
								
								
									<c:forEach items="${questionBnakList1}" var="questionBank1">
                                    <input type="hidden" value="${questionBank1.qbId}" name="qpQbId">
                                    <input type="hidden" value=" <%=i=i+1 %>">
                                    <input type="hidden" value=" <%=i1=i %>">
                                   
                                                                      
										<li id="qu_0_<%=i1 %>">
											<div class="test_content_nr_tt">
												<i><%=i1 %></i><span>(<%=questionType1.getQtGrade()%>分)</span><font>${questionBank1.qbContent}</font><b class="icon iconfont">&#xe881;</b>
											</div>

											<div class="test_content_nr_main">
												<ul>
													
														<li class="option">
															
																<input type="radio" class="radioOrCheck" name="${questionBank1.qbId}"
																	id="0_answer_<%=i1 %>_option_1" value="A"
																/>
															
															
															<label for="0_answer_<%=i1 %>_option_1">
																A.
																<p class="ue" style="display: inline;">${questionBank1.qbOptionsA}</p>
															</label>
														</li>
													
														<li class="option">
															
																<input type="radio" class="radioOrCheck" name="${questionBank1.qbId}"
																	id="0_answer_<%=i1 %>_option_2"  value="B"
																/>
															
															
															<label for="0_answer_<%=i1 %>_option_2">
																B.
																<p class="ue" style="display: inline;">${questionBank1.qbOptionsB}</p>
															</label>
														</li>
													
														<li class="option">
															
																<input type="radio" class="radioOrCheck" name="${questionBank1.qbId}"
																	id="0_answer_<%=i1 %>_option_3"  value="C"
																/>
															
															
															<label for="0_answer_<%=i1 %>_option_3">
																C.
																<p class="ue" style="display: inline;">${questionBank1.qbOptionsC}</p>
															</label>
														</li>
													
														<li class="option">
															
																<input type="radio" class="radioOrCheck" name="${questionBank1.qbId}"
																	id="0_answer_<%=i1 %>_option_4"  value="D"
																/>
															
															
															<label for="0_answer_<%=i1 %>_option_4">
																D.
																<p class="ue" style="display: inline;">${questionBank1.qbOptionsD}</p>
															</label>
														</li>
													
												</ul>
											</div>
										</li>
										
										</c:forEach>
										</ul>
							</div>	
										
										
										
										
										
										
									
										
						
							<div class="test_content">
								<div class="test_content_title">
									<h2>判断题</h2>
									<p>
										<span>共</span><i class="content_lit">10</i><span>题，</span><span>合计</span><i class="content_fs"><%=questionType2.getQtGrade()*10%></i><span>分</span>
									</p>
								</div>
							</div>
							<div class="test_content_nr">
								<ul>
									<c:forEach items="${questionBnakList3}" var="questionBank3">
									<input type="hidden" value="${questionBank3.qbId}" name="qpQbId">
                                    <input type="hidden" value=" <%=j=j+1 %>">
                                    <input type="hidden" value=" <%=j1=j %>">
										<li id="qu_1_<%=j1 %>">
											<div class="test_content_nr_tt">
												<i><%=j1 %></i><span>(<%=questionType2.getQtGrade()%>分)</span><font>${questionBank3.qbContent}</font><b class="icon iconfont">&#xe881;</b>
											</div>

											<div class="test_content_nr_main">
												<ul>
											
											
														<li class="option">
																<input type="radio" class="radioOrCheck" name="${questionBank3.qbId}"
																	id="1_answer_<%=j1 %>_option_1" value="是"
																/>

															<label for="1_answer_<%=j1 %>_option_1">
																
																<p class="ue" style="display: inline;">是</p>
															</label>
														</li>

														<li class="option">


																<input type="radio" class="radioOrCheck" name="${questionBank3.qbId}"
																	id="1_answer_<%=j1 %>_option_2" value="不是"
																/>

															<label for="1_answer_<%=j1 %>_option_2">
																
																<p class="ue" style="display: inline;">不是</p>
															</label>
														</li>
													

												</ul>
											</div>
										</li>
									</c:forEach>
								</ul>
							</div>








                        <div class="test_content">
                            <div class="test_content_title">
                                <h2>填空题</h2>
                                <p>
                                    <span>共</span><i class="content_lit">10</i><span>题，</span><span>合计</span><i class="content_fs"><%=questionType3.getQtGrade()*10%></i><span>分</span>
                                </p>
                            </div>
                        </div>
                        <div class="test_content_nr">
                            <ul>
                            
                            <c:forEach items="${questionBnakList2}" var="questionBank2">
                            <input type="hidden" value="${questionBank2.qbId}" name="qpQbId">
                            <input type="hidden" value=" <%=k=k+1 %>">
                            <input type="hidden" value=" <%=k1=k %>">

                                <li id="qu_2_<%=k1 %>">
                                    <div class="test_content_nr_tt">
                                        <i><%=k1 %></i><span>(<%=questionType2.getQtGrade()%>分)</span><font>${questionBank2.qbContent}</font><b class="icon iconfont">&#xe881;</b>
                                    </div>

                                    <div class="test_content_nr_main">
                                        <ul>
                                            <li class="option">
                                                    <textarea  style="display: inline; " name="${questionBank2.qbId}" id="2_answer_<%=k1 %>_option_1" ></textarea>
                                                    <label style="color:red;">(填写时请检查答案中是否含有空格！！！)</label>
                                                    
                                                    
                                                    
                                               <label for="2_answer_<%=k1 %>_option_1">
																
																
											   </label>
                                            </li>


                                        </ul>
                                    </div>
                                </li>
                                </c:forEach>



                            </ul>
                        </div>
						
					</form>
				</div>

			</div>
			<div class="nr_right">
				<div class="nr_rt_main">
					<div class="rt_nr1">
						<div class="rt_nr1_title">
							<h1>
								<i class="icon iconfont">&#xe692;</i>答题卡
							</h1>
							<%-- <p class="test_time">
								<i class="icon iconfont">&#xe6fb;</i><b class="alt-1">答题日期：<%=questionPaper.getQpCreateTime() %></b>
							</p> --%>
						</div>
						
							<div class="rt_content">
								<div class="rt_content_tt">
									<h2>单选题</h2>
									<p>
										<span>共</span><i class="content_lit">30</i><span>题</span>
									</p>
								</div>
								<div class="rt_content_nr answerSheet">
									<ul>
										
											<c:forEach items="${questionPaperList1}" var="questionPaper1">
											<input type="hidden" value=" <%=l=l+1 %>">
                                            <input type="hidden" value=" <%=l1=l %>">
                                           
                                            <td><a style="color:red;font-size:15px"><%=l1%>.</a>${questionPaper1.qpAnswer}</td>
                                           
                                            </c:forEach>
										
									</ul>
								</div>
							</div>
						
							<div class="rt_content">
								<div class="rt_content_tt">
									<h2>判断题</h2>
									<p>
										<span>共</span><i class="content_lit">10</i><span>题</span>
									</p>
								</div>
								<div class="rt_content_nr answerSheet">
									<ul>
										
										<c:forEach items="${questionPaperList3}" var="questionPaper3">
										<input type="hidden" value=" <%=m=m+1 %>">
                                        <input type="hidden" value=" <%=m1=m %>">
                                        <td><a style="color:red;font-size:15px"><%=m1%>.</a>${questionPaper3.qpAnswer}</td>
                                       
                                        </c:forEach>
											

									</ul>
								</div>
							</div>



                             <div class="rt_content">
                            <div class="rt_content_tt">
                                <h2>填空题</h2>
                                <p>
                                    <span>共</span><i class="content_lit">10</i><span>题</span>
                                </p>
                            </div>
                            <div class="rt_content_nr answerSheet">
                                <ul>

                                    <c:forEach items="${questionPaperList2}" var="questionPaper2">
                                    <input type="hidden" value=" <%=n=n+1 %>">
                                    <input type="hidden" value=" <%=n1=n %>">
                                    <td><a style="color:red;font-size:15px"><%=n1%>.</a>${questionPaper2.qpAnswer}</td>
                                   
                                    </c:forEach>

                                </ul>
                            </div>
                        </div>

                    
					</div>

				</div>
			</div>
		</div>
		<!--nr end-->
		<div class="foot"></div>
	</div>
	

</body>
</html>