import java.io.FileReader;
import java.io.IOException;

public class Mydos1 {

	public static void main(String[] args) throws IOException {
		if(args.length == 0) {
			System.out.println("TYPE [경로명] [타입명]");
			System.out.println("예시 : TYPE C:\\Temp a.txt");
		}
		FileReader fr = null;
		fr = new FileReader(args[1] + "\\" + args[2]);
		if(args[0].equals("TYPE")) {
			int data = 0;
			while((data = fr.read()) != -1) {
				System.out.print(data);
			}
			System.out.println("111");
			
			fr.close();
			
		}
		
			}
	
}

