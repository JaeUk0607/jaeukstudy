package Quiz;

interface I_Add_Shot {
	void Shot();

}

class Drink {
	int price;
	String size;
	boolean ice;

	Drink(int price, String size, boolean ice) {
		this(price, size, ice, 0);

	}

	Drink(int price, String size, boolean ice, int shot1) {
		this.price = price;
		this.size = size;
		this.ice = ice;
	}

}

class Caffeine extends Drink {

	Caffeine(int price, String size, boolean ice) {
		super(price, size, ice);
		// TODO Auto-generated constructor stub
	}

	Caffeine(int price, String size, boolean ice, int shot1) {
		super(price, size, ice, shot1);
		// TODO Auto-generated constructor stub
	}

}

class Expresso extends Caffeine {

	Expresso(String size, boolean ice) {
		super(2000, size, ice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Expresso";
	}

}

class Americano extends Caffeine implements I_Add_Shot {
	int shot1;

	Americano(String size, boolean ice, int shot) {
		super(2500, size, ice, shot);
		this.shot1 = shot;
	}

	@Override
	public void Shot() {

		if (shot1 != 0) {
			shot1 = shot1 * 500;
			this.price += shot1;
			System.out.println("샷을 추가 하셧습니다");
		} else {
			System.out.println();
		}
		shot1 = 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Americano";
	}
}

class Vanilla_Latte extends Caffeine implements I_Add_Shot {
	int shot1;

	Vanilla_Latte(String size, boolean ice, int shot) {
		super(3000, size, ice, shot);
		this.shot1 = shot;
	}

	@Override
	public void Shot() {

		if (shot1 != 0) {
			shot1 = shot1 * 500;
			this.price += shot1;
			System.out.println("샷을 추가 하셧습니다");
		} else {
			System.out.println();
		}
		shot1 = 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Vanilla_Latte";
	}

}

/////////////////////////////////////////////////////////////////////////////////
class Non_Caffeine extends Drink {

	Non_Caffeine(int price, String size, boolean ice) {
		super(price, size, ice);
		// TODO Auto-generated constructor stub
	}

	Non_Caffeine(int price, String size, boolean ice, int shot1) {
		super(price, size, ice);
		// TODO Auto-generated constructor stub
	}

}

class Green_Tee_Latte extends Non_Caffeine implements I_Add_Shot {
	int shot1;

	Green_Tee_Latte(String size, boolean ice, int shot) {
		super(4000, size, ice, shot);
		this.shot1 = shot;
	}

	@Override
	public void Shot() {

		if (shot1 != 0) {
			shot1 = shot1 * 500;
			this.price += shot1;
			System.out.println("샷을 추가 하셧습니다");
		} else {
			System.out.println();
		}
		shot1 = 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Green_Tee_Latte";
	}

}

class Strawberry_Smoothe extends Non_Caffeine {
	Strawberry_Smoothe(String size, boolean ice) {
		super(5000, size, ice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Strawberry_Smoothe";
	}

}

class Eari_Gray_Tee extends Non_Caffeine {
	Eari_Gray_Tee(String size, boolean ice) {
		super(3000, size, ice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Eari_Gray_Tee";
	}

}

class Buyer1 {
	int money = 1000000000;
	int index = 0;
	Drink[] darr = new Drink[8];

	void Buy(Drink d) {

		if (this.money < d.price) {
			System.out.println(" [ 고객님 잔액이 부족합니다 ]");
			return; // 함수의 종료
		}

		if (this.index >= 8) {
			System.out.println("[ 고객님 넘 많이 사셨어요 ]");
			return;
		}
		// 장바구니 담기***********************************
		// 예외처리 : if 통해서 배열 길이 체크
		darr[index++] = d;
		this.money -= d.price;
		System.out.print("[구매한 물건 :" + d.toString());
		System.out.print(", " + d.size);
		if (d.ice == true)
			System.out.println(", ICE]");
		else
			System.out.println(", HOT]");
		System.out.println("[가격은        :" + d.price + "]");
		System.out.println("현재남은 잔액 : " + this.money);
	}

}

//////////////////////////////////////////////////////////////////
public class Coffe {

	public static void main(String[] args) {
		Buyer1 buy = new Buyer1();
		Expresso e = new Expresso("Tall", true);
		Green_Tee_Latte g = new Green_Tee_Latte("tall", true, 2);
		Green_Tee_Latte g1 = new Green_Tee_Latte("tall", true, 1);
		g.Shot();
		buy.Buy(g);
		g1.Shot();
		buy.Buy(g1);
		g1.Shot();
		buy.Buy(g1);
		g1.Shot();
		buy.Buy(g1);
		g1.Shot();
		buy.Buy(g1);
		g1.Shot();
		buy.Buy(g1);
		g1.Shot();
		buy.Buy(g1);
		g1.Shot();
		buy.Buy(g1);
		g1.Shot();
		buy.Buy(g1);
	}

}
