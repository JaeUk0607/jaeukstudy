package kr.or.kosta.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.action.Action;
import kr.or.kosta.action.ActionForward;

public class deleteAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String idx = request.getParameter("idx");
		String pwd = request.getParameter("pwd");
		boardservice service = boardservice.getInstance();
		     int result = service.board_delete(idx, pwd);
		       
		       String msg="";
		       String url="";
		       
		       if(result > 0){
		           msg = "delete success";
		           url = "board_list.jsp";
		       }else{
		           msg = "delete fail";
		           url = "board_list.jsp";
		       }
		       ActionForward forward = new ActionForward();
		       request.setAttribute("board_msg",msg);
		       request.setAttribute("board_url", url);
		       forward.setPath("/board/board_delete.jsp");
		return forward;
	}
	

}
