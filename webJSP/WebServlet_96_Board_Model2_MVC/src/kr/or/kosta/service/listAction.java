package kr.or.kosta.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosta.action.Action;
import kr.or.kosta.action.ActionForward;
import kr.or.kosta.dto.board;

public class listAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 서비스 요청
		boardservice boardlist = boardservice.getInstance();

		// 서비스 요청 게시물 건수 (dao)
		int totalboardcount = boardlist.totalboardcount();

		String psstr = request.getParameter("ps"); // pagesize
		String cpstr = request.getParameter("cp"); // current page

		if (psstr == null || psstr.trim().equals("")) {

			psstr = "5"; // default pagesize =5
		}
		if (cpstr == null || cpstr.trim().equals("")) {
			cpstr = "1"; // default currentpage =1
		}

		int pagesize = Integer.parseInt(psstr);
		int cpage = Integer.parseInt(cpstr);
		int pagecount = 0;

		if (totalboardcount % pagesize == 0) {
			pagecount = totalboardcount / pagesize;
		} else {
			pagecount = (totalboardcount / pagesize) + 1;
		}
		// 102건 pagesize 15 pagecount : 21 페이지

		// out.print("pagesize : " + pagesize + "<br>");
		// out.print("totalboardcount : " + totalboardcount + "<br>");
		// out.print("currentpage : " + cpage + "<br>");
		// out.print("pagecount : " + pagecount + "<br>");

		List<board> list = boardlist.list(cpage, pagesize);

		request.setAttribute("pagesize", pagesize);
		request.setAttribute("cpage", cpage);
		request.setAttribute("pagecount", pagecount);
		request.setAttribute("list", list);
		request.setAttribute("totalboardcount", totalboardcount);

		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		forward.setPath("/board/board_list.jsp");
		
		return forward;
	}

}
