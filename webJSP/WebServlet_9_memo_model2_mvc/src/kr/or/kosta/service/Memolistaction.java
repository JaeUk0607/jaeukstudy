package kr.or.kosta.service;

import java.util.List;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.action.Action;
import kr.or.kosta.action.ActionForward;
import kr.or.kosta.dao.memodao;
import kr.or.kosta.dto.memo;

public class Memolistaction implements Action {

	@Override
	public ActionForward excute(HttpServletRequest request, HttpServletResponse response) {
		memodao dao = null;
		ActionForward forward = null;
		List<memo> memolist = null;
		try {
			dao = new memodao();
			memolist = dao.getMemoList();
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("memolist", memolist);
		forward = new ActionForward();
		forward.setPath("/WEB-INF/views/memolist.jsp");
		
		return forward;
	}

}
