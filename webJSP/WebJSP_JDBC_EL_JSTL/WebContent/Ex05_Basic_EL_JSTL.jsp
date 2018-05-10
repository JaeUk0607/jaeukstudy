<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
<%
	/* 
	<c:set         : 변수 생성 , 값을 저장    value="<%=객체>">
	<c:remove      : 변수 삭제>
	<c:if          : 조건문(test="조건")>
	<c:choose      : 여러가지 조건에 따라 처리 가능(if 보다 활용도가 높다)>
	<c:forEach     : 반복문 (개선된 for문)>
	<c:forTokens   : (split 과 for문 결합)>
	<c:out         : JSTL 출력 구문 (이것보다는 EL  ${})>
	<c:cath        : 예외처리>
	*/
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>EL parameter 받기</h3>
	${param.id}-${param.pwd}<br>
	
	<h3>EL & JSTL 혼합(의도 : scope 강제)</h3>
	<c:set var="userid" value="${param.id}"/>
	<c:set var="userpwd" value="${param.pwd}"/>
	
	<h3>사용</h3>
	id  : ${userid}<br>
	pwd : ${userpwd}<br>
	
	<!-- IF문 -->
	<c:if test="${empty userpwd}">
		<h3>empty userpwd</h3>
	</c:if>
	
	<hr>
	<c:if test="${!empty userpwd}">
		<h3>empty userpwd</h3>
		<c:if test="${userid=='1004'}">
			<h3>welcomeAdmin page</h3>
		</c:if>
	</c:if>
	
</body>
</html>