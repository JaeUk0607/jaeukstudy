<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>DB 연결하기 (DBCP)</h3>
	<%
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Context context = new InitialContext(); //이름 기반으로 (WAS 안에서)
		DataSource dbcp = (DataSource)context.lookup("java:comp/env/jdbc/oracle"); //name : jdbc/oracle
		
		conn = dbcp.getConnection(); //POOL 안에서 연결 객체를 하나 얻어내는 코드
		
		out.print("DB연결 여부 : " + conn.isClosed()+"<br>");
		conn.close(); //DBCP close() >> 반환 하기(Connection 반환)
		out.print("DB연결 여부 : " + conn.isClosed()+"<br>");
	%>

</body>
</html>