package kr.or.bit.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.dao.EmpDao;
import kr.or.bit.dto.EmpDto;
import net.sf.json.JSONArray;

@WebServlet("/Emplist")
public class EmpListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpListServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<EmpDto> emplist = null;
		
		String json = "[";
		try {
			EmpDao dao = new EmpDao();
			emplist = dao.empShowAllServlet();
			int i = 0;
			if(emplist.size() > 0) {
				for(EmpDto e : emplist) {
					
					json += "{\"empno\":\""+e.getEmpno()
			             +	"\",\"ename\":\""+e.getEname()
			             +  "\",\"job\":\""+e.getJob()
			             +  "\",\"mgr\":\""+e.getMgr()
			             +  "\",\"hiredate\":\""+e.getHiredate()
			             +  "\",\"sal\":\""+e.getSal()
			             +  "\",\"comm\":\""+e.getComm()
			             +  "\",\"deptno\":\""+e.getDeptno()+"\"}";
					if(emplist.size()-1 != i++) {
						json+= ",";
					}
				}
			} 
			json += "]";
		} catch (Exception e) {
			System.out.println("EmpListServlet 에러발생 : " + e.getMessage());
		}finally {
			response.getWriter().print(json);
		}
	}
}
