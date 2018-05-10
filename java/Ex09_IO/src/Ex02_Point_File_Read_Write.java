import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//��� : File (read, write) : �������� ����
//FileInputStream, FileOutputStream

//txt ��� �۾� : C:\\Temp\\a.txt >> HELLO
public class Ex02_Point_File_Read_Write {

	public static void main(String[] args) {
		//1�ܰ�
		//Point : I/O �۾��� ��κ� ������ �÷����� ����� �ƴϴ�
		//��������� �ڿ��� ���� �۾��� �Ѵ� (�Լ� : close() -> �Ҹ��� �Լ� ȣ��....)
		
		/*
		try {
			FileInputStream fs = new FileInputStream("C:\\Temp\\a.txt");
			int data = 0;
			while((data = fs.read()) !=-1) {
				System.out.println("����(����) : " + data);
				//H read ���������ι�ȯ(�ƽ�Ű �ڵ�ǥ)
				char c =(char)data;
				System.out.println(c);
			}
			fs.close(); //�������� ��� �ڿ�����
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
		    //�ڿ����� (fs ������ scope try {�ȿ��� ��}
			
		}*/
		FileInputStream fs = null;
		FileOutputStream fos = null;
		String path = "C:\\Temp\\a.txt";
		try {
			
			fs = new FileInputStream(path); //read
			fos = new FileOutputStream("C:\\Temp\\new.txt",true); 
			//write
			//FileOutputStream Ŭ������  Temp �����ȿ� new.txt �� �������� ������
			//���� ������ �մϴ� >> ������ ���Ͽ� write ���� �۾�
			
			//new FileOutputStream("C:\\Temp\\new.txt",true);
			//������ �ι��� ���� : true
			//���������� : append
			
			//new FileOutputStream("C:\\Temp\\new.txt");
			//default : false		
			//���������� : overwrite
			
			int data = 0;
			while((data = fs.read()) !=-1) {
				fos.write(data);
				System.out.println("����(����) : " + data);
				//H read ���������ι�ȯ(�ƽ�Ű �ڵ�ǥ)
				char c =(char)data;
				System.out.println(c);
			}
			fs.close(); //�������� ��� �ڿ�����
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}finally {
		    //�ڿ����� (fs ������ scope try {�ȿ��� ��}
			try {
				fs.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

}
