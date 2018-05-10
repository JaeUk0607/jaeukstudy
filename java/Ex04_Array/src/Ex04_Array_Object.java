import kr.or.bit.Emp;

//배열에서 가장 중요한 코드는 : 객체 배열
//[실무에서 가장 많이 사용]
public class Ex04_Array_Object {

	public static void main(String[] args) {
		//사원 3명을 만드세요
		/*Emp e = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();*/
		
		Emp[] emlist = new Emp[3];
		emlist[0] = new Emp();
		emlist[0].setempno(1000);
		emlist[0].setEname("홍길동");
		
		emlist[1] = new Emp(); //주소값 할당 : empList[1] 메모리 주소 할당
		emlist[1].InsertEmp(2000, "김유신"); // 초기화
		
		emlist[2] = new Emp();
		emlist[2].InsertEmp(3000, "유관순");
		
		//emlist 사원 번호와 사원이름을 출력하세요(for)
		for(int i = 0; i<emlist.length; i++) {
			emlist[i].empInfo();
		}
		
		//int[] arr = new int[]{10,20,30} 식으로 사원 3명 생성 정보 출력하세요.
		
		Emp[] emlist2 = new Emp[] {new Emp(1,"이씨"), new Emp(2,"박씨"), new Emp(3,"김씨")};
		for(int i = 0; i<emlist2.length; i++) {
			emlist2[i].empInfo();
		}
		
		//int[] arr = {10,20,30}식으로 사원 3명 생성 정보 출력하세요
		Emp[] emlist3 = {new Emp(111, "A"), new Emp(222, "B")};
		for(int i = 0; i<emlist3.length; i++) {
			emlist3[i].empInfo();
		}

	}

}
