<%@page contentType="text/html;charset=utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<div class="book_l_border1" id="__FenLeiLiuLan">
	<div class="book_sort_tushu">
		<h2>
			分类浏览
		</h2>
		
		<!--1级分类开始-->
			<s:iterator value="list">
			<div class="bg_old" onmouseover="this.className = 'bg_white';"
				onmouseout="this.className = 'bg_old';">
				<h3>
					[<a href='<s:url namespace = "/" action = "book_selectpaging"/>?id=<s:property value= "category_id"/>'>
					<s:property value="category_name"/>
					</a>]
				</h3>
					
				<ul class="ul_left_list">

						<!--2级分类开始-->
						<s:iterator value="catrgory">
						<li>								
							<a href='<s:url namespace = "/" action = "book_selectByStartEndAndScid"/>?cid=<s:property value= "category_id"/>'><s:property value="category_name"/></a>

						</li>
						</s:iterator>
						<!--2级分类结束-->

				</ul>
				<div class="empty_left">
				</div>
			</div>

			<div class="more2">
			</div>
		</s:iterator>
			

		
	</div>
</div>
