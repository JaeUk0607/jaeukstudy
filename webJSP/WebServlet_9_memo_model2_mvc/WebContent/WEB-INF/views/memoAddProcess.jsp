<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
int n = (int)request.getAttribute("n");

if(n>0){
	out.print("<script>");
	out.print("console.log('메롱');");
    out.print("alert('등록성공..');");
    out.print("location.href='list.do';");
    out.print("</script>");
    
  }else{
    out.print("<script>");
    out.print("console.log('메롱1');");
    out.print("alert('등록실패..');");
    out.print("location.href='memo.html';");
    out.print("</script>");
  }

%>