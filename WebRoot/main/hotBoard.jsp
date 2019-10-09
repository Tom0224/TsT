<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<div id="NewProduct_1_o_t" onmouseover="">
	<ul>
		<s:iterator value = "list">
		 <li><a href='<s:url namespace = "/" action = "book_selectBookEntityId"/>?id=<s:property value = "book_id"/>' target='_blank'><s:property value ="book_name"/></a></li>
		
		</s:iterator>
	</ul>
</div>