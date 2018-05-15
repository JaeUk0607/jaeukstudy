package javabook.exam.ch11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch11Exam2 {

	public static void main(String[] args) {
		File rfile = new File("c:/dev/ch11test.txt");
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(rfile));
			
			String s;
			InputThread t = new InputThread();
			t.start();
			
			while((s=reader.readLine()) != null) {
				System.out.println(s);
				Thread.sleep(2000);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일읽기 종료...");
	}
}

class InputThread extends Thread {
	public void run() {
		System.out.println("종료하려면 'q'를 누르고 엔터 하세요!!");
		Scanner s = new Scanner(System.in);
		if(s.next().equals("q")) {
			System.out.println("키입력으로 종료...");
			System.exit(0);
		}
	}
}