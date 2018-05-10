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
			Gugudan.inputdata = JOptionPane.showInputDialog(Gugudan.li.get(++x) + " * " + Gugudan.li.get(++x) + " 값은?");

			System.out.println("입력한 값은: " + Gugudan.inputdata);
			if ((Gugudan.li.get(++y) * Gugudan.li.get(++y)) == Integer.parseInt(Gugudan.inputdata)) {
				System.out.println("정답입니다");
				WordTimeOut.i = 15;
				Gugudan.q++;
			} else {
				System.out.println("구구단도 못하냐 ㅉㅉ");
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
				return; // run함수 탈출

			System.out.println("남은 시간: " + i);
			try {
				Thread.sleep(1000); // 대기실에서 1초간 쉬었다 ....
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("시간초과");
		System.out.println("맞은 갯수 : " + Gugudan.q);
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
			System.out.println("맞은 갯수 : " + Gugudan.q);
		}

	}

}
