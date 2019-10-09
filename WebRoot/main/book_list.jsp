<%@page contentType="text/html;charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<title>当当图书 – 全球最大的中文网上书店</title>
		<link href="${pageContext.request.contextPath}/css/book.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/second.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/secBook_Show.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/css/list.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		&nbsp;

		<!-- 头部开始 -->
		<%@include file="../common/head.jsp"%>
		<!-- 头部结束 -->

		<div style="width: 962px; margin: auto;">
			<a href="#"><img src="${pageContext.request.contextPath}/images/default/book_banner_081203.jpg" border="0" /> </a>
		</div>
		<div class='your_position'>
			您现在的位置:&nbsp;
			<a href='#'>当当图书</a> &gt;&gt;
			<font style='color: #cc3300'><strong>小说</strong> </font>
		</div>

		<div class="book">

			<!--左栏开始-->
			<div id="left" class="book_left">
				<div id="__fenleiliulan">
					<div class=second_l_border2>
						<h2>
							分类浏览
						</h2>
						<ul>
							<li>
								<div>
									<div class=second_fenlei>
										&middot;全部&nbsp;(23)
									</div>
								</div>
							</li>
							<div class="clear"></div>
							<!--2级分类开始-->
							
							<s:iterator value = "listcate">
							<li>
								<div>
									<div class=second_fenlei>
										&middot;
									</div>
									<div class=second_fenlei>
										<a href='<s:url namespace = "/" action = "book_selectByStartEndAndScid"/>?cid=<s:property value= "category_id"/>'><s:property value = "category_name"/>&nbsp;(<s:property value = "count"/>)</a>
									</div>
								</div>
							</li>
						    <div class="clear"></div>
							<!--2级分类结束-->
							</s:iterator>
							
							<li>
								<div></div>
							</li>
						</ul>
					</div>
				</div>
			</div>

			<!--左栏结束-->

			<!--中栏开始-->
			<div class="book_center">

				<!--图书列表开始-->
				<div id="divRight" class="list_right">
	
					<div id="book_list" class="list_r_title">
						<div id="divTopPageNavi" class="list_r_title_text3">

							<!--分页导航开始-->
							<s:if test="pa>1">
							
							<div class='list_r_title_text3a'>
									<s:if test="id!=null">
							
								<a name=link_page_next
									href= '<s:url namespace = "/" action = "book_selectpaging"/>?id=<s:property value ="id"/>&pa=<s:property value="pa-1"/>'>
								<img src='${pageContext.request.contextPath}/images/page_up.gif' /></a>
								
									</s:if>
									<s:else>
							<a name=link_page_next
									href= '<s:url namespace = "/" action = "book_selectByStartEndAndScid"/>?cid=<s:property value ="cid"/>&pa=<s:property value="pa-1"/>'>
								<img src='${pageContext.request.contextPath}/images/page_up.gif' /></a>
							
									</s:else>
							</div>
							
							</s:if>
							<s:else>
							<div class='list_r_title_text3a'>
								<img src='${pageContext.request.contextPath}/images/page_up_gray.gif' />
							</div>
							</s:else>
							
							<div class='list_r_title_text3b'>
								第<s:property value="pa"/>页/共<s:property value= "sum"/>页
							</div>
							
							
							
							
							<s:if test="pa<sum">
							<div class='list_r_title_text3a'>
									<s:if test="id!=null">
								<a name=link_page_next
									href= '<s:url namespace = "/" action = "book_selectpaging"/>?id=<s:property value ="id"/>&pa=<s:property value="pa+1"/>'>
									<img src='${pageContext.request.contextPath}/images/page_down.gif' /> </a>
									</s:if>
									<s:else>
							<a name=link_page_next
									href= '<s:url namespace = "/" action = "book_selectByStartEndAndScid"/>?cid=<s:property value="cid"/>&pa=<s:property value="pa+1"/>'>
								<img src='${pageContext.request.contextPath}/images/page_down.gif' /></a>
							
							
									</s:else>
							</div>
							 </s:if>
							<s:else>
							<div class='list_r_title_text3a'>
								<img src='${pageContext.request.contextPath}/images/page_down_gray.gif' />
							</div>
							</s:else>

							<!--分页导航结束-->
						</div>
					</div>
					
					<!--商品条目开始-->
					<s:iterator value = "list">
							
					
						<div class="list_r_line"></div>
						<div class="clear"></div>

						<div class="list_r_list">
							<span class="list_r_list_book"><a name="link_prd_img" href='#'>
								<img src='${pageContext.request.contextPath}/productImages/<s:property value = "product_image"/>'/> </a> </span>
							<h2>
								<a name="link_prd_name" href='#'><s:property  value = "book_name"/></a>
							</h2>
							<h3>
								顾客评分：100
							</h3>
							<h4 class="list_r_list_h4">
								作 者:
								<a href='#' name='作者'><s:property  value = "author"/></a>
							</h4>
							<h4>
								出版社：
								<a href='#' name='出版社'>人民邮电出版社</a>
							</h4>
							<h4>
								出版时间：<s:property  value = "groundingDate"/>
							</h4>
							<h5>
							内容简介：
								<s:property  value = "messages"/>
							</h5>
							<div class="clear"></div>
							<h6>
								<span class="del"><s:property  value = "book_prive"/></span>
								<span class="red"><s:property  value = "Dangproce"/></span>
								节省：<s:property  value = "book_prive-Dangproce"/>
							</h6>
							
							<span class="list_r_list_button"> 
							<a href="#"> 
							<img src='${pageContext.request.contextPath}/images/buttom_goumai.gif' /> </a>
							<span id="cartinfo"></span>
						</div>
						</s:iterator>
						
						<div class="clear"></div>
					
						<div class="clear"></div>
						
				<!--图书列表结束-->

			</div>
			<!--中栏结束-->
			<div class="clear"></div>
		</div>

		<!--页尾开始 -->
		<%@include file="../common/foot.jsp"%>
		<!--页尾结束 -->
	</body>
</html>
