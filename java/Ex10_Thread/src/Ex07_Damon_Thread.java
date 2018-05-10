//한글 작업 (주작업) ... 보조적으로 (저장) >> Damon...
//Damon 은 주 작업과 생명을 같이함

public class Ex07_Damon_Thread implements Runnable {
	static boolean autosave = false;

	
	public static void main(String[] args) {
		//Ex07_Damon_Thread ex = new Ex07_Damon_Thread();
		Thread th = new Thread(new Ex07_Damon_Thread());
		th.setDaemon(true);
		th.start();
		//main 하나의 쓰래드(non~damon)
		//main 의 보조는 th (th main 의 데몬쓰레드)
		//th는 main 과 운명을 같이 한다
		for(int i = 0; i<30; i++) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Main Thread : " + i);
			if(i == 5) { //i가 5가되는 시점에
				System.out.println(i);
				autosave = true;
			}
		}

	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			}catch(Exception e) {
				
			}
			if(autosave) { //true
				autoSave();
			}
		}
		
	}
	public void autoSave() {
		System.out.println("문서가 3초 간격으로 자동 저장되었습니다");
	}

}
