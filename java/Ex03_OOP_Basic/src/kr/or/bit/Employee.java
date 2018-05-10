package kr.or.bit;
//사원은 사번, 이름, 직종(job)을 가지고 있다 => 원칙 (캡슐화) =>read, write 지원 setter, getter
//사원 생성시 default 로 사번 = 9999; 이름=아무개 직종=인턴
//사원 생성시 별도의 사번, 이름, 직종을 통해 사원 생성도 가능하다
//사원이 가지는 사번, 이름 , 직종 생성 후 각각 수정이 가능하다
//사원정보는 사번, 이름, 직종을 한번에 확인 할 수 있고(각각의 정보를 확인 불가하다)
public class Employee {
	 private int empno;
	 private String ename;
	 private String job;
	 
	 //default constructor
	 public Employee() {
	  empno = 9999;
	  ename = "아무개";
	  job = "인턴";
	 }
	 
	 //overloading constructor
	 public Employee(int empno , String ename , String job) {
	  this.empno = empno;
	  this.ename = ename;
	  this.job = job;
	 }
	 
	/* public int getEmpno() {
	  return empno;
	 }*/
	 public void setEmpno(int empno) {
	  this.empno = empno;
	 }
	 
	 
	/* public String getEname() {
	  return ename;
	 }*/
	 public void setEname(String ename) {
	  this.ename = ename;
	 }
	 
	 
	 /*public String getJob() {
	  return job;
	 }*/
	 public void setJob(String job) {
	  this.job = job;
	 }
	 
	 //일반함수
	 public void employeeInfo() {
	  System.out.printf("사번 : [%d], 이름 : [%s], 직종 : [%s] \n", this.empno , this.ename, this.job);
	 }
	 
	 
	 
	}

