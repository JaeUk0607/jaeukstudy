package kr.or.kosta.service;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.action.Action;
import kr.or.kosta.action.ActionForward;
import kr.or.kosta.dao.memodao;

public class Memoidaction implements Action{

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) {
		String msg= "";
		memodao dao = null;
		String checkid = "";
		try {
			
			dao = new memodao();
			checkid = dao.isIdCheckById(request.getParameter("id"));
			if(checkid.equals("true")) {
				msg = "사용할 수 있는 데이터 입니다";
				
			}else {
				msg = "사용할 수 없다";
			}
			
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
	
		ActionForward forward = new ActionForward();
		forward.setPath("/WEB-INF/views/uservalid.jsp");
		request.setAttribute("msg",msg);
		return forward;
	}

}
