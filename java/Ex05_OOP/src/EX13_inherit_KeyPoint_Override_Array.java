/*
�䱸����
īƮ (Cart)
īƮ���� ���忡 �ִ� ��� ������ǰ�� ���� �� �ִ� 
īƮ�� ũ��� �����Ǿ� �ִ� (10��) : 1��  , 2�� ���� �� �ְ� �ִ� 10������ ���� �� �ִ�
���� ������ ���� �ϸ� ... īƮ�� ��´�

���뿡 ���� ��ü ���
������� �ʿ�
summary() ��� �߰��� �ּ���
����� ������ �����̸� �� �������� ����
�� �����ݾ� ��� ���

hint) īƮ ������ ��� ���� (Buy())
hint) summary()  main �Լ����� ����Ҷ�

�����ڴ� default �ݾ��� ������ �ְ� �ʱ�ݾ��� ������ �� �� �ִ�

*/

class Buyer1 { // ������
	int money = 1000000000;
	int bonuspoint = 0;
	Product1[] cart = new Product1 [10];
	int cart1 =0;
	
	
	void buy1(Product1 n) {  //�Լ��� ��ǰ��ü�� parameter�� POINT
		//******************��Ӱ��迡�� �θ�Ÿ������ �����ϴ��� ������ �Լ��� �ڽİ��� ���******************
		if(this.money < n.price) {
			System.out.println("���� �ܾ��� �����մϴ�^^");
			return; // ���������� ���� ����
		}
		// �Ǳ�������
				this.money -= n.price;
				this.bonuspoint += n.bonuspoint;
				//System.out.println("������ ������ : " + n.toString());
				
				if(cart1>=10) {
					System.out.println("��ã���ϴ�");
					return;
				}
				cart[cart1] = n;
				cart1++;
				for(int i =0; i<cart.length; i++) {
					System.out.println("������ ������ : " + cart[i]);
				}
				
				
	}
	void summary() {
		
		int sum =0;
		int total=0;
		
		for(int i = 0; i<cart.length; i++) {
			System.out.println(cart[i] + " " + cart[i].price);
			sum += cart[i].price;
			total += cart[i].bonuspoint;
			
			
		}System.out.println("�Ѿ��� : " + sum);
		System.out.println("���ʽ��� : " + total);
		
	}
}


class Product1 { // ������ǰ
	int price;
	int bonuspoint;

	// Product(){}
	Product1(int price) {
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}
}

class KtTv1 extends Product1 { // product �� KtTv ���...
	 KtTv1(){
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
class Audio1 extends Product1 {// product �� Audio ���...
	Audio1() {
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}

}

class Notebook1 extends Product1 {// product �� Notebook ���...
	Notebook1() {
		super(150);
	}

	@Override
	public String toString() {
		return "Notebook";
	}

}




public class EX13_inherit_KeyPoint_Override_Array {

	public static void main(String[] args) {
		KtTv1 kttv = new KtTv1();
		System.out.println(kttv.toString());
		Audio1 audio = new Audio1();
		System.out.println(audio.toString());
		Notebook1 notebook = new Notebook1();
		System.out.println(notebook.toString());
		
		Buyer1 buyer = new Buyer1();
		//1�� ����
		//��������
		buyer.buy1(audio);
		buyer.buy1(notebook);
		buyer.buy1(audio);
		buyer.buy1(notebook);
		buyer.buy1(kttv);
		buyer.buy1(kttv);
		buyer.buy1(kttv);
		buyer.buy1(kttv);
		buyer.buy1(kttv);
		buyer.buy1(kttv);
		buyer.buy1(kttv);
		buyer.buy1(kttv);
		buyer.buy1(kttv);
		buyer.summary();
		
		

	}

}
