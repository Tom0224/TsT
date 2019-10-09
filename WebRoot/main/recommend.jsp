<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<h2>
	编辑推荐
</h2>
<div id=__bianjituijian/danpin>
	<div class=second_c_02>
		<s:iterator value = "list">
			
		
		<!--编辑推荐开始-->
		<div class=second_c_02_b1>
			<div class=second_c_02_b1_1>
				<a href='<s:url namespace = "/" action = "book_selectBookEntityId"/>?id=<s:property value = "book_id"/>' target='_blank'><img src='${pageContext.request.contextPath}/productImages/<s:property value = "product_image"/>' width=70 border=0 /></a>
			</div>
			<div class=second_c_02_b1_2>
				<h3>
					<a href='<s:url namespace = "/" action = "book_selectBookEntityId"/>?id=<s:property value = "book_id"/>' target='_blank' title='输赢'>书名:<s:property value = "book_name"/></a>
				</h3>
				<h4>
					作者：××× 著<s:property value = "author"/>
					<br />
					出版社：没有&nbsp;&nbsp;&nbsp;&nbsp;出版时间：2006-7-1
				</h4>
				<h5>
					简介<s:property value = "messages"/>
				</h5>
				<h6>
					定价：<s:property value = "book_prive"/>&nbsp;&nbsp;当当价：<s:property value = "Dangproce"/>
				</h6>
				<div class=line_xx></div>
			</div>
		</div>
		</s:iterator>
		<%-- <div class=second_c_02_b1>
			<div class=second_c_02_b1_1>
				<a href='#' target='_blank'><img src="" width=70 border=0 /> </a>
			</div>
			<div class=second_c_02_b1_2>
				<h3>
					<a href='#' target='_blank'>书名</a>
				</h3>
				<h4>
					作者：××× 著
					<br />
					出版社：&nbsp;&nbsp;&nbsp;&nbsp;出版时间：2006-12-1
				</h4>
				<h5>
					介绍
					<span class=pot>...</span>
				</h5> 
				<h6>
					定价：￥168.00&nbsp;&nbsp;当当价：￥84.00
				</h6>
			</div>
		</div> --%>
		<!--编辑推荐结束-->
		
	</div>
</div>
