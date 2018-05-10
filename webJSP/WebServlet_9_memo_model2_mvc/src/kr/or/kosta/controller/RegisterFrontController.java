package kr.or.kosta.controller;

import java.io.IOException;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.action.Action;
import kr.or.kosta.action.ActionForward;
import kr.or.kosta.dao.memodao;
import kr.or.kosta.service.Memoidaction;
import kr.or.kosta.service.Memoinsertaction;
import kr.or.kosta.service.Memolistaction;

@WebServlet("*.do")
public class RegisterFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public RegisterFrontController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doprocess(request, response);
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doprocess(request, response);
	}
	
	private void doprocess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String RequestURI = request.getRequestURI();
		String RequestPath = request.getContextPath();
		String url_commend = RequestURI.substring(RequestPath.length());
		
		ActionForward actionforward = null;
		Action action = null;
		
		if(url_commend.equals("/id.do")) {
		 try {
			action = new Memoidaction(); 
			actionforward = action.excute(request, response);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		}else if(url_commend.equals("/list.do")) {
			action = new Memolistaction();
			actionforward = action.excute(request, response);
		}else if(url_commend.equals("/memo.do")) {
			action = new Memoinsertaction();
			actionforward = action.excute(request, response);
		}
		
		
		if(actionforward !=null) {
			if(actionforward.isRedirect()) { //true
				response.sendRedirect(actionforward.getPath());
			}else {
				RequestDispatcher dis = request.getRequestDispatcher(actionforward.getPath());
				dis.forward(request, response);
			}
		
		
	}


	}
}
