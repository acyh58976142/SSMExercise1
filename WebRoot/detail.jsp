<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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

		<title>回复信息列表</title>

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
		if("${msg }"!=null&&"${msg }"!=""){
			alert("${msg }");
		}
</script>
		<style type="text/css">
* {
	text-align: center;
}

table {
	margin: 0 auto;
	width: 500px;
}

#a {
	text-align: right;
}

#a a {
	text-decoration: none;
	font-weight: bold;
	color: red;
}

#th {
	background-color: blue;
}

table .td:nth-child(even) {
	background-color: green;
}
</style>
	</head>

	<body>
		<center>
			<h2>
				回复信息列表
			</h2>
			<table border="1">
				<tr>
					<td colspan="3" id="a">
						<a href="toAdd.do?invid=${invid }">添加回复</a> &nbsp;&nbsp;
						<a href="javascript:void(0)" onclick="location.href='list.do'">返回帖子列表</a>
					</td>
				</tr>
				<tr id="th">
					<td>
						回复内容
					</td>
					<td>
						回复昵称
					</td>
					<td>
						发布时间
					</td>
				</tr>
				<c:forEach items="${replist }" var="rep">
					<tr class="td">
						<td>
							${rep.content }
						</td>
						<td>
							${rep.author }
						</td>
						<td>
							<fmt:formatDate value="${rep.createdate }" type="date"
								pattern="yyyy-MM-dd" />
						</td>
					</tr>
				</c:forEach>
			</table>
			第${page.currentPage }/${page.pageCount}页
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<a href="javascript:void(0)"
				onClick="location.href='detail.do?currentPage=1&invid=${invid }'">首页</a>
			<a href="javascript:void(0)"
				onClick="location.href='detail.do?currentPage=${page.pre }&invid=${invid }'">上一页</a>
			<a href="javascript:void(0)"
				onClick="location.href='detail.do?currentPage=${page.next }&invid=${invid }'">下一页</a>
			<a href="javascript:void(0)"
				onClick="location.href='detail.do?currentPage=${page.pageCount }&invid=${invid }'">末页</a>
		</center>
	</body>
</html>
