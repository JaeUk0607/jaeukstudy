import java.io.File;

//File 클래스
//파일(a.txt) 생성, 수정, 삭제
//디렉토리(폴더) 생성, 삭제

//주로 사용 : 파일정보, 폴더정보


//C# : File, Directory 클래스
//절대경로 : C:\\ , D:\\ , C:\\Temp\\a.txt


//상대경로 : 나를 중심으로 


public class Ex07_File_Directory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Temp\\file.txt"; //기존에 만들어진 파일 정보
		File f = new File(path);
		//f.createNewFile() //파일생성
		String  filename = f.getName();
		System.out.println("파일명 : " + filename);
		
		System.out.println("전체경로 : " + f.getPath());
		System.out.println("절대경로 : " + f.getAbsolutePath());
		System.out.println("너 폴더니 : " + f.isDirectory());
		System.out.println("너 파일이니 :" + f.isFile());
		System.out.println("파일 크기 : " + f.length() + "Byte");
		System.out.println("부모경로 : " + f.getParent());
		System.out.println("파일 존재 여부 : " + f.exists());
		
		
		
		//f.delete() return type >>true, false
		//f.canRead(); 사용가능 여부

	}

}
