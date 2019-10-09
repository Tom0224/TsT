<%@page contentType="text/html;charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>生成订单 - 当当网</title>
<link href="../css/login.css" rel="stylesheet" type="text/css" />
<link href="../css/page_bottom.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
 
</script>
</head>
<body>
	<%@include file="../common/head1.jsp"%>
	<div class="login_step">
		添加收货地址：
	</div>
	<div class="fill_message">
	
		<form name="ctl00" action='<s:url namespace = "/" action="address_insertexist"/>'
			method="post" id="f" onsubmit="return checkForm()">
			<input type="hidden" name="address.id" id="addressId" />
			<table class="tab_login">
				<tr>
					<td valign="top" class="w1">收件人姓名：</td>
					<td><input onblur="checkname()" type="text" class="text_input"
						name="add.receive_name" id="receiveName" />
						<div class="text_left" id="nameValidMsg">
							<p>请填写有效的收件人姓名</p>
							<span id="name.info" style="color:red"></span>
						</div></td>
				</tr>
				<tr>
					<td valign="top" class="w1">收件人详细地址：</td>
					<td><input onblur="checkeaddress()" type="text"
						name="add.address" class="text_input" id="fullAddress" />
						<div class="text_left" id="addressValidMsg">
							<p>请填写有效的收件人的详细地址</p>
							<span id="address.info" style="color:red"></span>
						</div></td>
				</tr>
				<tr>
					<td valign="top" class="w1">手机</td>
					<td><input onblur="checkphone()" type="text"
						class="text_input" name="add.mobile" id="phone" />
						<div class="text_left" id="phoneValidMsg">
							<p>请填写有效的收件人的手机</p>
							<span id="telphone.info" style="color:red"></span>
						</div></td>
				</tr>
			</table>

			<div class="login_in">
				<a href="javascript:history.go(-1);"><input id="btnClientRegister"
					class="button_1"  type="button" value="取消" /></a> <input
					id="btnClientRegister" class="button_1" name="submit" type="submit"
					value="添加" />
			</div>
		</form>
	</div>
	<%@include file="../common/foot1.jsp"%>
</body>
</html>

