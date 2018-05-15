package javabook.exam.ch7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Ch7Exam2 {

	public static void main(String[] args) {
		File wfile = new File("c:/dev/ch7exam2.txt");

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(new FileWriter(wfile));
			
			String s;
			System.out.print("문장을 입력하세요: ");

			s=reader.readLine();
			System.out.println("입력문자열: "+ s);
			
			for(int i=0;i<s.length();i++) {
				int ascii = (int)s.charAt(i);
				out.print(ascii+",");
			}
			reader.close();
			out.close();
			System.out.print("결과확인은 c:/dev/ch7exam2.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
