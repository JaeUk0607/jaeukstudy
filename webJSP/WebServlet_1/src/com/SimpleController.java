package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
  서블릿(servlet)
 java 파일로 웹 서비스를 할 목적으로 만든 파일 
  서블릿 파일 조건(웹 : request , response)객체 사용가능
 
 1. extends HttpServlet 반드시 상속 (웹 환경에서 제공되는 요청 , 응답) 처리 가능
 
 2. SimpleController 서블릿
 
 3. 서블릿은 이벤트 기반 동작 (함수 특정 상황에 맞추어서 자동 호출)  
    [상황] :클라이언트가 SimpleController 요청 했을때 
         전송방식이 GET 넘어오면 자동 doGET()   :doGet(HttpServletRequest request, HttpServletResponse response)
         전송방식이 POST 넘어오면 자동 doPOST() :doPost(HttpServletRequest request, HttpServletResponse response)    
    
    doGET() -> <a href="board.do?id=kglim">서버에 요청</a>  
    doPOST() -> <form method="POST" .....
    
    3.1 클라이언트의  정보를 얻어온다 : request.getParameter()
    
 4. 서블릿(java) -> 컴파일 -> class파일 -> 실행 -> 결과 리턴
         기본적으로 자바는 멀티쓰레드 기반의 처리 가능
         
         
 5. Model2 기반의 MVC 패턴 작업
 
    5.1 JSP 만 가지고 개발 : Model(DAO, DTO) + JSP  >   Model1 방식
    5.2 JSP 클라이언트 요청 받고 -> 처리 담당 -> ?? JSP 를 편하고 하고 싶어요 ....
    
    5.3 Model2 기반의 MVC
        Model(DAO ,DTO) > 자바클래스 
        View > JSP(EL, JSTL)
                 그럼 클라이언트 요청 받고 파악하고 처리하는 과정 누가 담당할 까    
        Controller > Servlet  extends HttpServlet  (웹 상황실...) 
        1. 클라이언트의 요청 파악 (로그인 , 게시판 글쓰기 , 게시판 상세보기 ...)
        2. 요청을 파악 (필요에 따라서 Model 객체를 생성 , 사용하거나 ..... View 사용)
         
         
 6. 서블릿 파일을 클라이언트 어떻게 요청 할까 (요청 주소)
    6.1 <form action="loginok.jsp"  method="POST">
        locahost:8090/WebServlet_1/loginok.jsp
    
    6.2 <url-pattern>/simple</url-pattern>
        <form action="/simple"  method="POST">
        locahost:8090/WebServlet_1/simple 이 왔을때
        
        최초 요청 -> servlet 컴파일 -> 실행 -> doGET() or doPOST 호출
        
        
    
   Web.xml 
   <servlet>
  	<servlet-name>simplecontroller</servlet-name>
  	<servlet-class>com.SimpleController</servlet-class>
  </servlet>
  <servlet-mapping>
  	<servlet-name>simplecontroller</servlet-name>
  	<url-pattern>/simple</url-pattern>
  </servlet-mapping>         
            
            
*/

//@WebServlet("/SimpleController")
public class SimpleController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SimpleController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("클라이언트 요청");
		
		//1.사용자의 요청 파악(요청 값 받기)
		String type = request.getParameter("type");
		
		//2.요청에 따른 업무 수행 (service 실행)
		Object resultobj = null;
		if(type == null || type.equals("greeting")) {
			resultobj ="hello world";
		}else if(type.equals("date")) {
			resultobj = new java.util.Date();
		}else {
			resultobj = "invalid date type";
		}
		
		//3.요청 완료에 따라서 그 결과를 요청한 사용자에게 전달
		//정보를 저장 : request , session , application 객체 사용해서
		request.setAttribute("result", resultobj);
		
		//4.결과 보여주기 > 필요한 view 지정 한다
		//화면을 출력한 페이지를 정하고 ->  출력한 데이터를 넘겨 주어야 한다 -> forward(제어권)
		RequestDispatcher dis = request.getRequestDispatcher("/simpleview.jsp");
		dis.forward(request, response);  //forward 된 페이지에 request 주소값 전달
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
