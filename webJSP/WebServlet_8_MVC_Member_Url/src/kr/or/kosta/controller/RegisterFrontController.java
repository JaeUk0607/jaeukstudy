package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.dao.MvcRegisterDao;
import kr.or.kosta.dto.MvcRegister;

//@WebServlet("/Register.do")
//회원가입 <a href="Register.do?cmd=register">회원가입</a>

//@WebServlet("/Register.do") 정의된 servlet 페이지는 언제 컴파일 실행 >>
//위 코드는 요청 주소가 항상 /Register.do 지만 컴파일 되고 실행
//회원가입인지 , 회원가입 페이지를 보여달라고 하는지, 게시판 보여 달라고 하는지 알 수 있나요
//결국 >> prameter 통해서 cmd=login 로그인페이지, cmd=loginok 로그인....


//Url 방식 > 주소 고정 > "/Register.do" 처리 
// "*.do" 처리  > a.do , b.do , c.do

@WebServlet("*.do")
public class RegisterFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RegisterFrontController() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 요청 받기
		//String command = request.getParameter("cmd");
		//Url 방식은 cmd parameter 사용 안되요
		
		//register.do
		//registerok.do
		//registerlist.do
		
		//주소각 요청의 판단 근거
		String RequestURI = request.getRequestURI();
		String ContextPath = request.getContextPath();
		String url_command = RequestURI.substring(ContextPath.length());
		
		/*
		RequestURI : /WebServlet_8_MVC_Member_Url/Register.do
		ContextPath : /WebServlet_8_MVC_Member_Url
		url_command : /Register.do
		*/
		System.out.println("RequestURI : " + RequestURI);
		System.out.println("ContextPath : " + ContextPath);
		System.out.println("url_command : " + url_command);
		
		//2. 요청 판단 처리 (command  방식 : ?cmd=list)
		String viewpage="";
		if(url_command.equals("/Register.do")) { //?cmd=register
			//회원가입 페이지 전달
			viewpage = "/WEB-INF/Register/Register.jsp"; //WEB-INF 접근 가능
		}else if(url_command.equals("/ok.do")) { //?cmd=registerok
			//회원가입 처리
			//?cmd=registerok&id=hong&pwd=1004&email=hong@naver.com
			int id = Integer.parseInt(request.getParameter("id"));
			String pwd = request.getParameter("pwd");
			String email = request.getParameter("email");
			
			
			//Controller -> [Service] 생략 ->  DAO (DTO) 
			//DTO 객체
			MvcRegister dto = new MvcRegister();
			dto.setId(id);
			dto.setPwd(pwd);
			dto.setEmail(email);
			
			//DAO 객체
			MvcRegisterDao dao = new MvcRegisterDao();
			int result = dao.writeOk(dto);
			
			String resultdata="";
			if(result > 0) {
				resultdata = "welcome to kosta " + dto.getId() + "님";
			}else {
				resultdata = "Insert Fail retry";
			}
			
			//3. 결과 저장하기 (여기서 view 생성 태그 만들고 ..... 하지 않고 별도의  jsp)
			request.setAttribute("data", resultdata);
			viewpage = "/WEB-INF/Register/Register_welcome.jsp";
		}
		
		//4. view 지정
			RequestDispatcher dis = request.getRequestDispatcher(viewpage);
		
		//5. forward 
			dis.forward(request, response);
	}

}







