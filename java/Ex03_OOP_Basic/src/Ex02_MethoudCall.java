import kr.or.bit.FClass;
import kr.or.bit.Tv;

public class Ex02_MethoudCall {
	public static void main(String[] args) {
		FClass fc = new FClass();
		fc.m();
		fc.m2(10000);
		int result = fc.m3();
		System.out.println("result : " + result);
		fc.m3();
		System.out.println(fc.m3());

		result = fc.m4(1000);
		System.out.println("result : " + result);

		result = fc.sum(500);
		result = fc.sum2(100);

		result = fc.sum3(10, 20);
		System.out.println("�� ���� �� : " + result);

		result = fc.max(555, 333);
		System.out.println("max �� : " + result);
		
		
		///////////////////////////////////////////////////////////
		Tv t2 = fc.objMethod();
		System.out.println(t2.name);
		
		Tv t3 = fc.objMethod2();
		System.out.println("�ּҰ� �� : " + (t2==t3));
		
		//Tv t5 = null;
		fc.objMethod3(t2);
		
		

	}
}
