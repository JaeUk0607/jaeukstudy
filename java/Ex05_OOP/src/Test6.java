class Buyer6{
	int money=10000;
	int bonuspoint=0;
	void buy(Product6 n){
		if(money<n.price){
		System.out.println("금액초과");
		return;
		}
		
		this.money -= n.price;
		this.bonuspoint = n.bonuspoint;
		System.out.println("구매한 물건은 : " + n.toString());
		System.out.println("남은돈           : " + money);
		System.out.println("제품가격        : " + n.price);
		System.out.println("포인트는        : " + n.bonuspoint);
		
	}
}
class Product6{
	int price;
	int bonuspoint;
	Product6(int price){
	this.price = price;
	this.bonuspoint = (int)(this.price/10.0);
	
	}
	
}
class Tv6 extends Product6{
	Tv6(){
	super(1000);
	}
	@Override
	public String toString(){
	return "Tv";
	}
}
class Audio6 extends Product6{
	Audio6(){
	super(500);
	}
	@Override
	public String toString(){
	return "Audio";
	}
}
class Computer6 extends Product6{
	Computer6(){
	super(800);
	}
	@Override
	public String toString(){
	return "Computer";
	}
}
public class Test6 {

	public static void main(String[] args) {
		Tv6 tv = new Tv6();
		System.out.println(tv.toString());
		Audio6 audio = new Audio6();
		System.out.println(audio.toString());
		Computer6 computer = new Computer6();
		System.out.println(computer.toString());
		
		Buyer6 buy = new Buyer6();
		buy.buy(tv);
		buy.buy(audio);
		buy.buy(computer);

	}

}
