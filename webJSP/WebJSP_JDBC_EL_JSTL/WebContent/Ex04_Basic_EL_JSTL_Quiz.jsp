<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
 <%
    	String id = request.getParameter("ID");
    	if(id.equals("hong")){
%>
		<%=id %><img src="images/apeach.png" alt="이미지" width="100px" height ="100px">
<%    		
    	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>EL 과 JSTL 사용</h3>
	<c:if test="${param.ID == 'hong'}">
	${param.ID}<img src="images/apeach.png" alt="이미지" width="100px" height ="100px">
	</c:if>
	<h3>JSTL IF문</h3>
	<c:if test="${param.age > 20}" var="result">
			param.value : ${param.age}<br>
	</c:if>
	<br>
	if구문에서 var 변수는 결과값을 저장 : ${result}
</body>
</html>