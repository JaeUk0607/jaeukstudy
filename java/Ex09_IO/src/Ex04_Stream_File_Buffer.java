import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//컴퓨터 느린 작업 (DISK 파일 read, write)
//1.File 작업 (DISK) (read, write) byte 단위
//위 같은 문제를 해결하기 위해서
//Buffer 메모리 (작업 해 둔 것을)
//무조건 : file 작업할떄 중간에 Buffer 사용

//File I/O 성능개선
//Line 단위 처리

//JAVA API
//보조 스트림(input , output 추상클래스 상속한 크래스가 객체로 존재 해야지만 사용가능) 
//BufferedInputStream
//BufferedOutputStream
public class Ex04_Stream_File_Buffer {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("data txt"); //파일 생성 기능 가지고 있다
			bos = new BufferedOutputStream(fos);
			
			for(int i = 0; i < 10; i++) {
				bos.write('A');
			}
			/*
			 java buffer 크기 : 8kbyte => 8192byte
			 1.buffer 안에 내용이 8kbyte 채우면 자동으로 비운다
			 2.buffer 강제로 비우는 방법 : flush() 강제 호출
			 3.bos.close(); 내부에서 flush() 호출
			  
			 */
			//bos.flush();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
				bos.close(); //buffer close(flush()포함)
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
