<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id");
    
    /* 
    	request 객체
    	Tomcat 이 가지고 있는 내장 객체 (웹 프로젝트가 톰켓 서버 설정을 가지고 있어야 해요)
    	[*.jsp Default tomcat 의 내장 객체를 선언없이 사용 가능하다]
    	
    	
    	request 객체(요청 객체)
    	1.요청 페이지당 한개의 request 객체 생성
    	2.클라이언트 정보를 서버로 
    	3.클라이언트 정보 (입력값, 기본정보(브라우저 정보,IP정보))
    	request 내장 객체는 클라이언트에서 서버로 요청할때 생성되는
    	HttpServletRequest 타입의 객체가 생성되고 그 주소를 request라는 참조변수 주소값
    	
    	
    
    */
    
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request 객체 탐구</title>
</head>
<body>
id : <%= id %><hr>
접속한 클라이언트 IP : <%=request.getRemoteAddr() %><br>
서버(요청한방식:인코딩):<%=request.getCharacterEncoding() %><br>
전송방식:<%=request.getMethod() %><br>
포트<%=request.getServerPort() %><br>
context root(가상 디렉토리, 홈 디렉토리): <%=request.getContextPath() %><br>
<!-- /webJSP -->
<!-- 
D://bitcamp104/webJSP/JSPLap/webJSP : 실제경로

http://192.168.026:8090/webJSP/Ex04_request.jsp : 가상경로
http://192.168.026:8090/webJSP 가지는 서비스 경로(default);
[webContent]
 -->
 <%=request.getRequestURI() %>
 <!-- /wepJSP/Ex04_request.jsp -->
</body>
</html>
 	