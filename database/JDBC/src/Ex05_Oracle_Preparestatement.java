import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import kr.or.bit.utils.Singleton_Helper;

/*
 Statement stmt = con.createStatement(); //생성
 stmt.excuteQuery("select * from emp"); //실행
 
 장점 : 쿼리문을 바꾸어 실행이 가능하다 (재사용 : Statement stat 같은 여러개의 다른 SQL문 실행 가능)
 이유 : parameter 없는 경우 >> 고정문 쿼리문 (컬럼명, 테이블명, 시스템정보)....
 
 PreparedStatement pstmt = con.preparsStatement ("select * from emp");
 //쿼리문을 DB 보내서 -> 컴파일 -> 쿼리의 정보를 가지고 있는 객체를 리턴
  pstmt.excuteQuery();//실행
  
  장점 : 보안 , 미리 쿼리문 컴파일 ->  parameter 전송 (성능)
  단점 : 재사용성 (쿼리문)
  
 */
public class Ex05_Oracle_Preparestatement {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null; //권장(성능, 보안) >> sql injection 방어
		ResultSet rs = null;
		try {
			conn = Singleton_Helper.getConnection("oracle");
			String sql = "select empno, ename from emp where deptno=?";
			//select * from emp where id =? and name =? and job = ?
			//"where id = " + id +" and name = '" + name + ...(x)
			//parameter >> ? >> 순서가 중요
			//Statement stmt = con.createStatement()
			pstmt = conn.prepareStatement(sql);
			
			//이후에는 ? parameter 정보만 설정해서 실행
			pstmt.setInt(1, 30); //deptno=?" parameter 값을 30으로 설정
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				do {
					System.out.println(rs.getInt(1) + "/" + rs.getString(2));
				}while(rs.next());
			}else {
				System.out.println("데이터 없어요");
			}
			
		}catch (Exception e) {
			
	
	    }finally {
			Singleton_Helper.close(rs);
			Singleton_Helper.close(pstmt);
		//	Singleton_Helper.close(conn); //Singleton의 목적 APP  
		}
		

	}

}
