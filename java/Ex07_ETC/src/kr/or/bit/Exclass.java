package kr.or.bit;

public class Exclass {
	public Exclass()throws Exception{
		
	}
	public void call()throws ArithmeticException, IndexOutOfBoundsException{
		System.out.println("call 함수 Start");
		int i =1/0;
		System.out.println("call 함수 end");
	}
}
