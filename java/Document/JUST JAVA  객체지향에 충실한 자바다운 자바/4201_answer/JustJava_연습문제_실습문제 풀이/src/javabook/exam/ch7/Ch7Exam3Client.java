package javabook.exam.ch7;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ch7Exam3Client {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1",5000);
			System.out.println("## 클라이언트 실행..");

			PrintWriter pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자 두개를 입력하세요(콤마로 구분): ");
			String str = scan.next();
			pw.println(str);
			pw.close();
			s.close();
			System.out.println("## 클라이언트 종료..");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
