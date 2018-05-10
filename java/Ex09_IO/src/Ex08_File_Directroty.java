import java.io.File;

public class Ex08_File_Directroty {
	//main 프로그램 시작점
	public static void main(String[] args) {
		//System.out.println(args.length);
		//System.out.println(args[0]);
		
		if(args.length != 1) {
			System.out.println("사용법 : java 파일명 [디렉토리명]");
			System.exit(0); //포르세스 강제종료
		}
		//File f = new File(args[0]);
		//java Ex0/... C:\\Temp
		//args[0] = C:\\Temp 정보
		File f = new File(args[0]);
		if(!f.exists() || ! f.isDirectory()) {
			//존재하지 않거나 또는 디렉토리가 아니라면
			System.out.println("유효하지 않는 경로야");
			System.exit(0);
		}
		//존재하는 경로
		File[] files = f.listFiles(); //하위 지원 (각각을 파일 객체 타입으로)
		for(int i = 0; i < files.length; i++) {
			String name = files[i].getName(); //폴더명, 파일명
			System.out.println(files[i].isDirectory() ? "DIR" + name : name);
		}

	}

}
