import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 1. 드라이버 참조 (프로젝트에 jar 파일 추가)
 2. 드라이버 로딩 (JVM : Class.Forname(""))
 3. 연결 객체 생성 -> DriverManager 클래스...
 4. 명령 객체 생성 -> CRUD 작업 준비 (Statement)
 5. 명령 실행 -> DQL (select 데이터 1건, select 모든 row) => 결과 집합 생성(ResultSet) 
	 		DML (insert , ,delete, update ) => 결과 집합 생성 (x) ==> 성공 실패
 6. 명령 처리 (2가지) : DQL > 조회(출력) , DML > 결과에 따른 로직(성공 / 실패)
 7. 자원 해제
 
 
 JDBC API
 (인터페이스 기반)
 Connection
 Statement
 PrepareStatement
 ResultSet
 : 다형성 적용 코드 (어떤 DB를 작업하던 표준화된 코드로 작업)
 */
public class Ex02_Mysql_Connection {

	public static void main(String[] args) {
		/*
		Class.forName("com.mysql.jdbc.Driver"); //new memory 드라이버 로드
		System.out.println("오라클 드라이버 메모리 로딩");
		//jdbc:mysql://localhost:3306/kostadb?characterEncoding=utf8&verifyServerCertificate=false&useSSL=true
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kostadb?useSSL=true","kosta","1004");
		System.out.println(conn.isClosed());
		*/
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 2. 드라이버 로딩
			Class.forName("com.mysql.jdbc.Driver");
			
			//3. 연결 객체 생성
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kostadb?useSSL=true","kosta","1004");
			
			//4. 명령 객체 생성
			stmt = conn.createStatement();
			
			//4.1실행할 자원(Query 문장)
			System.out.print("직종입력 : ");
			String job = "";
			Scanner sc = new Scanner(System.in);
			job = sc.nextLine();
			//where job = 'CLERK'
			//select empno, ename, job from emp where job = 'CLERK'
			String sql = "select empno, ename, job from emp where job = '" + job + "'";
			
			//5. 명령 실행
			//DQL : 실행하는 함수 달라요> stat.excuteQuery(sql) > return ResultSet 객체의 주소
			//DML : 실행하는 함수 달라요> 결과 집합이 없어요 결과집합(x) 출력데이터(x)
			//executeUpdate() 함수가  return 자원은 반영된 행의 개수 : 성공.........실패........로직........
			//delete from emp where deptno = 30 >> return 5 (삭제된 행의 개수)
			
			rs = stmt.executeQuery(sql);
			
			//6. 명령 처리
			//DQL : 1. 결과가 없는 경우 (where empno = 5555)
			//      2. 결과가 1건인 경우(PK, UNOQUE) 조건 조회 >> where empno = 7788
			//      3. 결과가 여러개의 row >> select * from emp where deptno = 10
			
			/*
			//처리
	         while(rs.next()) {
		     System.out.println(rs.getInt("empno") + "/" +
	                       rs.getString("ename") + "/" +
				           rs.getString("job"));
	         }
	         
	         1. 간단하다(단순)
	         2. 결과 집합이 없는 경우에 대한 처리가 안되요
	         */
			 
			/*if(rs.next()) {
				System.out.println(rs.getInt("empno")+","+
			                       rs.getString("ename")+","+
								   rs.getString("job"));  
			}else {
				System.out.println("조회된 데이터가 없습니다");
			}
			
			1.Multi Row Read가 안된다
			2.결과 집합이 없는 겨우 처리 가능
			*/
			
			//위 두개 장점
			//1.열과 집합이 없는 경우 처리, 2.Single row, 3. Multi row 3가지 연속되는 코드 생성
			if (rs.next()) {
				do {
					System.out.println(rs.getInt("empno") + "," + 
				                       rs.getString("ename") + "," + 
							           rs.getString("job"));
				} while (rs.next());

			} else {
				System.out.println("조회된 데이터가 없습니다");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			//자원해제
			/*
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			if(rs != null)try {rs.close();} catch (Exception e) {}
			if(stmt != null)try {stmt.close();} catch (Exception e) {}
			if(conn != null)try {conn.close();} catch (Exception e) {}

		}
	}

}
