<%@page contentType="text/html;charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<link href="${pageContext.request.contextPath}/css/book_head090107.css" rel="stylesheet" type="text/css" />
<div class="head_container">
	<div class="head_welcome">
		<div class="head_welcome_right">
			<span class="head_welcome_text"> </span>
			<span class="head_welcome_text"> <span class="little_n">
		
					| <a href='<s:url namespace = "/" action = "address_selectexist" />' name="myaddress" class="head_black12a">我的收货地址</a>
					| <a href="${pageContext.request.contextPath}/order/my_order.jsp" name="mydangdang" class="head_black12a">我的订单</a> |
					 <a
					href="#" name="helpcenter" class="head_black12a" target="_blank">帮助</a>
					| </span> </span>
			<div class="cart gray4012">
				<a href="${pageContext.request.contextPath}/cart/cart_list.jsp">购物车</a>
			</div>
		</div>
		<span class="head_toutext" id="logininfo">
		<b>您好，欢迎光临当当网</b>
		[&nbsp;<a href="" class="b">登出</a>&nbsp;]
		[&nbsp;<a href="${pageContext.request.contextPath}/user/login_form.jsp" class="b">登录</a>|<a
			href="${pageContext.request.contextPath}/user/register_form.jsp" class="b">注册</a>&nbsp;]
		</span>
	</div>
	<div class="head_head_list">
		<div class="head_head_list_left">
			<span class="head_logo"><a href="#" name="backtobook"><img
						src="${pageContext.request.contextPath}/images/booksaleimg/book_logo.gif" /> </a> </span>
		</div>
		<div class="head_head_list_right">

			<div class="head_head_list_right_b">
			</div>
		</div>
	</div>
	<div class="head_search_div">

	</div>
	<div class="head_search_bg"></div>
</div>
