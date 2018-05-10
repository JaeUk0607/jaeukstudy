package kr.or.bit;
//���� ����� stack �ڷ� ����
public class Mystack {
	// �߰� : �ʿ��ϴٸ� �Լ� �߰�(�������� ó��)
	// �߰� : member field �߰�
	// LIFO �ڷᱸ���� ���� Ŭ���� ����
	private Object[] stackarr;
	
	private int top ;
	private int maxsize;
	

	public Mystack(int maxsize) {
		this.maxsize = maxsize;
		stackarr = new Object[maxsize];
		top = -1;
	}

	public boolean empty() { // ���ú��ִ�
		return (top == -1);
			
		}
	public boolean full() {
		return (top == maxsize-1);
	}
		
	

	public void push(Object i) {
		// ������ �ֱ�
		if(full()) {
			System.out.println("��ã��");
		}else {
			stackarr[++top] = i;
				
			
		}
		

	}

	public Object pop() {
		if(empty()) {
			System.out.println("������ �������");
			return null;
		}else {
			Object output = stackarr[top];
			top--;
			return output;
		}
		
	}

}

/*//���� ����� stack �ڷ� ����
public class Mystack {
	//�߰� : �ʿ��ϴٸ� �Լ� �߰� (�������� ó��)
	//�߰� : member field �߰� 
	//LIFO �ڷᱸ�Ḧ ���� Ŭ���� ����
	private int top; //�� �� ������ (�̵�)
	private int maxsize; //ũ�� ����
	private Object[] stackarr;	
	
	public Mystack(int maxsize) {
		this.maxsize = maxsize;
		stackarr = new Object[maxsize];
		top = -1;
	}
	
	public boolean empty() { //���� ��� �ִ�
		return (top == -1);
	}
	
	public boolean full() { 
		return (top == maxsize -1); //�迭�� ������ ���ȣ�� top �� ������
	}
	
	public void push(Object i) {
		//������ �ֱ�
		if(full()) {
			System.out.println("������ ������");
		}else {
			stackarr[++top] = i; //ó�� top = -1; >> [0]�濡 >> 
		}
	}
	
	public Object pop() {
		if(empty()) {
			System.out.println("������ �������");
			return null;
		}else {
			Object output = stackarr[top];
			top--;
			return output;
		}
		
	}
	
}
*/