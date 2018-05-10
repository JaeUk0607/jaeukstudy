import java.util.List;

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
		
		//Menu 구성 :
		//1. 조회하기
		//부서번호 입력 : 
		
		//1. 조건조회 (요청) >> 파악 >> DB작업 >> 함수
		DeptDao dao = new DeptDao();
		Dept dept = dao.getDeptListDeptno(10);
		System.out.println(dept.toString());
		//2.전체조회
		List<Dept> dept2 = dao.getDeptAllList();
		if (dept2 != null) {
			for (Dept d : dept2) {
				System.out.println(d);
			}
		}
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

	}

}
