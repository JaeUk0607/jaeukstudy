<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/* request.setCharacterEncoding("UTF-8");

	String writer = request.getParameter("reply_writer");
	String content = request.getParameter("reply_content");
	String pwd = request.getParameter("reply_pwd");
	String userid = request.getParameter("userid");
	String idx = request.getParameter("idx");
	userid = "empty";
	out.print(writer + "<br>");
	out.print(content + "<br>");
	out.print(pwd + "<br>");
	out.print(userid + "<br>");
	out.print(idx + "<br>");

	//서비스 객체 호출하고
	//insert 하고
	boardservice replyservice = boardservice.getInstance();
	int result = replyservice.replywrite(Integer.parseInt(idx), writer, userid, content, pwd); */
	////////////////

	
%>

<%=request.getAttribute("jsonarray") %>

