package kr.or.kosta.service;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.action.Action;
import kr.or.kosta.action.ActionForward;
import kr.or.kosta.dao.memodao;

public class Memoinsertaction implements Action{

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) {
		memodao dao = null;
		ActionForward forward = null;
		int n = 0;
		try {
			dao=new memodao();
			n = dao.insertMemo(request.getParameter("id"), request.getParameter("email"), request.getParameter("content"));
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		request.setAttribute("n", n);
		forward = new ActionForward();
		forward.setPath("/WEB-INF/views/memoAddProcess.jsp");
		
		return forward;
	}

}
