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
ID , PWD  , chk 값 받아서

1. ID , PWD 같다면 로그인 성공  (if(ID.equals("PWD") ...
   chk값이 체크 되어 있다면
   >쿠키 생성 ID값을 쿠키에 담아서 : 유효 타입(24시간)
   >쿠키 쓰기 완료
   
2. ID , PWD 같다면 로그인 성공   
   chk값이 체크 되어 있지 않다면
   >기존에 만들었던 쿠키 삭제  setMaxAge(0)
   
3. ID , PWD 같지 않다면
   response.sendRedirect() > Ex20_login.jsp 페이지    
   
-->
<%
		String id = request.getParameter("UID");
		String pwd = request.getParameter("PWD");
		String chk = null;
		chk = request.getParameter("chk");
		out.print(id + " / " + pwd + " / " + chk);

%>
<%
	if(id.equals(pwd)){
		out.print("로그인 성공" + "<br>");
			Cookie c = new Cookie("id",id);
			if(chk!=null/*chk.equals("on") */){
			c.setMaxAge(24*60*60);
			response.addCookie(c);
			}
			else{
				c.setMaxAge(0);
				response.addCookie(c);
			}
	}else{
		out.print("로그인 실패" + "<br>");
		response.sendRedirect("Ex20_login.jsp");
	}

%>

</body>
</html>