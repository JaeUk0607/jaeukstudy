package Quiz;
class Product{
	int price;
	int bonuspoint;
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
}
class Tv extends Product{
	Tv(){
		super(5000);
	}
	@Override
	public String toString() {
		return "Tv";
	}
}
class Audio extends Product{
	Audio(){
		super(4000);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}
class Computer extends Product{
	Computer(){
		super(2000);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}
class Buyer{
	int money = 10000;
	int bonuspoint = 0;
	void buy(Product n) {
		if(this.money<n.price) {
			System.out.println("�ݾ��ʰ�");
			return;
		}
		this.money -= n.price;
		this.bonuspoint += n.bonuspoint;
		System.out.println("��ǰ��             : " + n.toString());
		System.out.println("������             : " + n.price);
		System.out.println("���ʽ�����Ʈ�� : " + n.bonuspoint);
		System.out.println("������             : " + this.money);
	}
}

public class Test {

	public static void main(String[] args) {
		Tv tv = new Tv();
		System.out.println(tv.toString());
		Audio audio = new Audio();
		System.out.println(audio.toString());
		Computer computer = new Computer();
		System.out.println(computer.toString());
		
		Buyer buy = new Buyer();
		buy.buy(tv);
		buy.buy(audio);
		buy.buy(computer);
		buy.buy(tv);
		buy.buy(audio);
		buy.buy(computer);
		buy.buy(tv);
		buy.buy(audio);
		buy.buy(computer);
		

	}

}
