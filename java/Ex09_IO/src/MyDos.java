import java.io.File;

public class MyDos {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("���� : java mkdir [��θ�] [������]");
			System.out.println("����   : java mkdir C:\\Temp aa");
			System.exit(0); // ���μ��� ����
		}
		File f = new File(args[0]);
		if (args[0].equals("mkdir")) {
			String path = "";
			path = args[1] + "\\" + args[2];
			File newfile = new File(path);
			System.out.println("file path : " + newfile.getPath());
			if (newfile.exists()) {
				System.out.println("�̹� �����ϴ� ���丮�Դϴ�");
			} else {
				newfile.mkdir();
				System.out.println("else");
			}
		}
	}
}