<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
   String data = request.getParameter("json");
   System.out.println(data);
   
   JSONParser json = new JSONParser();
   JSONObject jsonobj = (JSONObject)json.parse(data);
   //System.out.println(jsonobj);
   
   JSONArray bookInfoArray = (JSONArray)jsonobj.get("books");
   
   for(int i=0; i<bookInfoArray.size(); i++){
	    //배열 안에 있는것도 JSON형식 이기 때문에 JSON Object 로 추출
	     JSONObject bookObject = (JSONObject) bookInfoArray.get(i);
 	     System.out.println("bookInfo: name==>"+bookObject.get("name"));
	     System.out.println("bookInfo: writer==>"+bookObject.get("writer"));
	     System.out.println("bookInfo: price==>"+bookObject.get("price"));
	     System.out.println("bookInfo: genre==>"+bookObject.get("genre"));
	     System.out.println("bookInfo: publisher==>"+bookObject.get("publisher"));
	 }
  
%>
    