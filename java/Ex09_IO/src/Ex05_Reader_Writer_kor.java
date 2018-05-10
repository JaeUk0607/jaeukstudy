import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//한글 2Byte -> Stream 통한 통신 불가 (Byte 단위)
//2Byte 문자 -> Reader, Writer 추상클래스
public class Ex05_Reader_Writer_kor {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("Ex01_Stream.java");
			fw = new FileWriter("copy_Ex01.txt"); //파일 생성 기능
			
			int data = 0;
			while((data = fr.read()) != -1) {
				//System.out.println(data + " : " + (char)data);
				//fw.write(data);
				if(data != '\n'&& data !='\r' && data != '\t' && data != ' ') {
					fw.write(data);
				}
			}
			
		}catch(Exception e) {
			
		}finally {
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

	}

}
