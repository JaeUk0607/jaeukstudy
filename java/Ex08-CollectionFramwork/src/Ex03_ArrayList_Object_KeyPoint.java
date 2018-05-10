import java.util.ArrayList;

import kr.or.bit.EMP;

public class Ex03_ArrayList_Object_KeyPoint {
	public static void main(String[] args) {
		// 정적배열(Array)
		// 사람 1명을 만드세요
		EMP e = new EMP(100, "김유신", "군인");

		// 정배열(Array)
		// 사용 사원 2명을 만드세요
		EMP[] emplist = { new EMP(10, "김씨", "IT"), new EMP(20, "박씨", "SALES"), };
		for (EMP em : emplist) {
			System.out.println(em.toString());
		}
		//////////////////////////// 기존 배열 (정적)
		//////////////////////////// 복습/////////////////////////////////////////

		// ArrayList 를 사용해서 사원 두명을 만드세요
		ArrayList elist = new ArrayList();
		elist.add(new EMP(1, "김", "IT"));
		elist.add(new EMP(2, "박", "영업"));
		System.out.println(elist.toString());

		// for문을 사용해서 사원 데이터 정보를 출력하는 toString() 금지
		// for문 개선된 for문 말 고 일반 for 문을 통해서 출력하세요

		for (int i = 0; i < elist.size(); i++) {
			// System.out.println(elist.get(i).toString());
			System.out.println(((EMP) elist.get(i)).toString());

			EMP m = (EMP) elist.get(i);
			System.out.println(m.getEmpno() + "/" + m.getEname() + "/" + m.getJob());

		}
		for (Object q : elist) {
			// System.out.println(q);
			EMP m = (EMP) q;
			System.out.println(m.getEmpno());
		}
		// Object 불편해서 쓰기...
		// generic (100%)
		ArrayList<EMP> elist2 = new ArrayList<EMP>();
		elist2.add(new EMP(1, "A", "IT"));
		elist2.add(new EMP(2, "B", "SALSE"));

		for (EMP em : elist2) {
			System.out.println(em.getEmpno() + "/" + em.getEname() + "/" + em.getJob());
		}

	}

}
