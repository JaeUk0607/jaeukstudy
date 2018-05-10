import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import kr.or.bit.utils.Singleton_Helper;

/*
 create table trans_A(
num number,
name varchar2(20)
);

create table trans_B(
num number constraint pk_trans_B_num primary key,
name varchar2(20)

);

JDBC >> autocommit

trans_A , trasn_B 하나의 논리적인 단위 (transaction 처리)

JDBC >>  autocommit >> false >> 개발자가 >> commit, rollback 제어
 */



public class Ex07_Oracle_Transaction {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		
		conn = Singleton_Helper.getConnection("oracle");
		String sql = "insert into trans_A(num,name) values(100,'A')";
		String sql2 = "insert into trans_B(num,name) values(100,'B')";
		
		try {
			conn.setAutoCommit(false); //APP. commit, rollback 강제
			//begin tran 생각
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			
			pstmt2 = conn.prepareStatement(sql2);
			pstmt2.executeUpdate();
			
			//insert 정상 적인 실행 (예외가 발생하지 않앗다면)
			conn.commit();
			
		} catch (Exception e) {
			System.out.println("문제발생 : " + e.getMessage());
			conn.rollback();
		}finally {
			
		}


	}

}
