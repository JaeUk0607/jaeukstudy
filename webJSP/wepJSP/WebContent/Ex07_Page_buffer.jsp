<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="8kb" autoFlush="true" %>
<!-- 
페이지에 어떠한 설정도 하지 않으면
default : buffer="8kb" autoFlush = "true"
buffer Full 되었을때 자동 flush

Page 에 더 이상 실행할 것이 없으면 : 자동 flush
 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		for(int i = 0; i<10; i++){
	%>
		출력값 : <%=i %><br>
	<%		
		}
	%>
</body>
</html>