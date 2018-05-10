//Thread : 프로세스에서 하나의 최소 실행단위(method)

//Thread 생성방법
//1. Thread 클래스를 상속 -> class Test extends Thread{}
//반드시 Thread 상속할 경우 run()함수 재정의

//2.implements Runnable 구현 -> class Test implements Runnable
//반드시 run() 추상함수 재정의
//POINT : Thread_2 implements Runnable >> Thread(x) 쓰레드가 될수 있는 요건만 갖춤

//why 2가지 제공
//class Test extends Car implements Runnable

//Thread 추상 클래스 아닌 일반 클래스
//추상 클래스 : new (x)



class Thread_1 extends Thread{

	@Override
	public void run() { //새로운 stack 에 처음 올라가는 함수(마치 main 함수...)
		for(int i = 0; i<1000; i++) {
			System.out.println("Thread_1 : " + i + this.getName());
		}
		System.out.println("Thread_1 run() END");
	}
	
}

class Thread_2 implements Runnable{

	@Override
	public void run() { //새로운 stack 에 처음 올라가는 함수(마치 main 함수...)
		for(int i = 0; i<1000; i++) {
			System.out.println("Thread_2 : " + i );
		}
		System.out.println("Thread_2 run() END");
	}
	
}


public class Ex02_Multi_Thread {
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		
		
		
		//1번
		Thread_1 th = new Thread_1();
		th.start(); //POINT > stack 생성하고 stack run() 올려놓기
		
		//2번
		Thread_2 th2 = new Thread_2();
		Thread thread = new Thread(th2); //일반 클래스
		thread.start(); //POINT > stack 생성하고 stack run() 올려놓기
		
		for(int i = 0; i<1000; i++) {
			System.out.println("Thread_2 : " + i );
		}
		System.out.println("Main END");
		
	}

}
