package Quiz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class GradeQuiz {
	static HashMap<Integer, Grade> map = new HashMap<Integer, Grade>();
	static int count = 1;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		GradeQuiz gq = new GradeQuiz();
		while (true) {
			System.out.println("�����������α׷��Դϴ�");
			System.out.print("<1>�߰� <2>���� <3>��� <4>���� <5>�ε� <6>���� : ");

			switch (scan.nextInt()) {
			case 1:
				//gq.add();
			}
		}

	}

	private void save() {
		File file = new File("grade.txt");
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(map);

			oos.close();
			fos.close();

		} catch (Exception e) {
			System.out.println("�����߻�!!");
		}
		System.out.println("����Ǿ����ϴ�.");

	}

	private void exit() {
		System.out.println("�ý��� �����մϴ�.");
		System.exit(0);
		scan.close();
	}

	private void print() {
		Set<Integer> set = map.keySet();
		System.out.println("��ȣ\t����\t����\t���\t����");
		for (Integer number : set) {
			double math = map.get(number).getMath();
			double java = map.get(number).getJava();
			double python = map.get(number).getPython();
			double avg = map.get(number).getAvg();
			String you = map.get(number).getYou();
			
			System.out.printf("%s\t%.2f\n%s\t%.2f\n%s\t%.2f\t%.2f\t%s\n",math,java,python,avg,you);
		}
	}

}
