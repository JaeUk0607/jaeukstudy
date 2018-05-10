<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>    
<% request.setCharacterEncoding("UTF-8"); 
   /* Ex08_Ajax_loginok.jsp JSTL 변환 하세요 
   	String user_id = request.getParameter("user_id");
	String user_pwd = request.getParameter("user_pw");
	
	String result = null;
	if(user_id.equals("kosta") && user_pwd.equals("1004")){
		result = "success";
	}else{
		result = "fail";
	}

   */
   
%> 
<c:set var="user_id" value="${param.user_id}"/>
<c:set var="user_pw" value="${param.user_pw}"/>

<c:choose>
	<c:when test="${user_id == 'kosta' && user_pw == '1004'}">
		<c:set var="result" value="success"/>
	</c:when>
	<c:otherwise>
		<c:set var="result" value="fail"/>
	</c:otherwise>
</c:choose>
${result }   
