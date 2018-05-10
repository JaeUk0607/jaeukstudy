package kr.or.kosta.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.action.Action;
import kr.or.kosta.action.ActionForward;
import kr.or.kosta.dao.boarddao;
import kr.or.kosta.dto.board;

public class contentAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String idx = request.getParameter("idx"); //글번호 받기
		
		if(idx == null || idx.trim().equals("")){
			try {
				response.sendRedirect("board_list.jsp");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		idx = idx.trim();
		
		//원칙은 글번호 만 .... 목록으로 갔을때 현재 page 유지하고 싶다
		//list 돌아갔을때 page 유지
		String cpage = request.getParameter("cp"); //현재 페이지 정보  10페이지 101번글
		String pagesize = request.getParameter("ps"); //pagesize
		
		if(cpage == null || cpage.trim().equals("")){
			cpage = "1"; 
		}
		if(pagesize == null || pagesize.trim().equals("")){
			pagesize = "5"; 
		}
		boarddao dao = new boarddao();
		
		//조회수증가
		boolean res = dao.getReadNum(idx);
		if(res) System.out.println("조회수 증가");
		
		//데이터 조회
		board boarddto = dao.getContent(Integer.parseInt(idx));
		
		
		if(boarddto == null){
			response.sendRedirect("board_list.jsp");
		
		
	}
		ActionForward forward = new ActionForward();
		
		request.setAttribute("boarddto",boarddto);
		request.setAttribute("cpage", cpage);
		request.setAttribute("idx", idx);
		request.setAttribute("pagesize", pagesize);
		request.setAttribute("dao", dao);
		
		forward.setRedirect(false);
		forward.setPath("/board/board_content.jsp");
		
		return forward;
	}
}
