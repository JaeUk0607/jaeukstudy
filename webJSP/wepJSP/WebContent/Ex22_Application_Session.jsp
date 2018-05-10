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
TODAY POINT
서버자원(WAS) : memory

application    :   session  
[전역객체] 변수                   [개인 : 접속한 브라우져 : 고유값] 변수 (접속한 사용자마다 고유하게 부여되는 변수)

사이트 접속 : 전체 접속자 수 [10000명]
application.setAttribute("count",0) : count 변수를 만들고 0으로 초기화
사이트에 접속하는 모든 사용자는 count 변수를 접근 가능 (모든  session 은 : count 변수 가지고 놀 수 있다)


[session]
session.setAttribute("userid","kglim");
접속한 사용자(브라우져) 마다 고유하게 부여되는 변수

A라는 사용자 웹 서버 접속
서버  session 객체 생성 > 식별값 (325C1CA75A2E62599BEBD77F5711C59C) > 접속브라우져 (response)
session.setAttribute("userid","kglim");

B라는 사용자 웹 서버 접속
서버  session 객체 생성 > 식별값 (AAAA1CA75A2E62599BEBD77F5711C59C) > 접속브라우져 (response)
session.setAttribute("userid","hong");

Application  변수는 사용자 마다 같은 값
Session 변수 접속하는 사용마다 다른 값을 가질 수 있다
-->
<h3>세션정보</h3>
웹 서버가 부여한 고유한 ID값 : <%= session.getId() %>
<hr>
<%
	String userid = request.getParameter("userid");
	session.setAttribute("id", userid); //세션변수 () write : 접속한 사용자 ID

%>
<h3>세션 변수값</h3>
<%	
	 String id =(String)session.getAttribute("id"); //세션변수() read
	 out.print("당신의 ID는 <b>" + id + "</b>"); 
%>
</body>
</html>






