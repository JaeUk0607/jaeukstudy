package kr.or.bit.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

/*
전체 프로젝트에서 (회원 : 전체조회페이지 , 조건 조회 페이지 , 삭제 페이지 , 수정 페이지 ...)
위 각각의 페이지가 드라이버로딩 , DB 연결 있어야 DB 작업 가능 
1. 반복전인 코드 줄인다 (드라이버 로딩 , 연결객체 , 명령  ,,,,, 자원해제)
2. Oracle , Mysql 둘 연동했을때 문제 없는 코드

*반복적인 코드 제거
*개선 >> 패턴 >> Singleton >> 하나의 객체 공유 
*class  설계  > 많이 사용되는 기능(method) > static > overloading > 다형성 확보


*/

public class ConnectionHelper {
	public static Connection getConnection(String dsn) { //oracle , mysql
		Connection conn = null;
		try {
			  if(dsn.equals("oracle")) {
				  Class.forName("oracle.jdbc.OracleDriver");
				  conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","bituser","1004");
			  }else if(dsn.equals("mysql")) {
				  Class.forName("com.mysql.jdbc.Driver");
				  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kostadb?useSSL=true","kosta","1004");
			  }
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	public static Connection getConnection(String dsn , String id , String pwd) { //oracle , mysql
		Connection conn = null;
		try {
			  if(dsn.equals("oracle")) {
				  Class.forName("oracle.jdbc.OracleDriver");
				  conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",id,pwd);
			  }else if(dsn.equals("mysql")) {
				  Class.forName("com.mysql.jdbc.Driver");
				  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kostadb?useSSL=true",id,pwd);
			  }
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	//연결해제
	//if(stmt != null)try {stmt.close();} catch (Exception e) {}
	//if(conn != null)try {conn.close();} catch (Exception e) {}
	public static void close(Connection conn) {
		if(conn != null)
			try {
					conn.close();
				}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
	public static void close(ResultSet rs) {
		if(rs != null)
			try {
					rs.close();
				}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
	public static void close(Statement stmt) {
		if(stmt != null)
			try {
				stmt.close();
				}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
	public static void clase(PreparedStatement pstmt) {
		if(pstmt != null)
			try {
				pstmt.close();
				}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}

}





