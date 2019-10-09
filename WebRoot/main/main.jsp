<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>当当图书 – 全球最大的中文网上书店</title>
		<link href="../css/book.css" rel="stylesheet" type="text/css" />
		<link href="../css/second.css" rel="stylesheet" type="text/css" />
		<link href="../css/secBook_Show.css" rel="stylesheet" type="text/css" />
	
	</head>
	<body>
		&nbsp;
		<!-- 头部开始 -->
		<%@include file="../common/head.jsp"%>
		<!-- 头部结束 -->
		<div style="width: 962px; margin: auto;">
			<a href="#" target="_blank"><img
					src="../images/default/book_banner_081203.jpg" border="0" /> </a>
		</div>

		<div class="book">

			<!--左栏开始-->
			<div id="left" class="book_left">
			<s:action namespace = "/" name = "categ_selectall" executeResult = "true"></s:action>
			</div>
			<!--左栏结束-->
			
			<!--中栏开始-->
			<div class="book_center">

				<!--推荐图书开始-->
				<div class=second_c_border1 id="recommend"><s:action namespace = "/" name = "book_selectsalenumdes" executeResult = "true"></s:action>
				</div>

				<!--推荐图书结束-->

				<!--热销图书开始-->
				<div class="book_c_border2" id="hot"><s:action namespace = "/" name = "book_selectsalenum" executeResult = "true"></s:action>
				</div>
				<!--热销图书结束-->

				<!--最新上架图书开始-->
				<div class="book_c_border2" id="new">最新上架<s:action namespace = "/" name = "book_selectdate" executeResult = "true"></s:action>
				</div>

				<!--最新上架图书结束-->

				<div class="clear">
				</div>
			</div>
			<!--中栏结束-->



			<!--右栏开始-->
			<div class="book_right">
				<div class="book_r_border2" id="__XinShuReMai">
					<div class="book_r_b2_1x" id="new_bang">
						<h2 class="t_xsrm">
							新书热卖榜
						
						</h2>
									
							
						<div id="NewProduct_1_o_t" onmouseover="">
								
							<h3 class="second">
								<span class="dot_r"> 
								 
								 </span>
								 <s:action namespace = "/" name = "book_selectbooksalenum" executeResult = "true"></s:action>
								 <a href="#" target="_blank">更多&gt;&gt;</a>
							</h3>
						</div>
					</div>
				</div>
			</div>
			<!--右栏结束-->
			<div class="clear"></div>
		</div>

		<!--页尾开始 -->
		<%@include file="../common/foot.jsp"%>
		<!--页尾结束 -->
	</body>
</html>
