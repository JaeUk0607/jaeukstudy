<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	request.setCharacterEncoding("UTF-8");
	String type = request.getParameter("type");
	String userid = request.getParameter("userid");
	String type2 = request.getParameter("type2");
	out.print(type + "/" + userid + "<br>");
	//http://localhost:8090/wepJSP/Ex14_include_param_main.jsp?type=A&userid=hong
			
    //http://localhost:8090/wepJSP/Ex14_include_param_main.jsp?type=A&userid=hong&type2=B			
%> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>include (request 객체 공유)</title>
</head>
<body>
	MAIN PAGE<br>
	<hr>
			<jsp:include page="Ex14_subparam.jsp">
				<jsp:param value="<%=type2 %>" name="aaaa"/>
				<jsp:param value="1004" name="pwd"/>
			</jsp:include>
	<hr>
	MAIN END

</body>
</html>