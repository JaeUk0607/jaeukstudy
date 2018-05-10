package kr.or.kosta.Action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.DALOAD;

import kr.or.kosta.dao.boarddao;
import kr.or.kosta.dto.reply;
import net.sf.json.JSONArray;

public class BoardReplylistAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		String writer = request.getParameter("reply_writer");
		String content = request.getParameter("reply_content");
		String pwd = request.getParameter("reply_pwd");
		String userid = request.getParameter("userid");
		
		userid = "empty";
		
	
		String idx = request.getParameter("idx");
		System.out.println("idx : "+ idx);

		boarddao dao = new boarddao();
		int result = dao.replywrite(Integer.parseInt(idx), writer, userid, content, pwd);
		List<reply> list =dao.replylist(idx);
		
		System.out.println("list : " + list);
		
		JSONArray jsonarray = JSONArray.fromObject(list);
		System.out.println(jsonarray);
		request.setAttribute("jsonarray", jsonarray);
		forward = new ActionForward();
		forward.setPath("/board/board_replyok.jsp");
		return forward;
	}
	
}
