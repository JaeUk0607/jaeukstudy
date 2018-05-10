import kr.or.bit.Car;
public class Ex03_Modifier {

	public static void main(String[] args) {
		
		Car c = new Car();
		//c.window 볼수 없어요....private
		c.setWindow(111);
		int result = c.getWindow();
		System.out.println("result : " + result);
		
		/*c.setSpeed(-100);
		System.out.println("현재 속도  : " + c.getSpeed());
		
		c.setSpeed(200);
		System.out.println("현재 속도  : " + c.getSpeed());
		
		c.setSpeed(-159);
		System.out.println("현재 속도  : " + c.getSpeed());
		*/
		c.setSpeed(200);
		System.out.println("현재속도 : " + c.getSpeed());
		System.out.println("현재속도 : " + c.getSpeed());
		
		
		c.speedUp();
		System.out.println("현재속도 : " + c.getSpeed());
		
		c.speedUp();
		System.out.println("현재속도 : " + c.getSpeed());
		
		c.speedUp();
		System.out.println("현재속도 : " + c.getSpeed());
		
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		System.out.println("현재속도 : " + c.getSpeed());

	}

}
