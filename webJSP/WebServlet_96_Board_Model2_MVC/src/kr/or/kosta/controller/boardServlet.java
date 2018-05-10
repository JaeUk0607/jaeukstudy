package kr.or.kosta.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.action.Action;
import kr.or.kosta.action.ActionForward;
import kr.or.kosta.service.contentAction;
import kr.or.kosta.service.deleteAction;
import kr.or.kosta.service.listAction;


@WebServlet("*.bbs")
public class boardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public boardServlet() {
        super();
   
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	private void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		String RequestURI = request.getRequestURI();
		String ContextPath = request.getContextPath();
		String url_command = RequestURI.substring(ContextPath.length());
		
		Action action = null;
		ActionForward forward = null;
		if(url_command.equals("/content.bbs")) {
			try {
				action = new contentAction();
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.getMessage();
			}						
		}else if(url_command.equals("/list.bbs")) {
			try {
				action = new listAction();
				forward = action.execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(url_command.equals("/delete.bbs")) {
				action = new deleteAction();
				try {
					forward = action.execute(request, response);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		if(forward !=null) {
			if(forward.isRedirect()) { //true
				response.sendRedirect(forward.getPath());
			}else {
				RequestDispatcher dis = request.getRequestDispatcher(forward.getPath());
				dis.forward(request, response);
			}
		}
	}

}
