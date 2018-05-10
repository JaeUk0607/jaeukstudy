<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	404 : 요청 페이지가 없는 경우
	500 : 서버쪽 코드 문제(실행시 0으로 나누거나, null)
	
	500 예외가 발생하면 : 별도의 페이지를 서비스 (web.xml) 설정
 -->
 <%
 		String data = request.getParameter("name").toLowerCase();
 %>
 전달받은 내용 : <%=data %>
</body>
</html>