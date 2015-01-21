<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
	font-family:Arial,Helvetica,sans-serif;
	font-size:12px;	
}
.errors {
	background-color:#FFCCCC;
	border:1px solid #CC0000;
	width:220px;
	line-height:10px;
}
.errors li{
	list-style: none; 
}
</style>
</head>
<body>
<form action="thanhcong" method="post">
<center>
	<table width="200">
		<tr height="30">
			<td width="200" colspan="2">
				
			</td>
		</tr>
		<tr>
			<td colspan="2"width="200"align="left"style="background:#eee">Login Here</td>
		</tr>
		<tr>
			<td align="left">User ID:</td><td align="left"><input type="text" name="user_id"/></td>
		</tr>
		<tr>
			<td align="left">Password:</td><td align="left"><input type="password" name="password"/></td>
		</tr>
		<tr>
			<td align="left"></td><td align="left"><input type="submit"name="login"value="Login"></td>
		</tr>
	</table>
</center>
</form>
</body>
</html>