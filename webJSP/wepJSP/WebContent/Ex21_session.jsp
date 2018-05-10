<%@page import="java.text.SimpleDateFormat"%>
<%@page import="sun.java2d.pipe.SpanShapeRenderer.Simple"%>
<%@page import="java.util.Date"%>
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
		session 브라우저(접속한 사용자) 마다 부여되는 [고유한 객체]
	
		session 값 : 웹 서버가 접속한 클라이언트(브라우저에게)부여하는 고유한 ID 값(식별값) 
		A라는 사용자가 > 웹 서버에 접속 (session 객체를 생성하고 > id값을 만들고 > Client response
		B6FEB6E26220F2ACAA40D77C0F8A7CE3(Client)
		B6FEB6E26220F2ACAA40D77C0F8A7CE3(Server) 값은 session 객체
		: 처음 접속한 시간
		: 마지막 접속한 시간
	 -->
	 <%
	 	Date time = new Date();
	 	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	 	
	 %>
	 <h3>세선정보</h3>
	 <%= session.getId() %>
	 <hr>
	 <%
	 	time.setTime(session.getCreationTime());
	 %>
	 [session 생성된 시간] : <%=formatter.format(time) %>
	 <hr>
	 <%
	 	time.setTime(session.getLastAccessedTime());
	 	%>
	 	[session(client) 마지막 접속시간] <%=formatter.format(time) %>
</body>
</html>
 	