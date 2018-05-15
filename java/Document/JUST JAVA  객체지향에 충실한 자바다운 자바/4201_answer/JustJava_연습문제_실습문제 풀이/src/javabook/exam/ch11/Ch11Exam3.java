package javabook.exam.ch11;

public class Ch11Exam3{
	public static void main(String[] args) {
		new Thread(()-> {
			System.out.println("Ramda Example!!");			
		}).start();
	}
}