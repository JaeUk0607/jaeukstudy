<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    //자바코드
    String userid = request.getParameter("userid");
    String username = request.getParameter("username");
    
    
    
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>당신이 입력한 데이터는</h3>
ID : <%= userid %><br>
PWD : <%= username %><br>
</body>
</html>