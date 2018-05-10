<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="jdk.nashorn.internal.parser.JSONParser"%>
<%@page import="net.sf.json.JSONObject"%>
<%@page import="net.sf.json.JSONArray"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
//클라이언트에서 넘긴 데이터 받기 
//String[] aStr = request.getParameterValues("string"); 일반적인 동기형태 (checkbox)
String[] aStr = request.getParameterValues("string[]");         
//배열의 값 출력1
System.out.println("배열에 들어있는값 : "+Arrays.toString(aStr));

//배열의 값 출력2
for(String str : aStr){
    System.out.println(str);
}

//클라이언트에 값 전달.
//요청한곳에 응답. json형식 및 다양한 형식으로 전달 가능
if(aStr != null){            
      out.write("[\""+aStr[0]+"\",\""+aStr[1]+"\"]");
}   
%>         