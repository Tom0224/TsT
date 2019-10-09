<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<h2>
	<span class="more"><a href="#" target="_blank">更多&gt;&gt;</a> </span>最新图书
</h2>
<div class="book_c_04">
	<s:iterator value = "list">
		
	
	<!--热销图书A开始-->
	<div class="second_d_wai">
		<div class="img">
			<a href='<s:url namespace = "/" action = "book_selectBookEntityId"/>?id=<s:property value = "book_id"/>' target='_blank'><img
					src='${pageContext.request.contextPath}/productImages/<s:property value = "product_image"/>' border=0 /> </a>
		</div>
		<div class="shuming">
			<a href="'<s:url namespace = "/" action = "book_selectBookEntityId"/>?id=<s:property value = "book_id"/>'" target="_blank">书籍标题</a><br>
			<s:property value = "book_name"/>
			<a href="#" target="_blank"></a>
		</div>
		<div class="price">
			定价：<s:property value = "book_prive"/>
		</div>
		<div class="price">
			当当价：<s:property value = "Dangproce"/>bbbb
		</div>
	</div>
	</s:iterator>
	<div class="book_c_xy_long"></div>
	<!--热销图书A结束-->

</div>
<div class="clear"></div>