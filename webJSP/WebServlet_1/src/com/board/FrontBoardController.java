package com.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/FrontBoardController")
public class FrontBoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FrontBoardController() {
        super();
        
    }
    //GET , POST 두가지 요청에 대해서 모두 동작하는 함수
    //1. servlet 제공하는 함수 : service() 함수
    //2. 별도의 함수 개발자 생성해서 : doProcess()
    
    private void doProcess(HttpServletRequest request, HttpServletResponse response , String method) throws ServletException, IOException {
    	//doGET , doPOST 모든 요청을 내가 처리....
    	System.out.println("클라이언트 요청 : " + method);
    	
    	//1. 요청 받기 (GET, POST)
    	
    	//2. 요청 판단 (판단의 기준 ^^) : command 방식
    	//2.1 parameter 기준으로
    	//2.2 /board?cmd=login&userid=kglim
    	//String str = request.getParameter("cmd")
    	//if(str.equals("login")){   로그인 처리  ..}
    	
    	//TIP : URL 주소 판단 : board/boardlist 
    	//                  board/boardwrite?title=aaa&content=bbb
        //마지막 주소 문자 : boardlist  게시판 목록보기 
    	//            boardwrite 게시판 글쓰기
    	
    	
    	//문제 : 클라이언트 서버있는 페이지 주소 직접 입력 :
    	//localhost:8090/WebServlet_1/ok.jsp  이 문제 해결
    	//보안폴더 > WEB-INF (클라이언트가 직접 URL 주소로 접근 불가)
    	//1. WEB-INF  접근 : 404 Error
    	//2. WEB-INF  활용 : views > board > list.jsp
    	//                 views > member > memberok.jsp   
    	//^^ : forward 접근 방식을 통해서 PAGE 서비스
    	
    	//1.요청 받기 (command 방식)
    	//요청주소: http://localhost:8090/WebServlet_1/board?cmd=list
    	String cmd = request.getParameter("cmd");
    	
    	//2.요청 판단 (업무에 따라서 정하시면 됩니다)
    	String viewpage = null;
    	//cmd > null > error.jsp
    	//cmd > boardlist > list.jsp
    	//cmd > boardwrite > write.jsp 서비스
    	
    	if(cmd == null) {
    		viewpage = "/error/error.jsp";
    	}else if(cmd.equals("boardlist")) {
    		viewpage = "/board/boardlist.jsp";
    		//DB연결
    		//SELECT ...
    		//실행 > 결과 (rs) > 객체 담기 
    		//boarddao dao = new boarddao();
    		//List<board> boardlist = dao.selectboardlist();
    		//request.setAttribute("list",boardlist)
    		//view page forward 방식으로
    		//<c:set var="list" value=<%= request.getAttribute("list") %>
    	}else if(cmd.equals("boardwrite")) {
    		viewpage = "/board/boardwrite.jsp";
    	}else if(cmd.equals("login")) {
    		viewpage = "/WEB-INF/login/login.jsp";
    	}else {
    		viewpage = "/error/error.jsp";
    	}
    	
    	//3.결과 만들고 ...저장
    	//가정 : List<Emp> list = new ArrayList<>();
    	//가정 : list.add(new Emp(2000,"김유신"));
    	//request.setAttribute("emplist",list)
    	
    	//4. view 지정  > forward 
    	RequestDispatcher dis = request.getRequestDispatcher(viewpage);
    	
    	//5. view forward 방식을 통해서 (view 에게 정보전달 : request )
    	dis.forward(request, response); //servlet 이 가지고 있는  request  객체 의 주소 > view 전달
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response,"GET");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response,"POST");
	}

}
