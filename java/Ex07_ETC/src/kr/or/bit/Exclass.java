package kr.or.bit;

public class Exclass {
	public Exclass()throws Exception{
		
	}
	public void call()throws ArithmeticException, IndexOutOfBoundsException{
		System.out.println("call �Լ� Start");
		int i =1/0;
		System.out.println("call �Լ� end");
	}
}
