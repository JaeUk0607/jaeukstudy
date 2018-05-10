<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int num = 0; /* 유효범위 : Page 내에서 (Ex10_Application.jsp) */
	/* 
		WAS : 여러개의 웹 어플리케이션을 서비스 할 수 있다
		WAS : WebJSP 웹 어플리케이션을 가지고 있다
		WebJSP(가상디렉토리) -> 실경로(WebContent)
		:Context root    -> WebContent
		
		WebContent 안에 있는 모든 페이지가 공유할 수 있는 자원은 없을까
		
		웹 어플리케이션은 하나의 설정파일을 가진다 (웹 전체를 설정 여러가지 정보....)
		web.xml (웹 어플리케이션 설정 정보 관리) > 가장 먼저 실행
		webContent > WEB-INF > web.xml
		**WEB-INF (보안폴더) : 클라이언트가 접속할 수 없는 경로
		**http://localhost:8090/webJSP/WEB-INF/web.xml >> 404 file not found
		**WEB-INF > view 생성 > 여기서 파일 관리
		
		web.xml
		 <context-param>
		  	<description>기본적인 설명을 하시면...</description>
		  	<param-name>email</param-name>
		  	<param-value>webmaster@bit.or.kr</param-value>
		 </context-param>
		 <context-param>
		  	<description>파일 저장 경로</description>
		  	<param-name>FilePath</param-name>
		  	<param-value>C:\\Web\\download</param-value>
	     </context-param>
	     
	     application
	             웹서버의 어플리케이션이 실행되는 [실행환경에 대한 정보]를 처리하는 객체입니다...
	     web.xml 설정에 처리 >> application
		
		
	*/
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
			String param = application.getInitParameter("email");
			out.print("<h3>" + param + "</h3>");
			
			String param2 = application.getInitParameter("FilePath");
			out.print("<h3>" + param2 + "</h3>");
	%>
</body>
</html>