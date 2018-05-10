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
   //{"name":"kglim","age":100}  
   JSONParser json = new JSONParser();
   JSONObject jsonobj = (JSONObject)json.parse(data);
   //System.out.println(jsonobj);
   System.out.println(jsonobj.get("name"));
   System.out.println(jsonobj.get("age"));
%>
    