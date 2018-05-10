<%@page import="com.sun.xml.internal.ws.api.ha.StickyFeature"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	request.setCharacterEncoding("UTF-8");
    	String id = request.getParameter("userId"); //아이디의 name값을 가져옴
    	String name = request.getParameter("userName"); //이름의 name값을 가져옴
    	String pass = request.getParameter("userPass");
    	String gender = request.getParameter("gender");
    	String email = request.getParameter("userEmail");
    	String jumin1 = request.getParameter("userSsn1");
    	String jumin2 = request.getParameter("userSsn2");
    	String userZipCode = request.getParameter("userZipCode");
    	String userAddr1 = request.getParameter("userAddr1");
    	String userAddr2 = request.getParameter("userAddr2");
    	String userPhone = request.getParameter("userPhone");
    	String[] hobbys = request.getParameterValues("hobby");
        String val = "";
    	for(int i = 0; i<hobbys.length; i++){
    	
    	 val += hobbys[i];
    	}
    	String year =request.getParameter("year");
    	String month = request.getParameter("month");
    	String day = request.getParameter("day");
    	
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
아이디 : <%=id %><br>
이름 : <%=name %><br>
비번 : <%=pass %><br>
성별 : <%=gender %><br>
이메일 : <%=email %><br>
주민앞 : <%=jumin1 %><br>
주민뒤 : <%=jumin2 %><br>
우편번호 : <%=userZipCode %><br>
1번주소 : <%=userAddr1 %><br>
2번주소 : <%=userAddr2 %><br>
폰 : <%=userPhone %><br>
취미 :<%=val %><br>
년 : <%=year %> 월 : <%=month %> 일 : <%=day %>

</body>
</html>
 	