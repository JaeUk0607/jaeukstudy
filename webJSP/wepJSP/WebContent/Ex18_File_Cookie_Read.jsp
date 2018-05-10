<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>파일쿠키 READ</h3>
<%
	Cookie[] cs = request.getCookies();
	if(cs != null || cs.length > 0){
		for(Cookie c : cs){
			out.print(c.getName() + "<br>");
			out.print(c.getValue() + "<br>");
			out.print(c.getMaxAge() + "<br>");
		}
	}
%>
</body>
</html>
 	