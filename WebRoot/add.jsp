<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

		<title>添加回复</title>

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
	function checkNull() {
		if (!$("#content").val().trim()) {
			alert("回复内容不能为空！");
			return;
		}
		$("#form1").submit();
	}
</script>
		<style type="text/css">
#th,#button {
	text-align: center;
}

#th {
	background-color: blue;
}
</style>
	</head>

	<body>
		<center>
			<form action="add.do?invid=${invid }" method="post" id="form1">
				<table border="1">
					<tr id="th">
						<td colspan="2">
							<b>添加回复</b>
						</td>
					</tr>
					<tr>
						<td>
							<b>回复内容：</b>
						</td>
						<td>
							<textarea rows="3" name="content" id="content"></textarea>
						</td>
					</tr>
					<tr>
						<td>
							<b>回复昵称：</b>
						</td>
						<td>
							<input type="text" name="author" id="author">
						</td>
					</tr>
					<tr id="button">
						<td colspan="2">
							<input type="button" value="提交" onclick="checkNull()">
							&nbsp;&nbsp;
							<input type="button" value="返回" onclick="history.back()">
						</td>
					</tr>
				</table>
			</form>
		</center>
	</body>
</html>
