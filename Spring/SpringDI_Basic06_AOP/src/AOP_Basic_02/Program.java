package AOP_Basic_02;

import java.lang.reflect.Proxy;

public class Program {
	public static void main (String[] args) {
		/*Cal cal = new Cal();
		int result = cal.Add(100, 200);
		System.out.println("Add result : " + result);
		
		result = cal.Mul(100, 200);
		System.out.println("Mul result : " + result);*/
		
		Calc calc = new NewCalc();
		//calc.ADD(100, 200)
		
		//Froxy 객체를 통해서 처리(가짜)
		Calc calc2 = (Calc)Proxy.newProxyInstance(calc.getClass().getClassLoader(), //실제 클래스 메타 정보 
							   calc.getClass().getInterfaces(), //행위정보 (인터페이스)
							   new LogPrintHandler(calc)); //핸들러(보조관심) >> 실객체의 주소
		//Froxy 를 통해서 처리하지만
		//사용자는 실제 Calc 객체를 사용하는 것 처럼......
		//MUL, ADD, SUB >> LogPrintHandler 객체의 invoke 함수 호출 (대리함수)
		
		int result = calc2.ADD(1000, 2000);
		System.out.println("main : " + result);
	}
	
}
