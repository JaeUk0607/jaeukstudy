import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

import DAO.DeptDao;
import DTO.Dept;

//Controller or View 역할
/*
 MVC
 
 Model > DTO(VO,DOMAIN) , DAO
 DTO(Data Transfer object) == VO(Value Object)
 
 1. DTO 의 클래스 생성
 EMP 테이블 >> DTO 클래스 >> class Emp{   타입       }
 >>Emp e = new Emp();
 >>e.setEmpno(100);
 >>e.setEname("홍길동");
 
 
 DTO 클래스 있다면 (여러건의 데이터)
 List<Emp> list = new ArrayList<>();
 >>List.add(new Emp())
 >>List.add(new EMp())
 
 DEPT 테이블 >> DTO 클래스 >> class Dept{   타입        }
 
 1. DAO 클래스 생성
 -> Data Access Object
 -> CRUD 작업을 할 수 있는 클래스 -> CURD 처리 함수를 모아 놓은 클래스
 -> (전체 조회 , 조건 조회, 삽입, 수정, 삭제)
 -> DAO 클래스 최소 5의 함수를 가진다
 
 상세하게 나눌수 도 있따
 SERVICE -> DAO -> DB
            DTO
 
 
 
 
 */




public class Program {

	public static void main(String[] args) {
		DeptDao dao = new DeptDao();
		Scanner sc = new Scanner(System.in);
		//Menu 구성 :
		//1. 조회하기
		//부서번호 입력 :
		System.out.println("1.부서조회");
		System.out.println("2.부서등록");
		System.out.println("3.부서변경");
		System.out.println("4.부서삭제");
		System.out.println("5.부서검색");
		System.out.println("6.종료");
		while(true) {
			
			Dept dept = new Dept();
			switch(Integer.parseInt(sc.nextLine())){
			case 1:
				System.out.println("부서목록조회");
				List<Dept> dept2 = dao.getDeptAllList();
				if (dept2 != null) {
					for (Dept d : dept2) {
						System.out.println(d);
					}
				}
				break;
			case 2:
				System.out.println("부서등록");
				System.out.println("부서번호를 입력하세요");
				dept.setDeptno(Integer.parseInt(sc.nextLine()));
				System.out.println("부서명을 입력하세요");
				dept.setDname(sc.nextLine());
				System.out.println("부서지역을 입력하세요");
				dept.setLoc(sc.nextLine());
				dao.insertDept(dept);
				List<Dept> dept3 = dao.getDeptAllList();
				if (dept3 != null) {
					for (Dept d : dept3) {
						System.out.println(d);
					}
				}
				break;
			case 3:
				System.out.println("부서변경");
				System.out.println("변경할 부서 번호를 입력하세요");
				dept.setDeptno(Integer.parseInt(sc.nextLine()));
				System.out.println("변경할 부서의 이름을 입력하세요");
				dept.setDname(sc.nextLine());
				System.out.println("변경할 부서 지역을 입력하세요");
				dept.setLoc(sc.nextLine());
				dao.updateDept(dept);
				List<Dept> dept4 = dao.getDeptAllList();
				if (dept4 != null) {
					for (Dept d : dept4) {
						System.out.println(d);
					}
				}
				break;
			case 4:
				System.out.println("삭제할 부서의 번호를 입력하세요");
				
				dao.deleteDept(Integer.parseInt(sc.nextLine()));
				List<Dept> dept5 = dao.getDeptAllList();
				if (dept5 != null) {
					for (Dept d : dept5) {
						System.out.println(d);
					}
				}
				break;
			case 5:
				System.out.println("검색할 부서번호를 입력하세요");
				Dept dept6 = dao.getDeptListDeptno(Integer.parseInt(sc.nextLine()));
				System.out.println(dept.toString());
				break;
			case 6:
				System.out.println("검색할 이름을 입력하세요");
			
				List<Dept> dept12 = new ArrayList<>();
				dept12 = dao.searchDept(sc.nextLine());
				for (Dept de : dept12) {
					System.out.println(de);
				}
				break;
			}
		}
		
/*		//1. 조건조회 (요청) >> 파악 >> DB작업 >> 함수
		//DeptDao dao = new DeptDao();
		Dept dept = dao.getDeptListDeptno(10);
		System.out.println(dept.toString());
		//2.전체조회
	
		//3.삽입 & 조회
		
		Dept dept3 = new Dept();
		dept3.setDeptno(50);
		dept3.setDname("김진원");
		dept3.setLoc("까치산");
		dao.insertDept(dept3);
		dept2 = dao.getDeptAllList();
		if (dept2 != null) {
			for (Dept d : dept2) {
				System.out.println(d);
			}
		}
		
		
	    	
		
		Dept dept4 = new Dept();
		dept4.setDeptno(10);
		dept4.setDname("홍길동");
		dept4.setLoc("활빈당");
		dao.updateDept(dept4);
		

		dao.deleteDept(10);
*/
	}

}
