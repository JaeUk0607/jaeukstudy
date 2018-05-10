import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//Echo : �������� ������ ó��(Ex01 ~ Ex03)

//Server : read, write
//Client : read, write
//���ÿ�(Thread)...
//read(Thread) , write(Thread) >> stack

//1:1 ä���� �Է°� ����� ���ÿ�...
public class Ex04_TCP_Chatt_Server {

	public static void main(String[] args) {

		ServerSocket seversocket = null;

		try {
			ServerSocket serversocket = new ServerSocket(9999);
			System.out.println("���� �����...");
			Socket socket = serversocket.accept(); // Ŭ���̾�Ʈ�� �����ϸ�....
			System.out.println("����Ϸ�");

			// ServerSend ��ü��
			// ServerRecive ��ü�� socket ��ü�� �ּҰ� �ʿ�
			// WHY : socket�� ���ؼ� read, write

			// ServerSend send = new ServerSend(socket);
			// send.start();
			new ServerSend(socket).start();
			// ServerRecive recive = new ServerRecive();
			// recive.start();
			new ServerRecive(socket).start();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			try {
				seversocket.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}

		}

	}

}

// ��� : socket (read, write ��ü)
// write : socket > outputStream
class ServerSend extends Thread {
	// cmd â���� �Է��� ���� read �ؼ�
	// OutputStream ����ؼ� write >> ����� socket�� ���ؼ�
	Socket socket;

	public ServerSend(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() { // �ٸ� stack main �Լ��� ���� ��Ȱ
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			/*
			  Scanner sc = new Scanner(System.in); String msg = sc.nextLine(); OutputStream
			  out = socket.getOutputStream(); DataOutputStream dos = new
			  DataOutputStream(out); dos.writeUTF(msg);
			 */

			// Buffer >> Line() read
			br = new BufferedReader(new InputStreamReader(System.in));
			pw = new PrintWriter(socket.getOutputStream(), true);

			while (true) {
				String data = br.readLine(); // sc.nextLine();
				if (data.equals("exit"))
					break;
				pw.println(data); // ������ Ŭ���̾�Ʈ �޽��� ������ dos.writeUTF(msg);
			}

		} catch (Exception e) {

		} finally {
			try {
				pw.close();
				br.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

// read : socket > inputStream
class ServerRecive extends Thread {
	// ����� socket�� ���ؼ� read �ؼ�
	// cmd �� ��� ���

	Socket socket;

	public ServerRecive(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() { // �ٸ� stack main �Լ��� ���� ��Ȱ
		BufferedReader br = null;
		try {
			/*
			  InputStream in = socket.getInputStream(); DataInputStream dis = new
			  DataInputStream(in); String msg = dis.readUTF();
			 */

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String data = null;
			while ((data = br.readLine()) != null) {
				System.out.println("Client ���� �޼��� [ " + data + " ]");

			}
			System.out.println("ServerReceive ����");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {

				System.out.println(e.getMessage());
			}
		}
	}

}
