<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%
    /* 클라이언트가 서버에 전달하여 데이터 받기
        request 요청 객체
        ?userid = hong&pwd=111......
    */
    
    //한글처리
    request.setCharacterEncoding("UTF-8");
    
    String uid = request.getParameter("userid"); //단일값
    String pwd = request.getParameter("pwd");
    String[] hobbys = request.getParameterValues("hobby"); //다중값
%>
<!--  
1. 이클립스 -> window -> preferences -> workspace -> UTF-8 (Text 기반의 주석 처리)

2. window -> preferences -> web -> CSS files -> Encoding (UTF-8)
  window -> preferences -> web -> HTML files -> Encoding (UTF-8)
  window -> preferences -> web -> JSP files -> Encoding (UTF-8)
 
  TIP) 한글 깨짐과 상관 없지만.... HTML5형식의 JSP 페이지
3.  window -> preferences -> web -> jsp files -> editor -> template 추가(new)
 
4. Tomcat (서버 : WAS) 한글 설정
  server.xml 서버 설정 (63번째 라인)
  <Connector connectionTimeout="20000"
                port="8090"
                protocol="HTTP/1.1"
                redirectPort="8443"/>

5. **한글 처리**
전송방식 : get(Tomcat9 한글 문제 없음)
        -데이터를 받기 전(페이지 상단)
        -request.setCharacterEncoding("UTF-8");
        -<Connector URIEncoding="UTF-8" ....


전송방식 : post
          -request.setCharacterEncoding("UTF-8");    

정리 ) Tomcat 9..
페이지 상단 : request.setCharacterEncoding("UTF-8");
  그런데 만약 문제가 생기면
 <Connector URIEncoding="UTF-8" ....
-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    입력값 : <%= uid %><br>
    입력값 : <%= pwd %><br>
    당신의 취미는 : <br>
    <%
        for(String str : hobbys){
    %>
        hobby:<%=str %><br>
    <%
        }
    %>
    
</body>
</html>