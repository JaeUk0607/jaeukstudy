import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.or.bit.utils.Singleton_Helper;

public class Ex06_Oracle_Prepare_dml {

	public static void main(String[] args) {
		//insert into dml(empno,ename,deptno) values(?,?,?)
		//Singleton, Preparestatement 사용해서...
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		try {
			conn = Singleton_Helper.getConnection("oracle");
			String sql = "insert into dmlemp(empno,ename,deptno) values(?,?,?)";
			psmt = conn.prepareStatement(sql);
			Scanner sc = new Scanner(System.in);
			System.out.println("사번을 입력하세요");
			int empno = Integer.parseInt(sc.nextLine());
			System.out.println("이름을 입력하세요");
			String ename = sc.nextLine();
			System.out.println("부서번호를 입력하세요");
			int deptno = Integer.parseInt(sc.nextLine());
			psmt.setInt(1, empno);
			psmt.setString(2, ename);
			psmt.setInt(3, deptno);
			
		
			int row = psmt.executeUpdate();
			
			if(row > 0) {
				System.out.println("insert row count : " + row);
			}else {
				System.out.println("row count : " + row);
			}
			
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			
			Singleton_Helper.close(psmt);
		}
		

	}

}
