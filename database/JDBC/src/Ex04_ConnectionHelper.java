import java.sql.Connection;
import java.sql.SQLException;

import kr.or.bit.utils.ConnectionHelper;
import kr.or.bit.utils.Singleton_Helper;

public class Ex04_ConnectionHelper {

	public static void main(String[] args) throws SQLException {
		/*
		//ConnectionHelper 사용하기 
		 
		
		Connection conn = null;
		conn = ConnectionHelper.getConnection("oracle");
		System.out.println(conn.toString());
		System.out.println(conn.getMetaData().getDatabaseProductName());
		System.out.println(conn.getMetaData().getDatabaseProductVersion());
		ConnectionHelper.close(conn);
		System.out.println("연결여부 : " + conn.isClosed());
		
		//연결 객체가 재활용가능한 객체일까
		conn = ConnectionHelper.getConnection("oracle");
		System.out.println(conn.toString());
		System.out.println(conn.getMetaData().getDatabaseProductName());
		System.out.println(conn.getMetaData().getDatabaseProductVersion());
		ConnectionHelper.close(conn);
		System.out.println("연결여부 : " + conn.isClosed());
		
		//1. return 받은 Connection 객체의 주소가 : 78e03bb5
		//2. return 받은 Connection 객체의 주소가 : 4f67eb2a
		//result : getConnection()함수 호출시 마다 새로운 객체 생성 ......
		//하나의 APP 에서 연결객체가 하나만 사용하면 되지 않을까  ...... 한만 만들어 두고 재사용 ....
		//->singleton 
		
		conn = ConnectionHelper.getConnection("oracle","hr","1004");
		System.out.println("다른 계정 연결여부 : " + conn.isClosed());
		
		Connection myconn = null;
		myconn = ConnectionHelper.getConnection("mysql");
		System.out.println(myconn.toString());
		System.out.println(myconn.getMetaData().getDatabaseProductName());
		System.out.println(myconn.getMetaData().getDatabaseProductVersion());
		ConnectionHelper.close(myconn);
		System.out.println("연결여부 : " + myconn.isClosed());
		*/
		
		//Singleton_Helper 사용하기
		//두개의 DB 접속 (singleton 으로 생성)
		//문제점) 공유자원 (자원의 값이 변화) -> 참조하는 모든 자원도 영향
		//원칙적으로 Singleton 설계 (DB연결) -> 연결 종료는 하지 않아요 -> 서버 종료할떄 까지
		
		//문제 해결)DB 연결 끊기
		//result : 사용한다는 것은 하나의 연결계정(접속)으로 다수의 사용자가 사용 (여러가지 문제 소지)
		
		Connection conn = null;
		conn = Singleton_Helper.getConnection("oracle");
		System.out.println(conn.toString());
		System.out.println(conn.getMetaData().getDatabaseProductName());
		System.out.println(conn.getMetaData().getDatabaseProductVersion());
		//Singleton_Helper.close(conn);
		System.out.println("연결여부 : " + conn.isClosed());
		
		Connection conn2 = null;
		conn2 = Singleton_Helper.getConnection("oracle");
		System.out.println(conn2.toString());
		System.out.println(conn2.getMetaData().getDatabaseProductName());
		System.out.println(conn2.getMetaData().getDatabaseProductVersion());
		//Singleton_Helper.close(conn2);
		Singleton_Helper.dbClose();
		System.out.println("연결여부 : " + conn2.isClosed());
		
		//전환 : 특정 페이지에서 mysql 사용
		Connection myconn = null;
		myconn = Singleton_Helper.getConnection("mysql");
		System.out.println(myconn.toString());
		System.out.println(myconn.getMetaData().getDatabaseProductName());
		System.out.println(myconn.getMetaData().getDatabaseProductVersion());
		Singleton_Helper.close(myconn);
		System.out.println("연결여부 : " + myconn.isClosed());
		
		
	}

}





