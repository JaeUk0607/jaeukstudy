//18.02.21
//�켱���� : CPU �������� ���̰ڴ�
//default : 5 (max : 10, min : 1)

class Pth extends Thread{

	@Override
	public void run() {
		for(int i = 0; i<1000; i++) {
			System.out.println("-----------");
		}
	}
	
}

class Pth2 extends Thread{

	@Override
	public void run() {
		for(int i = 0; i<1000; i++) {
			System.out.println("|||||||||||||");
		}
	}
	
}

class Pth3 extends Thread{

	@Override
	public void run() {
		for(int i = 0; i<1000; i++) {
			System.out.println("************");
		}
	}
	
}
public class Ex06_Priority {

	public static void main(String[] args) {
		Pth ph = new Pth();
		Pth2 ph2 = new Pth2();
		Pth3 ph3 = new Pth3();
		
		System.out.println(ph.getPriority()); //�⺻��  : 5
		System.out.println(ph2.getPriority());
		System.out.println(ph3.getPriority());
		
		ph.setPriority(6); //���� ������ ���ؿ�~~~~~
		ph3.setPriority(4);//���߿� "************"
		
		
		ph.start();
		ph2.start();
		ph3.start();
		
		System.out.println("Main End");
	}

}
