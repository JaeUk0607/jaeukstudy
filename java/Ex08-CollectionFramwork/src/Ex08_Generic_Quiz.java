import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kr.or.bit.CopyEmp;
import kr.or.bit.EMP;

public class Ex08_Generic_Quiz {

	public static void main(String[] args) {
		// 1. Emp 클래스 사용해서 사원 3명을 생성하세요
		// 단 ArrayList<T> 제네릭을 사용하세요
		ArrayList<EMP> arr = new ArrayList();
		arr.add(new EMP(1, "a", "IT"));
		arr.add(new EMP(2, "b", "IT"));
		arr.add(new EMP(3, "c", "IT"));

		// 2. 사원의 정보 (사번, 이름, 직종)을 개선된 for문을 사용해서 출력하세요
		// 단 toString() 사용 금지
		for (EMP emp : arr) {
			System.out.println(emp);
		}
		System.out.println("------------------------------------------");

		// 3. 사원의 정보 (사번, 이름, 직종)을 일반for문을 사용해서 출력하세요
		// 단 toString() 사용 금지
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));

		}
		System.out.println("------------------------------------------");
		// 4.CopyEmp 라는 클래스를 만드세요(Emp 와 같은데)
		// job member field 대신에 >>
		// private int sal; 로 바꾸어서 만드세요(getter ,setter 구현)
		// kr.or.bit.CopyEmp 로 하세요
		// ArrayList<> 제너릭 사용해서 사원 3명 만드세요
		// 아래 데이터 사용
		// 100,"김",1000
		// 200,"이",2000
		// 300,"박",3000
		List<CopyEmp> arr2 = new ArrayList<>();
		arr2.add(new CopyEmp(100, "김", 1000));
		arr2.add(new CopyEmp(200, "이", 2000));
		arr2.add(new CopyEmp(300, "박", 3000));

		// 5.200번 사원의 급여를 5000으로 수정해서 출력하세요(일반 for문 안에서 ....)//여기몰랏어
		for (int i = 0; i < arr2.size(); i++) {
			if (arr2.get(i).getEmpno() == 200) {
				arr2.get(i).setSal(5000);
			}
			System.out.println(arr2.get(i).getEmpno() + "/" + arr2.get(i).getEname() + "/" + arr2.get(i).getSal());
		}
		System.out.println("------------------------------------------");

		// 6.300번 사원의 이름을 "궁금해" 로 수정해서 출력하세요(개선된 for문 안에서 ....)
		for (CopyEmp aa : arr2) {
			if (aa.getEmpno() == 300) {
				aa.setEname("궁금해");

			}
			System.out.println(aa.getEmpno() + "/" + aa.getEname() + "/" + aa.getSal());
		}
		System.out.println("------------------------------------------");
		//7. 사원정보를 Iterator 인터페이스를 사용해서 출력하세요
		Iterator<CopyEmp> l1 = arr2.iterator();
		while(l1.hasNext()) {
			
			//next() 이동 값을 return 
			//System.out.println(l1.next().getEmpno());
			//System.out.println(l1.next().getEname());
			//System.out.println(l1.next().getSal());
			CopyEmp e = l1.next();
			System.out.println(e.getEmpno());
			
			System.out.println(e.getEname());
			
			System.out.println(e.getSal());
		}
	}

}
