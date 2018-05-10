<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>삽입</h3>
	
	<form action="empInsertServlet" method="post">
	<input type="text" name="empno" value="사번">
	<input type="text" name="ename" value="이름">
	<input type="text" name="job" value="직종">
	<input type="text" name="mgr" value="사수번호">
	<input type="text" name="hiredate" value="고용일">
	<input type="text" name="sal" value="연봉">
	<input type="text" name="comm" value="수당">
	<input type="text" name="deptno" value = "부서번호">
	<input type="submit" name="전송" value="삽입">
	</form>
</body>
</html>
 	