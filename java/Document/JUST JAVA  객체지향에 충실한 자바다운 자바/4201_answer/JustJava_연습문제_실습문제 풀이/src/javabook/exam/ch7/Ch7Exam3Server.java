package javabook.exam.ch7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class Ch7Exam3Server {

	public static void main(String[] args) {
		try {
			ServerSocket sc = new ServerSocket(5000);
			System.out.println("## 서버 실행: "+sc.getInetAddress().getLocalHost());

			while(true) {
				Socket s = sc.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				System.out.println("## 클라이언트 연결됨 !!");
				String str = br.readLine();
				System.out.println("## 클라이언트 전송: "+str);
				
				StringTokenizer st = new StringTokenizer(str,",");
				int result=0;
				while(st.hasMoreTokens()) {
					result *= Integer.parseInt(st.nextToken());  
				}
				System.out.println("## 계산결과: "+result);
				br.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}