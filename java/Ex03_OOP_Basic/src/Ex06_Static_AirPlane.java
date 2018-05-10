
import kr.or.bit.Book;
public class Ex06_Static_AirPlane {

	public static void main(String[] args) {
		
		/*		
		AirPlane a1 = new makeAirPlane();
		a1.airInfo();
		a1.Count();
				
		AirPlane a2 = new AirPlane(332, "세계로");
		
		a2.apCount();
		
		AirPlane a3 = new AirPlane(607,"미래로");
		
		a3.apCount();

	}*/
		//생성자 함수를 잘 사용하면 코드가 줄어요
		/*AirPlane a1 = new AirPlane("대한항공", 707);
		a1.airPlaneInfo();
		a1.apCount();
		AirPlane a2 = new AirPlane("미래로", 607);
		a2.airPlaneInfo();
		a2.apCount();
		
		AirPlane a3 = new AirPlane("세계로", 507);
		a3.airPlaneInfo();
		a3.apCount();*/
		Book b1 = new Book("안녕", 10000);
		b1.BookInfo();
		Book b2 = new Book("바보", 20000);
		b2.BookInfo();
		

}
}
