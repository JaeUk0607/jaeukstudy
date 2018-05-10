package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DTO.Dept;
import Util.Singleton_Helper;

/*
 목적 : DB연결 -> CRUD 작업
DAO 클래스는 함수 만들어라 (select, insert ,,,,,,,,,)

CRUD
1. 전체조회 : select deptno, dname, loc from dept

2. 조건조회 : select deptno, dname, loc from dept where detno = ?

3. 삽입  : insert into dept(deptno,dname,loc) values(?,?,?)

4. 수정 : update dept set dname = ? , loc = ? where deptno = ?

5. 삭제 : delete from dept where deptno = ? 

처리하는 함수
parameter 처리
return 처리
 */

public class DeptDao {
	
	//DB연결 작업.... 코드
	//함수 안에서 동일한 작업
	
	
	
	//1.(전체조회) >> select 결과 >> multi row
	public List<Dept> getDeptAllList() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dept> deptList = new ArrayList<>(); //여러건의 데이터 담기 위해서
		
		try {
			conn = Singleton_Helper.getConnection("oracle");
			String sql = "select deptno, dname, loc from dept";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		
			if(rs.next()) {
				do {
					Dept dept = new Dept(); //하나의 row 데이터 담기 준비 (다른 객체)
					dept.setDeptno(rs.getInt("deptno"));
					dept.setDname(rs.getString("dname"));
					dept.setLoc(rs.getString("loc"));
					
					deptList.add(dept); //배열에 객체 추가
					/*
					 Dept 설계
					 public Dept(int deptno, String dname, String Loc) {
					 this.deptno = deptno;
					 ..
					 ..
					 }
					 public Dept(int deptno, String dname) {
					  
					 }
					 while(rs.next()){
					 deptlist.add(new Dept(rs.getInt("deptno"),.....);
					 */
					
				}while(rs.next());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			Singleton_Helper.close(rs);
			Singleton_Helper.close(pstmt);
		}
		return deptList;
	}
	//2.(조건조회) >> select 결과 > return single row
	public Dept getDeptListDeptno(int deptno) {
		//select deptno, dname, loc from dept where detno = ?
		Dept dept = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = Singleton_Helper.getConnection("oracle");
			String sql ="select deptno, dname, loc from dept where deptno =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			Singleton_Helper.close(rs);
			Singleton_Helper.close(pstmt);
		}
		
		return dept;
	}
	
	//3. 데이터 삽입
	public int insertDept(Dept dept) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int cnt = 0;
		
		try {
			conn = Singleton_Helper.getConnection("oracle");
			String sql = "insert into dept(deptno,dname,loc) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2,dept.getDname());
			pstmt.setString(3, dept.getLoc());
			cnt = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			Singleton_Helper.close(pstmt);
		}
		
		return cnt;
	}
	
	//4. 데이터 수정
	public int updateDept(Dept dept) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int cnt = 0;
		
		try {
			conn = Singleton_Helper.getConnection("oracle");
			String sql = "update dept set dname = ? , loc = ? where deptno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept.getDname());
			pstmt.setString(2,dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());
			cnt = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			Singleton_Helper.close(pstmt);
		}
		
		return cnt;
	}
	
	
	//5. 데이터 삭제
	public int deleteDept(int deptno) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int cnt = 0;
		
		try {
			conn = Singleton_Helper.getConnection("oracle");
			String sql = "delete from dept where deptno = ? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,deptno);
			
			cnt = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			Singleton_Helper.close(pstmt);
		}
		
		return cnt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
