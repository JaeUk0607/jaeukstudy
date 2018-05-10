import java.io.IOException;

public class Ex03_Exception_finally {
	static void startInstall(){
		System.out.println("INSTALL");
	}
	static void copyFiles(){
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("DELETE FILES");
	}


	public static void main(String[] args) {
		
		try {
			copyFiles();
			startInstall(); //설치가 중단되던, 설치완료 되면 DISK 설치 파일 삭제
			
			//개발자(사용자) 강제로 예외를 처리
			//사용자 예외 던지기(예외 객체를 개발자가 직적 생성 new 해라)
			//IOException io = new IOException("Install 처리 중 문제 발생");
			//throw io; //catch 가 처리
			throw new IOException("Install 처리 중 문제 발생");
		}catch (Exception e) {
			System.out.println("예외 메세지 출력하기 : " + e.getMessage());
		}finally { //예외가 발생, 발생(x) 강제적 실행 블럭
			fileDelete();
		}
		System.out.println("실행");
		//주의 사항
		//*****함수 종료 (return;)있다 하더라도 finally 불럭이 있으면 {실행하고}....종료*****

	}

}
