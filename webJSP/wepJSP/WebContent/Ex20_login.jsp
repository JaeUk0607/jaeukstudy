<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	/* 
	   쿠키값이 존재하면 UID input 태그 value 속성에 그 값을 출력 
	  쿠키가 존재하지 않으면 "Ex20_login.jsp" redirect
	
	*/
	Cookie[] c = request.getCookies();
	String userid = "";
	if(c==null){
		response.sendRedirect("Ex20_login.jsp");
	}else if(c != null || c.length>0){
		for(Cookie d : c){
			if(d.getName().equals("id")){
				userid=d.getValue();
			}
		}
	}
	
%>
<script type="text/javascript">
	
</script>
<body>
	
	<form action="Ex20_loginok.jsp" method="get">
		ID:<input type="text" name="UID" value="<%=userid%>"><br>
		PWD:<input type="password" name="PWD">
		<hr>
		ID값 유지하기 <input type="checkbox" name="chk">
		<hr>
		<input type="submit" value="로그인">
		<input type="reset" value="취소">
	
	</form>
</body>
</html>