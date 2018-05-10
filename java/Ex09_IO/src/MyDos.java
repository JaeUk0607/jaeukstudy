import java.io.File;

public class MyDos {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("사용법 : java mkdir [경로명] [폴더명]");
			System.out.println("예시   : java mkdir C:\\Temp aa");
			System.exit(0); // 프로세스 종료
		}
		File f = new File(args[0]);
		if (args[0].equals("mkdir")) {
			String path = "";
			path = args[1] + "\\" + args[2];
			File newfile = new File(path);
			System.out.println("file path : " + newfile.getPath());
			if (newfile.exists()) {
				System.out.println("이미 존재하는 디렉토리입니다");
			} else {
				newfile.mkdir();
				System.out.println("else");
			}
		}
	}
}