package kr.or.bit;

public class Emp {
	private int empno;
	private String ename;
	
	// 생성자 만드는 코드(overloading constructor)
	// 생성자함수 (member field 초기화 : 객체생성과 동시에 처리)
	// 함수의 이름은 클래스 이름과 동일
	public Emp() {
		//default constructor
	}
	
	
	  public Emp(int empno , String ename) {
		  //overloading constructor
		this.ename = ename;
		this.empno = empno;
	}
	public void InsertEmp(int data, String data2) {
		empno = data;
		ename = data2;
	}
	
	public void setempno(int data) {
		empno = data;
		
		
	}
	public int getempno() {
		return empno;
	}
	
	
	//자동생성 코드
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void empInfo() {
		System.out.println(empno + " / " + ename);
	}
	

}
