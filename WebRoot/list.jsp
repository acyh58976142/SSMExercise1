<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>帖子列表</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
		<script type="text/javascript">
	function toDelete(id){
		if(confirm("确认删除该条发帖及其相关回复？")){
			//location.href="delete.do?id="+id;
			location.href="http://www.baidu.com";
		}
	}
</script>
		<style type="text/css">
* {
	text-align: center;
}
table,form {
	margin: 0 auto;
	width: 600px;
}

#th {
	background-color: blue;
}

table .td:nth-child(odd) {
	background-color: green;
}

#msg {
	color: red;
}

#id {
	text-align: left;
}
</style>
	</head>

	<body>
		<center>
			<h2>
				帖子列表
			</h2>
			<table border="1">
				<tr id="search">
					<td colspan="5">
						<form action="list.do?name=${name }" method="get">
							帖子标题：
							<input type="text" name="name" id="id" value="${name }">
							<input type="submit" value="搜索">
						</form>
					</td>
				</tr>
				<tr id="th">
					<td>
						标题
					</td>
					<td>
						内容摘要
					</td>
					<td>
						作者
					</td>
					<td>
						发布时间
					</td>
					<td>
						操作
					</td>
				</tr>
				<c:forEach items="${invlist }" var="inv">
					<tr class="td">
						<td>
							${inv.title }
						</td>
						<td>
							${inv.summary }
						</td>
						<td>
							${inv.author }
						</td>
						<td>
							<fmt:formatDate value="${inv.createdate }" type="date"
								pattern="yyyy-MM-dd" />
						</td>
						<td>
							<a href="javascript:void(0)"
								onClick="location.href='detail.do?invid=${inv.id }'">查看回复</a>||
							<a href="javascript:void(0)" onClick="toDelete(${inv.id })">删除</a>
						</td>
					</tr>
				</c:forEach>
				<c:if test="${msg!=null }">
					<tr id="msg">
						<td colspan="5">
							${msg }
						</td>
					</tr>
				</c:if>
			</table>
			第${page.currentPage }/${page.pageCount}页
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="javascript:void(0)"
				onClick="location.href='list.do?currentPage=1&name=${name }'">首页</a>&nbsp;
			<a href="javascript:void(0)"
				onClick="location.href='list.do?currentPage=${page.pre }&name=${name }'">上一页</a>&nbsp;
			<a href="javascript:void(0)"
				onClick="location.href='list.do?currentPage=${page.next }&name=${name }'">下一页</a>&nbsp;
			<a href="javascript:void(0)"
				onClick="location.href='list.do?currentPage=${page.pageCount }&name=${name }'">末页</a>
		</center>
	</body>
</html>
