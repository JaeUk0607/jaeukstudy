/*
 �ó�����(�䱸����)
 ����� ������ǰ ���� �ַ�� �����ϴ� ������Դϴ�
 
 [Ŭ���̾�Ʈ �䱸����]
 ������ǰ�� ��ǰ�� ����, ��ǰ�� ����Ʈ ������ ���������� ������ �ֽ��ϴ�
 ������ ������ǰ�� ��ǰ�� ������ �̸��� ������ �ִ�
 ex)
 ������ ������ǰ�� �̸��� ������ �ִ�(ex: Tv, Audio , Computer)
 ������ ������ǰ�� �ٸ� ������ ������ �ִ�(Tv:5000, Audio:6000...)
 ��ǰ�� ����Ʈ�� ������ 10% ����

�ùķ��̼� �ó�����
������ : ��ǰ�� �����ϱ� ���� �ݾ�����, ����Ʈ ������ ������ �ִ�
���� ��� : 10���� , ����Ʈ 0
�����ڴ� ��ǰ�� ������ ���ִ�, ���������� �ϰԵǸ� ������ �ִ� ���� �����ϰ� ����Ʈ�� �ö󰣴�
�����ڴ� �ʱ� �ݾ��� ���� �� �ִ�
 */
class Buyer { // ������
	int money = 1000;
	int bonuspoint = 0;
	
	//��������
	//��������(�ܾ� - ��ǰ�� ����), ����Ʈ ���� ����
	//�����ڴ� ������ �ִ� ��� ��ǰ�� ������ �� �ִ�
	//���� �Լ�
	//���忡 �ִ� ��ǰ(kttv, audio, notebook)
	
	//1�� ���� ����
	//�Ͽ��� �ް�^^
	
	//������ ��ǰ�� 1000�� �ٸ� ��ǰ�� �߰� (POS ��� �ڵ�ȭ)
	//������ ���� ���忡 ��ġ �ڵ�ȭ
	//���� >> ��>>�ڵ��� ���� ����
	//�ٸ� 997�� ��ǰ�� ���� �������� �� �� ����
	//�� ģ���� 997���� �޼��带 �����...
	
	/*void kttvBuy(KtTv n) { //�Լ��� ��ǰ��ü�� parameter�� POINT
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^");
			return; //���������� ���� ����
		}
		//�Ǳ�������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
	void audio(Audio n) { //�Լ��� ��ǰ��ü�� parameter�� POINT
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^");
			return; //���������� ���� ����
		}
		//�Ǳ�������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}
	void notebook(Notebook n) { //�Լ��� ��ǰ��ü�� parameter�� POINT
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^");
			return; //���������� ���� ����
		}
		//�Ǳ�������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}*/
	//2�� ����
	//���� 1000���� ��ǰ�� �ִٸ� 1000���� �ٸ� �Լ����� ȣ�� �Ͽ��� �Ѵ�
	//�����ϴ� �Լ����� �ٸ��� ������ >> �����ϴ� �ϳ��� ���� >> method overloading
	
	/*void buy(KtTv n) { // �Լ��� ��ǰ��ü�� parameter�� POINT
		if (this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^");
			return; // ���������� ���� ����
		}
		// �Ǳ�������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}

	void buy(Audio n) { // �Լ��� ��ǰ��ü�� parameter�� POINT
		if (this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^");
			return; // ���������� ���� ����
		}
		// �Ǳ�������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}

	void buy(Notebook n) { // �Լ��� ��ǰ��ü�� parameter�� POINT
		if (this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^");
			return; // ���������� ���� ����
		}
		// �Ǳ�������
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("������ ������ : " + n.toString());
	}*/
	//3�� ����
	//��ǰ�� ��������� �߰� �Ǵ��� ���������� ���� �Լ��� �߰������� ������ �ʰڴ�
	//why) ���� ��ſ� �ް��� ������ �Ѵ�
	//**�ݺ����� �ڵ� ����....
	//**�ϳ��� �Լ��� ��� ���ǿ� ���� ���� ������ ����
	//key Point : ��� ��ǰ�� product �� ����ϰ� �ִ�(��� ��ǰ�� �θ�� Product �Դϴ�)
	
	//Product p �θ�Ÿ���� ������ ��Ӱ��迡�� �ڽ�Ÿ���� �ּҸ� ���� �� �ִ�
	//Audio a = new Audio();
	//p=a;
	void buy(Product n) {  //�Լ��� ��ǰ��ü�� parameter�� POINT
		//******************��Ӱ��迡�� �θ�Ÿ������ �����ϴ��� ������ �Լ��� �ڽİ��� ���******************
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^");
			return; // ���������� ���� ����
		}
		// �Ǳ�������
				this.money -= n.price;
				this.bonuspoint += n.bonuspoint;
				System.out.println("������ ������ : " + n.toString());
	}
}

class Product { // ������ǰ
	int price;
	int bonuspoint;

	// Product(){}
	Product(int price) {
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}
}

class KtTv extends Product { // product �� KtTv ���...
	 KtTv(){
		 super(500);

	// price = 500;
	 }
	// KtTv(int price){
	//KtTv(String name) {
		//super(500);
		// this.price = price;
		// super(price);

	//}

	@Override
	public String toString() {
		return "Kttv";
	}

}

// KtTv lgtv = new KtTv(500);
// KtTv lgtv = new KtTv();
class Audio extends Product {// product �� Audio ���...
	Audio() {
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}

}

class Notebook extends Product {// product �� Notebook ���...
	Notebook() {
		super(150);
	}

	@Override
	public String toString() {
		return "Notebook";
	}

}




public class Ex12_Inherit_KeyPoint {

	public static void main(String[] args) {
		KtTv kttv = new KtTv();
		System.out.println(kttv.toString());
		Audio audio = new Audio();
		System.out.println(audio.toString());
		Notebook notebook = new Notebook();
		System.out.println(notebook.toString());
		
		Buyer buyer = new Buyer();
		//1�� ����
		//��������
		buyer.buy(audio);
		buyer.buy(notebook);
		buyer.buy(audio);
		buyer.buy(notebook);
		buyer.buy(kttv);
		buyer.buy(kttv);
		
		

	}

}
