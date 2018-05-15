package javabook.exam.ch7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ch7Exam1 {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			OutputStreamWriter out = new OutputStreamWriter(System.out);

			String s;
			System.out.print("문장을 입력하세요: ");
			s=reader.readLine();
			System.out.println("입력문자열: "+ s);
			
			/*
			 * 문자열에서 각 문자를 읽어 아스키로 변환하는 것은 여러 방법으로 구현이 가능함.
			 * 여기서는 int로 캐스팅하는 방법을 사용함.
			 */
			System.out.print("아스키코드: ");
			for(int i=0;i<s.length();i++) {
				int ascii = (int)s.charAt(i);
				System.out.print(ascii+",");
			}
			reader.close();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
