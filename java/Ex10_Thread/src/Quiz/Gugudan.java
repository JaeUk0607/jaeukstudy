package Quiz;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

class WordInputProcess extends Thread {
	@Override
	public void run() {
		int x = -1;
		int y = -1;
		while (true) {
			
			Gugudan.li.add((int) ((Math.random() * 19) + 1));
			Gugudan.li.add((int) ((Math.random() * 19) + 1));
			Gugudan.inputdata = JOptionPane.showInputDialog(Gugudan.li.get(++x) + " * " + Gugudan.li.get(++x) + " ����?");

			System.out.println("�Է��� ����: " + Gugudan.inputdata);
			if ((Gugudan.li.get(++y) * Gugudan.li.get(++y)) == Integer.parseInt(Gugudan.inputdata)) {
				System.out.println("�����Դϴ�");
				WordTimeOut.i = 15;
				Gugudan.q++;
			} else {
				System.out.println("�����ܵ� ���ϳ� ����");
					if (Gugudan.inputdata != null && !Gugudan.inputdata.equals("")) {
					Gugudan.inputcheck = true;
					break;
				}
			}
		}
	}
}

class WordTimeOut extends Thread {
	
	static int i;
	
	@Override
	public void run() {
		for (i=15; i > 0; i--) {

			if (Gugudan.inputcheck)
				return; // run�Լ� Ż��

			System.out.println("���� �ð�: " + i);
			try {
				Thread.sleep(1000); // ���ǿ��� 1�ʰ� ������ ....
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("�ð��ʰ�");
		System.out.println("���� ���� : " + Gugudan.q);
		System.exit(0);
		
	}
	
}

public class Gugudan {
	static List<Integer> li = new ArrayList<>();
	static boolean inputcheck = false;
	static String inputdata;
	static int q;

	public static void main(String[] args) {

		WordInputProcess wip = new WordInputProcess();
		WordTimeOut wto = new WordTimeOut();
		
		wto.start();
		wip.start();
		try {
			wto.join();
			wip.join();
		}catch(Exception e){
			
		}finally {
			System.out.println("���� ���� : " + Gugudan.q);
		}

	}

}
