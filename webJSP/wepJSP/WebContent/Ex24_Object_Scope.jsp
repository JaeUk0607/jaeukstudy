<%@page import="kr.or.bit.EMP"%>
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
	Tomcat(WAS) 기본적으로 제공하는 객체
	1. request  (요청 : 클라이언트 정보)
	2. response (응답 : 특정페이지, 정보 츨력(쿠키 쓰기))
	3. application (전역객체 : xml 제어...변수)
	4. session     (사용자마다 고유하게 부여되는 객체....변수)
	5. out
	6.........
	
	session 객체
	[session변수]
	scope : 모든 페이지 사용가능(a.jsp (session.setAtt..) -> b.jsp(session.getAtt..))
	Life-cycle : sessionId 와 동일
	
	application 객체
	[application변수 : 전역]
	scope : 모든 사용자 와 모든 페이지에서 사용가능 (java : static 같은 자원)
		   (모든 session  == 모든 사용자)
	Life-cycle : web server 죽으면 (재부팅)...
	
	request 객체
	[request 변수] : request.setAtt......
	scope : 요청 페이지 한개(login.jsp -> request사용)
                               예외적으로 login.jsp 코드 (include, forward) 된 페이지에서도 사용가능

 -->
<%
	EMP emp = new EMP();
	emp.setEmpno(2000);
	emp.setEname("홍길동");
	
	session.setAttribute("empobj", emp);
	
	EMP e = (EMP)session.getAttribute("empobj");
	
	out.print(e.getEmpno() + "<br>");
	out.print(e.getEname() + "<br>");
	
	request.setAttribute("who", "king");
	String who = (String)request.getAttribute("who");
	
	out.print("request : " + who);
	
	
%>
<%-- <jsp:include page="b.jsp"></jsp:include>
b.jsp 페이지
session.getAttribute("empobj") 가능
request.getAttribute("who") 가능
 --%>
</body>
</html>