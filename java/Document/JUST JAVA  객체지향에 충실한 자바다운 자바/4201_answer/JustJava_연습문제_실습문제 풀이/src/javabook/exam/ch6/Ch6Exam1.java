package javabook.exam.ch6;

public class Ch6Exam1 {

	public static void main(String[] args) {
		String str;
		StringBuffer sb = new StringBuffer();
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i;j++){
				sb.append("*");
			}
			sb.append("\n");
		}
		str = sb.toString();
		System.out.print(str);
	}
}
