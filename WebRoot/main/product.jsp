<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">


<html xmlns="http://www.w3.org/1999/xhtml">

<head>


<style type="text/css">

ul li {
	text-decoration: none;
	list-style-type: none;
	line-height: 20px;
}

body {
	font-family: 宋体, Arial, Helvetica, sans-serif;
	font-size: 12px;
	background: #769b72 url(../images/booksaleimg/bg_grad.gif) top center
		no-repeat;
	cursor: default;
	color: #404040;
	margin: 0;
	padding: 0;
}
</style>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.1.js"></script>
	<script type="text/javascript">
		$(function(){
			$("[name ='t1']").click(function(){
		
			var id=$(this).next().html();
				var v = $(this);	
				v.prop("src","<s:url namespace='/' action='cart_addCart'/>?book_id="+id);
				window.setTimeout(function(){
					v.prop("src","<s:url value='/images/load.gif'/>");
					
				},200); 
				window.setTimeout(function(){
					v.prop("src","<s:url value='/images/label3.gif'/>");
				},500);
				window.setTimeout(function(){
					v.prop("src","<s:url value='/images/buttom_goumai.gif'/>");
				},1000);
				
			});
			
			
		});
	</script>
</head>

<body>
	<div style="width: 60%;margin:20px auto;">
		<div style="width:100%;float: left;">
			<h1>
				
			</h1>			
			<s:iterator value = "listbook">
			<span><font color="#cccccc">丛书名：</font></span>
			<hr />
			<div>
				<div style="float: left;width:20%;">
					<img src='${pageContext.request.contextPath}/productImages/<s:property value = 'product_image'/>'  border=0 />
				</div>
				<div style="float: left;width:80%">
					<ul class="info">
						<li>作&nbsp;者：<s:property value = "author"/></li>
						<li>出版社：</li>
						<li style="float:left;width:50%;">出版时间：<s:property value = "groundingDate"/>aaa</li>
						<li style="float:left;width:50%;">字数：</li>
						<li style="float:clear;"></li>
						<li style="float:left;width:50%;">版次：</li>
						<li style="float:left;width:50%;">页数：</li>
						<li style="float:clear;"></li>
						<li style="float:left;width:50%;">印刷时间：</li>
						<li style="float:left;width:50%;">开本：	</li>
						<li style="float:clear;"></li>
						<li style="float:left;width:50%;">印次：</li>
						<li style="float:left;width:50%;">纸张：</li>
						<li style="float:clear;"></li>
						<li style="float:left;width:50%;">ISBN：</li>
						<li style="float:left;width:50%;">包装：</li>
						<li>
							<div class='your_position'>
								
								
								您现在的位置:&nbsp; <a href='../main/main.jsp'>当当图书</a> &gt;&gt; 
								<s:iterator value = "listbook.CategoryEntity">
								<font style='color: #cc3300'> 
									<strong>
								
									<s:property  value = "listbook.CategoryEntity.category.category_name"/>&gt;&gt; 
									</strong>
								</font>
								</s:iterator>
							</div>
						</li>		
						<li>定价：￥<s:property value = "book_prive"/>&nbsp;&nbsp;  
							当当价：￥<s:property value = "Dangproce"/>&nbsp;&nbsp; 节省：￥<s:property value = "book_prive-Dangproce"/></li>
						<li><a href="javascript:void(0)"> <img
								src='${pageContext.request.contextPath}/images/buttom_goumai.gif' class="abc"
								name="t1" /><span style="display:none;"><s:property value = "book_id"/></span>
						</a></li>
					</ul>
				</div>
				<div style="float: clear;"></div>
			</div>
			</s:iterator>
		</div>
	</div>
</body>
</html>