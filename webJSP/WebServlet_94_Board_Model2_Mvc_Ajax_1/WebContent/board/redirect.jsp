<%@page import="kr.or.kosta.dto.reply"%>
<%@page import="kr.or.kosta.dto.board"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.kosta.dao.boarddao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
  String msg = (String)request.getAttribute("board_msg");
  String url = (String)request.getAttribute("board_url");
  String idx = (String)request.getAttribute("idx");
  
  if(msg != null && url != null){
%>
	<script>
		alert('<%= msg %>');		
	 <%--    //location.href='<%=url%>'; --%>
	</script>
	
<%	  
  }
%>
<%boarddao dao = new boarddao(); 
List<reply> list = dao.replylist(idx);%>
<%=list %>

