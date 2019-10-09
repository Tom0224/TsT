<%@page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>生成订单 - 当当网</title>
<link href="../css/login.css" rel="stylesheet" type="text/css" />
<link href="../css/page_bottom.css" rel="stylesheet" type="text/css" />
<link href="../css/address.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
	$(function(){
		 
	})
</script>
</head>
<body>
	<%@include file="../common/head1.jsp"%>
	<div class="login_step">
		生成订单骤: 1.确认订单 ><span class="red_bold"> 2.填写送货地址</span> > 3.订单成功
	</div>
	<div class="fill_message">
		 
		 <form action="order_ok.jsp" method="post">
			 <div class="address-wrap">
				<ul class="address-list">
					 <li class="address-wrap selected">
					<div class="addressBox">
						<span class="marker-tip">寄送至</span>
					</div>
					<label class="addressInfo">
						<input type="radio" name="address"/>
						<span class="user-address">
							<span >河南省 郑州市 金水区 文化路街道 </span>
							<span>文化路82号硅谷广场A座13A16(14层)百知教育</span>
							<span>（</span>
							<span>段小翔</span>
							<span> 收）</span>
							<em>15637128565</em>
						</span>
					</label>
				</li>
				<li class="address-wrap">
					<label class="addressInfo">
						<input type="radio" name="address"/>
						<span class="user-address">
							<span >河南省 郑州市 金水区 文化路街道 </span>
							<span>文化路82号硅谷广场A座13A16(14层)百知教育</span>
							<span>（</span>
							<span>段小翔</span>
							<span> 收）</span>
							<em>15637128565</em>
						</span>
					</label>
				</li>
				</ul>
			</div>
			
			<div class="login_in">
				<input
					id="btnClientRegister" class="button_1" name="submit" type="submit"
					value="下一步" />
			</div>
			
		</form>
	</div>
	<%@include file="../common/foot1.jsp"%>
</body>
</html>

