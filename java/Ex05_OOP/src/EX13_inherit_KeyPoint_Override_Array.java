/*
요구사항
카트 (Cart)
카트에는 매장에 있는 모든 전자제품을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개  , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... 카트에 담는다

계산대에 가면 전체 계산
계산기능이 필요
summary() 기능 추가해 주세요
당신이 구매한 물건이름 과 가격정보 나열
총 누적금액 계산 출력

hint) 카트 물건을 담는 행위 (Buy())
hint) summary()  main 함수에서 계산할때

구매자는 default 금액을 가지고 있고 초기금액을 설정할 수 도 있다

*/

class Buyer1 { // 구매자
	int money = 1000000000;
	int bonuspoint = 0;
	Product1[] cart = new Product1 [10];
	int cart1 =0;
	
	
	void buy1(Product1 n) {  //함수가 제품객체를 parameter로 POINT
		//******************상속관계에서 부모타입으로 접근하더라도 재정의 함수는 자식것을 사용******************
		if(this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다^^");
			return; // 구매행위에 대한 종료
		}
		// 실구매행위
				this.money -= n.price;
				this.bonuspoint += n.bonuspoint;
				//System.out.println("구매한 물건은 : " + n.toString());
				
				if(cart1>=10) {
					System.out.println("꽉찾습니다");
					return;
				}
				cart[cart1] = n;
				cart1++;
				for(int i =0; i<cart.length; i++) {
					System.out.println("구매한 물건은 : " + cart[i]);
				}
				
				
	}
	void summary() {
		
		int sum =0;
		int total=0;
		
		for(int i = 0; i<cart.length; i++) {
			System.out.println(cart[i] + " " + cart[i].price);
			sum += cart[i].price;
			total += cart[i].bonuspoint;
			
			
		}System.out.println("총액은 : " + sum);
		System.out.println("보너스는 : " + total);
		
	}
}


class Product1 { // 전자제품
	int price;
	int bonuspoint;

	// Product(){}
	Product1(int price) {
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}
}

class KtTv1 extends Product1 { // product 를 KtTv 상속...
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
class Audio1 extends Product1 {// product 를 Audio 상속...
	Audio1() {
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}

}

class Notebook1 extends Product1 {// product 를 Notebook 상속...
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
		//1차 오픈
		//구매행위
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
