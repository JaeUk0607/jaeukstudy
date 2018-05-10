package kr.or.bit;

//DTO(VO, DOMAIN) 클래스
public class Emp { //class Emp extends Object  (default)
	private int empno;
	private String ename;
	
	
	//constructor
	public Emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	//getter, setter 함수
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	//Object 가지고 있는 toString()함수는 주소값을 return 함수
	//재정의(override)
	//주로 member filed 값 출력용으로 사용;
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	
	
	

}
