import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//대상 : File (read, write) : 물리적인 파일
//FileInputStream, FileOutputStream

//txt 기반 작업 : C:\\Temp\\a.txt >> HELLO
public class Ex02_Point_File_Read_Write {

	public static void main(String[] args) {
		//1단계
		//Point : I/O 작업은 대부분 가비지 컬렉터의 대상이 아니다
		//명시적으로 자원을 해제 작업을 한다 (함수 : close() -> 소멸자 함수 호출....)
		
		/*
		try {
			FileInputStream fs = new FileInputStream("C:\\Temp\\a.txt");
			int data = 0;
			while((data = fs.read()) !=-1) {
				System.out.println("정수(숫자) : " + data);
				//H read 정수값으로반환(아스키 코드표)
				char c =(char)data;
				System.out.println(c);
			}
			fs.close(); //정상적인 경우 자원해제
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
		    //자원해제 (fs 변수의 scope try {안에서 만}
			
		}*/
		FileInputStream fs = null;
		FileOutputStream fos = null;
		String path = "C:\\Temp\\a.txt";
		try {
			
			fs = new FileInputStream(path); //read
			fos = new FileOutputStream("C:\\Temp\\new.txt",true); 
			//write
			//FileOutputStream 클래스는  Temp 폴더안에 new.txt 가 존재하지 않으면
			//파일 생성을 합니다 >> 생성된 파일에 write 쓰기 작업
			
			//new FileOutputStream("C:\\Temp\\new.txt",true);
			//생성자 두번쨰 인자 : true
			//기존데이터 : append
			
			//new FileOutputStream("C:\\Temp\\new.txt");
			//default : false		
			//기존데이터 : overwrite
			
			int data = 0;
			while((data = fs.read()) !=-1) {
				fos.write(data);
				System.out.println("정수(숫자) : " + data);
				//H read 정수값으로반환(아스키 코드표)
				char c =(char)data;
				System.out.println(c);
			}
			fs.close(); //정상적인 경우 자원해제
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
		    //자원해제 (fs 변수의 scope try {안에서 만}
			try {
				fs.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
